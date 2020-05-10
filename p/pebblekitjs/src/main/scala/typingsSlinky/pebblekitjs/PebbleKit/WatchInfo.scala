package typingsSlinky.pebblekitjs.PebbleKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object containing information about the currently connected watch,
  * returned by Pebble.getActiveWatchInfo().
  * Read the PebbleKit JS guides for complete information on possible values.
  * @see Pebble.getActiveWatchInfo
  */
@js.native
trait WatchInfo extends js.Object {
  var firmware: Firmware = js.native
  var language: String = js.native
  var model: String = js.native
  var platform: String = js.native
}

object WatchInfo {
  @scala.inline
  def apply(firmware: Firmware, language: String, model: String, platform: String): WatchInfo = {
    val __obj = js.Dynamic.literal(firmware = firmware.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchInfo]
  }
  @scala.inline
  implicit class WatchInfoOps[Self <: WatchInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirmware(value: Firmware): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

