package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachedDiskInitializeParams extends js.Object {
  /** Specifies the disk name. If not specified, the default is to use the name of the instance. */
  var diskName: js.UndefOr[String] = js.native
  /** Specifies the size of the disk in base-2 GB. */
  var diskSizeGb: js.UndefOr[String] = js.native
  /**
    * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example:
    *
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/pd-standard
    *
    * Other values include pd-ssd and local-ssd. If you define this field, you can provide either the full or partial URL. For example, the following are
    * valid values:
    * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/diskType
    * - projects/project/zones/zone/diskTypes/diskType
    * - zones/zone/diskTypes/diskType  Note that for InstanceTemplate, this is the name of the disk type, not URL.
    */
  var diskType: js.UndefOr[String] = js.native
  /**
    * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or disks.source is required.
    *
    * To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-8 to use the
    * latest Debian 8 image:
    *
    * projects/debian-cloud/global/images/family/debian-8
    *
    * Alternatively, use a specific version of a public operating system image:
    *
    * projects/debian-cloud/global/images/debian-8-jessie-vYYYYMMDD
    *
    * To create a disk with a private image that you created, specify the image name in the following format:
    *
    * global/images/my-private-image
    *
    * You can also specify a private image by its image family, which returns the latest version of the image in that family. Replace the image name with
    * family/family-name:
    *
    * global/images/family/my-private-family
    *
    * If the source image is deleted later, this field will not be set.
    */
  var sourceImage: js.UndefOr[String] = js.native
  /**
    * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
    *
    * Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source
    * images are encrypted with your own keys.
    */
  var sourceImageEncryptionKey: js.UndefOr[CustomerEncryptionKey] = js.native
}

object AttachedDiskInitializeParams {
  @scala.inline
  def apply(): AttachedDiskInitializeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedDiskInitializeParams]
  }
  @scala.inline
  implicit class AttachedDiskInitializeParamsOps[Self <: AttachedDiskInitializeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskName")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskSizeGb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeGb")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskType")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceImage")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceImageEncryptionKey(value: CustomerEncryptionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceImageEncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceImageEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceImageEncryptionKey")(js.undefined)
        ret
    }
  }
  
}

