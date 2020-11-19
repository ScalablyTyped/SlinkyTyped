package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProductOutput extends js.Object {
  
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProductViewDetail] = js.native
  
  /**
    * Information about the provisioning artifact.
    */
  var ProvisioningArtifactDetail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactDetail] = js.native
  
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}
object CreateProductOutput {
  
  @scala.inline
  def apply(): CreateProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProductOutput]
  }
  
  @scala.inline
  implicit class CreateProductOutputOps[Self <: CreateProductOutput] (val x: Self) extends AnyVal {
    
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
    def setProductViewDetail(value: ProductViewDetail): Self = this.set("ProductViewDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductViewDetail: Self = this.set("ProductViewDetail", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactDetail(value: ProvisioningArtifactDetail): Self = this.set("ProvisioningArtifactDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningArtifactDetail: Self = this.set("ProvisioningArtifactDetail", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
