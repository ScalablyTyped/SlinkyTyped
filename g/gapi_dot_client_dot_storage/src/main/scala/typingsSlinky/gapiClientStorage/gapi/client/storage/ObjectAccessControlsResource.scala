package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientStorage.AnonObject
import typingsSlinky.gapiClientStorage.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(request: AnonObject): Request_[Unit] = js.native
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(request: AnonObject): Request_[ObjectAccessControl] = js.native
  /** Creates a new ACL entry on the specified object. */
  def insert(request: AnonQuotaUser): Request_[ObjectAccessControl] = js.native
  /** Retrieves ACL entries on the specified object. */
  def list(request: AnonQuotaUser): Request_[ObjectAccessControls] = js.native
  /** Updates an ACL entry on the specified object. This method supports patch semantics. */
  def patch(request: AnonObject): Request_[ObjectAccessControl] = js.native
  /** Updates an ACL entry on the specified object. */
  def update(request: AnonObject): Request_[ObjectAccessControl] = js.native
}

object ObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: AnonObject => Request_[Unit],
    get: AnonObject => Request_[ObjectAccessControl],
    insert: AnonQuotaUser => Request_[ObjectAccessControl],
    list: AnonQuotaUser => Request_[ObjectAccessControls],
    patch: AnonObject => Request_[ObjectAccessControl],
    update: AnonObject => Request_[ObjectAccessControl]
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
    def withDelete(value: AnonObject => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonObject => Request_[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonQuotaUser => Request_[ObjectAccessControls]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonObject => Request_[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonObject => Request_[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

