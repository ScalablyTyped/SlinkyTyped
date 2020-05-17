package typingsSlinky.gapiClientVault.gapi.client.vault

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientVault.anon.Alt
import typingsSlinky.gapiClientVault.anon.Callback
import typingsSlinky.gapiClientVault.anon.Fields
import typingsSlinky.gapiClientVault.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MattersResource extends js.Object {
  var holds: HoldsResource = js.native
  /** Adds an account as a matter collaborator. */
  def addPermissions(request: Alt): Request[MatterPermission] = js.native
  /** Closes the specified matter. Returns matter with updated state. */
  def close(request: Alt): Request[CloseMatterResponse] = js.native
  /**
    * Creates a new matter with the given name and description. The initial state
    * is open, and the owner is the method caller. Returns the created matter
    * with default view.
    */
  def create(request: Callback): Request[Matter] = js.native
  /** Deletes the specified matter. Returns matter with updated state. */
  def delete(request: Alt): Request[Matter] = js.native
  /** Gets the specified matter. */
  def get(request: Fields): Request[Matter] = js.native
  /** Lists matters the user has access to. */
  def list(request: Key): Request[ListMattersResponse] = js.native
  /** Removes an account as a matter collaborator. */
  def removePermissions(request: Alt): Request[js.Object] = js.native
  /** Reopens the specified matter. Returns matter with updated state. */
  def reopen(request: Alt): Request[ReopenMatterResponse] = js.native
  /** Undeletes the specified matter. Returns matter with updated state. */
  def undelete(request: Alt): Request[Matter] = js.native
  /**
    * Updates the specified matter.
    * This updates only the name and description of the matter, identified by
    * matter id. Changes to any other fields are ignored.
    * Returns the default view of the matter.
    */
  def update(request: Alt): Request[Matter] = js.native
}

object MattersResource {
  @scala.inline
  def apply(
    addPermissions: Alt => Request[MatterPermission],
    close: Alt => Request[CloseMatterResponse],
    create: Callback => Request[Matter],
    delete: Alt => Request[Matter],
    get: Fields => Request[Matter],
    holds: HoldsResource,
    list: Key => Request[ListMattersResponse],
    removePermissions: Alt => Request[js.Object],
    reopen: Alt => Request[ReopenMatterResponse],
    undelete: Alt => Request[Matter],
    update: Alt => Request[Matter]
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
    def withAddPermissions(value: Alt => Request[MatterPermission]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClose(value: Alt => Request[CloseMatterResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: Callback => Request[Matter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Alt => Request[Matter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[Matter]): Self = {
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
    def withList(value: Key => Request[ListMattersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePermissions(value: Alt => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReopen(value: Alt => Request[ReopenMatterResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reopen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUndelete(value: Alt => Request[Matter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Alt => Request[Matter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

