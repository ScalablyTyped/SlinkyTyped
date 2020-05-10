package typingsSlinky.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonManeuver extends js.Object {
  var maneuver: js.Array[AnonId] = js.native
}

object AnonManeuver {
  @scala.inline
  def apply(maneuver: js.Array[AnonId]): AnonManeuver = {
    val __obj = js.Dynamic.literal(maneuver = maneuver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManeuver]
  }
  @scala.inline
  implicit class AnonManeuverOps[Self <: AnonManeuver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManeuver(value: js.Array[AnonId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maneuver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

