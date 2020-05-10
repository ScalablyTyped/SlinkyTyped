package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceSnapshot extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the snapshot (e.g., arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp when the snapshot was created (e.g., 1479907467.024).
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * An array of disk objects containing information about all block storage disks.
    */
  var fromAttachedDisks: js.UndefOr[DiskList] = js.native
  /**
    * The blueprint ID from which you created the snapshot (e.g., os_debian_8_3). A blueprint is a virtual private server (or instance) image used to create instances quickly.
    */
  var fromBlueprintId: js.UndefOr[String] = js.native
  /**
    * The bundle ID from which you created the snapshot (e.g., micro_1_0).
    */
  var fromBundleId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE).
    */
  var fromInstanceArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The instance from which the snapshot was created.
    */
  var fromInstanceName: js.UndefOr[ResourceName] = js.native
  /**
    * A Boolean value indicating whether the snapshot was created from an automatic snapshot.
    */
  var isFromAutoSnapshot: js.UndefOr[Boolean] = js.native
  /**
    * The region name and Availability Zone where you created the snapshot.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the snapshot.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The progress of the snapshot.
    */
  var progress: js.UndefOr[String] = js.native
  /**
    * The type of resource (usually InstanceSnapshot).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The size in GB of the SSD.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  /**
    * The state the snapshot is in.
    */
  var state: js.UndefOr[InstanceSnapshotState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object InstanceSnapshot {
  @scala.inline
  def apply(): InstanceSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSnapshot]
  }
  @scala.inline
  implicit class InstanceSnapshotOps[Self <: InstanceSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withFromAttachedDisks(value: DiskList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromAttachedDisks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromAttachedDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromAttachedDisks")(js.undefined)
        ret
    }
    @scala.inline
    def withFromBlueprintId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBlueprintId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromBlueprintId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBlueprintId")(js.undefined)
        ret
    }
    @scala.inline
    def withFromBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withFromInstanceArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFromInstanceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFromAutoSnapshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFromAutoSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFromAutoSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFromAutoSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: ResourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
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
    def withProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeInGb(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInGb")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: InstanceSnapshotState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

