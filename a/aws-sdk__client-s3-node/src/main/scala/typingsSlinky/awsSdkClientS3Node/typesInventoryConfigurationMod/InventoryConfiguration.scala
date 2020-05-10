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
import typingsSlinky.awsSdkClientS3Node.typesInventoryDestinationMod.InventoryDestination
import typingsSlinky.awsSdkClientS3Node.typesInventoryFilterMod.InventoryFilter
import typingsSlinky.awsSdkClientS3Node.typesInventoryScheduleMod.InventorySchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryConfiguration extends js.Object {
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
  implicit class InventoryConfigurationOps[Self <: InventoryConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: InventoryDestination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludedObjectVersions(value: All | Current | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludedObjectVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: InventorySchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: InventoryFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalFieldsIterable(
      value: js.Iterable[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionalFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionalFields(
      value: (js.Array[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ]) | (js.Iterable[
          Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionalFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionalFields")(js.undefined)
        ret
    }
  }
  
}

