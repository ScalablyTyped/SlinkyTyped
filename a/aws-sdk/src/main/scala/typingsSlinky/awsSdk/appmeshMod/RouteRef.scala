package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the route.
    */
  var arn: Arn = js.native
  /**
    * The name of the service mesh that the route resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with Shared Meshes.
    */
  var meshOwner: AccountId = js.native
  /**
    * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's
    the ID of the mesh owner, or another account that the mesh is shared with. For more information about mesh sharing, see Working with Shared Meshes.
    */
  var resourceOwner: AccountId = js.native
  /**
    * The name of the route.
    */
  var routeName: ResourceName = js.native
  /**
    * The virtual router that the route is associated with.
    */
  var virtualRouterName: ResourceName = js.native
}

object RouteRef {
  @scala.inline
  def apply(
    arn: Arn,
    meshName: ResourceName,
    meshOwner: AccountId,
    resourceOwner: AccountId,
    routeName: ResourceName,
    virtualRouterName: ResourceName
  ): RouteRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], meshOwner = meshOwner.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRef]
  }
  @scala.inline
  implicit class RouteRefOps[Self <: RouteRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshOwner(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceOwner(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualRouterName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualRouterName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

