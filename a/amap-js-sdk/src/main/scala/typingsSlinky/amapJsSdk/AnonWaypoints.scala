package typingsSlinky.amapJsSdk

import typingsSlinky.amapJsSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWaypoints extends js.Object {
  var waypoints: js.Array[LngLat] = js.native
}

object AnonWaypoints {
  @scala.inline
  def apply(waypoints: js.Array[LngLat]): AnonWaypoints = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWaypoints]
  }
  @scala.inline
  implicit class AnonWaypointsOps[Self <: AnonWaypoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWaypoints(value: js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

