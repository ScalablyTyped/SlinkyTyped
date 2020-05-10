package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDedicatedIpPoolsRequest extends js.Object {
  /**
    * A token returned from a previous call to ListDedicatedIpPools to indicate the position in the list of dedicated IP pools.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.NextToken] = js.native
  /**
    * The number of results to show in a single call to ListDedicatedIpPools. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
}

object ListDedicatedIpPoolsRequest {
  @scala.inline
  def apply(): ListDedicatedIpPoolsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDedicatedIpPoolsRequest]
  }
  @scala.inline
  implicit class ListDedicatedIpPoolsRequestOps[Self <: ListDedicatedIpPoolsRequest] (val x: Self) extends AnyVal {
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
    def withPageSize(value: MaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(js.undefined)
        ret
    }
  }
  
}

