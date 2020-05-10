package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterData extends js.Object {
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The associated metadata for the virtual router.
    */
  var metadata: ResourceMetadata = js.native
  /**
    * The specifications of the virtual router.
    */
  var spec: VirtualRouterSpec = js.native
  /**
    * The current status of the virtual router.
    */
  var status: VirtualRouterStatus = js.native
  /**
    * The name of the virtual router.
    */
  var virtualRouterName: ResourceName = js.native
}

object VirtualRouterData {
  @scala.inline
  def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualRouterSpec,
    status: VirtualRouterStatus,
    virtualRouterName: ResourceName
  ): VirtualRouterData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterData]
  }
  @scala.inline
  implicit class VirtualRouterDataOps[Self <: VirtualRouterData] (val x: Self) extends AnyVal {
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
    def withMetadata(value: ResourceMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpec(value: VirtualRouterSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: VirtualRouterStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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

