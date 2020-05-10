package typingsSlinky.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGeoFenceID extends js.Object {
  var geoFenceID: String = js.native
}

object AnonGeoFenceID {
  @scala.inline
  def apply(geoFenceID: String): AnonGeoFenceID = {
    val __obj = js.Dynamic.literal(geoFenceID = geoFenceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeoFenceID]
  }
  @scala.inline
  implicit class AnonGeoFenceIDOps[Self <: AnonGeoFenceID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoFenceID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoFenceID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

