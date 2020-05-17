package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.CreativeFieldId
import typingsSlinky.gapiClientDfareporting.anon.ProfileId
import typingsSlinky.gapiClientDfareporting.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: CreativeFieldId): Request[Unit] = js.native
  /** Gets one creative field value by ID. */
  def get(request: CreativeFieldId): Request[CreativeFieldValue] = js.native
  /** Inserts a new creative field value. */
  def insert(request: ProfileId): Request[CreativeFieldValue] = js.native
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(request: QuotaUser): Request[CreativeFieldValuesListResponse] = js.native
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: CreativeFieldId): Request[CreativeFieldValue] = js.native
  /** Updates an existing creative field value. */
  def update(request: ProfileId): Request[CreativeFieldValue] = js.native
}

object CreativeFieldValuesResource {
  @scala.inline
  def apply(
    delete: CreativeFieldId => Request[Unit],
    get: CreativeFieldId => Request[CreativeFieldValue],
    insert: ProfileId => Request[CreativeFieldValue],
    list: QuotaUser => Request[CreativeFieldValuesListResponse],
    patch: CreativeFieldId => Request[CreativeFieldValue],
    update: ProfileId => Request[CreativeFieldValue]
  ): CreativeFieldValuesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CreativeFieldValuesResource]
  }
  @scala.inline
  implicit class CreativeFieldValuesResourceOps[Self <: CreativeFieldValuesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: CreativeFieldId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: CreativeFieldId => Request[CreativeFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: ProfileId => Request[CreativeFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: QuotaUser => Request[CreativeFieldValuesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: CreativeFieldId => Request[CreativeFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: ProfileId => Request[CreativeFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

