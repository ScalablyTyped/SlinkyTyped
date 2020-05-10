package typingsSlinky.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonName extends js.Object {
  var name: String = js.native
  var occupancy: Double = js.native
  var occupants: js.Array[AnonState] = js.native
}

object AnonName {
  @scala.inline
  def apply(name: String, occupancy: Double, occupants: js.Array[AnonState]): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], occupancy = occupancy.asInstanceOf[js.Any], occupants = occupants.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
  @scala.inline
  implicit class AnonNameOps[Self <: AnonName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccupancy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occupancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOccupants(value: js.Array[AnonState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occupants")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

