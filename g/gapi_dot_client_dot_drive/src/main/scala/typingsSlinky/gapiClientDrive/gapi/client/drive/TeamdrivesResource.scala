package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDrive.AnonQ
import typingsSlinky.gapiClientDrive.AnonRequestId
import typingsSlinky.gapiClientDrive.AnonTeamDriveId
import typingsSlinky.gapiClientDrive.AnonUseDomainAdminAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamdrivesResource extends js.Object {
  /** Creates a new Team Drive. */
  def create(request: AnonRequestId): Request_[TeamDrive] = js.native
  /** Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items. */
  def delete(request: AnonTeamDriveId): Request_[Unit] = js.native
  /** Gets a Team Drive's metadata by ID. */
  def get(request: AnonUseDomainAdminAccess): Request_[TeamDrive] = js.native
  /** Lists the user's Team Drives. */
  def list(request: AnonQ): Request_[TeamDriveList] = js.native
  /** Updates a Team Drive's metadata */
  def update(request: AnonTeamDriveId): Request_[TeamDrive] = js.native
}

object TeamdrivesResource {
  @scala.inline
  def apply(
    create: AnonRequestId => Request_[TeamDrive],
    delete: AnonTeamDriveId => Request_[Unit],
    get: AnonUseDomainAdminAccess => Request_[TeamDrive],
    list: AnonQ => Request_[TeamDriveList],
    update: AnonTeamDriveId => Request_[TeamDrive]
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
    def withCreate(value: AnonRequestId => Request_[TeamDrive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonTeamDriveId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonUseDomainAdminAccess => Request_[TeamDrive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonQ => Request_[TeamDriveList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonTeamDriveId => Request_[TeamDrive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

