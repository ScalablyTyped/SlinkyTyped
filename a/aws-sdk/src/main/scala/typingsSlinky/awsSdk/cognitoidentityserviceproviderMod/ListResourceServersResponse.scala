package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceServersResponse extends js.Object {
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  /**
    * The resource servers.
    */
  var ResourceServers: ResourceServersListType = js.native
}

object ListResourceServersResponse {
  @scala.inline
  def apply(ResourceServers: ResourceServersListType): ListResourceServersResponse = {
    val __obj = js.Dynamic.literal(ResourceServers = ResourceServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceServersResponse]
  }
  @scala.inline
  implicit class ListResourceServersResponseOps[Self <: ListResourceServersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceServers(value: ResourceServersListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationKeyType): Self = {
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

