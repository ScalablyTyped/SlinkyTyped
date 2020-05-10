package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support
  * ownership management and SELinux relabeling.
  */
@js.native
trait RBDPersistentVolumeSource extends js.Object {
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
    * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
    * inferred to be "ext4" if unspecified. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#rbd
    */
  val fsType: String = js.native
  /**
    * The rados image name. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  val image: String = js.native
  /**
    * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  val keyring: String = js.native
  /**
    * A collection of Ceph monitors. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  val monitors: js.Array[String] = js.native
  /**
    * The rados pool name. Default is rbd. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  val pool: String = js.native
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More
    * info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  val readOnly: Boolean = js.native
  /**
    * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring.
    * Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  val secretRef: SecretReference = js.native
  /**
    * The rados user name. Default is admin. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  val user: String = js.native
}

object RBDPersistentVolumeSource {
  @scala.inline
  def apply(
    fsType: String,
    image: String,
    keyring: String,
    monitors: js.Array[String],
    pool: String,
    readOnly: Boolean,
    secretRef: SecretReference,
    user: String
  ): RBDPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], keyring = keyring.asInstanceOf[js.Any], monitors = monitors.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RBDPersistentVolumeSource]
  }
  @scala.inline
  implicit class RBDPersistentVolumeSourceOps[Self <: RBDPersistentVolumeSource] (val x: Self) extends AnyVal {
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
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyring(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
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
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

