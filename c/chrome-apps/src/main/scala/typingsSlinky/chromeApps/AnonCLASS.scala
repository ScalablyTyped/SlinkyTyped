package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.class_
import typingsSlinky.chromeApps.chromeAppsStrings.reserved_
import typingsSlinky.chromeApps.chromeAppsStrings.standard_
import typingsSlinky.chromeApps.chromeAppsStrings.vendor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCLASS extends js.Object {
  var CLASS: class_ = js.native
  var RESERVED: reserved_ = js.native
  var STANDARD: standard_ = js.native
  var VENDOR: vendor_ = js.native
}

object AnonCLASS {
  @scala.inline
  def apply(CLASS: class_, RESERVED: reserved_, STANDARD: standard_, VENDOR: vendor_): AnonCLASS = {
    val __obj = js.Dynamic.literal(CLASS = CLASS.asInstanceOf[js.Any], RESERVED = RESERVED.asInstanceOf[js.Any], STANDARD = STANDARD.asInstanceOf[js.Any], VENDOR = VENDOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCLASS]
  }
  @scala.inline
  implicit class AnonCLASSOps[Self <: AnonCLASS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLASS(value: class_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESERVED(value: reserved_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESERVED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTANDARD(value: standard_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STANDARD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVENDOR(value: vendor_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VENDOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

