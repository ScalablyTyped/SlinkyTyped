package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Persistent Disk resource in Google Compute Engine.
  *
  * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE
  * project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only
  * many times. GCE PDs support ownership management and SELinux relabeling.
  */
@js.native
trait GCEPersistentDiskVolumeSource extends js.Object {
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
    * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
    * inferred to be "ext4" if unspecified. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * The partition in the volume that you want to mount. If omitted, the default is to mount by
    * volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly,
    * the volume partition for /dev/sda is "0" (or you can leave the property empty). More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var partition: js.UndefOr[Input[Double]] = js.native
  /**
    * Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var pdName: Input[String] = js.native
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More
    * info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
}

object GCEPersistentDiskVolumeSource {
  @scala.inline
  def apply(pdName: Input[String]): GCEPersistentDiskVolumeSource = {
    val __obj = js.Dynamic.literal(pdName = pdName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GCEPersistentDiskVolumeSource]
  }
  @scala.inline
  implicit class GCEPersistentDiskVolumeSourceOps[Self <: GCEPersistentDiskVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPdName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdName")(value.asInstanceOf[js.Any])
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
    def withPartition(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(js.undefined)
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

