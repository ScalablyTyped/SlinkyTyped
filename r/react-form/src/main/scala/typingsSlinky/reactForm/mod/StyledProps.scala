package typingsSlinky.reactForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledProps extends FieldProps {
  var messageBefore: js.UndefOr[Boolean] = js.native
  var noMessage: js.UndefOr[Boolean] = js.native
  var touchValidation: js.UndefOr[Boolean] = js.native
}

object StyledProps {
  @scala.inline
  def apply(): StyledProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledProps]
  }
  @scala.inline
  implicit class StyledPropsOps[Self <: StyledProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchValidation")(js.undefined)
        ret
    }
  }
  
}

