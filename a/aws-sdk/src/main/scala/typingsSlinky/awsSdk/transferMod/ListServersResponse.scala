package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServersResponse extends js.Object {
  /**
    * When you can get additional results from the ListServers operation, a NextToken parameter is returned in the output. In a following command, you can pass in the NextToken parameter to continue listing additional servers.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.transferMod.NextToken] = js.native
  /**
    * An array of servers that were listed.
    */
  var Servers: ListedServers = js.native
}

object ListServersResponse {
  @scala.inline
  def apply(Servers: ListedServers): ListServersResponse = {
    val __obj = js.Dynamic.literal(Servers = Servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServersResponse]
  }
  @scala.inline
  implicit class ListServersResponseOps[Self <: ListServersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServers(value: ListedServers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Servers")(value.asInstanceOf[js.Any])
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

