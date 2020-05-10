package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersInput extends js.Object {
  /**
    * An optional Boolean value. If provided, the request is limited either to members that the current AWS account owns (true) or that other AWS accounts own (false). If omitted, all members are listed.
    */
  var IsOwned: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.IsOwned] = js.native
  /**
    * The maximum number of members to return in the request.
    */
  var MaxResults: js.UndefOr[MemberListMaxResults] = js.native
  /**
    * The optional name of the member to list.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The unique identifier of the network for which to list members.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An optional status specifier. If provided, only members currently in this status are listed.
    */
  var Status: js.UndefOr[MemberStatus] = js.native
}

object ListMembersInput {
  @scala.inline
  def apply(NetworkId: ResourceIdString): ListMembersInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersInput]
  }
  @scala.inline
  implicit class ListMembersInputOps[Self <: ListMembersInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOwned(value: IsOwned): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOwned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOwned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsOwned")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MemberListMaxResults): Self = {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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
    def withStatus(value: MemberStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

