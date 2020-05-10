package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
  */
@js.native
trait AzureDiskVolumeSource extends js.Object {
  /**
    * Host Caching mode: None, Read Only, Read Write.
    */
  var cachingMode: js.UndefOr[Input[String]] = js.native
  /**
    * The Name of the data disk in the blob storage
    */
  var diskName: Input[String] = js.native
  /**
    * The URI the data disk in the blob storage
    */
  var diskURI: Input[String] = js.native
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob
    * disk per storage account  Managed: azure managed data disk (only in managed availability
    * set). defaults to shared
    */
  var kind: js.UndefOr[Input[String]] = js.native
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
}

object AzureDiskVolumeSource {
  @scala.inline
  def apply(diskName: Input[String], diskURI: Input[String]): AzureDiskVolumeSource = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any], diskURI = diskURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureDiskVolumeSource]
  }
  @scala.inline
  implicit class AzureDiskVolumeSourceOps[Self <: AzureDiskVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskURI(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCachingMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFsType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsType")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
  }
  
}

