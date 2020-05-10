package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVirtualNodesInput extends js.Object {
  /**
    * The maximum number of results returned by ListVirtualNodes in paginated
    output. When you use this parameter, ListVirtualNodes returns only
    limit results in a single page along with a nextToken response
    element. You can see the remaining results of the initial request by sending another
    ListVirtualNodes request with the returned nextToken value.
    This value can be between 1 and 100. If you don't use this
    parameter, ListVirtualNodes returns up to 100 results and a
    nextToken value if applicable.
    */
  var limit: js.UndefOr[ListVirtualNodesLimit] = js.native
  /**
    * The name of the service mesh to list virtual nodes in.
    */
  var meshName: ResourceName = js.native
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with Shared Meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  /**
    * The nextToken value returned from a previous paginated
    ListVirtualNodes request where limit was used and the results
    exceeded the value of that parameter. Pagination continues from the end of the previous
    results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListVirtualNodesInput {
  @scala.inline
  def apply(meshName: ResourceName): ListVirtualNodesInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualNodesInput]
  }
  @scala.inline
  implicit class ListVirtualNodesInputOps[Self <: ListVirtualNodesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeshName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: ListVirtualNodesLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMeshOwner(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeshOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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
  }
  
}

