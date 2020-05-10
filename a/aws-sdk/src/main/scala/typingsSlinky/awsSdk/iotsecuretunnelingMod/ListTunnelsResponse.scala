package typingsSlinky.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTunnelsResponse extends js.Object {
  /**
    * A token to used to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A short description of the tunnels in an AWS account.
    */
  var tunnelSummaries: js.UndefOr[TunnelSummaryList] = js.native
}

object ListTunnelsResponse {
  @scala.inline
  def apply(): ListTunnelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTunnelsResponse]
  }
  @scala.inline
  implicit class ListTunnelsResponseOps[Self <: ListTunnelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnelSummaries(value: TunnelSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnelSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnelSummaries")(js.undefined)
        ret
    }
  }
  
}

