package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryConfiguration extends js.Object {
  /**
    * Contains information about where to publish the inventory results.
    */
  var Destination: InventoryDestination = js.native
  /**
    * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
    */
  var Filter: js.UndefOr[InventoryFilter] = js.native
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId = js.native
  /**
    * Object versions to include in the inventory list. If set to All, the list includes all the object versions, which adds the version-related fields VersionId, IsLatest, and DeleteMarker to the list. If set to Current, the list does not contain these version-related fields.
    */
  var IncludedObjectVersions: InventoryIncludedObjectVersions = js.native
  /**
    * Specifies whether the inventory is enabled or disabled. If set to True, an inventory list is generated. If set to False, no inventory list is generated.
    */
  var IsEnabled: typingsSlinky.awsSdk.s3Mod.IsEnabled = js.native
  /**
    * Contains the optional fields that are included in the inventory results.
    */
  var OptionalFields: js.UndefOr[InventoryOptionalFields] = js.native
  /**
    * Specifies the schedule for generating inventory results.
    */
  var Schedule: InventorySchedule = js.native
}

object InventoryConfiguration {
  @scala.inline
  def apply(
    Destination: InventoryDestination,
    Id: InventoryId,
    IncludedObjectVersions: InventoryIncludedObjectVersions,
    IsEnabled: IsEnabled,
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
    def withId(value: InventoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludedObjectVersions(value: InventoryIncludedObjectVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludedObjectVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: IsEnabled): Self = {
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
    def withOptionalFields(value: InventoryOptionalFields): Self = {
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

