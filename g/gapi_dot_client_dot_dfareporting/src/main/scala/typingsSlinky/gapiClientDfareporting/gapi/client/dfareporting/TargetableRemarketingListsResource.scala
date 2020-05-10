package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonActiveAdvertiserId
import typingsSlinky.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetableRemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: AnonFields): Request_[TargetableRemarketingList] = js.native
  /** Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging. */
  def list(request: AnonActiveAdvertiserId): Request_[TargetableRemarketingListsListResponse] = js.native
}

object TargetableRemarketingListsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[TargetableRemarketingList],
    list: AnonActiveAdvertiserId => Request_[TargetableRemarketingListsListResponse]
  ): TargetableRemarketingListsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TargetableRemarketingListsResource]
  }
  @scala.inline
  implicit class TargetableRemarketingListsResourceOps[Self <: TargetableRemarketingListsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[TargetableRemarketingList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonActiveAdvertiserId => Request_[TargetableRemarketingListsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

