package typingsSlinky.cordovaPluginCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDATAURL extends js.Object {
  var DATA_URL: Double = js.native
  var FILE_URI: Double = js.native
  var NATIVE_URI: Double = js.native
}

object AnonDATAURL {
  @scala.inline
  def apply(DATA_URL: Double, FILE_URI: Double, NATIVE_URI: Double): AnonDATAURL = {
    val __obj = js.Dynamic.literal(DATA_URL = DATA_URL.asInstanceOf[js.Any], FILE_URI = FILE_URI.asInstanceOf[js.Any], NATIVE_URI = NATIVE_URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDATAURL]
  }
  @scala.inline
  implicit class AnonDATAURLOps[Self <: AnonDATAURL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDATA_URL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATA_URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFILE_URI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FILE_URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNATIVE_URI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_URI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

