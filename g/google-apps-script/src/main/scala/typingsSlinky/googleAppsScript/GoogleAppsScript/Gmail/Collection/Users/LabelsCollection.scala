package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users

import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.Label
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListLabelsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelsCollection extends js.Object {
  // Creates a new label.
  def create(resource: Label, userId: String): Label = js.native
  // Gets the specified label.
  def get(userId: String, id: String): Label = js.native
  // Lists all labels in the user's mailbox.
  def list(userId: String): ListLabelsResponse = js.native
  // Updates the specified label. This method supports patch semantics.
  def patch(resource: Label, userId: String, id: String): Label = js.native
  // Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to.
  def remove(userId: String, id: String): Unit = js.native
  // Updates the specified label.
  def update(resource: Label, userId: String, id: String): Label = js.native
}

object LabelsCollection {
  @scala.inline
  def apply(
    create: (Label, String) => Label,
    get: (String, String) => Label,
    list: String => ListLabelsResponse,
    patch: (Label, String, String) => Label,
    remove: (String, String) => Unit,
    update: (Label, String, String) => Label
  ): LabelsCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction3(patch), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[LabelsCollection]
  }
  @scala.inline
  implicit class LabelsCollectionOps[Self <: LabelsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (Label, String) => Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet(value: (String, String) => Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: String => ListLabelsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: (Label, String, String) => Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemove(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (Label, String, String) => Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

