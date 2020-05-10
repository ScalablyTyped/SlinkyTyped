package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualServiceInput extends js.Object {
  /**
    * The name of the service mesh to delete the virtual service in.
    */
  var meshName: ResourceName = js.native
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with Shared Meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  /**
    * The name of the virtual service to delete.
    */
  var virtualServiceName: ServiceName = js.native
}

object DeleteVirtualServiceInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualServiceName: ServiceName): DeleteVirtualServiceInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualServiceInput]
  }
  @scala.inline
  implicit class DeleteVirtualServiceInputOps[Self <: DeleteVirtualServiceInput] (val x: Self) extends AnyVal {
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
    def withVirtualServiceName(value: ServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualServiceName")(value.asInstanceOf[js.Any])
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
  }
  
}

