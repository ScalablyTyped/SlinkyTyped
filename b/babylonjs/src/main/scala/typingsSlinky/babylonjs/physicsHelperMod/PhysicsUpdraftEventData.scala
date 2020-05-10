package typingsSlinky.babylonjs.physicsHelperMod

import typingsSlinky.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsUpdraftEventData extends js.Object {
  /**
    * A cylinder used for the updraft event
    */
  var cylinder: Mesh = js.native
}

object PhysicsUpdraftEventData {
  @scala.inline
  def apply(cylinder: Mesh): PhysicsUpdraftEventData = {
    val __obj = js.Dynamic.literal(cylinder = cylinder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsUpdraftEventData]
  }
  @scala.inline
  implicit class PhysicsUpdraftEventDataOps[Self <: PhysicsUpdraftEventData] (val x: Self) extends AnyVal {
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

