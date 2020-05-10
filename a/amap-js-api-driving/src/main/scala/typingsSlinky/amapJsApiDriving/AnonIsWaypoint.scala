package typingsSlinky.amapJsApiDriving

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsWaypoint extends js.Object {
  var isWaypoint: Boolean = js.native
}

object AnonIsWaypoint {
  @scala.inline
  def apply(isWaypoint: Boolean): AnonIsWaypoint = {
    val __obj = js.Dynamic.literal(isWaypoint = isWaypoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsWaypoint]
  }
  @scala.inline
  implicit class AnonIsWaypointOps[Self <: AnonIsWaypoint] (val x: Self) extends AnyVal {
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
  }
  
}

