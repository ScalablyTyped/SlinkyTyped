package typingsSlinky.gapiClientFusiontables.gapi.client.fusiontables

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientFusiontables.anon.Fields
import typingsSlinky.gapiClientFusiontables.anon.Key
import typingsSlinky.gapiClientFusiontables.anon.TemplateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateResource extends js.Object {
  /** Deletes a template */
  def delete(request: TemplateId): Request[Unit] = js.native
  /** Retrieves a specific template by its id */
  def get(request: TemplateId): Request[Template] = js.native
  /** Creates a new template for the table. */
  def insert(request: Fields): Request[Template] = js.native
  /** Retrieves a list of templates. */
  def list(request: Key): Request[TemplateList] = js.native
  /** Updates an existing template. This method supports patch semantics. */
  def patch(request: TemplateId): Request[Template] = js.native
  /** Updates an existing template */
  def update(request: TemplateId): Request[Template] = js.native
}

object TemplateResource {
  @scala.inline
  def apply(
    delete: TemplateId => Request[Unit],
    get: TemplateId => Request[Template],
    insert: Fields => Request[Template],
    list: Key => Request[TemplateList],
    patch: TemplateId => Request[Template],
    update: TemplateId => Request[Template]
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
    def withDelete(value: TemplateId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: TemplateId => Request[Template]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Fields => Request[Template]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[TemplateList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: TemplateId => Request[Template]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: TemplateId => Request[Template]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

