package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonAlt
import typingsSlinky.gapiClientGmail.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelsResource extends js.Object {
  /** Creates a new label. */
  def create(request: AnonAlt): Request_[Label] = js.native
  /** Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets the specified label. */
  def get(request: AnonFields): Request_[Label] = js.native
  /** Lists all labels in the user's mailbox. */
  def list(request: AnonAlt): Request_[ListLabelsResponse] = js.native
  /** Updates the specified label. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Label] = js.native
  /** Updates the specified label. */
  def update(request: AnonFields): Request_[Label] = js.native
}

object LabelsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Label],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Label],
    list: AnonAlt => Request_[ListLabelsResponse],
    patch: AnonFields => Request_[Label],
    update: AnonFields => Request_[Label]
  ): LabelsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LabelsResource]
  }
  @scala.inline
  implicit class LabelsResourceOps[Self <: LabelsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Label]): Self = {
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
    def withGet(value: AnonFields => Request_[Label]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListLabelsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[Label]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonFields => Request_[Label]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

