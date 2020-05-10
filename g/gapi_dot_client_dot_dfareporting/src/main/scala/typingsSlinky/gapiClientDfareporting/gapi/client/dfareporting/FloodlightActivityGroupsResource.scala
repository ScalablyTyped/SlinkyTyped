package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonFloodlightConfigurationId
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivityGroupsResource extends js.Object {
  /** Gets one floodlight activity group by ID. */
  def get(request: AnonFields): Request_[FloodlightActivityGroup] = js.native
  /** Inserts a new floodlight activity group. */
  def insert(request: AnonKey): Request_[FloodlightActivityGroup] = js.native
  /** Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging. */
  def list(request: AnonFloodlightConfigurationId): Request_[FloodlightActivityGroupsListResponse] = js.native
  /** Updates an existing floodlight activity group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[FloodlightActivityGroup] = js.native
  /** Updates an existing floodlight activity group. */
  def update(request: AnonKey): Request_[FloodlightActivityGroup] = js.native
}

object FloodlightActivityGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[FloodlightActivityGroup],
    insert: AnonKey => Request_[FloodlightActivityGroup],
    list: AnonFloodlightConfigurationId => Request_[FloodlightActivityGroupsListResponse],
    patch: AnonFields => Request_[FloodlightActivityGroup],
    update: AnonKey => Request_[FloodlightActivityGroup]
  ): FloodlightActivityGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FloodlightActivityGroupsResource]
  }
  @scala.inline
  implicit class FloodlightActivityGroupsResourceOps[Self <: FloodlightActivityGroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[FloodlightActivityGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[FloodlightActivityGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFloodlightConfigurationId => Request_[FloodlightActivityGroupsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[FloodlightActivityGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[FloodlightActivityGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

