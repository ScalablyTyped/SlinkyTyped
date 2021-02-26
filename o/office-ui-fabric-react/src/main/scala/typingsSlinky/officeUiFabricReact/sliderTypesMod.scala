package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.sliderBaseMod.SliderBase
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderTypesMod {
  
  @js.native
  trait ISlider extends StObject {
    
    def focus(): Unit = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object ISlider {
    
    @scala.inline
    def apply(focus: () => Unit): ISlider = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ISlider]
    }
    
    @scala.inline
    implicit class ISliderMutableBuilder[Self <: ISlider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ISliderProps extends ClassAttributes[SliderBase] {
    
    /**
      * A description of the Slider for the benefit of screen readers.
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * A text description of the Slider number value for the benefit of screen readers.
      * This should be used when the Slider number value is not accurately represented by a number.
      */
    var ariaValueText: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
    
    /**
      * Optional mixin for additional props on the thumb button within the slider.
      */
    var buttonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.native
    
    /**
      * Optional className to attach to the slider root element.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the ISlider interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ISlider]] = js.native
    
    /**
      * The initial value of the Slider. Use this if you intend for the Slider to be an uncontrolled component.
      * This value is mutually exclusive to value. Use one or the other.
      */
    var defaultValue: js.UndefOr[Double] = js.native
    
    /**
      * Optional flag to render the Slider as disabled.
      * @defaultvalue false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Description label of the Slider
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * The max value of the Slider
      * @defaultvalue 10
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * The min value of the Slider
      * @defaultvalue 0
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * Callback when the value has been changed
      */
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /**
      * Callback on mouse up or touch end
      */
    var onChanged: js.UndefOr[
        js.Function2[/* event */ MouseEvent | TouchEvent | KeyboardEvent, /* value */ Double, Unit]
      ] = js.native
    
    /**
      * Optional flag to attach the origin of slider to zero. Helpful when the range include negatives.
      * @defaultvalue false
      */
    var originFromZero: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to show the value on the right of the Slider.
      * @defaultvalue true
      */
    var showValue: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional flag to decide that thumb will snap to closest value while moving the slider
      * @defaultvalue false
      */
    var snapToStep: js.UndefOr[Boolean] = js.native
    
    /**
      * The difference between the two adjacent values of the Slider
      * @defaultvalue 1
      */
    var step: js.UndefOr[Double] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles]] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * The initial value of the Slider. Use this if you intend to pass in a new value as a result of onChange events.
      * This value is mutually exclusive to defaultValue. Use one or the other.
      */
    var value: js.UndefOr[Double] = js.native
    
    /**
      * Optional function to format the slider value.
      */
    var valueFormat: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
    
    /**
      * Optional flag to render the slider vertically. Defaults to rendering horizontal.
      */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object ISliderProps {
    
    @scala.inline
    def apply(): ISliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISliderProps]
    }
    
    @scala.inline
    implicit class ISliderPropsMutableBuilder[Self <: ISliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaValueText(value: /* value */ Double => String): Self = StObject.set(x, "ariaValueText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAriaValueTextUndefined: Self = StObject.set(x, "ariaValueText", js.undefined)
      
      @scala.inline
      def setButtonProps(value: HTMLAttributes[HTMLButtonElement]): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ISlider]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ISlider | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[ISlider]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnChanged(value: (/* event */ MouseEvent | TouchEvent | KeyboardEvent, /* value */ Double) => Unit): Self = StObject.set(x, "onChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      @scala.inline
      def setOriginFromZero(value: Boolean): Self = StObject.set(x, "originFromZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginFromZeroUndefined: Self = StObject.set(x, "originFromZero", js.undefined)
      
      @scala.inline
      def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
      
      @scala.inline
      def setSnapToStep(value: Boolean): Self = StObject.set(x, "snapToStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToStepUndefined: Self = StObject.set(x, "snapToStep", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ISliderStyleProps => DeepPartial[ISliderStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFormat(value: /* value */ Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Slider/Slider.types.ISliderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Slider/Slider.types.ISliderProps, 'className' | 'disabled' | 'vertical'> & {  showTransitions :boolean | undefined,   showValue :boolean | undefined,   titleLabelClassName :string | undefined} */
  @js.native
  trait ISliderStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var showTransitions: js.UndefOr[Boolean] = js.native
    
    var showValue: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
    
    var titleLabelClassName: js.UndefOr[String] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object ISliderStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ISliderStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISliderStyleProps]
    }
    
    @scala.inline
    implicit class ISliderStylePropsMutableBuilder[Self <: ISliderStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setShowTransitions(value: Boolean): Self = StObject.set(x, "showTransitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTransitionsUndefined: Self = StObject.set(x, "showTransitions", js.undefined)
      
      @scala.inline
      def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowValueUndefined: Self = StObject.set(x, "showValue", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLabelClassName(value: String): Self = StObject.set(x, "titleLabelClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLabelClassNameUndefined: Self = StObject.set(x, "titleLabelClassName", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait ISliderStyles extends StObject {
    
    /**
      * Style set for active portion of the line.
      */
    var activeSection: IStyle = js.native
    
    /**
      * Style set for the container of the slider.
      */
    var container: IStyle = js.native
    
    /**
      * Style set for inactive portion of the line.
      */
    var inactiveSection: IStyle = js.native
    
    /**
      * Style set for element that contains all the lines.
      */
    var line: IStyle = js.native
    
    /**
      * Style set for both active and inactive sections of the line.
      */
    var lineContainer: IStyle = js.native
    
    /**
      * Style set for the root element.
      */
    var root: IStyle = js.native
    
    /**
      * Style set for the actual box containting interactive elements of the slider.
      */
    var slideBox: IStyle = js.native
    
    /**
      * Style set for thumb of the slider.
      */
    var thumb: IStyle = js.native
    
    /**
      * Style set for the title label above the slider.
      */
    var titleLabel: IStyle = js.native
    
    /**
      * Style set for value label on right/below of the slider.
      */
    var valueLabel: IStyle = js.native
    
    /**
      * Style set for tick on 0 on number line. This element only shows up when originFromZero prop is true.
      */
    var zeroTick: IStyle = js.native
  }
  object ISliderStyles {
    
    @scala.inline
    def apply(): ISliderStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISliderStyles]
    }
    
    @scala.inline
    implicit class ISliderStylesMutableBuilder[Self <: ISliderStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveSection(value: IStyle): Self = StObject.set(x, "activeSection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveSectionNull: Self = StObject.set(x, "activeSection", null)
      
      @scala.inline
      def setActiveSectionUndefined: Self = StObject.set(x, "activeSection", js.undefined)
      
      @scala.inline
      def setContainer(value: IStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setInactiveSection(value: IStyle): Self = StObject.set(x, "inactiveSection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveSectionNull: Self = StObject.set(x, "inactiveSection", null)
      
      @scala.inline
      def setInactiveSectionUndefined: Self = StObject.set(x, "inactiveSection", js.undefined)
      
      @scala.inline
      def setLine(value: IStyle): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineContainer(value: IStyle): Self = StObject.set(x, "lineContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineContainerNull: Self = StObject.set(x, "lineContainer", null)
      
      @scala.inline
      def setLineContainerUndefined: Self = StObject.set(x, "lineContainer", js.undefined)
      
      @scala.inline
      def setLineNull: Self = StObject.set(x, "line", null)
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSlideBox(value: IStyle): Self = StObject.set(x, "slideBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideBoxNull: Self = StObject.set(x, "slideBox", null)
      
      @scala.inline
      def setSlideBoxUndefined: Self = StObject.set(x, "slideBox", js.undefined)
      
      @scala.inline
      def setThumb(value: IStyle): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbNull: Self = StObject.set(x, "thumb", null)
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      @scala.inline
      def setTitleLabel(value: IStyle): Self = StObject.set(x, "titleLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLabelNull: Self = StObject.set(x, "titleLabel", null)
      
      @scala.inline
      def setTitleLabelUndefined: Self = StObject.set(x, "titleLabel", js.undefined)
      
      @scala.inline
      def setValueLabel(value: IStyle): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueLabelNull: Self = StObject.set(x, "valueLabel", null)
      
      @scala.inline
      def setValueLabelUndefined: Self = StObject.set(x, "valueLabel", js.undefined)
      
      @scala.inline
      def setZeroTick(value: IStyle): Self = StObject.set(x, "zeroTick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroTickNull: Self = StObject.set(x, "zeroTick", null)
      
      @scala.inline
      def setZeroTickUndefined: Self = StObject.set(x, "zeroTick", js.undefined)
    }
  }
}
