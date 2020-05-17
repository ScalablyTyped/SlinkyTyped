package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Common.Math.b2Mat22
import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2FrictionJoint extends b2Joint {
  /**
  		* Angular mass.
  		**/
  var m_angularMass: Double = js.native
  /**
  		* Linear mass.
  		**/
  var m_linearMass: b2Mat22 = js.native
  /**
  		* Gets the max force.
  		* @return Max force.
  		**/
  def GetMaxForce(): Double = js.native
  /**
  		* Gets the max torque.
  		* @return Max torque.
  		**/
  def GetMaxTorque(): Double = js.native
  /**
  		* Sets the max force.
  		* @param force New max force.
  		**/
  def SetMaxForce(force: Double): Unit = js.native
  /**
  		* Sets the max torque.
  		* @param torque New max torque.
  		**/
  def SetMaxTorque(torque: Double): Unit = js.native
}

object b2FrictionJoint {
  @scala.inline
  def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetMaxForce: () => Double,
    GetMaxTorque: () => Double,
    GetNext: () => b2Joint,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetType: () => Double,
    GetUserData: () => js.Any,
    IsActive: () => Boolean,
    SetMaxForce: Double => Unit,
    SetMaxTorque: Double => Unit,
    SetUserData: js.Any => Unit,
    m_angularMass: Double,
    m_linearMass: b2Mat22
  ): b2FrictionJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetMaxForce = js.Any.fromFunction0(GetMaxForce), GetMaxTorque = js.Any.fromFunction0(GetMaxTorque), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetMaxForce = js.Any.fromFunction1(SetMaxForce), SetMaxTorque = js.Any.fromFunction1(SetMaxTorque), SetUserData = js.Any.fromFunction1(SetUserData), m_angularMass = m_angularMass.asInstanceOf[js.Any], m_linearMass = m_linearMass.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FrictionJoint]
  }
  @scala.inline
  implicit class b2FrictionJointOps[Self <: b2FrictionJoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMaxForce(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMaxForce")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaxTorque(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMaxTorque")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetMaxForce(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMaxForce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMaxTorque(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMaxTorque")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withM_angularMass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_angularMass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_linearMass(value: b2Mat22): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_linearMass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

