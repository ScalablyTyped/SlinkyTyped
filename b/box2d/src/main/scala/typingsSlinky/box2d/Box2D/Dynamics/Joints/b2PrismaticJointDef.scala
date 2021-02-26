package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2PrismaticJointDef extends b2JointDef {
  
  /**
    * Initialize the joint.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchor Anchor.
    * @param axis Axis.
    **/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2, axis: b2Vec2): Unit = js.native
  
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
  implicit class b2PrismaticJointDefMutableBuilder[Self <: b2PrismaticJointDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableLimit(value: Boolean): Self = StObject.set(x, "enableLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMotor(value: Boolean): Self = StObject.set(x, "enableMotor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialize(value: (b2Body, b2Body, b2Vec2, b2Vec2) => Unit): Self = StObject.set(x, "Initialize", js.Any.fromFunction4(value))
    
    @scala.inline
    def setLocalAnchorA(value: b2Vec2): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorB(value: b2Vec2): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAxisA(value: b2Vec2): Self = StObject.set(x, "localAxisA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerTranslation(value: Double): Self = StObject.set(x, "lowerTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMotorForce(value: Double): Self = StObject.set(x, "maxMotorForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotorSpeed(value: Double): Self = StObject.set(x, "motorSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceAngle(value: Double): Self = StObject.set(x, "referenceAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperTranslation(value: Double): Self = StObject.set(x, "upperTranslation", value.asInstanceOf[js.Any])
  }
}
