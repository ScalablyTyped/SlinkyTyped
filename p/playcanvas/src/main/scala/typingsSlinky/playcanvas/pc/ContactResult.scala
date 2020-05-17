package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ContactResult
  * @classdesc Object holding the result of a contact between two Entities.
  * @description Create a new ContactResult.
  * @param {pc.Entity} other - The entity that was involved in the contact with this entity.
  * @param {pc.ContactPoint[]} contacts - An array of ContactPoints with the other entity.
  * @property {pc.Entity} other The entity that was involved in the contact with this entity.
  * @property {pc.ContactPoint[]} contacts An array of ContactPoints with the other entity.
  */
@js.native
trait ContactResult extends js.Object {
  /**
    * An array of ContactPoints with the other entity.
    */
  var contacts: js.Array[ContactPoint] = js.native
  /**
    * The entity that was involved in the contact with this entity.
    */
  var other: Entity = js.native
}

object ContactResult {
  @scala.inline
  def apply(contacts: js.Array[ContactPoint], other: Entity): ContactResult = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactResult]
  }
  @scala.inline
  implicit class ContactResultOps[Self <: ContactResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContacts(value: js.Array[ContactPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOther(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

