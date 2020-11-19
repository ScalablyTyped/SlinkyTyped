package typingsSlinky.awsSdkClientS3Node.typesInventoryConfigurationMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.All
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Current
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ETag
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.EncryptionStatus
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.IsMultipartUploaded
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.LastModifiedDate
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ReplicationStatus
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Size
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.StorageClass
import typingsSlinky.awsSdkClientS3Node.typesInventoryDestinationMod.UnmarshalledInventoryDestination
import typingsSlinky.awsSdkClientS3Node.typesInventoryFilterMod.UnmarshalledInventoryFilter
import typingsSlinky.awsSdkClientS3Node.typesInventoryScheduleMod.UnmarshalledInventorySchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledInventoryConfiguration extends InventoryConfiguration {
  
  /**
    * <p>Contains information about where to publish the inventory results.</p>
    */
  @JSName("Destination")
  var Destination_UnmarshalledInventoryConfiguration: UnmarshalledInventoryDestination = js.native
  
  /**
    * <p>Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledInventoryConfiguration: js.UndefOr[UnmarshalledInventoryFilter] = js.native
  
  /**
    * <p>Contains the optional fields that are included in the inventory results.</p>
    */
  @JSName("OptionalFields")
  var OptionalFields_UnmarshalledInventoryConfiguration: js.UndefOr[
    js.Array[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ]
  ] = js.native
  
  /**
    * <p>Specifies the schedule for generating inventory results.</p>
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledInventoryConfiguration: UnmarshalledInventorySchedule = js.native
}
object UnmarshalledInventoryConfiguration {
  
  @scala.inline
  def apply(
    Destination: UnmarshalledInventoryDestination,
    Id: String,
    IncludedObjectVersions: All | Current | String,
    IsEnabled: Boolean,
    Schedule: UnmarshalledInventorySchedule
  ): UnmarshalledInventoryConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInventoryConfiguration]
  }
  
  @scala.inline
  implicit class UnmarshalledInventoryConfigurationOps[Self <: UnmarshalledInventoryConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: UnmarshalledInventoryDestination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: UnmarshalledInventorySchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: UnmarshalledInventoryFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setOptionalFieldsVarargs(
      value: (Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String)*
    ): Self = this.set("OptionalFields", js.Array(value :_*))
    
    @scala.inline
    def setOptionalFields(
      value: js.Array[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ]
    ): Self = this.set("OptionalFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalFields: Self = this.set("OptionalFields", js.undefined)
  }
}
