package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends js.Object {
  
  def callback(collider: PhysicsImpostor, collidedAgainst: PhysicsImpostor): Unit = js.native
  
  var otherImpostors: js.Array[PhysicsImpostor] = js.native
}
object Callback {
  
  @scala.inline
  def apply(callback: (PhysicsImpostor, PhysicsImpostor) => Unit, otherImpostors: js.Array[PhysicsImpostor]): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), otherImpostors = otherImpostors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(value: (PhysicsImpostor, PhysicsImpostor) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOtherImpostorsVarargs(value: PhysicsImpostor*): Self = this.set("otherImpostors", js.Array(value :_*))
    
    @scala.inline
    def setOtherImpostors(value: js.Array[PhysicsImpostor]): Self = this.set("otherImpostors", value.asInstanceOf[js.Any])
  }
}
