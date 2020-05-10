package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonCreativeFieldId
import typingsSlinky.gapiClientDfareporting.AnonProfileId
import typingsSlinky.gapiClientDfareporting.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeFieldValuesResource extends js.Object {
  /** Deletes an existing creative field value. */
  def delete(request: AnonCreativeFieldId): Request_[Unit] = js.native
  /** Gets one creative field value by ID. */
  def get(request: AnonCreativeFieldId): Request_[CreativeFieldValue] = js.native
  /** Inserts a new creative field value. */
  def insert(request: AnonProfileId): Request_[CreativeFieldValue] = js.native
  /** Retrieves a list of creative field values, possibly filtered. This method supports paging. */
  def list(request: AnonQuotaUser): Request_[CreativeFieldValuesListResponse] = js.native
  /** Updates an existing creative field value. This method supports patch semantics. */
  def patch(request: AnonCreativeFieldId): Request_[CreativeFieldValue] = js.native
  /** Updates an existing creative field value. */
  def update(request: AnonProfileId): Request_[CreativeFieldValue] = js.native
}

object CreativeFieldValuesResource {
  @scala.inline
  def apply(
    delete: AnonCreativeFieldId => Request_[Unit],
    get: AnonCreativeFieldId => Request_[CreativeFieldValue],
    insert: AnonProfileId => Request_[CreativeFieldValue],
    list: AnonQuotaUser => Request_[CreativeFieldValuesListResponse],
    patch: AnonCreativeFieldId => Request_[CreativeFieldValue],
    update: AnonProfileId => Request_[CreativeFieldValue]
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
    def withDelete(value: AnonCreativeFieldId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonCreativeFieldId => Request_[CreativeFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonProfileId => Request_[CreativeFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonQuotaUser => Request_[CreativeFieldValuesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonCreativeFieldId => Request_[CreativeFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonProfileId => Request_[CreativeFieldValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

