package typingsSlinky.gapiClientStorage.gapi.client.storage

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientStorage.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified bucket. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Returns the ACL entry for the specified entity on the specified bucket. */
  def get(request: Alt): Request[BucketAccessControl] = js.native
  /** Creates a new ACL entry on the specified bucket. */
  def insert(request: typingsSlinky.gapiClientStorage.anon.Bucket): Request[BucketAccessControl] = js.native
  /** Retrieves ACL entries on the specified bucket. */
  def list(request: typingsSlinky.gapiClientStorage.anon.Bucket): Request[BucketAccessControls] = js.native
  /** Updates an ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: Alt): Request[BucketAccessControl] = js.native
  /** Updates an ACL entry on the specified bucket. */
  def update(request: Alt): Request[BucketAccessControl] = js.native
}

object BucketAccessControlsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[BucketAccessControl],
    insert: typingsSlinky.gapiClientStorage.anon.Bucket => Request[BucketAccessControl],
    list: typingsSlinky.gapiClientStorage.anon.Bucket => Request[BucketAccessControls],
    patch: Alt => Request[BucketAccessControl],
    update: Alt => Request[BucketAccessControl]
  ): BucketAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BucketAccessControlsResource]
  }
  @scala.inline
  implicit class BucketAccessControlsResourceOps[Self <: BucketAccessControlsResource] (val x: Self) extends AnyVal {
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
    def withGet(value: Alt => Request[BucketAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: typingsSlinky.gapiClientStorage.anon.Bucket => Request[BucketAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: typingsSlinky.gapiClientStorage.anon.Bucket => Request[BucketAccessControls]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Alt => Request[BucketAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Alt => Request[BucketAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

