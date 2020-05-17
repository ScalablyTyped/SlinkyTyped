package typingsSlinky.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Desktop extends js.Object {
  var Date: String = js.native
  var Desktop: js.UndefOr[Double] = js.native
  var Mobile: js.UndefOr[Double] = js.native
  var Unknown: js.UndefOr[Double] = js.native
  var WebMail: js.UndefOr[Double] = js.native
}

object Desktop {
  @scala.inline
  def apply(Date: String): Desktop = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desktop]
  }
  @scala.inline
  implicit class DesktopOps[Self <: Desktop] (val x: Self) extends AnyVal {
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
    def withoutDesktop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(js.undefined)
        ret
    }
    @scala.inline
    def withWebMail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebMail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebMail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WebMail")(js.undefined)
        ret
    }
  }
  
}

