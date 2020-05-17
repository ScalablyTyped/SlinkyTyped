package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Joint extends js.Object {
  /**
  		* Get the anchor point on bodyA in world coordinates.
  		* @return Anchor A point.
  		**/
  def GetAnchorA(): b2Vec2 = js.native
  /**
  		* Get the anchor point on bodyB in world coordinates.
  		* @return Anchor B point.
  		**/
  def GetAnchorB(): b2Vec2 = js.native
  /**
  		* Get the first body attached to this joint.
  		* @return Body A.
  		**/
  def GetBodyA(): b2Body = js.native
  /**
  		* Get the second body attached to this joint.
  		* @return Body B.
  		**/
  def GetBodyB(): b2Body = js.native
  /**
  		* Get the next joint the world joint list.
  		* @return Next joint.
  		**/
  def GetNext(): b2Joint = js.native
  /**
  		* Get the reaction force on body2 at the joint anchor in Newtons.
  		* @param inv_dt
  		* @return Reaction force (N)
  		**/
  def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
  /**
  		* Get the reaction torque on body2 in N.
  		* @param inv_dt
  		* @return Reaction torque (N).
  		**/
  def GetReactionTorque(inv_dt: Double): Double = js.native
  /**
  		* Get the type of the concrete joint.
  		* @return Joint type.
  		**/
  def GetType(): Double = js.native
  /**
  		* Get the user data pointer.
  		* @return User data.  Cast to your data type.
  		**/
  def GetUserData(): js.Any = js.native
  /**
  		* Short-cut function to determine if either body is inactive.
  		* @return True if active, otherwise false.
  		**/
  def IsActive(): Boolean = js.native
  /**
  		* Set the user data pointer.
  		* @param data Your custom data.
  		**/
  def SetUserData(data: js.Any): Unit = js.native
}

object b2Joint {
  @scala.inline
  def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetNext: () => b2Joint,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUserData: () => js.Any,
    IsActive: () => Boolean,
    SetUserData: js.Any => Unit
  ): b2Joint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2Joint]
  }
  @scala.inline
  implicit class b2JointOps[Self <: b2Joint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAnchorA(value: () => b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAnchorA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAnchorB(value: () => b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAnchorB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBodyA(value: () => b2Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBodyA")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBodyB(value: () => b2Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBodyB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNext(value: () => b2Joint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetReactionForce(value: Double => b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetReactionForce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetReactionTorque(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetReactionTorque")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserData(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetUserData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetUserData(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetUserData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

