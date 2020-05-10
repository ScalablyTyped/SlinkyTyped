package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * The rados image name. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var image: Input[String] = js.native
  /**
    * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var keyring: js.UndefOr[Input[String]] = js.native
  /**
    * A collection of Ceph monitors. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var monitors: Input[js.Array[Input[String]]] = js.native
  /**
    * The rados pool name. Default is rbd. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var pool: js.UndefOr[Input[String]] = js.native
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More
    * info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring.
    * Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var secretRef: js.UndefOr[Input[SecretReference]] = js.native
  /**
    * The rados user name. Default is admin. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var user: js.UndefOr[Input[String]] = js.native
}

object RBDPersistentVolumeSource {
  @scala.inline
  def apply(image: Input[String], monitors: Input[js.Array[Input[String]]]): RBDPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], monitors = monitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RBDPersistentVolumeSource]
  }
  @scala.inline
  implicit class RBDPersistentVolumeSourceOps[Self <: RBDPersistentVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitors(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitors")(value.asInstanceOf[js.Any])
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
    def withKeyring(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyring")(js.undefined)
        ret
    }
    @scala.inline
    def withPool(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
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
    def withSecretRef(value: Input[SecretReference]): Self = {
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
    @scala.inline
    def withUser(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

