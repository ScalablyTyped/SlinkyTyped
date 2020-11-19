package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2PrismaticJoint extends b2Joint {
  
  /**
    * Enable/disable the joint limit.
    * @param flag True to enable, false to disable.
    **/
  def EnableLimit(flag: Boolean): Unit = js.native
  
  /**
    * Enable/disable the joint motor.
    * @param flag True to enable, false to disable.
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
    * @param force New max force.
    **/
  def SetMaxMotorForce(force: Double): Unit = js.native
  
  /**
    * Set the motor speed, usually in meters per second.
    * @param speed New motor speed.
    **/
  def SetMotorSpeed(speed: Double): Unit = js.native
}
object b2PrismaticJoint {
  
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
  ): b2PrismaticJoint = {
    val __obj = js.Dynamic.literal(EnableLimit = js.Any.fromFunction1(EnableLimit), EnableMotor = js.Any.fromFunction1(EnableMotor), GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetJointSpeed = js.Any.fromFunction0(GetJointSpeed), GetJointTranslation = js.Any.fromFunction0(GetJointTranslation), GetLowerLimit = js.Any.fromFunction0(GetLowerLimit), GetMotorForce = js.Any.fromFunction0(GetMotorForce), GetMotorSpeed = js.Any.fromFunction0(GetMotorSpeed), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUpperLimit = js.Any.fromFunction0(GetUpperLimit), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), IsLimitEnabled = js.Any.fromFunction0(IsLimitEnabled), IsMotorEnabled = js.Any.fromFunction0(IsMotorEnabled), SetLimits = js.Any.fromFunction2(SetLimits), SetMaxMotorForce = js.Any.fromFunction1(SetMaxMotorForce), SetMotorSpeed = js.Any.fromFunction1(SetMotorSpeed), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2PrismaticJoint]
  }
  
  @scala.inline
  implicit class b2PrismaticJointOps[Self <: b2PrismaticJoint] (val x: Self) extends AnyVal {
    
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
    def setEnableLimit(value: Boolean => Unit): Self = this.set("EnableLimit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableMotor(value: Boolean => Unit): Self = this.set("EnableMotor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJointSpeed(value: () => Double): Self = this.set("GetJointSpeed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetJointTranslation(value: () => Double): Self = this.set("GetJointTranslation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLowerLimit(value: () => Double): Self = this.set("GetLowerLimit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMotorForce(value: () => Double): Self = this.set("GetMotorForce", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMotorSpeed(value: () => Double): Self = this.set("GetMotorSpeed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpperLimit(value: () => Double): Self = this.set("GetUpperLimit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLimitEnabled(value: () => Boolean): Self = this.set("IsLimitEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMotorEnabled(value: () => Boolean): Self = this.set("IsMotorEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLimits(value: (Double, Double) => Unit): Self = this.set("SetLimits", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetMaxMotorForce(value: Double => Unit): Self = this.set("SetMaxMotorForce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMotorSpeed(value: Double => Unit): Self = this.set("SetMotorSpeed", js.Any.fromFunction1(value))
  }
}
