package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not
  * support ownership management or SELinux relabeling.
  */
@js.native
trait CephFSVolumeSource extends js.Object {
  /**
    * Required: Monitors is a collection of Ceph monitors More info:
    * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var monitors: Input[js.Array[Input[String]]] = js.native
  /**
    * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
    */
  var path: js.UndefOr[Input[String]] = js.native
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret
    * More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretFile: js.UndefOr[Input[String]] = js.native
  /**
    * Optional: SecretRef is reference to the authentication secret for User, default is empty.
    * More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.native
  /**
    * Optional: User is the rados user name, default is admin More info:
    * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var user: js.UndefOr[Input[String]] = js.native
}

object CephFSVolumeSource {
  @scala.inline
  def apply(monitors: Input[js.Array[Input[String]]]): CephFSVolumeSource = {
    val __obj = js.Dynamic.literal(monitors = monitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CephFSVolumeSource]
  }
  @scala.inline
  implicit class CephFSVolumeSourceOps[Self <: CephFSVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitors(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
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
    def withSecretFile(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretFile")(js.undefined)
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

