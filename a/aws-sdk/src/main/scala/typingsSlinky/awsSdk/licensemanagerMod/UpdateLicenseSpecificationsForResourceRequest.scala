package typingsSlinky.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLicenseSpecificationsForResourceRequest extends StObject {
  
  /**
    * ARNs of the license configurations to add.
    */
  var AddLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.native
  
  /**
    * ARNs of the license configurations to remove.
    */
  var RemoveLicenseSpecifications: js.UndefOr[LicenseSpecifications] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the AWS resource.
    */
  var ResourceArn: String = js.native
}
object UpdateLicenseSpecificationsForResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: String): UpdateLicenseSpecificationsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseSpecificationsForResourceRequest]
  }
  
  @scala.inline
  implicit class UpdateLicenseSpecificationsForResourceRequestMutableBuilder[Self <: UpdateLicenseSpecificationsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLicenseSpecifications(value: LicenseSpecifications): Self = StObject.set(x, "AddLicenseSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddLicenseSpecificationsUndefined: Self = StObject.set(x, "AddLicenseSpecifications", js.undefined)
    
    @scala.inline
    def setAddLicenseSpecificationsVarargs(value: LicenseSpecification*): Self = StObject.set(x, "AddLicenseSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setRemoveLicenseSpecifications(value: LicenseSpecifications): Self = StObject.set(x, "RemoveLicenseSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveLicenseSpecificationsUndefined: Self = StObject.set(x, "RemoveLicenseSpecifications", js.undefined)
    
    @scala.inline
    def setRemoveLicenseSpecificationsVarargs(value: LicenseSpecification*): Self = StObject.set(x, "RemoveLicenseSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
