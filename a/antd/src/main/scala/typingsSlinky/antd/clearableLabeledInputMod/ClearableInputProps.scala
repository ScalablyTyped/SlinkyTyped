package typingsSlinky.antd.clearableLabeledInputMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.input
import typingsSlinky.antd.antdStrings.text
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This props only for input.
  */
trait ClearableInputProps extends BasicProps {
  var addonAfter: js.UndefOr[TagMod[Any]] = js.undefined
  var addonBefore: js.UndefOr[TagMod[Any]] = js.undefined
  var prefix: js.UndefOr[TagMod[Any]] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var suffix: js.UndefOr[TagMod[Any]] = js.undefined
  def triggerFocus(): Unit
}

object ClearableInputProps {
  @scala.inline
  def apply(
    element: ReactElement,
    handleReset: SyntheticMouseEvent[HTMLElement] => Unit,
    inputType: text | input,
    prefixCls: String,
    triggerFocus: () => Unit
  ): ClearableInputProps = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], triggerFocus = js.Any.fromFunction0(triggerFocus))
    __obj.asInstanceOf[ClearableInputProps]
  }
  @scala.inline
  implicit class ClearableInputPropsOps[Self <: ClearableInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTriggerFocus(value: () => Unit): Self = this.set("triggerFocus", js.Any.fromFunction0(value))
    @scala.inline
    def setAddonAfterReactElement(value: ReactElement): Self = this.set("addonAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddonAfter(value: TagMod[Any]): Self = this.set("addonAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddonAfter: Self = this.set("addonAfter", js.undefined)
    @scala.inline
    def setAddonBeforeReactElement(value: ReactElement): Self = this.set("addonBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddonBefore(value: TagMod[Any]): Self = this.set("addonBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddonBefore: Self = this.set("addonBefore", js.undefined)
    @scala.inline
    def setPrefixReactElement(value: ReactElement): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: TagMod[Any]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSuffixReactElement(value: ReactElement): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffix(value: TagMod[Any]): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}

