package typingsSlinky.reactNativeMaterialTextfield

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextInputProps
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.dashed
import typingsSlinky.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.dotted
import typingsSlinky.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.none
import typingsSlinky.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-material-textfield", "FilledTextField")
  @js.native
  class FilledTextField protected () extends TextField {
    def this(props: TextFieldProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextFieldProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-material-textfield", "OutlinedTextField")
  @js.native
  class OutlinedTextField protected () extends TextField {
    def this(props: TextFieldProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextFieldProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-material-textfield", "TextField")
  @js.native
  class TextField protected ()
    extends Component[TextFieldProps, js.Any, js.Any] {
    def this(props: TextFieldProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextFieldProps, context: js.Any) = this()
    
    /*
      * Release focus
      */
    def blur(): Unit = js.native
    
    /*
      * Clear text field
      */
    def clear(): Unit = js.native
    
    /*
      * Acquire focus
      */
    def focus(): Unit = js.native
    
    /*
      * Get current focus state
      */
    def isFocused(): Boolean = js.native
    
    /*
      * Get current restriction state
      */
    def isRestricted(): Boolean = js.native
    
    /*
      * Set current value
      */
    def setValue(): Unit = js.native
    def setValue(value: String): Unit = js.native
    
    /*
      * Get current value
      */
    def value(): String = js.native
  }
  
  @js.native
  trait ContentInset extends StObject {
    
    var input: js.UndefOr[Double] = js.native
    
    var label: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object ContentInset {
    
    @scala.inline
    def apply(): ContentInset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentInset]
    }
    
    @scala.inline
    implicit class ContentInsetMutableBuilder[Self <: ContentInset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: Double): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait TextFieldProps extends TextInputProps {
    
    var activeLineWidth: js.UndefOr[Double] = js.native
    
    var affixTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var baseColor: js.UndefOr[String] = js.native
    
    var characterRestriction: js.UndefOr[Double] = js.native
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var contentInset: js.UndefOr[ContentInset] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledLineType: js.UndefOr[solid | dotted | dashed | none] = js.native
    
    var disabledLineWidth: js.UndefOr[Double] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var errorColor: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var formatText: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
    
    var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var labelFontSize: js.UndefOr[Double] = js.native
    
    var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var lineType: js.UndefOr[solid | dotted | dashed | none] = js.native
    
    var lineWidth: js.UndefOr[Double] = js.native
    
    var onPress: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var renderLeftAccessory: js.UndefOr[js.Function0[ReactElement]] = js.native
    
    var renderRightAccessory: js.UndefOr[js.Function0[ReactElement]] = js.native
    
    @JSName("style")
    var style_TextFieldProps: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var textColor: js.UndefOr[String] = js.native
    
    var tintColor: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  }
  object TextFieldProps {
    
    @scala.inline
    def apply(): TextFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFieldProps]
    }
    
    @scala.inline
    implicit class TextFieldPropsMutableBuilder[Self <: TextFieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveLineWidth(value: Double): Self = StObject.set(x, "activeLineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveLineWidthUndefined: Self = StObject.set(x, "activeLineWidth", js.undefined)
      
      @scala.inline
      def setAffixTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "affixTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixTextStyleNull: Self = StObject.set(x, "affixTextStyle", null)
      
      @scala.inline
      def setAffixTextStyleUndefined: Self = StObject.set(x, "affixTextStyle", js.undefined)
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      @scala.inline
      def setCharacterRestriction(value: Double): Self = StObject.set(x, "characterRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharacterRestrictionUndefined: Self = StObject.set(x, "characterRestriction", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setContentInset(value: ContentInset): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledLineType(value: solid | dotted | dashed | none): Self = StObject.set(x, "disabledLineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledLineTypeUndefined: Self = StObject.set(x, "disabledLineType", js.undefined)
      
      @scala.inline
      def setDisabledLineWidth(value: Double): Self = StObject.set(x, "disabledLineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledLineWidthUndefined: Self = StObject.set(x, "disabledLineWidth", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorColor(value: String): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFormatText(value: /* text */ String => String): Self = StObject.set(x, "formatText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatTextUndefined: Self = StObject.set(x, "formatText", js.undefined)
      
      @scala.inline
      def setInputContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputContainerStyleNull: Self = StObject.set(x, "inputContainerStyle", null)
      
      @scala.inline
      def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      @scala.inline
      def setLabelTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTextStyleNull: Self = StObject.set(x, "labelTextStyle", null)
      
      @scala.inline
      def setLabelTextStyleUndefined: Self = StObject.set(x, "labelTextStyle", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLineType(value: solid | dotted | dashed | none): Self = StObject.set(x, "lineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineTypeUndefined: Self = StObject.set(x, "lineType", js.undefined)
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setOnPress(value: /* event */ Event => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRenderLeftAccessory(value: () => ReactElement): Self = StObject.set(x, "renderLeftAccessory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderLeftAccessoryUndefined: Self = StObject.set(x, "renderLeftAccessory", js.undefined)
      
      @scala.inline
      def setRenderRightAccessory(value: () => ReactElement): Self = StObject.set(x, "renderRightAccessory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderRightAccessoryUndefined: Self = StObject.set(x, "renderRightAccessory", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleTextStyleNull: Self = StObject.set(x, "titleTextStyle", null)
      
      @scala.inline
      def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
