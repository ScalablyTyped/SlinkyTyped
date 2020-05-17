package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Compatibilities
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import typingsSlinky.gapiClientDfareporting.anon.PlacementIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementsResource extends js.Object {
  /** Generates tags for a placement. */
  def generatetags(request: PlacementIds): Request[PlacementsGenerateTagsResponse] = js.native
  /** Gets one placement by ID. */
  def get(request: Fields): Request[Placement] = js.native
  /** Inserts a new placement. */
  def insert(request: Key): Request[Placement] = js.native
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(request: Compatibilities): Request[PlacementsListResponse] = js.native
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: Fields): Request[Placement] = js.native
  /** Updates an existing placement. */
  def update(request: Key): Request[Placement] = js.native
}

object PlacementsResource {
  @scala.inline
  def apply(
    generatetags: PlacementIds => Request[PlacementsGenerateTagsResponse],
    get: Fields => Request[Placement],
    insert: Key => Request[Placement],
    list: Compatibilities => Request[PlacementsListResponse],
    patch: Fields => Request[Placement],
    update: Key => Request[Placement]
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
    def withGeneratetags(value: PlacementIds => Request[PlacementsGenerateTagsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatetags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[Placement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[Placement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Compatibilities => Request[PlacementsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[Placement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[Placement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

