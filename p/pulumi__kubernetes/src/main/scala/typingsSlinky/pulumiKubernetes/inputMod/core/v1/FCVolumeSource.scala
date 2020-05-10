package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * Optional: FC target lun number
    */
  var lun: js.UndefOr[Input[Double]] = js.native
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Optional: FC target worldwide names (WWNs)
    */
  var targetWWNs: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of
    * targetWWNs and lun must be set, but not both simultaneously.
    */
  var wwids: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object FCVolumeSource {
  @scala.inline
  def apply(): FCVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FCVolumeSource]
  }
  @scala.inline
  implicit class FCVolumeSourceOps[Self <: FCVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLun(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lun")(js.undefined)
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
    @scala.inline
    def withTargetWWNs(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWWNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetWWNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetWWNs")(js.undefined)
        ret
    }
    @scala.inline
    def withWwids(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wwids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWwids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wwids")(js.undefined)
        ret
    }
  }
  
}

