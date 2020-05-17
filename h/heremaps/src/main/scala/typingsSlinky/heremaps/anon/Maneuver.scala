package typingsSlinky.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Maneuver extends js.Object {
  var maneuver: js.Array[Id] = js.native
}

object Maneuver {
  @scala.inline
  def apply(maneuver: js.Array[Id]): Maneuver = {
    val __obj = js.Dynamic.literal(maneuver = maneuver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maneuver]
  }
  @scala.inline
  implicit class ManeuverOps[Self <: Maneuver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManeuver(value: js.Array[Id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maneuver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

