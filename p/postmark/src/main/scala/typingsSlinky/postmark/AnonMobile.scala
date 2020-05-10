package typingsSlinky.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMobile extends js.Object {
  var Date: String = js.native
  var Desktop: Double = js.native
  var Mobile: Double = js.native
  var Unknown: Double = js.native
}

object AnonMobile {
  @scala.inline
  def apply(Date: String, Desktop: Double, Mobile: Double, Unknown: Double): AnonMobile = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMobile]
  }
  @scala.inline
  implicit class AnonMobileOps[Self <: AnonMobile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesktop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

