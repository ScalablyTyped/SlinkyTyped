package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonFloodlightActivityGroupIds
import typingsSlinky.gapiClientDfareporting.AnonFloodlightActivityId
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivitiesResource extends js.Object {
  /** Deletes an existing floodlight activity. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Generates a tag for a floodlight activity. */
  def generatetag(request: AnonFloodlightActivityId): Request_[FloodlightActivitiesGenerateTagResponse] = js.native
  /** Gets one floodlight activity by ID. */
  def get(request: AnonFields): Request_[FloodlightActivity] = js.native
  /** Inserts a new floodlight activity. */
  def insert(request: AnonKey): Request_[FloodlightActivity] = js.native
  /** Retrieves a list of floodlight activities, possibly filtered. This method supports paging. */
  def list(request: AnonFloodlightActivityGroupIds): Request_[FloodlightActivitiesListResponse] = js.native
  /** Updates an existing floodlight activity. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[FloodlightActivity] = js.native
  /** Updates an existing floodlight activity. */
  def update(request: AnonKey): Request_[FloodlightActivity] = js.native
}

object FloodlightActivitiesResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    generatetag: AnonFloodlightActivityId => Request_[FloodlightActivitiesGenerateTagResponse],
    get: AnonFields => Request_[FloodlightActivity],
    insert: AnonKey => Request_[FloodlightActivity],
    list: AnonFloodlightActivityGroupIds => Request_[FloodlightActivitiesListResponse],
    patch: AnonFields => Request_[FloodlightActivity],
    update: AnonKey => Request_[FloodlightActivity]
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
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGeneratetag(value: AnonFloodlightActivityId => Request_[FloodlightActivitiesGenerateTagResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatetag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[FloodlightActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[FloodlightActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFloodlightActivityGroupIds => Request_[FloodlightActivitiesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[FloodlightActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[FloodlightActivity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

