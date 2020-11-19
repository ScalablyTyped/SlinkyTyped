package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProvisioningArtifactsOutput extends js.Object {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * Information about the provisioning artifacts.
    */
  var ProvisioningArtifactDetails: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactDetails] = js.native
}
object ListProvisioningArtifactsOutput {
  
  @scala.inline
  def apply(): ListProvisioningArtifactsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningArtifactsOutput]
  }
  
  @scala.inline
  implicit class ListProvisioningArtifactsOutputOps[Self <: ListProvisioningArtifactsOutput] (val x: Self) extends AnyVal {
    
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
    def setProvisioningArtifactDetailsVarargs(value: ProvisioningArtifactDetail*): Self = this.set("ProvisioningArtifactDetails", js.Array(value :_*))
    
    @scala.inline
    def setProvisioningArtifactDetails(value: ProvisioningArtifactDetails): Self = this.set("ProvisioningArtifactDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningArtifactDetails: Self = this.set("ProvisioningArtifactDetails", js.undefined)
  }
}
