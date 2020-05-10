package typingsSlinky.antd.formItemInputMod

import slinky.core.TagMod
import typingsSlinky.antd.formItemMod.ValidateStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormItemInputMiscProps extends js.Object {
  var children: TagMod[Any] = js.native
  var errors: js.Array[TagMod[Any]] = js.native
  var hasFeedback: js.UndefOr[Boolean] = js.native
  var prefixCls: String = js.native
  var validateStatus: js.UndefOr[ValidateStatus] = js.native
  def onDomErrorVisibleChange(visible: Boolean): Unit = js.native
}

object FormItemInputMiscProps {
  @scala.inline
  def apply(errors: js.Array[TagMod[Any]], onDomErrorVisibleChange: Boolean => Unit, prefixCls: String): FormItemInputMiscProps = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], onDomErrorVisibleChange = js.Any.fromFunction1(onDomErrorVisibleChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemInputMiscProps]
  }
  @scala.inline
  implicit class FormItemInputMiscPropsOps[Self <: FormItemInputMiscProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDomErrorVisibleChange(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDomErrorVisibleChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withHasFeedback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFeedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFeedback")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateStatus(value: ValidateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateStatus")(js.undefined)
        ret
    }
  }
  
}

