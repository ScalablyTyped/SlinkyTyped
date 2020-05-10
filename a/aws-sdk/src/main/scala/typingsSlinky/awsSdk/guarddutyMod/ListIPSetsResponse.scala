package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIPSetsResponse extends js.Object {
  /**
    * The IDs of the IPSet resources.
    */
  var IpSetIds: typingsSlinky.awsSdk.guarddutyMod.IpSetIds = js.native
  /**
    * Pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListIPSetsResponse {
  @scala.inline
  def apply(IpSetIds: IpSetIds): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal(IpSetIds = IpSetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIPSetsResponse]
  }
  @scala.inline
  implicit class ListIPSetsResponseOps[Self <: ListIPSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpSetIds(value: IpSetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpSetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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
  }
  
}

