package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val cachingMode: String = js.native
  /**
    * The Name of the data disk in the blob storage
    */
  val diskName: String = js.native
  /**
    * The URI the data disk in the blob storage
    */
  val diskURI: String = js.native
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  val fsType: String = js.native
  /**
    * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob
    * disk per storage account  Managed: azure managed data disk (only in managed availability
    * set). defaults to shared
    */
  val kind: String = js.native
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean = js.native
}

object AzureDiskVolumeSource {
  @scala.inline
  def apply(
    cachingMode: String,
    diskName: String,
    diskURI: String,
    fsType: String,
    kind: String,
    readOnly: Boolean
  ): AzureDiskVolumeSource = {
    val __obj = js.Dynamic.literal(cachingMode = cachingMode.asInstanceOf[js.Any], diskName = diskName.asInstanceOf[js.Any], diskURI = diskURI.asInstanceOf[js.Any], fsType = fsType.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureDiskVolumeSource]
  }
  @scala.inline
  implicit class AzureDiskVolumeSourceOps[Self <: AzureDiskVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCachingMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

