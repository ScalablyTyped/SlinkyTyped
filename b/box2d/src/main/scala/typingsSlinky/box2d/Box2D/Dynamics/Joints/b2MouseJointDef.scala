package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2MouseJointDef extends b2JointDef {
  /**
  		* The damping ratio. 0 = no damping, 1 = critical damping.
  		**/
  var dampingRatio: Double = js.native
  /**
  		* The response speed.
  		**/
  var frequencyHz: Double = js.native
  /**
  		* The maximum constraint force that can be exerted to move the candidate body.
  		**/
  var maxForce: Double = js.native
}

object b2MouseJointDef {
  @scala.inline
  def apply(
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    dampingRatio: Double,
    frequencyHz: Double,
    maxForce: Double,
    `type`: Double,
    userData: js.Any
  ): b2MouseJointDef = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], dampingRatio = dampingRatio.asInstanceOf[js.Any], frequencyHz = frequencyHz.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2MouseJointDef]
  }
  @scala.inline
  implicit class b2MouseJointDefOps[Self <: b2MouseJointDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDampingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dampingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequencyHz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyHz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxForce")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

