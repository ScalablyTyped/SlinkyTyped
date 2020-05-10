package typingsSlinky.gapiClientTagmanager.gapi.client.tagmanager

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTagmanager.AnonAlt
import typingsSlinky.gapiClientTagmanager.AnonFields
import typingsSlinky.gapiClientTagmanager.AnonFingerprint
import typingsSlinky.gapiClientTagmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariablesResource extends js.Object {
  /** Creates a GTM Variable. */
  def create(request: AnonAlt): Request_[Variable] = js.native
  /** Deletes a GTM Variable. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets a GTM Variable. */
  def get(request: AnonFields): Request_[Variable] = js.native
  /** Lists all GTM Variables of a Container. */
  def list(request: AnonKey): Request_[ListVariablesResponse] = js.native
  /** Reverts changes to a GTM Variable in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertVariableResponse] = js.native
  /** Updates a GTM Variable. */
  def update(request: AnonFingerprint): Request_[Variable] = js.native
}

object VariablesResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Variable],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Variable],
    list: AnonKey => Request_[ListVariablesResponse],
    revert: AnonFingerprint => Request_[RevertVariableResponse],
    update: AnonFingerprint => Request_[Variable]
  ): VariablesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[VariablesResource]
  }
  @scala.inline
  implicit class VariablesResourceOps[Self <: VariablesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Variable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Variable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListVariablesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: AnonFingerprint => Request_[RevertVariableResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFingerprint => Request_[Variable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

