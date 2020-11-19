package typingsSlinky.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckCollisionObject extends js.Object {
  
  /**
    * Will bodies collide with the bottom side of the world bounds?
    */
  var down: Boolean = js.native
  
  /**
    * Will bodies collide with the left side of the world bounds?
    */
  var left: Boolean = js.native
  
  /**
    * Will bodies collide with the right side of the world bounds?
    */
  var right: Boolean = js.native
  
  /**
    * Will bodies collide with the top side of the world bounds?
    */
  var up: Boolean = js.native
}
object CheckCollisionObject {
  
  @scala.inline
  def apply(down: Boolean, left: Boolean, right: Boolean, up: Boolean): CheckCollisionObject = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckCollisionObject]
  }
  
  @scala.inline
  implicit class CheckCollisionObjectOps[Self <: CheckCollisionObject] (val x: Self) extends AnyVal {
    
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
    def setDown(value: Boolean): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Boolean): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Boolean): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: Boolean): Self = this.set("up", value.asInstanceOf[js.Any])
  }
}
