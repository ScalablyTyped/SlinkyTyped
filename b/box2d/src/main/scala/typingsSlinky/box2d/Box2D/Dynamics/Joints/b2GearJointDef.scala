package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2GearJointDef extends b2JointDef {
  
  /**
    * The first revolute/prismatic joint attached to the gear joint.
    **/
  var joint1: b2Joint = js.native
  
  /**
    * The second revolute/prismatic joint attached to the gear joint.
    **/
  var joint2: b2Joint = js.native
  
  /**
    * The gear ratio.
    **/
  var ratio: Double = js.native
}
object b2GearJointDef {
  
  @scala.inline
  def apply(
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    joint1: b2Joint,
    joint2: b2Joint,
    ratio: Double,
    `type`: Double,
    userData: js.Any
  ): b2GearJointDef = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], joint1 = joint1.asInstanceOf[js.Any], joint2 = joint2.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2GearJointDef]
  }
  
  @scala.inline
  implicit class b2GearJointDefOps[Self <: b2GearJointDef] (val x: Self) extends AnyVal {
    
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
    def setJoint1(value: b2Joint): Self = this.set("joint1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoint2(value: b2Joint): Self = this.set("joint2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
  }
}
