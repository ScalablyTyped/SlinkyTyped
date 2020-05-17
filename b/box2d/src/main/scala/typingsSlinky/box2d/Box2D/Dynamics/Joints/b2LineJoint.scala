package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2LineJoint extends b2Joint {
  /**
  		* Enable/disable the joint limit.
  		* @param flag True to enable, false to disable limits
  		**/
  def EnableLimit(flag: Boolean): Unit = js.native
  /**
  		* Enable/disable the joint motor.
  		* @param flag True to enable, false to disable the motor.
  		**/
  def EnableMotor(flag: Boolean): Unit = js.native
  /**
  		* Get the current joint translation speed, usually in meters per second.
  		* @return Joint speed.
  		**/
  def GetJointSpeed(): Double = js.native
  /**
  		* Get the current joint translation, usually in meters.
  		* @return Joint translation.
  		**/
  def GetJointTranslation(): Double = js.native
  /**
  		* Get the lower joint limit, usually in meters.
  		* @return Lower limit.
  		**/
  def GetLowerLimit(): Double = js.native
  /**
  		* Get the maximum motor force, usually in N.
  		* @return Max motor force.
  		**/
  def GetMaxMotorForce(): Double = js.native
  /**
  		* Get the current motor force, usually in N.
  		* @return Motor force.
  		**/
  def GetMotorForce(): Double = js.native
  /**
  		* Get the motor speed, usually in meters per second.
  		* @return Motor speed.
  		**/
  def GetMotorSpeed(): Double = js.native
  /**
  		* Get the upper joint limit, usually in meters.
  		* @return Upper limit.
  		**/
  def GetUpperLimit(): Double = js.native
  /**
  		* Is the joint limit enabled?
  		* @return True if enabled otherwise false.
  		**/
  def IsLimitEnabled(): Boolean = js.native
  /**
  		* Is the joint motor enabled?
  		* @return True if enabled, otherwise false.
  		**/
  def IsMotorEnabled(): Boolean = js.native
  /**
  		* Set the joint limits, usually in meters.
  		* @param lower Lower limit.
  		* @param upper Upper limit.
  		**/
  def SetLimits(lower: Double, upper: Double): Unit = js.native
  /**
  		* Set the maximum motor force, usually in N.
  		* @param force New max motor force.
  		**/
  def SetMaxMotorForce(force: Double): Unit = js.native
  /**
  		* Set the motor speed, usually in meters per second.
  		* @param speed New motor speed.
  		**/
  def SetMotorSpeed(speed: Double): Unit = js.native
}

object b2LineJoint {
  @scala.inline
  def apply(
    EnableLimit: Boolean => Unit,
    EnableMotor: Boolean => Unit,
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetJointSpeed: () => Double,
    GetJointTranslation: () => Double,
    GetLowerLimit: () => Double,
    GetMaxMotorForce: () => Double,
    GetMotorForce: () => Double,
    GetMotorSpeed: () => Double,
    GetNext: () => b2Joint,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUpperLimit: () => Double,
    GetUserData: () => js.Any,
    IsActive: () => Boolean,
    IsLimitEnabled: () => Boolean,
    IsMotorEnabled: () => Boolean,
    SetLimits: (Double, Double) => Unit,
    SetMaxMotorForce: Double => Unit,
    SetMotorSpeed: Double => Unit,
    SetUserData: js.Any => Unit
  ): b2LineJoint = {
    val __obj = js.Dynamic.literal(EnableLimit = js.Any.fromFunction1(EnableLimit), EnableMotor = js.Any.fromFunction1(EnableMotor), GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetJointSpeed = js.Any.fromFunction0(GetJointSpeed), GetJointTranslation = js.Any.fromFunction0(GetJointTranslation), GetLowerLimit = js.Any.fromFunction0(GetLowerLimit), GetMaxMotorForce = js.Any.fromFunction0(GetMaxMotorForce), GetMotorForce = js.Any.fromFunction0(GetMotorForce), GetMotorSpeed = js.Any.fromFunction0(GetMotorSpeed), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUpperLimit = js.Any.fromFunction0(GetUpperLimit), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), IsLimitEnabled = js.Any.fromFunction0(IsLimitEnabled), IsMotorEnabled = js.Any.fromFunction0(IsMotorEnabled), SetLimits = js.Any.fromFunction2(SetLimits), SetMaxMotorForce = js.Any.fromFunction1(SetMaxMotorForce), SetMotorSpeed = js.Any.fromFunction1(SetMotorSpeed), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2LineJoint]
  }
  @scala.inline
  implicit class b2LineJointOps[Self <: b2LineJoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableLimit(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableMotor(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableMotor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetJointSpeed(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetJointSpeed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetJointTranslation(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetJointTranslation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLowerLimit(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLowerLimit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaxMotorForce(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMaxMotorForce")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMotorForce(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMotorForce")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMotorSpeed(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMotorSpeed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUpperLimit(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUpperLimit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLimitEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLimitEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMotorEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMotorEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLimits(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetLimits")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMaxMotorForce(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMaxMotorForce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMotorSpeed(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMotorSpeed")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

