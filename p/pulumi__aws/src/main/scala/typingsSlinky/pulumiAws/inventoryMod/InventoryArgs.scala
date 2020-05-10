package typingsSlinky.pulumiAws.inventoryMod

import typingsSlinky.pulumiAws.inputMod.s3.InventoryDestination
import typingsSlinky.pulumiAws.inputMod.s3.InventoryFilter
import typingsSlinky.pulumiAws.inputMod.s3.InventorySchedule
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryArgs extends js.Object {
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  val bucket: Input[String] = js.native
  /**
    * Contains information about where to publish the inventory results (documented below).
    */
  val destination: Input[InventoryDestination] = js.native
  /**
    * Specifies whether the inventory is enabled or disabled.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria (documented below).
    */
  val filter: js.UndefOr[Input[InventoryFilter]] = js.native
  /**
    * Object versions to include in the inventory list. Valid values: `All`, `Current`.
    */
  val includedObjectVersions: Input[String] = js.native
  /**
    * Unique identifier of the inventory configuration for the bucket.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * List of optional fields that are included in the inventory results.
    * Valid values: `Size`, `LastModifiedDate`, `StorageClass`, `ETag`, `IsMultipartUploaded`, `ReplicationStatus`, `EncryptionStatus`, `ObjectLockRetainUntilDate`, `ObjectLockMode`, `ObjectLockLegalHoldStatus`, `IntelligentTieringAccessTier`.
    */
  val optionalFields: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Specifies the schedule for generating inventory results (documented below).
    */
  val schedule: Input[InventorySchedule] = js.native
}

object InventoryArgs {
  @scala.inline
  def apply(
    bucket: Input[String],
    destination: Input[InventoryDestination],
    includedObjectVersions: Input[String],
    schedule: Input[InventorySchedule]
  ): InventoryArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], includedObjectVersions = includedObjectVersions.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryArgs]
  }
  @scala.inline
  implicit class InventoryArgsOps[Self <: InventoryArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: Input[InventoryDestination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludedObjectVersions(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedObjectVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchedule(value: Input[InventorySchedule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Input[InventoryFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalFields(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalFields")(js.undefined)
        ret
    }
  }
  
}

