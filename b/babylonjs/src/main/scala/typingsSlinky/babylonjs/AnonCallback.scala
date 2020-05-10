package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallback extends js.Object {
  var otherImpostors: js.Array[PhysicsImpostor] = js.native
  def callback(collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor): Unit = js.native
}

object AnonCallback {
  @scala.inline
  def apply(callback: (PhysicsImpostor, PhysicsImpostor) => Unit, otherImpostors: js.Array[PhysicsImpostor]): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), otherImpostors = otherImpostors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback]
  }
  @scala.inline
  implicit class AnonCallbackOps[Self <: AnonCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: (PhysicsImpostor, PhysicsImpostor) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOtherImpostors(value: js.Array[PhysicsImpostor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherImpostors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

