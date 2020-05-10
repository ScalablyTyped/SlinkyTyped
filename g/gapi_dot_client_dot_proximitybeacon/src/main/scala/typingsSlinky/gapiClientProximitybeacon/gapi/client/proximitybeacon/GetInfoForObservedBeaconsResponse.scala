package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInfoForObservedBeaconsResponse extends js.Object {
  /**
    * Public information about beacons.
    * May be empty if the request matched no beacons.
    */
  var beacons: js.UndefOr[js.Array[BeaconInfo]] = js.native
}

object GetInfoForObservedBeaconsResponse {
  @scala.inline
  def apply(): GetInfoForObservedBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInfoForObservedBeaconsResponse]
  }
  @scala.inline
  implicit class GetInfoForObservedBeaconsResponseOps[Self <: GetInfoForObservedBeaconsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeacons(value: js.Array[BeaconInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeacons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beacons")(js.undefined)
        ret
    }
  }
  
}

