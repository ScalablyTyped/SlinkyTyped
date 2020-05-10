package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write
  * once. Fibre Channel volumes support ownership management and SELinux relabeling.
  */
@js.native
trait FCVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
    */
  val fsType: String = js.native
  /**
    * Optional: FC target lun number
    */
  val lun: Double = js.native
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  val readOnly: Boolean = js.native
  /**
    * Optional: FC target worldwide names (WWNs)
    */
  val targetWWNs: js.Array[String] = js.native
  /**
    * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of
    * targetWWNs and lun must be set, but not both simultaneously.
    */
  val wwids: js.Array[String] = js.native
}

object FCVolumeSource {
  @scala.inline
  def apply(
    fsType: String,
    lun: Double,
    readOnly: Boolean,
    targetWWNs: js.Array[String],
    wwids: js.Array[String]
  ): FCVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], lun = lun.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], targetWWNs = targetWWNs.asInstanceOf[js.Any], wwids = wwids.asInstanceOf[js.Any])
    __obj.asInstanceOf[FCVolumeSource]
  }
  @scala.inline
  implicit class FCVolumeSourceOps[Self <: FCVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFsType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLun(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetWWNs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWWNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWwids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wwids")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

