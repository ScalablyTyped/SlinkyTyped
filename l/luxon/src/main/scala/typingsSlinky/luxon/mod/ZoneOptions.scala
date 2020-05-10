package typingsSlinky.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneOptions extends js.Object {
  /**
    * @deprecated since 0.2.12. Use keepLocalTime instead
    */
  var keepCalendarTime: js.UndefOr[Boolean] = js.native
  var keepLocalTime: js.UndefOr[Boolean] = js.native
}

object ZoneOptions {
  @scala.inline
  def apply(): ZoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneOptions]
  }
  @scala.inline
  implicit class ZoneOptionsOps[Self <: ZoneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepCalendarTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCalendarTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepCalendarTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCalendarTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepLocalTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLocalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepLocalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepLocalTime")(js.undefined)
        ret
    }
  }
  
}

