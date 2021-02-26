package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProvisionedProductPlanInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.NotificationArns] = js.native
  
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the plan.
    */
  var PlanName: ProvisionedProductPlanName = js.native
  
  /**
    * The plan type.
    */
  var PlanType: ProvisionedProductPlanType = js.native
  
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  
  /**
    * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be updated after the product is provisioned.
    */
  var ProvisionedProductName: typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductName = js.native
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id = js.native
  
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.native
  
  /**
    * One or more tags. If the plan is for an existing provisioned product, the product must have a RESOURCE_UPDATE constraint with TagUpdatesOnProvisionedProduct set to ALLOWED to allow tag updates.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
}
object CreateProvisionedProductPlanInput {
  
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    PlanName: ProvisionedProductPlanName,
    PlanType: ProvisionedProductPlanType,
    ProductId: Id,
    ProvisionedProductName: ProvisionedProductName,
    ProvisioningArtifactId: Id
  ): CreateProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], PlanName = PlanName.asInstanceOf[js.Any], PlanType = PlanType.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any], ProvisionedProductName = ProvisionedProductName.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisionedProductPlanInput]
  }
  
  @scala.inline
  implicit class CreateProvisionedProductPlanInputMutableBuilder[Self <: CreateProvisionedProductPlanInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationArns(value: NotificationArns): Self = StObject.set(x, "NotificationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationArnsUndefined: Self = StObject.set(x, "NotificationArns", js.undefined)
    
    @scala.inline
    def setNotificationArnsVarargs(value: NotificationArn*): Self = StObject.set(x, "NotificationArns", js.Array(value :_*))
    
    @scala.inline
    def setPathId(value: Id): Self = StObject.set(x, "PathId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathIdUndefined: Self = StObject.set(x, "PathId", js.undefined)
    
    @scala.inline
    def setPlanName(value: ProvisionedProductPlanName): Self = StObject.set(x, "PlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanType(value: ProvisionedProductPlanType): Self = StObject.set(x, "PlanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionedProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningParameters(value: UpdateProvisioningParameters): Self = StObject.set(x, "ProvisioningParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningParametersUndefined: Self = StObject.set(x, "ProvisioningParameters", js.undefined)
    
    @scala.inline
    def setProvisioningParametersVarargs(value: UpdateProvisioningParameter*): Self = StObject.set(x, "ProvisioningParameters", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
