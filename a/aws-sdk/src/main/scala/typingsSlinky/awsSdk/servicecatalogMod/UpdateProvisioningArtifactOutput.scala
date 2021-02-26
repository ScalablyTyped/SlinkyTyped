package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProvisioningArtifactOutput extends StObject {
  
  /**
    * The URL of the CloudFormation template in Amazon S3.
    */
  var Info: js.UndefOr[ProvisioningArtifactInfo] = js.native
  
  /**
    * Information about the provisioning artifact.
    */
  var ProvisioningArtifactDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactDetail] = js.native
  
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Status] = js.native
}
object UpdateProvisioningArtifactOutput {
  
  @scala.inline
  def apply(): UpdateProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisioningArtifactOutput]
  }
  
  @scala.inline
  implicit class UpdateProvisioningArtifactOutputMutableBuilder[Self <: UpdateProvisioningArtifactOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: ProvisioningArtifactInfo): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "Info", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactDetail(value: ProvisioningArtifactDetail): Self = StObject.set(x, "ProvisioningArtifactDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactDetailUndefined: Self = StObject.set(x, "ProvisioningArtifactDetail", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
