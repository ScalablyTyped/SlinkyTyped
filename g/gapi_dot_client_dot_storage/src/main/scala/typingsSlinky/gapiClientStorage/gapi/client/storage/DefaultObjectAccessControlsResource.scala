package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientStorage.AnonAlt
import typingsSlinky.gapiClientStorage.AnonBucket
import typingsSlinky.gapiClientStorage.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the default object ACL entry for the specified entity on the specified bucket. */
  def delete(request: AnonAlt): Request_[Unit] = js.native
  /** Returns the default object ACL entry for the specified entity on the specified bucket. */
  def get(request: AnonAlt): Request_[ObjectAccessControl] = js.native
  /** Creates a new default object ACL entry on the specified bucket. */
  def insert(request: AnonBucket): Request_[ObjectAccessControl] = js.native
  /** Retrieves default object ACL entries on the specified bucket. */
  def list(request: AnonFields): Request_[ObjectAccessControls] = js.native
  /** Updates a default object ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[ObjectAccessControl] = js.native
  /** Updates a default object ACL entry on the specified bucket. */
  def update(request: AnonAlt): Request_[ObjectAccessControl] = js.native
}

object DefaultObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[ObjectAccessControl],
    insert: AnonBucket => Request_[ObjectAccessControl],
    list: AnonFields => Request_[ObjectAccessControls],
    patch: AnonAlt => Request_[ObjectAccessControl],
    update: AnonAlt => Request_[ObjectAccessControl]
  ): DefaultObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DefaultObjectAccessControlsResource]
  }
  @scala.inline
  implicit class DefaultObjectAccessControlsResourceOps[Self <: DefaultObjectAccessControlsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAlt => Request_[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonBucket => Request_[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[ObjectAccessControls]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonAlt => Request_[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAlt => Request_[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

