package typingsSlinky.antdMobile

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.antdMobileStrings.left
import typingsSlinky.antdMobile.antdMobileStrings.right
import typingsSlinky.antdMobile.inputItemPropsTypeMod.InputEventHandler
import typingsSlinky.antdMobile.inputItemPropsTypeMod.InputKey
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customInputMod {
  
  @JSImport("antd-mobile/lib/input-item/CustomInput", JSImport.Default)
  @js.native
  class default protected () extends NumberInput {
    def this(props: NumberInputProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.autoAdjustHeight")
      @js.native
      def autoAdjustHeight: Boolean = js.native
      @scala.inline
      def autoAdjustHeight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.editable")
      @js.native
      def editable: Boolean = js.native
      @scala.inline
      def editable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editable")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.keyboardPrefixCls")
      @js.native
      def keyboardPrefixCls: String = js.native
      @scala.inline
      def keyboardPrefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyboardPrefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.onBlur")
      @js.native
      def onBlur(): Unit = js.native
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.onChange")
      @js.native
      def onChange(): Unit = js.native
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.onFocus")
      @js.native
      def onFocus(): Unit = js.native
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.onVirtualKeyboardConfirm")
      @js.native
      def onVirtualKeyboardConfirm(): Unit = js.native
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.placeholder")
      @js.native
      def placeholder: String = js.native
      @scala.inline
      def placeholder_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/input-item/CustomInput", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NumberInput
    extends Component[NumberInputProps, js.Any, js.Any] {
    
    def addBlurListener(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MNumberInput(nextProps: NumberInputProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MNumberInput(): Unit = js.native
    
    var container: HTMLDivElement = js.native
    
    def doBlur(ev: MouseEvent): Unit = js.native
    
    def focus(): Unit = js.native
    
    def getComponent(): ReactElement = js.native
    
    def getContainer(): HTMLDivElement = js.native
    
    var inputRef: HTMLDivElement | Null = js.native
    
    var keyBoard: ReactElement | Null = js.native
    
    def onChange(value: js.Any): Unit = js.native
    
    def onConfirm(value: js.Any): Unit = js.native
    
    def onFakeInputClick(): Unit = js.native
    
    def onInputBlur(value: String): Unit = js.native
    
    def onInputFocus(): Unit = js.native
    
    def onKeyboardClick(KeyboardItemValue: String): Unit = js.native
    
    def removeBlurListener(): Unit = js.native
    
    def renderCustomKeyboard(): Unit = js.native
    
    def renderPortal(): js.UndefOr[js.Object | Null] = js.native
    
    def saveRef(): Unit = js.native
    def saveRef(el: typingsSlinky.antdMobile.customKeyboardMod.default): Unit = js.native
    
    def unLinkInput(): Unit = js.native
  }
  
  @js.native
  trait NumberInputProps extends StObject {
    
    var autoAdjustHeight: js.UndefOr[Boolean] = js.native
    
    var backspaceLabel: js.Any = js.native
    
    var cancelKeyboardLabel: js.Any = js.native
    
    var confirmLabel: js.Any = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var disabledKeys: js.UndefOr[js.Array[InputKey] | Null] = js.native
    
    var editable: js.UndefOr[Boolean] = js.native
    
    var keyboardPrefixCls: js.UndefOr[String] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var moneyKeyboardAlign: js.UndefOr[left | right | String] = js.native
    
    var moneyKeyboardHeader: js.UndefOr[ReactElement] = js.native
    
    var moneyKeyboardWrapProps: js.UndefOr[js.Object] = js.native
    
    var onBlur: js.UndefOr[InputEventHandler] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Unit]] = js.native
    
    var onFocus: js.UndefOr[InputEventHandler] = js.native
    
    var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object NumberInputProps {
    
    @scala.inline
    def apply(backspaceLabel: js.Any, cancelKeyboardLabel: js.Any, confirmLabel: js.Any): NumberInputProps = {
      val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberInputProps]
    }
    
    @scala.inline
    implicit class NumberInputPropsMutableBuilder[Self <: NumberInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoAdjustHeight(value: Boolean): Self = StObject.set(x, "autoAdjustHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustHeightUndefined: Self = StObject.set(x, "autoAdjustHeight", js.undefined)
      
      @scala.inline
      def setBackspaceLabel(value: js.Any): Self = StObject.set(x, "backspaceLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelKeyboardLabel(value: js.Any): Self = StObject.set(x, "cancelKeyboardLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmLabel(value: js.Any): Self = StObject.set(x, "confirmLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledKeys(value: js.Array[InputKey]): Self = StObject.set(x, "disabledKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledKeysNull: Self = StObject.set(x, "disabledKeys", null)
      
      @scala.inline
      def setDisabledKeysUndefined: Self = StObject.set(x, "disabledKeys", js.undefined)
      
      @scala.inline
      def setDisabledKeysVarargs(value: InputKey*): Self = StObject.set(x, "disabledKeys", js.Array(value :_*))
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setKeyboardPrefixCls(value: String): Self = StObject.set(x, "keyboardPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardPrefixClsUndefined: Self = StObject.set(x, "keyboardPrefixCls", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMoneyKeyboardAlign(value: left | right | String): Self = StObject.set(x, "moneyKeyboardAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoneyKeyboardAlignUndefined: Self = StObject.set(x, "moneyKeyboardAlign", js.undefined)
      
      @scala.inline
      def setMoneyKeyboardHeader(value: ReactElement): Self = StObject.set(x, "moneyKeyboardHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoneyKeyboardHeaderReactElement(value: ReactElement): Self = StObject.set(x, "moneyKeyboardHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoneyKeyboardHeaderUndefined: Self = StObject.set(x, "moneyKeyboardHeader", js.undefined)
      
      @scala.inline
      def setMoneyKeyboardWrapProps(value: js.Object): Self = StObject.set(x, "moneyKeyboardWrapProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoneyKeyboardWrapPropsUndefined: Self = StObject.set(x, "moneyKeyboardWrapProps", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnVirtualKeyboardConfirm(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onVirtualKeyboardConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVirtualKeyboardConfirmUndefined: Self = StObject.set(x, "onVirtualKeyboardConfirm", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
