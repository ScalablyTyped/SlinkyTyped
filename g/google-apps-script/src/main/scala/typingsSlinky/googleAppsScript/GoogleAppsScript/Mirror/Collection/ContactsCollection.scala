package typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.Contact
import typingsSlinky.googleAppsScript.GoogleAppsScript.Mirror.Schema.ContactsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactsCollection extends js.Object {
  // Gets a single contact by ID.
  def get(id: String): Contact = js.native
  // Inserts a new contact.
  def insert(resource: Contact): Contact = js.native
  // Retrieves a list of contacts for the authenticated user.
  def list(): ContactsListResponse = js.native
  // Updates a contact in place. This method supports patch semantics.
  def patch(resource: Contact, id: String): Contact = js.native
  // Deletes a contact.
  def remove(id: String): Unit = js.native
  // Updates a contact in place.
  def update(resource: Contact, id: String): Contact = js.native
}

object ContactsCollection {
  @scala.inline
  def apply(
    get: String => Contact,
    insert: Contact => Contact,
    list: () => ContactsListResponse,
    patch: (Contact, String) => Contact,
    remove: String => Unit,
    update: (Contact, String) => Contact
  ): ContactsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction0(list), patch = js.Any.fromFunction2(patch), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[ContactsCollection]
  }
  @scala.inline
  implicit class ContactsCollectionOps[Self <: ContactsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: String => Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Contact => Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: () => ContactsListResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPatch(value: (Contact, String) => Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (Contact, String) => Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

