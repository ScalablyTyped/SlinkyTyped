package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksListForRefResponseCheckRunsItemPullRequestsItem extends js.Object {
  var base: ChecksListForRefResponseCheckRunsItemPullRequestsItemBase = js.native
  var head: ChecksListForRefResponseCheckRunsItemPullRequestsItemHead = js.native
  var id: Double = js.native
  var number: Double = js.native
  var url: String = js.native
}

object ChecksListForRefResponseCheckRunsItemPullRequestsItem {
  @scala.inline
  def apply(
    base: ChecksListForRefResponseCheckRunsItemPullRequestsItemBase,
    head: ChecksListForRefResponseCheckRunsItemPullRequestsItemHead,
    id: Double,
    number: Double,
    url: String
  ): ChecksListForRefResponseCheckRunsItemPullRequestsItem = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForRefResponseCheckRunsItemPullRequestsItem]
  }
  @scala.inline
  implicit class ChecksListForRefResponseCheckRunsItemPullRequestsItemOps[Self <: ChecksListForRefResponseCheckRunsItemPullRequestsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: ChecksListForRefResponseCheckRunsItemPullRequestsItemBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead(value: ChecksListForRefResponseCheckRunsItemPullRequestsItemHead): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

