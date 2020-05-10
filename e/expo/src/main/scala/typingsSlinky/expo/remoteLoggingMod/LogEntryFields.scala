package typingsSlinky.expo.remoteLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEntryFields extends js.Object {
  var groupCollapsed: js.UndefOr[Boolean] = js.native
  var groupDepth: js.UndefOr[Double] = js.native
  var shouldHide: js.UndefOr[Boolean] = js.native
}

object LogEntryFields {
  @scala.inline
  def apply(): LogEntryFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntryFields]
  }
  @scala.inline
  implicit class LogEntryFieldsOps[Self <: LogEntryFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldHide")(js.undefined)
        ret
    }
  }
  
}

