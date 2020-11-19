package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVolumeAttributeRequest extends js.Object {
  
  /**
    * The attribute of the volume. This parameter is required.
    */
  var Attribute: VolumeAttributeName = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the volume.
    */
  var VolumeId: typingsSlinky.awsSdk.ec2Mod.VolumeId = js.native
}
object DescribeVolumeAttributeRequest {
  
  @scala.inline
  def apply(Attribute: VolumeAttributeName, VolumeId: VolumeId): DescribeVolumeAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVolumeAttributeRequest]
  }
  
  @scala.inline
  implicit class DescribeVolumeAttributeRequestOps[Self <: DescribeVolumeAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttribute(value: VolumeAttributeName): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeId(value: VolumeId): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
}
