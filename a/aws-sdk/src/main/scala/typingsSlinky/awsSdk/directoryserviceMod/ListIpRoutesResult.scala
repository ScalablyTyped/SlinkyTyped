package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIpRoutesResult extends js.Object {
  /**
    * A list of IpRoutes.
    */
  var IpRoutesInfo: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.IpRoutesInfo] = js.native
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListIpRoutes to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
}

object ListIpRoutesResult {
  @scala.inline
  def apply(): ListIpRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIpRoutesResult]
  }
  @scala.inline
  implicit class ListIpRoutesResultOps[Self <: ListIpRoutesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpRoutesInfo(value: IpRoutesInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRoutesInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpRoutesInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpRoutesInfo")(js.undefined)
        ret
    }
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
  }
  
}

