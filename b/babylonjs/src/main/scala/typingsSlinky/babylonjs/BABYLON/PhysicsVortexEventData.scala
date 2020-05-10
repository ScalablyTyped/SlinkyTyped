package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsVortexEventData extends js.Object {
  /**
    * A cylinder used for the vortex event
    */
  var cylinder: Mesh = js.native
}

object PhysicsVortexEventData {
  @scala.inline
  def apply(cylinder: Mesh): PhysicsVortexEventData = {
    val __obj = js.Dynamic.literal(cylinder = cylinder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsVortexEventData]
  }
  @scala.inline
  implicit class PhysicsVortexEventDataOps[Self <: PhysicsVortexEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCylinder(value: Mesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cylinder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

