package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskSnapshot extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date when the disk snapshot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
    */
  var fromDiskArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The unique name of the source disk from which the disk snapshot was created.
    */
  var fromDiskName: js.UndefOr[ResourceName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The unique name of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceName: js.UndefOr[ResourceName] = js.native
  /**
    * A Boolean value indicating whether the snapshot was created from an automatic snapshot.
    */
  var isFromAutoSnapshot: js.UndefOr[Boolean] = js.native
  /**
    * The AWS Region and Availability Zone where the disk snapshot was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the disk snapshot (e.g., my-disk-snapshot).
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The progress of the disk snapshot operation.
    */
  var progress: js.UndefOr[String] = js.native
  /**
    * The Lightsail resource type (e.g., DiskSnapshot).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  /**
    * The status of the disk snapshot operation.
    */
  var state: js.UndefOr[DiskSnapshotState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object DiskSnapshot {
  @scala.inline
  def apply(): DiskSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskSnapshot]
  }
  @scala.inline
  implicit class DiskSnapshotOps[Self <: DiskSnapshot] (val x: Self) extends AnyVal {
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
    def withFromDiskArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDiskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromDiskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDiskArn")(js.undefined)
        ret
    }
    @scala.inline
    def withFromDiskName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDiskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromDiskName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDiskName")(js.undefined)
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
    def withState(value: DiskSnapshotState): Self = {
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

