package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImageAttributeRequest extends StObject {
  
  /**
    * The AMI attribute.  Note: Depending on your account privileges, the blockDeviceMapping attribute may return a Client.AuthFailure error. If this happens, use DescribeImages to get information about the block device mapping for the AMI.
    */
  var Attribute: ImageAttributeName = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the AMI.
    */
  var ImageId: typingsSlinky.awsSdk.ec2Mod.ImageId = js.native
}
object DescribeImageAttributeRequest {
  
  @scala.inline
  def apply(Attribute: ImageAttributeName, ImageId: ImageId): DescribeImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageAttributeRequest]
  }
  
  @scala.inline
  implicit class DescribeImageAttributeRequestMutableBuilder[Self <: DescribeImageAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: ImageAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
  }
}
