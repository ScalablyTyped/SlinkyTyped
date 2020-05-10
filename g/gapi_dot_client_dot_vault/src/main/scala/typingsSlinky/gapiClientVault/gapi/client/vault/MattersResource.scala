package typingsSlinky.gapiClientVault.gapi.client.vault

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientVault.AnonAlt
import typingsSlinky.gapiClientVault.AnonCallback
import typingsSlinky.gapiClientVault.AnonFields
import typingsSlinky.gapiClientVault.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MattersResource extends js.Object {
  var holds: HoldsResource = js.native
  /** Adds an account as a matter collaborator. */
  def addPermissions(request: AnonAlt): Request_[MatterPermission] = js.native
  /** Closes the specified matter. Returns matter with updated state. */
  def close(request: AnonAlt): Request_[CloseMatterResponse] = js.native
  /**
    * Creates a new matter with the given name and description. The initial state
    * is open, and the owner is the method caller. Returns the created matter
    * with default view.
    */
  def create(request: AnonCallback): Request_[Matter] = js.native
  /** Deletes the specified matter. Returns matter with updated state. */
  def delete(request: AnonAlt): Request_[Matter] = js.native
  /** Gets the specified matter. */
  def get(request: AnonFields): Request_[Matter] = js.native
  /** Lists matters the user has access to. */
  def list(request: AnonKey): Request_[ListMattersResponse] = js.native
  /** Removes an account as a matter collaborator. */
  def removePermissions(request: AnonAlt): Request_[js.Object] = js.native
  /** Reopens the specified matter. Returns matter with updated state. */
  def reopen(request: AnonAlt): Request_[ReopenMatterResponse] = js.native
  /** Undeletes the specified matter. Returns matter with updated state. */
  def undelete(request: AnonAlt): Request_[Matter] = js.native
  /**
    * Updates the specified matter.
    * This updates only the name and description of the matter, identified by
    * matter id. Changes to any other fields are ignored.
    * Returns the default view of the matter.
    */
  def update(request: AnonAlt): Request_[Matter] = js.native
}

object MattersResource {
  @scala.inline
  def apply(
    addPermissions: AnonAlt => Request_[MatterPermission],
    close: AnonAlt => Request_[CloseMatterResponse],
    create: AnonCallback => Request_[Matter],
    delete: AnonAlt => Request_[Matter],
    get: AnonFields => Request_[Matter],
    holds: HoldsResource,
    list: AnonKey => Request_[ListMattersResponse],
    removePermissions: AnonAlt => Request_[js.Object],
    reopen: AnonAlt => Request_[ReopenMatterResponse],
    undelete: AnonAlt => Request_[Matter],
    update: AnonAlt => Request_[Matter]
  ): MattersResource = {
    val __obj = js.Dynamic.literal(addPermissions = js.Any.fromFunction1(addPermissions), close = js.Any.fromFunction1(close), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), holds = holds.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), removePermissions = js.Any.fromFunction1(removePermissions), reopen = js.Any.fromFunction1(reopen), undelete = js.Any.fromFunction1(undelete), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MattersResource]
  }
  @scala.inline
  implicit class MattersResourceOps[Self <: MattersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPermissions(value: AnonAlt => Request_[MatterPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClose(value: AnonAlt => Request_[CloseMatterResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: AnonCallback => Request_[Matter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAlt => Request_[Matter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Matter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHolds(value: HoldsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListMattersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePermissions(value: AnonAlt => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReopen(value: AnonAlt => Request_[ReopenMatterResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reopen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUndelete(value: AnonAlt => Request_[Matter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAlt => Request_[Matter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

