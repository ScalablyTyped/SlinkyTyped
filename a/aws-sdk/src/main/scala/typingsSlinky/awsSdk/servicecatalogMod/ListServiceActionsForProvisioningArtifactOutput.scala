package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceActionsForProvisioningArtifactOutput extends js.Object {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * An object containing information about the self-service actions associated with the provisioning artifact.
    */
  var ServiceActionSummaries: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ServiceActionSummaries] = js.native
}
object ListServiceActionsForProvisioningArtifactOutput {
  
  @scala.inline
  def apply(): ListServiceActionsForProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceActionsForProvisioningArtifactOutput]
  }
  
  @scala.inline
  implicit class ListServiceActionsForProvisioningArtifactOutputOps[Self <: ListServiceActionsForProvisioningArtifactOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setServiceActionSummariesVarargs(value: ServiceActionSummary*): Self = this.set("ServiceActionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setServiceActionSummaries(value: ServiceActionSummaries): Self = this.set("ServiceActionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceActionSummaries: Self = this.set("ServiceActionSummaries", js.undefined)
  }
}
