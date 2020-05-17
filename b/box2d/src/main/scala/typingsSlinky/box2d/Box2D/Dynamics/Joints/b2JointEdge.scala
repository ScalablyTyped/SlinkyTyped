package typingsSlinky.box2d.Box2D.Dynamics.Joints

import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2JointEdge extends js.Object {
  /**
  		* The joint.
  		**/
  var joint: b2Joint = js.native
  /**
  		* The next joint edge in the body's joint list.
  		**/
  var next: b2JointEdge = js.native
  /**
  		* Provides quick access to the other body attached.
  		**/
  var other: b2Body = js.native
  /**
  		* The previous joint edge in the body's joint list.
  		**/
  var prev: b2JointEdge = js.native
}

object b2JointEdge {
  @scala.inline
  def apply(joint: b2Joint, next: b2JointEdge, other: b2Body, prev: b2JointEdge): b2JointEdge = {
    val __obj = js.Dynamic.literal(joint = joint.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2JointEdge]
  }
  @scala.inline
  implicit class b2JointEdgeOps[Self <: b2JointEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJoint(value: b2Joint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: b2JointEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: b2Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrev(value: b2JointEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

