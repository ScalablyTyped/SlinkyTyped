package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.FloodlightActivityGroupIds
import typingsSlinky.gapiClientDfareporting.anon.FloodlightActivityId
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivitiesResource extends js.Object {
  /** Deletes an existing floodlight activity. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Generates a tag for a floodlight activity. */
  def generatetag(request: FloodlightActivityId): Request[FloodlightActivitiesGenerateTagResponse] = js.native
  /** Gets one floodlight activity by ID. */
  def get(request: Fields): Request[FloodlightActivity] = js.native
  /** Inserts a new floodlight activity. */
  def insert(request: Key): Request[FloodlightActivity] = js.native
  /** Retrieves a list of floodlight activities, possibly filtered. This method supports paging. */
  def list(request: FloodlightActivityGroupIds): Request[FloodlightActivitiesListResponse] = js.native
  /** Updates an existing floodlight activity. This method supports patch semantics. */
  def patch(request: Fields): Request[FloodlightActivity] = js.native
  /** Updates an existing floodlight activity. */
  def update(request: Key): Request[FloodlightActivity] = js.native
}

object FloodlightActivitiesResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    generatetag: FloodlightActivityId => Request[FloodlightActivitiesGenerateTagResponse],
    get: Fields => Request[FloodlightActivity],
    insert: Key => Request[FloodlightActivity],
    list: FloodlightActivityGroupIds => Request[FloodlightActivitiesListResponse],
    patch: Fields => Request[FloodlightActivity],
    update: Key => Request[FloodlightActivity]
  ): FloodlightActivitiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), generatetag = js.Any.fromFunction1(generatetag), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FloodlightActivitiesResource]
  }
  @scala.inline
  implicit class FloodlightActivitiesResourceOps[Self <: FloodlightActivitiesResource] (val x: Self) extends AnyVal {
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
    def withGeneratetag(value: FloodlightActivityId => Request[FloodlightActivitiesGenerateTagResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatetag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[FloodlightActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[FloodlightActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: FloodlightActivityGroupIds => Request[FloodlightActivitiesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[FloodlightActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[FloodlightActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

