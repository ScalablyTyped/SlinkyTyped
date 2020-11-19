package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCylinder(value: Mesh): Self = this.set("cylinder", value.asInstanceOf[js.Any])
  }
}
