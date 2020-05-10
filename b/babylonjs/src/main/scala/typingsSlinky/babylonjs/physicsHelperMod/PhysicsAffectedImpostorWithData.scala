package typingsSlinky.babylonjs.physicsHelperMod

import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsAffectedImpostorWithData extends js.Object {
  /**
    * The data about the hit/horce from the explosion
    */
  var hitData: PhysicsHitData = js.native
  /**
    * The impostor affected by the effect
    */
  var impostor: PhysicsImpostor = js.native
}

object PhysicsAffectedImpostorWithData {
  @scala.inline
  def apply(hitData: PhysicsHitData, impostor: PhysicsImpostor): PhysicsAffectedImpostorWithData = {
    val __obj = js.Dynamic.literal(hitData = hitData.asInstanceOf[js.Any], impostor = impostor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsAffectedImpostorWithData]
  }
  @scala.inline
  implicit class PhysicsAffectedImpostorWithDataOps[Self <: PhysicsAffectedImpostorWithData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHitData(value: PhysicsHitData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpostor(value: PhysicsImpostor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impostor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

