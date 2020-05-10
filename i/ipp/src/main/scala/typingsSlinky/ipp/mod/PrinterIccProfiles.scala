package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrinterIccProfiles extends js.Object {
  var `profile-name`: js.UndefOr[String] = js.native
  var `profile-url`: js.UndefOr[String] = js.native
}

object PrinterIccProfiles {
  @scala.inline
  def apply(): PrinterIccProfiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterIccProfiles]
  }
  @scala.inline
  implicit class PrinterIccProfilesOps[Self <: PrinterIccProfiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withProfile-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProfile-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withProfile-url`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile-url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProfile-url`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile-url")(js.undefined)
        ret
    }
  }
  
}

