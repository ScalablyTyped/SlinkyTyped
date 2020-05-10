package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFWVersion extends js.Object {
  var FWVersion: String = js.native
  var HWVersion: String = js.native
  var isLoggedIn: String = js.native
  var manufacturer: String = js.native
  var name: String = js.native
  var serial: String = js.native
}

object AnonFWVersion {
  @scala.inline
  def apply(
    FWVersion: String,
    HWVersion: String,
    isLoggedIn: String,
    manufacturer: String,
    name: String,
    serial: String
  ): AnonFWVersion = {
    val __obj = js.Dynamic.literal(FWVersion = FWVersion.asInstanceOf[js.Any], HWVersion = HWVersion.asInstanceOf[js.Any], isLoggedIn = isLoggedIn.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFWVersion]
  }
  @scala.inline
  implicit class AnonFWVersionOps[Self <: AnonFWVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFWVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FWVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHWVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HWVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoggedIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoggedIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

