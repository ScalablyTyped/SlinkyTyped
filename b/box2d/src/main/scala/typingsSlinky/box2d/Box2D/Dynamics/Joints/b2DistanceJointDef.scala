package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2DistanceJointDef extends b2JointDef {
  /**
  		* The damping ratio. 0 = no damping, 1 = critical damping.
  		**/
  var dampingRatio: Double = js.native
  /**
  		* The mass-spring-damper frequency in Hertz.
  		**/
  var frequencyHz: Double = js.native
  /**
  		* The natural length between the anchor points.
  		**/
  var length: Double = js.native
  /**
  		* The local anchor point relative to body1's origin.
  		**/
  var localAnchorA: b2Vec2 = js.native
  /**
  		* The local anchor point relative to body2's origin.
  		**/
  var localAnchorB: b2Vec2 = js.native
  /**
  		* Initialize the bodies, anchors, and length using the world anchors.
  		* @param bA Body A.
  		* @param bB Body B.
  		* @param anchorA Anchor A.
  		* @param anchorB Anchor B.
  		**/
  def Initialize(bA: b2Body, bB: b2Body, anchorA: b2Vec2, anchorB: b2Vec2): Unit = js.native
}

object b2DistanceJointDef {
  @scala.inline
  def apply(
    Initialize: (b2Body, b2Body, b2Vec2, b2Vec2) => Unit,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    dampingRatio: Double,
    frequencyHz: Double,
    length: Double,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    `type`: Double,
    userData: js.Any
  ): b2DistanceJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction4(Initialize), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], dampingRatio = dampingRatio.asInstanceOf[js.Any], frequencyHz = frequencyHz.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceJointDef]
  }
  @scala.inline
  implicit class b2DistanceJointDefOps[Self <: b2DistanceJointDef] (val x: Self) extends AnyVal {
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
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
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
  }
  
}

