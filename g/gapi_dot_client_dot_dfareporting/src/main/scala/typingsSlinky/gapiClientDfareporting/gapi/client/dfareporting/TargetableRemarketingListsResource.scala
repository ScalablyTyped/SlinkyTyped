package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.ActiveAdvertiserId
import typingsSlinky.gapiClientDfareporting.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetableRemarketingListsResource extends js.Object {
  /** Gets one remarketing list by ID. */
  def get(request: Fields): Request[TargetableRemarketingList] = js.native
  /** Retrieves a list of targetable remarketing lists, possibly filtered. This method supports paging. */
  def list(request: ActiveAdvertiserId): Request[TargetableRemarketingListsListResponse] = js.native
}

object TargetableRemarketingListsResource {
  @scala.inline
  def apply(
    get: Fields => Request[TargetableRemarketingList],
    list: ActiveAdvertiserId => Request[TargetableRemarketingListsListResponse]
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
    def withGet(value: Fields => Request[TargetableRemarketingList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: ActiveAdvertiserId => Request[TargetableRemarketingListsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

