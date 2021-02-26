package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationItem extends StObject {
  
  /**
    * The 12-digit AWS account ID associated with the resource.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  
  /**
    * accoun
    */
  var arn: js.UndefOr[ARN] = js.native
  
  /**
    * The Availability Zone associated with the resource.
    */
  var availabilityZone: js.UndefOr[AvailabilityZone] = js.native
  
  /**
    * The region where the resource resides.
    */
  var awsRegion: js.UndefOr[AwsRegion] = js.native
  
  /**
    * The description of the resource configuration.
    */
  var configuration: js.UndefOr[Configuration] = js.native
  
  /**
    * The time when the configuration recording was initiated.
    */
  var configurationItemCaptureTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Unique MD5 hash that represents the configuration item's state. You can use MD5 hash to compare the states of two or more configuration items that are associated with the same resource.
    */
  var configurationItemMD5Hash: js.UndefOr[ConfigurationItemMD5Hash] = js.native
  
  /**
    * The configuration item status. The valid values are:   OK – The resource configuration has been updated   ResourceDiscovered – The resource was newly discovered   ResourceNotRecorded – The resource was discovered but its configuration was not recorded since the recorder excludes the recording of resources of this type   ResourceDeleted – The resource was deleted   ResourceDeletedNotRecorded – The resource was deleted but its configuration was not recorded since the recorder excludes the recording of resources of this type    The CIs do not incur any cost. 
    */
  var configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.native
  
  /**
    * An identifier that indicates the ordering of the configuration items of a resource.
    */
  var configurationStateId: js.UndefOr[ConfigurationStateId] = js.native
  
  /**
    * A list of CloudTrail event IDs. A populated field indicates that the current configuration was initiated by the events recorded in the CloudTrail log. For more information about CloudTrail, see What Is AWS CloudTrail. An empty field indicates that the current configuration was not initiated by any event. As of Version 1.3, the relatedEvents field is empty. You can access the LookupEvents API in the AWS CloudTrail API Reference to retrieve the events for the resource.
    */
  var relatedEvents: js.UndefOr[RelatedEventList] = js.native
  
  /**
    * A list of related AWS resources.
    */
  var relationships: js.UndefOr[RelationshipList] = js.native
  
  /**
    * The time stamp when the resource was created.
    */
  var resourceCreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The ID of the resource (for example, sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The custom name of the resource, if available.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The type of AWS resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * Configuration attributes that AWS Config returns for certain resource types to supplement the information returned for the configuration parameter.
    */
  var supplementaryConfiguration: js.UndefOr[SupplementaryConfiguration] = js.native
  
  /**
    * A mapping of key value tags associated with the resource.
    */
  var tags: js.UndefOr[Tags] = js.native
  
  /**
    * The version number of the resource configuration.
    */
  var version: js.UndefOr[Version] = js.native
}
object ConfigurationItem {
  
  @scala.inline
  def apply(): ConfigurationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationItem]
  }
  
  @scala.inline
  implicit class ConfigurationItemMutableBuilder[Self <: ConfigurationItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    @scala.inline
    def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationItemCaptureTime(value: js.Date): Self = StObject.set(x, "configurationItemCaptureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationItemCaptureTimeUndefined: Self = StObject.set(x, "configurationItemCaptureTime", js.undefined)
    
    @scala.inline
    def setConfigurationItemMD5Hash(value: ConfigurationItemMD5Hash): Self = StObject.set(x, "configurationItemMD5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationItemMD5HashUndefined: Self = StObject.set(x, "configurationItemMD5Hash", js.undefined)
    
    @scala.inline
    def setConfigurationItemStatus(value: ConfigurationItemStatus): Self = StObject.set(x, "configurationItemStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationItemStatusUndefined: Self = StObject.set(x, "configurationItemStatus", js.undefined)
    
    @scala.inline
    def setConfigurationStateId(value: ConfigurationStateId): Self = StObject.set(x, "configurationStateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationStateIdUndefined: Self = StObject.set(x, "configurationStateId", js.undefined)
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setRelatedEvents(value: RelatedEventList): Self = StObject.set(x, "relatedEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedEventsUndefined: Self = StObject.set(x, "relatedEvents", js.undefined)
    
    @scala.inline
    def setRelatedEventsVarargs(value: RelatedEvent*): Self = StObject.set(x, "relatedEvents", js.Array(value :_*))
    
    @scala.inline
    def setRelationships(value: RelationshipList): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setRelationshipsVarargs(value: Relationship*): Self = StObject.set(x, "relationships", js.Array(value :_*))
    
    @scala.inline
    def setResourceCreationTime(value: js.Date): Self = StObject.set(x, "resourceCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceCreationTimeUndefined: Self = StObject.set(x, "resourceCreationTime", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setSupplementaryConfiguration(value: SupplementaryConfiguration): Self = StObject.set(x, "supplementaryConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplementaryConfigurationUndefined: Self = StObject.set(x, "supplementaryConfiguration", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
