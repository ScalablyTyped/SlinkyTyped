package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonCompatibilities
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import typingsSlinky.gapiClientDfareporting.AnonPlacementIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementsResource extends js.Object {
  /** Generates tags for a placement. */
  def generatetags(request: AnonPlacementIds): Request_[PlacementsGenerateTagsResponse] = js.native
  /** Gets one placement by ID. */
  def get(request: AnonFields): Request_[Placement] = js.native
  /** Inserts a new placement. */
  def insert(request: AnonKey): Request_[Placement] = js.native
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(request: AnonCompatibilities): Request_[PlacementsListResponse] = js.native
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Placement] = js.native
  /** Updates an existing placement. */
  def update(request: AnonKey): Request_[Placement] = js.native
}

object PlacementsResource {
  @scala.inline
  def apply(
    generatetags: AnonPlacementIds => Request_[PlacementsGenerateTagsResponse],
    get: AnonFields => Request_[Placement],
    insert: AnonKey => Request_[Placement],
    list: AnonCompatibilities => Request_[PlacementsListResponse],
    patch: AnonFields => Request_[Placement],
    update: AnonKey => Request_[Placement]
  ): PlacementsResource = {
    val __obj = js.Dynamic.literal(generatetags = js.Any.fromFunction1(generatetags), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlacementsResource]
  }
  @scala.inline
  implicit class PlacementsResourceOps[Self <: PlacementsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneratetags(value: AnonPlacementIds => Request_[PlacementsGenerateTagsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatetags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[Placement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[Placement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCompatibilities => Request_[PlacementsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[Placement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[Placement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

