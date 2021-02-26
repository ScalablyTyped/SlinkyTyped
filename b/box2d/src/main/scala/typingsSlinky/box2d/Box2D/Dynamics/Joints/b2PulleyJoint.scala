package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2PulleyJoint extends b2Joint {
  
  /**
    * Get the first ground anchor.
    **/
  def GetGroundAnchorA(): b2Vec2 = js.native
  
  /**
    * Get the second ground anchor.
    **/
  def GetGroundAnchorB(): b2Vec2 = js.native
  
  /**
    * Get the current length of the segment attached to body1.
    **/
  def GetLength1(): Double = js.native
  
  /**
    * Get the current length of the segment attached to body2.
    **/
  def GetLength2(): Double = js.native
  
  /**
    * Get the pulley ratio.
    **/
  def GetRatio(): Double = js.native
}
object b2PulleyJoint {
  
  @scala.inline
  def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetGroundAnchorA: () => b2Vec2,
    GetGroundAnchorB: () => b2Vec2,
    GetLength1: () => Double,
    GetLength2: () => Double,
    GetNext: () => b2Joint,
    GetRatio: () => Double,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUserData: () => js.Any,
    IsActive: () => Boolean,
    SetUserData: js.Any => Unit
  ): b2PulleyJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetGroundAnchorA = js.Any.fromFunction0(GetGroundAnchorA), GetGroundAnchorB = js.Any.fromFunction0(GetGroundAnchorB), GetLength1 = js.Any.fromFunction0(GetLength1), GetLength2 = js.Any.fromFunction0(GetLength2), GetNext = js.Any.fromFunction0(GetNext), GetRatio = js.Any.fromFunction0(GetRatio), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2PulleyJoint]
  }
  
  @scala.inline
  implicit class b2PulleyJointMutableBuilder[Self <: b2PulleyJoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGroundAnchorA(value: () => b2Vec2): Self = StObject.set(x, "GetGroundAnchorA", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroundAnchorB(value: () => b2Vec2): Self = StObject.set(x, "GetGroundAnchorB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength1(value: () => Double): Self = StObject.set(x, "GetLength1", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength2(value: () => Double): Self = StObject.set(x, "GetLength2", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRatio(value: () => Double): Self = StObject.set(x, "GetRatio", js.Any.fromFunction0(value))
  }
}
