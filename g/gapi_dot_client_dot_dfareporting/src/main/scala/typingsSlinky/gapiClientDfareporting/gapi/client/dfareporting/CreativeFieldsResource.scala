package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import typingsSlinky.gapiClientDfareporting.anon.SearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeFieldsResource extends js.Object {
  /** Deletes an existing creative field. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets one creative field by ID. */
  def get(request: Fields): Request[CreativeField] = js.native
  /** Inserts a new creative field. */
  def insert(request: Key): Request[CreativeField] = js.native
  /** Retrieves a list of creative fields, possibly filtered. This method supports paging. */
  def list(request: SearchString): Request[CreativeFieldsListResponse] = js.native
  /** Updates an existing creative field. This method supports patch semantics. */
  def patch(request: Fields): Request[CreativeField] = js.native
  /** Updates an existing creative field. */
  def update(request: Key): Request[CreativeField] = js.native
}

object CreativeFieldsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[CreativeField],
    insert: Key => Request[CreativeField],
    list: SearchString => Request[CreativeFieldsListResponse],
    patch: Fields => Request[CreativeField],
    update: Key => Request[CreativeField]
  ): CreativeFieldsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeFieldsResource]
  }
  @scala.inline
  implicit class CreativeFieldsResourceOps[Self <: CreativeFieldsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[CreativeField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[CreativeField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: SearchString => Request[CreativeFieldsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[CreativeField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[CreativeField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

