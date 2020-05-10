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
@js.native
trait ClearableInputProps extends BasicProps {
  var addonAfter: js.UndefOr[TagMod[Any]] = js.native
  var addonBefore: js.UndefOr[TagMod[Any]] = js.native
  var prefix: js.UndefOr[TagMod[Any]] = js.native
  var size: js.UndefOr[SizeType] = js.native
  var suffix: js.UndefOr[TagMod[Any]] = js.native
  def triggerFocus(): Unit = js.native
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
    def withTriggerFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddonAfterReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddonAfter(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddonAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withAddonBeforeReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddonBefore(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddonBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: SizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffixReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffix(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
  }
  
}

