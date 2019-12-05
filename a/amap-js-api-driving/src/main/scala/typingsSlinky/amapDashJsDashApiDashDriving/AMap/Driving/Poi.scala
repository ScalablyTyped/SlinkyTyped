package typingsSlinky.amapDashJsDashApiDashDriving.AMap.Driving

import typingsSlinky.amapDashJsDashApi.AMap.LngLat
import typingsSlinky.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.end
import typingsSlinky.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.start
import typingsSlinky.amapDashJsDashApiDashDriving.amapDashJsDashApiDashDrivingStrings.waypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poi extends js.Object {
  var location: LngLat
  var name: String
  var `type`: start | end | waypoint
}

object Poi {
  @scala.inline
  def apply(location: LngLat, name: String, `type`: start | end | waypoint): Poi = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poi]
  }
}

