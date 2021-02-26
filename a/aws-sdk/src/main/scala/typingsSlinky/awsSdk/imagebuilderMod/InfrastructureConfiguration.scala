package typingsSlinky.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfrastructureConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  
  /**
    * The date on which the infrastructure configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  
  /**
    * The date on which the infrastructure configuration was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  
  /**
    * The description of the infrastructure configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The instance profile of the infrastructure configuration.
    */
  var instanceProfileName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The instance types of the infrastructure configuration.
    */
  var instanceTypes: js.UndefOr[InstanceTypeList] = js.native
  
  /**
    * The EC2 key pair of the infrastructure configuration.
    */
  var keyPair: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The logging configuration of the infrastructure configuration.
    */
  var logging: js.UndefOr[Logging] = js.native
  
  /**
    * The name of the infrastructure configuration.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The tags attached to the resource created by Image Builder.
    */
  var resourceTags: js.UndefOr[ResourceTagMap] = js.native
  
  /**
    * The security group IDs of the infrastructure configuration.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.native
  
  /**
    * The SNS topic Amazon Resource Name (ARN) of the infrastructure configuration.
    */
  var snsTopicArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The subnet ID of the infrastructure configuration.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The tags of the infrastructure configuration.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The terminate instance on failure configuration of the infrastructure configuration.
    */
  var terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.native
}
object InfrastructureConfiguration {
  
  @scala.inline
  def apply(): InfrastructureConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfrastructureConfiguration]
  }
  
  @scala.inline
  implicit class InfrastructureConfigurationMutableBuilder[Self <: InfrastructureConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: DateTime): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setInstanceProfileName(value: NonEmptyString): Self = StObject.set(x, "instanceProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileNameUndefined: Self = StObject.set(x, "instanceProfileName", js.undefined)
    
    @scala.inline
    def setInstanceTypes(value: InstanceTypeList): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
    
    @scala.inline
    def setInstanceTypesVarargs(value: InstanceType*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setKeyPair(value: NonEmptyString): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceTags(value: ResourceTagMap): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSnsTopicArn(value: NonEmptyString): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
    
    @scala.inline
    def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTerminateInstanceOnFailure(value: NullableBoolean): Self = StObject.set(x, "terminateInstanceOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateInstanceOnFailureUndefined: Self = StObject.set(x, "terminateInstanceOnFailure", js.undefined)
  }
}
