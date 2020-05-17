package typingsSlinky.box2d.Box2D.Dynamics.Contacts

import typingsSlinky.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2ContactEdge extends js.Object {
  /**
  		* Contact.
  		**/
  var contact: b2Contact = js.native
  /**
  		* Next contact edge.
  		**/
  var next: b2ContactEdge = js.native
  /**
  		* Contact body.
  		**/
  var other: b2Body = js.native
  /**
  		* Previous contact edge.
  		**/
  var prev: b2ContactEdge = js.native
}

object b2ContactEdge {
  @scala.inline
  def apply(contact: b2Contact, next: b2ContactEdge, other: b2Body, prev: b2ContactEdge): b2ContactEdge = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactEdge]
  }
  @scala.inline
  implicit class b2ContactEdgeOps[Self <: b2ContactEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContact(value: b2Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: b2ContactEdge): Self = {
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
    def withPrev(value: b2ContactEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

