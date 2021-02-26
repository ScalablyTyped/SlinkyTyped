package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.All
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Current
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ETag
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.EncryptionStatus
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.IsMultipartUploaded
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.LastModifiedDate
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ReplicationStatus
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Size
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.StorageClass
import typingsSlinky.awsSdkClientS3Browser.typesInventoryDestinationMod.InventoryDestination
import typingsSlinky.awsSdkClientS3Browser.typesInventoryDestinationMod.UnmarshalledInventoryDestination
import typingsSlinky.awsSdkClientS3Browser.typesInventoryFilterMod.InventoryFilter
import typingsSlinky.awsSdkClientS3Browser.typesInventoryFilterMod.UnmarshalledInventoryFilter
import typingsSlinky.awsSdkClientS3Browser.typesInventoryScheduleMod.InventorySchedule
import typingsSlinky.awsSdkClientS3Browser.typesInventoryScheduleMod.UnmarshalledInventorySchedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryConfigurationMod {
  
  @js.native
  trait InventoryConfiguration extends StObject {
    
    /**
      * <p>Contains information about where to publish the inventory results.</p>
      */
    var Destination: InventoryDestination = js.native
    
    /**
      * <p>Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.</p>
      */
    var Filter: js.UndefOr[InventoryFilter] = js.native
    
    /**
      * <p>The ID used to identify the inventory configuration.</p>
      */
    var Id: String = js.native
    
    /**
      * <p>Specifies which object version(s) to included in the inventory results.</p>
      */
    var IncludedObjectVersions: All | Current | String = js.native
    
    /**
      * <p>Specifies whether the inventory is enabled or disabled.</p>
      */
    var IsEnabled: Boolean = js.native
    
    /**
      * <p>Contains the optional fields that are included in the inventory results.</p>
      */
    var OptionalFields: js.UndefOr[
        (js.Array[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ]) | (js.Iterable[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ])
      ] = js.native
    
    /**
      * <p>Specifies the schedule for generating inventory results.</p>
      */
    var Schedule: InventorySchedule = js.native
  }
  object InventoryConfiguration {
    
    @scala.inline
    def apply(
      Destination: InventoryDestination,
      Id: String,
      IncludedObjectVersions: All | Current | String,
      IsEnabled: Boolean,
      Schedule: InventorySchedule
    ): InventoryConfiguration = {
      val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
      __obj.asInstanceOf[InventoryConfiguration]
    }
    
    @scala.inline
    implicit class InventoryConfigurationMutableBuilder[Self <: InventoryConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: InventoryDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: InventoryFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedObjectVersions(value: All | Current | String): Self = StObject.set(x, "IncludedObjectVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalFields(
        value: (js.Array[
              Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
            ]) | (js.Iterable[
              Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
            ])
      ): Self = StObject.set(x, "OptionalFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalFieldsIterable(
        value: js.Iterable[
              Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
            ]
      ): Self = StObject.set(x, "OptionalFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalFieldsUndefined: Self = StObject.set(x, "OptionalFields", js.undefined)
      
      @scala.inline
      def setOptionalFieldsVarargs(
        value: (Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String)*
      ): Self = StObject.set(x, "OptionalFields", js.Array(value :_*))
      
      @scala.inline
      def setSchedule(value: InventorySchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class UnmarshalledInventoryConfigurationMutableBuilder[Self <: UnmarshalledInventoryConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: UnmarshalledInventoryDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: UnmarshalledInventoryFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
      
      @scala.inline
      def setOptionalFields(
        value: js.Array[
              Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
            ]
      ): Self = StObject.set(x, "OptionalFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalFieldsUndefined: Self = StObject.set(x, "OptionalFields", js.undefined)
      
      @scala.inline
      def setOptionalFieldsVarargs(
        value: (Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String)*
      ): Self = StObject.set(x, "OptionalFields", js.Array(value :_*))
      
      @scala.inline
      def setSchedule(value: UnmarshalledInventorySchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    }
  }
}
