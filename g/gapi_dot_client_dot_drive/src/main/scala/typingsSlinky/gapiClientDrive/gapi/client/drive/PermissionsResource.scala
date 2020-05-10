package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDrive.AnonEmailMessage
import typingsSlinky.gapiClientDrive.AnonPageSize
import typingsSlinky.gapiClientDrive.AnonPermissionId
import typingsSlinky.gapiClientDrive.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionsResource extends js.Object {
  /** Creates a permission for a file or Team Drive. */
  def create(request: AnonEmailMessage): Request_[Permission] = js.native
  /** Deletes a permission. */
  def delete(request: AnonPermissionId): Request_[Unit] = js.native
  /** Gets a permission by ID. */
  def get(request: AnonPermissionId): Request_[Permission] = js.native
  /** Lists a file's or Team Drive's permissions. */
  def list(request: AnonPageSize): Request_[PermissionList] = js.native
  /** Updates a permission with patch semantics. */
  def update(request: AnonQuotaUser): Request_[Permission] = js.native
}

object PermissionsResource {
  @scala.inline
  def apply(
    create: AnonEmailMessage => Request_[Permission],
    delete: AnonPermissionId => Request_[Unit],
    get: AnonPermissionId => Request_[Permission],
    list: AnonPageSize => Request_[PermissionList],
    update: AnonQuotaUser => Request_[Permission]
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
    def withCreate(value: AnonEmailMessage => Request_[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonPermissionId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonPermissionId => Request_[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPageSize => Request_[PermissionList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonQuotaUser => Request_[Permission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

