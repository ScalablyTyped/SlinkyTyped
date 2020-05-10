package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDiskRequest extends js.Object {
  /**
    * An array of objects that represent the add-ons to enable for the new disk.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.native
  /**
    * The Availability Zone where you want to create the disk (e.g., us-east-2a). Use the same Availability Zone as the Lightsail instance to which you want to attach the disk. Use the get regions operation to list the Availability Zones where Lightsail is currently available.
    */
  var availabilityZone: NonEmptyString = js.native
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName = js.native
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: integer = js.native
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateDiskRequest {
  @scala.inline
  def apply(availabilityZone: NonEmptyString, diskName: ResourceName, sizeInGb: integer): CreateDiskRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], diskName = diskName.asInstanceOf[js.Any], sizeInGb = sizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiskRequest]
  }
  @scala.inline
  implicit class CreateDiskRequestOps[Self <: CreateDiskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeInGb(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeInGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddOns(value: AddOnRequestList): Self = {
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

