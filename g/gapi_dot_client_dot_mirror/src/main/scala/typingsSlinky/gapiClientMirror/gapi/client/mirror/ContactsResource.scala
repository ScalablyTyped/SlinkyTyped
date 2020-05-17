package typingsSlinky.gapiClientMirror.gapi.client.mirror

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientMirror.anon.Alt
import typingsSlinky.gapiClientMirror.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactsResource extends js.Object {
  /** Deletes a contact. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Gets a single contact by ID. */
  def get(request: Alt): Request[Contact] = js.native
  /** Inserts a new contact. */
  def insert(request: Fields): Request[Contact] = js.native
  /** Retrieves a list of contacts for the authenticated user. */
  def list(request: Fields): Request[ContactsListResponse] = js.native
  /** Updates a contact in place. This method supports patch semantics. */
  def patch(request: Alt): Request[Contact] = js.native
  /** Updates a contact in place. */
  def update(request: Alt): Request[Contact] = js.native
}

object ContactsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[Contact],
    insert: Fields => Request[Contact],
    list: Fields => Request[ContactsListResponse],
    patch: Alt => Request[Contact],
    update: Alt => Request[Contact]
  ): ContactsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ContactsResource]
  }
  @scala.inline
  implicit class ContactsResourceOps[Self <: ContactsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Fields => Request[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[ContactsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Alt => Request[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Alt => Request[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

