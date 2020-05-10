package typingsSlinky.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ContactGroup is is a group of contacts.
  */
@js.native
trait ContactGroup extends js.Object {
  def addContact(contact: Contact): ContactGroup = js.native
  def deleteGroup(): Unit = js.native
  def getContacts(): js.Array[Contact] = js.native
  /** @deprecated DO NOT USE */ def getGroupName(): String = js.native
  def getId(): String = js.native
  def getName(): String = js.native
  def isSystemGroup(): Boolean = js.native
  def removeContact(contact: Contact): ContactGroup = js.native
  /** @deprecated DO NOT USE */ def setGroupName(name: String): Unit = js.native
  def setName(name: String): ContactGroup = js.native
}

object ContactGroup {
  @scala.inline
  def apply(
    addContact: Contact => ContactGroup,
    deleteGroup: () => Unit,
    getContacts: () => js.Array[Contact],
    getGroupName: () => String,
    getId: () => String,
    getName: () => String,
    isSystemGroup: () => Boolean,
    removeContact: Contact => ContactGroup,
    setGroupName: String => Unit,
    setName: String => ContactGroup
  ): ContactGroup = {
    val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction1(addContact), deleteGroup = js.Any.fromFunction0(deleteGroup), getContacts = js.Any.fromFunction0(getContacts), getGroupName = js.Any.fromFunction0(getGroupName), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), isSystemGroup = js.Any.fromFunction0(isSystemGroup), removeContact = js.Any.fromFunction1(removeContact), setGroupName = js.Any.fromFunction1(setGroupName), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[ContactGroup]
  }
  @scala.inline
  implicit class ContactGroupOps[Self <: ContactGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddContact(value: Contact => ContactGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addContact")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteGroup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContacts(value: () => js.Array[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContacts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetGroupName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSystemGroup(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystemGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveContact(value: Contact => ContactGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeContact")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetGroupName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGroupName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetName(value: String => ContactGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

