package typingsSlinky.rcInputNumber

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.KeyboardEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcInputNumber.rcInputNumberStrings.large
    - typingsSlinky.rcInputNumber.rcInputNumberStrings.middle
    - typingsSlinky.rcInputNumber.rcInputNumberStrings.small
  */
  trait ISize extends StObject
  object ISize {
    
    @scala.inline
    def large: typingsSlinky.rcInputNumber.rcInputNumberStrings.large = "large".asInstanceOf[typingsSlinky.rcInputNumber.rcInputNumberStrings.large]
    
    @scala.inline
    def middle: typingsSlinky.rcInputNumber.rcInputNumberStrings.middle = "middle".asInstanceOf[typingsSlinky.rcInputNumber.rcInputNumberStrings.middle]
    
    @scala.inline
    def small: typingsSlinky.rcInputNumber.rcInputNumberStrings.small = "small".asInstanceOf[typingsSlinky.rcInputNumber.rcInputNumberStrings.small]
  }
  
  @js.native
  trait InputNumberProps
    extends /* key */ StringDictionary[js.Any] {
    
    var autoComplete: String = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var decimalSeparator: js.UndefOr[String] = js.native
    
    var defaultValue: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var downHandler: ReactElement = js.native
    
    var focusOnUpDown: Boolean = js.native
    
    var formatter: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], String]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    def onBlur(arg: js.Any*): Unit = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | String], Unit]] = js.native
    
    def onFocus(arg: js.Any*): Unit = js.native
    
    def onKeyDown(e: js.Any, arg: js.Any*): Unit = js.native
    
    def onKeyUp(e: js.Any, arg: js.Any*): Unit = js.native
    
    def onMouseUp(arg: js.Any*): Unit = js.native
    
    var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var parser: js.UndefOr[js.Function1[/* displayValue */ js.UndefOr[String], Double | String]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var precision: js.UndefOr[Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var required: Boolean = js.native
    
    var size: js.UndefOr[ISize] = js.native
    
    var step: js.UndefOr[Double | String] = js.native
    
    var style: CSSProperties = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var upHandler: ReactElement = js.native
    
    var useTouch: Boolean = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object InputNumberProps {
    
    @scala.inline
    def apply(
      autoComplete: String,
      downHandler: ReactElement,
      focusOnUpDown: Boolean,
      onBlur: /* repeated */ js.Any => Unit,
      onFocus: /* repeated */ js.Any => Unit,
      onKeyDown: (js.Any, /* repeated */ js.Any) => Unit,
      onKeyUp: (js.Any, /* repeated */ js.Any) => Unit,
      onMouseUp: /* repeated */ js.Any => Unit,
      required: Boolean,
      style: CSSProperties,
      upHandler: ReactElement,
      useTouch: Boolean
    ): InputNumberProps = {
      val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], downHandler = downHandler.asInstanceOf[js.Any], focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyUp = js.Any.fromFunction2(onKeyUp), onMouseUp = js.Any.fromFunction1(onMouseUp), required = required.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], upHandler = upHandler.asInstanceOf[js.Any], useTouch = useTouch.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputNumberProps]
    }
    
    @scala.inline
    implicit class InputNumberPropsMutableBuilder[Self <: InputNumberProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDecimalSeparator(value: String): Self = StObject.set(x, "decimalSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalSeparatorUndefined: Self = StObject.set(x, "decimalSeparator", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownHandler(value: ReactElement): Self = StObject.set(x, "downHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnUpDown(value: Boolean): Self = StObject.set(x, "focusOnUpDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatter(value: /* value */ js.UndefOr[Double | String] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChange(value: /* value */ js.UndefOr[Double | String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDown(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyUp(value: (js.Any, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseUp(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressEnter(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      @scala.inline
      def setParser(value: /* displayValue */ js.UndefOr[String] => Double | String): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: ISize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUpHandler(value: ReactElement): Self = StObject.set(x, "upHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTouch(value: Boolean): Self = StObject.set(x, "useTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait InputNumberState extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.native
    
    var inputValue: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object InputNumberState {
    
    @scala.inline
    def apply(): InputNumberState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputNumberState]
    }
    
    @scala.inline
    implicit class InputNumberStateMutableBuilder[Self <: InputNumberState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
