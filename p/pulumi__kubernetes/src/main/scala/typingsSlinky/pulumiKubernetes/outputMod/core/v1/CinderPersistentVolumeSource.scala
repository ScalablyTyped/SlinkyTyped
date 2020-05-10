package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting
  * to a container. The volume must also be in the same region as the kubelet. Cinder volumes
  * support ownership management and SELinux relabeling.
  */
@js.native
trait CinderPersistentVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More
    * info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  val fsType: String = js.native
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  val readOnly: Boolean = js.native
  /**
    * Optional: points to a secret object containing parameters used to connect to OpenStack.
    */
  val secretRef: SecretReference = js.native
  /**
    * volume id used to identify the volume in cinder. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  val volumeID: String = js.native
}

object CinderPersistentVolumeSource {
  @scala.inline
  def apply(fsType: String, readOnly: Boolean, secretRef: SecretReference, volumeID: String): CinderPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], volumeID = volumeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CinderPersistentVolumeSource]
  }
  @scala.inline
  implicit class CinderPersistentVolumeSourceOps[Self <: CinderPersistentVolumeSource] (val x: Self) extends AnyVal {
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
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretRef(value: SecretReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

