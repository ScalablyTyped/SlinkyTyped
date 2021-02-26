package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProductInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The description of the product.
    */
  var Description: js.UndefOr[ProductViewShortDescription] = js.native
  
  /**
    * The distributor of the product.
    */
  var Distributor: js.UndefOr[ProductViewOwner] = js.native
  
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  
  /**
    * The name of the product.
    */
  var Name: ProductViewName = js.native
  
  /**
    * The owner of the product.
    */
  var Owner: ProductViewOwner = js.native
  
  /**
    * The type of product.
    */
  var ProductType: typingsSlinky.awsSdk.servicecatalogMod.ProductType = js.native
  
  /**
    * The configuration of the provisioning artifact. The info field accepts ImportFromPhysicalID.
    */
  var ProvisioningArtifactParameters: ProvisioningArtifactProperties = js.native
  
  /**
    * The support information about the product.
    */
  var SupportDescription: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportDescription] = js.native
  
  /**
    * The contact email for product support.
    */
  var SupportEmail: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportEmail] = js.native
  
  /**
    * The contact URL for product support.
    */
  var SupportUrl: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.SupportUrl] = js.native
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[AddTags] = js.native
}
object CreateProductInput {
  
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    Name: ProductViewName,
    Owner: ProductViewOwner,
    ProductType: ProductType,
    ProvisioningArtifactParameters: ProvisioningArtifactProperties
  ): CreateProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], ProductType = ProductType.asInstanceOf[js.Any], ProvisioningArtifactParameters = ProvisioningArtifactParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProductInput]
  }
  
  @scala.inline
  implicit class CreateProductInputMutableBuilder[Self <: CreateProductInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setDescription(value: ProductViewShortDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDistributor(value: ProductViewOwner): Self = StObject.set(x, "Distributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributorUndefined: Self = StObject.set(x, "Distributor", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ProductViewName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: ProductViewOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductType(value: ProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactParameters(value: ProvisioningArtifactProperties): Self = StObject.set(x, "ProvisioningArtifactParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportDescription(value: SupportDescription): Self = StObject.set(x, "SupportDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportDescriptionUndefined: Self = StObject.set(x, "SupportDescription", js.undefined)
    
    @scala.inline
    def setSupportEmail(value: SupportEmail): Self = StObject.set(x, "SupportEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportEmailUndefined: Self = StObject.set(x, "SupportEmail", js.undefined)
    
    @scala.inline
    def setSupportUrl(value: SupportUrl): Self = StObject.set(x, "SupportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUrlUndefined: Self = StObject.set(x, "SupportUrl", js.undefined)
    
    @scala.inline
    def setTags(value: AddTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
