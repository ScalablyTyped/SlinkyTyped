package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientStorage.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(request: typingsSlinky.gapiClientStorage.anon.Object): Request[Unit] = js.native
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(request: typingsSlinky.gapiClientStorage.anon.Object): Request[ObjectAccessControl] = js.native
  /** Creates a new ACL entry on the specified object. */
  def insert(request: QuotaUser): Request[ObjectAccessControl] = js.native
  /** Retrieves ACL entries on the specified object. */
  def list(request: QuotaUser): Request[ObjectAccessControls] = js.native
  /** Updates an ACL entry on the specified object. This method supports patch semantics. */
  def patch(request: typingsSlinky.gapiClientStorage.anon.Object): Request[ObjectAccessControl] = js.native
  /** Updates an ACL entry on the specified object. */
  def update(request: typingsSlinky.gapiClientStorage.anon.Object): Request[ObjectAccessControl] = js.native
}

object ObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: typingsSlinky.gapiClientStorage.anon.Object => Request[Unit],
    get: typingsSlinky.gapiClientStorage.anon.Object => Request[ObjectAccessControl],
    insert: QuotaUser => Request[ObjectAccessControl],
    list: QuotaUser => Request[ObjectAccessControls],
    patch: typingsSlinky.gapiClientStorage.anon.Object => Request[ObjectAccessControl],
    update: typingsSlinky.gapiClientStorage.anon.Object => Request[ObjectAccessControl]
  ): ObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ObjectAccessControlsResource]
  }
  @scala.inline
  implicit class ObjectAccessControlsResourceOps[Self <: ObjectAccessControlsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: typingsSlinky.gapiClientStorage.anon.Object => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: typingsSlinky.gapiClientStorage.anon.Object => Request[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: QuotaUser => Request[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: QuotaUser => Request[ObjectAccessControls]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: typingsSlinky.gapiClientStorage.anon.Object => Request[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: typingsSlinky.gapiClientStorage.anon.Object => Request[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

