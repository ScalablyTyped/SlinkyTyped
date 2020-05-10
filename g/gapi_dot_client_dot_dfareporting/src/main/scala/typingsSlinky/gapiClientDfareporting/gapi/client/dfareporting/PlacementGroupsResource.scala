package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonCampaignIds
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementGroupsResource extends js.Object {
  /** Gets one placement group by ID. */
  def get(request: AnonFields): Request_[PlacementGroup] = js.native
  /** Inserts a new placement group. */
  def insert(request: AnonKey): Request_[PlacementGroup] = js.native
  /** Retrieves a list of placement groups, possibly filtered. This method supports paging. */
  def list(request: AnonCampaignIds): Request_[PlacementGroupsListResponse] = js.native
  /** Updates an existing placement group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[PlacementGroup] = js.native
  /** Updates an existing placement group. */
  def update(request: AnonKey): Request_[PlacementGroup] = js.native
}

object PlacementGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[PlacementGroup],
    insert: AnonKey => Request_[PlacementGroup],
    list: AnonCampaignIds => Request_[PlacementGroupsListResponse],
    patch: AnonFields => Request_[PlacementGroup],
    update: AnonKey => Request_[PlacementGroup]
  ): PlacementGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlacementGroupsResource]
  }
  @scala.inline
  implicit class PlacementGroupsResourceOps[Self <: PlacementGroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[PlacementGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[PlacementGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCampaignIds => Request_[PlacementGroupsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[PlacementGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[PlacementGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

