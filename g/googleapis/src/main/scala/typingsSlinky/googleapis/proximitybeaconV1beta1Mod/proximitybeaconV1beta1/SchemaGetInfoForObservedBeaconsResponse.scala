package typingsSlinky.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the requested beacons, optionally including attachment
  * data.
  */
@js.native
trait SchemaGetInfoForObservedBeaconsResponse extends js.Object {
  /**
    * Public information about beacons. May be empty if the request matched no
    * beacons.
    */
  var beacons: js.UndefOr[js.Array[SchemaBeaconInfo]] = js.native
}

object SchemaGetInfoForObservedBeaconsResponse {
  @scala.inline
  def apply(): SchemaGetInfoForObservedBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetInfoForObservedBeaconsResponse]
  }
  @scala.inline
  implicit class SchemaGetInfoForObservedBeaconsResponseOps[Self <: SchemaGetInfoForObservedBeaconsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeacons(value: js.Array[SchemaBeaconInfo]): Self = {
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

