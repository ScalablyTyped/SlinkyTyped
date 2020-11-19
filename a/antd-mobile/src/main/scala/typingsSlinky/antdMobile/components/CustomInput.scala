package typingsSlinky.antdMobile.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.antdMobileStrings.left
import typingsSlinky.antdMobile.antdMobileStrings.right
import typingsSlinky.antdMobile.customInputMod.NumberInputProps
import typingsSlinky.antdMobile.customInputMod.default
import typingsSlinky.antdMobile.inputItemPropsTypeMod.InputKey
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomInput {
  
  @JSImport("antd-mobile/lib/input-item/CustomInput", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def autoAdjustHeight(value: Boolean): this.type = set("autoAdjustHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledKeysVarargs(value: InputKey*): this.type = set("disabledKeys", js.Array(value :_*))
    
    @scala.inline
    def disabledKeys(value: js.Array[InputKey]): this.type = set("disabledKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledKeysNull: this.type = set("disabledKeys", null)
    
    @scala.inline
    def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardPrefixCls(value: String): this.type = set("keyboardPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moneyKeyboardAlign(value: left | right | String): this.type = set("moneyKeyboardAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moneyKeyboardHeaderReactElement(value: ReactElement): this.type = set("moneyKeyboardHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moneyKeyboardHeader(value: ReactElement): this.type = set("moneyKeyboardHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def moneyKeyboardWrapProps(value: js.Object): this.type = set("moneyKeyboardWrapProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* value */ js.UndefOr[String] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* e */ ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* value */ js.UndefOr[String] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVirtualKeyboardConfirm(value: /* value */ js.UndefOr[String] => Unit): this.type = set("onVirtualKeyboardConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NumberInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(backspaceLabel: js.Any, cancelKeyboardLabel: js.Any, confirmLabel: js.Any): Builder = {
    val __props = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NumberInputProps]))
  }
}
