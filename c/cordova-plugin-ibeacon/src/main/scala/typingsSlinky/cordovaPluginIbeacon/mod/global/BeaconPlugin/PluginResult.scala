package typingsSlinky.cordovaPluginIbeacon.mod.global.BeaconPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginResult extends js.Object {
  var authorizationStatus: String = js.native
  var beacons: js.Array[Beacon] = js.native
  var error: String = js.native
  var eventType: String = js.native
  var region: Region = js.native
  var state: String = js.native
}

object PluginResult {
  @scala.inline
  def apply(
    authorizationStatus: String,
    beacons: js.Array[Beacon],
    error: String,
    eventType: String,
    region: Region,
    state: String
  ): PluginResult = {
    val __obj = js.Dynamic.literal(authorizationStatus = authorizationStatus.asInstanceOf[js.Any], beacons = beacons.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginResult]
  }
  @scala.inline
  implicit class PluginResultOps[Self <: PluginResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeacons(value: js.Array[Beacon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

