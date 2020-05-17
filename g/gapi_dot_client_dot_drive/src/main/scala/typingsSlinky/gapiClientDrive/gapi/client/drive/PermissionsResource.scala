package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDrive.anon.EmailMessage
import typingsSlinky.gapiClientDrive.anon.PageSize
import typingsSlinky.gapiClientDrive.anon.PermissionId
import typingsSlinky.gapiClientDrive.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionsResource extends js.Object {
  /** Creates a permission for a file or Team Drive. */
  def create(request: EmailMessage): Request[Permission] = js.native
  /** Deletes a permission. */
  def delete(request: PermissionId): Request[Unit] = js.native
  /** Gets a permission by ID. */
  def get(request: PermissionId): Request[Permission] = js.native
  /** Lists a file's or Team Drive's permissions. */
  def list(request: PageSize): Request[PermissionList] = js.native
  /** Updates a permission with patch semantics. */
  def update(request: QuotaUser): Request[Permission] = js.native
}

object PermissionsResource {
  @scala.inline
  def apply(
    create: EmailMessage => Request[Permission],
    delete: PermissionId => Request[Unit],
    get: PermissionId => Request[Permission],
    list: PageSize => Request[PermissionList],
    update: QuotaUser => Request[Permission]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PermissionsResource]
  }
  @scala.inline
  implicit class PermissionsResourceOps[Self <: PermissionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: EmailMessage => Request[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: PermissionId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: PermissionId => Request[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: PageSize => Request[PermissionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: QuotaUser => Request[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

