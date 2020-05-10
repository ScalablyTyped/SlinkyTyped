package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting
  * to a container. The volume must also be in the same region as the kubelet. Cinder volumes
  * support ownership management and SELinux relabeling.
  */
@js.native
trait CinderVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More
    * info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Optional: points to a secret object containing parameters used to connect to OpenStack.
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.native
  /**
    * volume id used to identify the volume in cinder. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var volumeID: Input[String] = js.native
}

object CinderVolumeSource {
  @scala.inline
  def apply(volumeID: Input[String]): CinderVolumeSource = {
    val __obj = js.Dynamic.literal(volumeID = volumeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CinderVolumeSource]
  }
  @scala.inline
  implicit class CinderVolumeSourceOps[Self <: CinderVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVolumeID(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeID")(value.asInstanceOf[js.Any])
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
    def withSecretRef(value: Input[LocalObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(js.undefined)
        ret
    }
  }
  
}

