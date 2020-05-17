package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2PrismaticJointDef extends b2JointDef {
  /**
  		* Enable/disable the joint limit.
  		**/
  var enableLimit: Boolean = js.native
  /**
  		* Enable/disable the joint motor.
  		**/
  var enableMotor: Boolean = js.native
  /**
  		* The local anchor point relative to body1's origin.
  		**/
  var localAnchorA: b2Vec2 = js.native
  /**
  		* The local anchor point relative to body2's origin.
  		**/
  var localAnchorB: b2Vec2 = js.native
  /**
  		* The local translation axis in body1.
  		**/
  var localAxisA: b2Vec2 = js.native
  /**
  		* The lower translation limit, usually in meters.
  		**/
  var lowerTranslation: Double = js.native
  /**
  		* The maximum motor torque, usually in N-m.
  		**/
  var maxMotorForce: Double = js.native
  /**
  		* The desired motor speed in radians per second.
  		**/
  var motorSpeed: Double = js.native
  /**
  		* The constrained angle between the bodies: bodyB_angle - bodyA_angle.
  		**/
  var referenceAngle: Double = js.native
  /**
  		* The upper translation limit, usually in meters.
  		**/
  var upperTranslation: Double = js.native
  /**
  		* Initialize the joint.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param anchor Anchor.
  		* @param axis Axis.
  		**/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2, axis: b2Vec2): Unit = js.native
}

object b2PrismaticJointDef {
  @scala.inline
  def apply(
    Initialize: (b2Body, b2Body, b2Vec2, b2Vec2) => Unit,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    enableLimit: Boolean,
    enableMotor: Boolean,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    localAxisA: b2Vec2,
    lowerTranslation: Double,
    maxMotorForce: Double,
    motorSpeed: Double,
    referenceAngle: Double,
    `type`: Double,
    upperTranslation: Double,
    userData: js.Any
  ): b2PrismaticJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction4(Initialize), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], enableLimit = enableLimit.asInstanceOf[js.Any], enableMotor = enableMotor.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], localAxisA = localAxisA.asInstanceOf[js.Any], lowerTranslation = lowerTranslation.asInstanceOf[js.Any], maxMotorForce = maxMotorForce.asInstanceOf[js.Any], motorSpeed = motorSpeed.asInstanceOf[js.Any], referenceAngle = referenceAngle.asInstanceOf[js.Any], upperTranslation = upperTranslation.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2PrismaticJointDef]
  }
  @scala.inline
  implicit class b2PrismaticJointDefOps[Self <: b2PrismaticJointDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialize(value: (b2Body, b2Body, b2Vec2, b2Vec2) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initialize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withEnableLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableMotor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMotor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalAnchorA(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalAnchorB(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAnchorB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalAxisA(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAxisA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowerTranslation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMotorForce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMotorForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotorSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motorSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpperTranslation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperTranslation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

