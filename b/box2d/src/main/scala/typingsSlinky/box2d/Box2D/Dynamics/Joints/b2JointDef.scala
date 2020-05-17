package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2JointDef extends js.Object {
  /**
  		* The first attached body.
  		**/
  var bodyA: b2Body = js.native
  /**
  		* The second attached body.
  		**/
  var bodyB: b2Body = js.native
  /**
  		* Set this flag to true if the attached bodies should collide.
  		**/
  var collideConnected: Boolean = js.native
  /**
  		* The joint type is set automatically for concrete joint types.
  		**/
  var `type`: Double = js.native
  /**
  		* Use this to attach application specific data to your joints.
  		**/
  var userData: js.Any = js.native
}

object b2JointDef {
  @scala.inline
  def apply(bodyA: b2Body, bodyB: b2Body, collideConnected: Boolean, `type`: Double, userData: js.Any): b2JointDef = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2JointDef]
  }
  @scala.inline
  implicit class b2JointDefOps[Self <: b2JointDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyA(value: b2Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyB(value: b2Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollideConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideConnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

