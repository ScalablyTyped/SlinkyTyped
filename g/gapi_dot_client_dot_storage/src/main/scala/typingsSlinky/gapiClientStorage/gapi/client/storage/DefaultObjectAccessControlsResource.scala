package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientStorage.anon.Alt
import typingsSlinky.gapiClientStorage.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the default object ACL entry for the specified entity on the specified bucket. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Returns the default object ACL entry for the specified entity on the specified bucket. */
  def get(request: Alt): Request[ObjectAccessControl] = js.native
  /** Creates a new default object ACL entry on the specified bucket. */
  def insert(request: typingsSlinky.gapiClientStorage.anon.Bucket): Request[ObjectAccessControl] = js.native
  /** Retrieves default object ACL entries on the specified bucket. */
  def list(request: Fields): Request[ObjectAccessControls] = js.native
  /** Updates a default object ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: Alt): Request[ObjectAccessControl] = js.native
  /** Updates a default object ACL entry on the specified bucket. */
  def update(request: Alt): Request[ObjectAccessControl] = js.native
}

object DefaultObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[ObjectAccessControl],
    insert: typingsSlinky.gapiClientStorage.anon.Bucket => Request[ObjectAccessControl],
    list: Fields => Request[ObjectAccessControls],
    patch: Alt => Request[ObjectAccessControl],
    update: Alt => Request[ObjectAccessControl]
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
    def withDelete(value: Alt => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Alt => Request[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: typingsSlinky.gapiClientStorage.anon.Bucket => Request[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[ObjectAccessControls]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Alt => Request[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Alt => Request[ObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

