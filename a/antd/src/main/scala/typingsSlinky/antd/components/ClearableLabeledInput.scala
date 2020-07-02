package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.input
import typingsSlinky.antd.antdStrings.text
import typingsSlinky.antd.clearableLabeledInputMod.ClearableInputProps
import typingsSlinky.antd.clearableLabeledInputMod.default
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClearableLabeledInput {
  @JSImport("antd/lib/input/ClearableLabeledInput", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def addonAfterReactElement(value: ReactElement): this.type = set("addonAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def addonAfter(value: ReactElement): this.type = set("addonAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def addonBeforeReactElement(value: ReactElement): this.type = set("addonBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def addonBefore(value: ReactElement): this.type = set("addonBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def allowClear(value: Boolean): this.type = set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: js.Any): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixReactElement(value: ReactElement): this.type = set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def prefix(value: ReactElement): this.type = set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def suffixReactElement(value: ReactElement): this.type = set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def suffix(value: ReactElement): this.type = set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClearableInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    element: ReactElement,
    handleReset: SyntheticMouseEvent[HTMLElement] => Unit,
    inputType: text | input,
    prefixCls: String,
    triggerFocus: () => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], triggerFocus = js.Any.fromFunction0(triggerFocus))
    new Builder(js.Array(this.component, __props.asInstanceOf[ClearableInputProps]))
  }
}

