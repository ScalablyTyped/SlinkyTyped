package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disk extends js.Object {
  /**
    * An array of objects representing the add-ons enabled on the disk.
    */
  var addOns: js.UndefOr[AddOnList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the disk.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The resources to which the disk is attached.
    */
  var attachedTo: js.UndefOr[ResourceName] = js.native
  /**
    * (Deprecated) The attachment state of the disk.  In releases prior to November 14, 2017, this parameter returned attached for system disks in the API response. It is now deprecated, but still included in the response. Use isAttached instead. 
    */
  var attachmentState: js.UndefOr[String] = js.native
  /**
    * The date when the disk was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * (Deprecated) The number of GB in use by the disk.  In releases prior to November 14, 2017, this parameter was not included in the API response. It is now deprecated. 
    */
  var gbInUse: js.UndefOr[integer] = js.native
  /**
    * The input/output operations per second (IOPS) of the disk.
    */
  var iops: js.UndefOr[integer] = js.native
  /**
    * A Boolean value indicating whether the disk is attached.
    */
  var isAttached: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[Boolean] = js.native
  /**
    * The AWS Region and Availability Zone where the disk is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The unique name of the disk.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The disk path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The Lightsail resource type (e.g., Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  /**
    * Describes the status of the disk.
    */
  var state: js.UndefOr[DiskState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object Disk {
  @scala.inline
  def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  @scala.inline
  implicit class DiskOps[Self <: Disk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOns(value: AddOnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOns")(js.undefined)
        ret
    }
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
    def withAttachedTo(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachedTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedTo")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachmentState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentState")(js.undefined)
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
    def withGbInUse(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbInUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGbInUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gbInUse")(js.undefined)
        ret
    }
    @scala.inline
    def withIops(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAttached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAttached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAttached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAttached")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSystemDisk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystemDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSystemDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystemDisk")(js.undefined)
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
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
    def withState(value: DiskState): Self = {
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

