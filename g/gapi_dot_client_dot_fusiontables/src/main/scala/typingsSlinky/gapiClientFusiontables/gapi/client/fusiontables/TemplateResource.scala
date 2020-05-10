package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFusiontables.AnonFields
import typingsSlinky.gapiClientFusiontables.AnonKey
import typingsSlinky.gapiClientFusiontables.AnonTemplateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateResource extends js.Object {
  /** Deletes a template */
  def delete(request: AnonTemplateId): Request_[Unit] = js.native
  /** Retrieves a specific template by its id */
  def get(request: AnonTemplateId): Request_[Template] = js.native
  /** Creates a new template for the table. */
  def insert(request: AnonFields): Request_[Template] = js.native
  /** Retrieves a list of templates. */
  def list(request: AnonKey): Request_[TemplateList] = js.native
  /** Updates an existing template. This method supports patch semantics. */
  def patch(request: AnonTemplateId): Request_[Template] = js.native
  /** Updates an existing template */
  def update(request: AnonTemplateId): Request_[Template] = js.native
}

object TemplateResource {
  @scala.inline
  def apply(
    delete: AnonTemplateId => Request_[Unit],
    get: AnonTemplateId => Request_[Template],
    insert: AnonFields => Request_[Template],
    list: AnonKey => Request_[TemplateList],
    patch: AnonTemplateId => Request_[Template],
    update: AnonTemplateId => Request_[Template]
  ): TemplateResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TemplateResource]
  }
  @scala.inline
  implicit class TemplateResourceOps[Self <: TemplateResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonTemplateId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonTemplateId => Request_[Template]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[Template]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[TemplateList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonTemplateId => Request_[Template]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonTemplateId => Request_[Template]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

