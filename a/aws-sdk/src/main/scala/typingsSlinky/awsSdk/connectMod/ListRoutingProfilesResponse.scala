package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRoutingProfilesResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.NextToken] = js.native
  /**
    * Information about the routing profiles.
    */
  var RoutingProfileSummaryList: js.UndefOr[typingsSlinky.awsSdk.connectMod.RoutingProfileSummaryList] = js.native
}

object ListRoutingProfilesResponse {
  @scala.inline
  def apply(): ListRoutingProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoutingProfilesResponse]
  }
  @scala.inline
  implicit class ListRoutingProfilesResponseOps[Self <: ListRoutingProfilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingProfileSummaryList(value: RoutingProfileSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingProfileSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingProfileSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoutingProfileSummaryList")(js.undefined)
        ret
    }
  }
  
}

