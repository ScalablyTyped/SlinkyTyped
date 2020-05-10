package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import typingsSlinky.gapiClientDfareporting.AnonSearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeFieldsResource extends js.Object {
  /** Deletes an existing creative field. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets one creative field by ID. */
  def get(request: AnonFields): Request_[CreativeField] = js.native
  /** Inserts a new creative field. */
  def insert(request: AnonKey): Request_[CreativeField] = js.native
  /** Retrieves a list of creative fields, possibly filtered. This method supports paging. */
  def list(request: AnonSearchString): Request_[CreativeFieldsListResponse] = js.native
  /** Updates an existing creative field. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[CreativeField] = js.native
  /** Updates an existing creative field. */
  def update(request: AnonKey): Request_[CreativeField] = js.native
}

object CreativeFieldsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[CreativeField],
    insert: AnonKey => Request_[CreativeField],
    list: AnonSearchString => Request_[CreativeFieldsListResponse],
    patch: AnonFields => Request_[CreativeField],
    update: AnonKey => Request_[CreativeField]
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
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[CreativeField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[CreativeField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonSearchString => Request_[CreativeFieldsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[CreativeField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[CreativeField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

