package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDrive.anon.Q
import typingsSlinky.gapiClientDrive.anon.RequestId
import typingsSlinky.gapiClientDrive.anon.TeamDriveId
import typingsSlinky.gapiClientDrive.anon.UseDomainAdminAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamdrivesResource extends js.Object {
  /** Creates a new Team Drive. */
  def create(request: RequestId): Request[TeamDrive] = js.native
  /** Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items. */
  def delete(request: TeamDriveId): Request[Unit] = js.native
  /** Gets a Team Drive's metadata by ID. */
  def get(request: UseDomainAdminAccess): Request[TeamDrive] = js.native
  /** Lists the user's Team Drives. */
  def list(request: Q): Request[TeamDriveList] = js.native
  /** Updates a Team Drive's metadata */
  def update(request: TeamDriveId): Request[TeamDrive] = js.native
}

object TeamdrivesResource {
  @scala.inline
  def apply(
    create: RequestId => Request[TeamDrive],
    delete: TeamDriveId => Request[Unit],
    get: UseDomainAdminAccess => Request[TeamDrive],
    list: Q => Request[TeamDriveList],
    update: TeamDriveId => Request[TeamDrive]
  ): TeamdrivesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TeamdrivesResource]
  }
  @scala.inline
  implicit class TeamdrivesResourceOps[Self <: TeamdrivesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: RequestId => Request[TeamDrive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: TeamDriveId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: UseDomainAdminAccess => Request[TeamDrive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Q => Request[TeamDriveList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: TeamDriveId => Request[TeamDrive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

