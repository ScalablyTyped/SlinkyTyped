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
trait TriggersResource extends js.Object {
  /** Creates a GTM Trigger. */
  def create(request: AnonAlt): Request_[Trigger] = js.native
  /** Deletes a GTM Trigger. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets a GTM Trigger. */
  def get(request: AnonFields): Request_[Trigger] = js.native
  /** Lists all GTM Triggers of a Container. */
  def list(request: AnonKey): Request_[ListTriggersResponse] = js.native
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertTriggerResponse] = js.native
  /** Updates a GTM Trigger. */
  def update(request: AnonFingerprint): Request_[Trigger] = js.native
}

object TriggersResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Trigger],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Trigger],
    list: AnonKey => Request_[ListTriggersResponse],
    revert: AnonFingerprint => Request_[RevertTriggerResponse],
    update: AnonFingerprint => Request_[Trigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TriggersResource]
  }
  @scala.inline
  implicit class TriggersResourceOps[Self <: TriggersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Trigger]): Self = {
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
    def withGet(value: AnonFields => Request_[Trigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListTriggersResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRevert(value: AnonFingerprint => Request_[RevertTriggerResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFingerprint => Request_[Trigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

