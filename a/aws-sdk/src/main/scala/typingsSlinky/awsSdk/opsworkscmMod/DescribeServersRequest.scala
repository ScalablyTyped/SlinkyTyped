package typingsSlinky.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServersRequest extends js.Object {
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.MaxResults] = js.native
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.NextToken] = js.native
  /**
    * Describes the server with the specified ServerName.
    */
  var ServerName: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.ServerName] = js.native
}

object DescribeServersRequest {
  @scala.inline
  def apply(): DescribeServersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServersRequest]
  }
  @scala.inline
  implicit class DescribeServersRequestOps[Self <: DescribeServersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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
    @scala.inline
    def withServerName(value: ServerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerName")(js.undefined)
        ret
    }
  }
  
}

