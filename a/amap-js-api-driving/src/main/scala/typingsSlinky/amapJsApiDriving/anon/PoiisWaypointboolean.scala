package typingsSlinky.amapJsApiDriving.anon

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.end
import typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.start
import typingsSlinky.amapJsApiDriving.amapJsApiDrivingStrings.waypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api-driving.AMap.Driving.Poi & {  isWaypoint  :boolean} */
@js.native
trait PoiisWaypointboolean extends js.Object {
  var isWaypoint: Boolean = js.native
  var location: LngLat = js.native
  var name: String = js.native
  var `type`: start | end | waypoint = js.native
}

object PoiisWaypointboolean {
  @scala.inline
  def apply(isWaypoint: Boolean, location: LngLat, name: String, `type`: start | end | waypoint): PoiisWaypointboolean = {
    val __obj = js.Dynamic.literal(isWaypoint = isWaypoint.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoiisWaypointboolean]
  }
  @scala.inline
  implicit class PoiisWaypointbooleanOps[Self <: PoiisWaypointboolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsWaypoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWaypoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: start | end | waypoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

