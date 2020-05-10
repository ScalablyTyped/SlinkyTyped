package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not
  * support ownership management or SELinux relabeling.
  */
@js.native
trait CephFSPersistentVolumeSource extends js.Object {
  /**
    * Required: Monitors is a collection of Ceph monitors More info:
    * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  val monitors: js.Array[String] = js.native
  /**
    * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
    */
  val path: String = js.native
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  val readOnly: Boolean = js.native
  /**
    * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret
    * More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  val secretFile: String = js.native
  /**
    * Optional: SecretRef is reference to the authentication secret for User, default is empty.
    * More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  val secretRef: SecretReference = js.native
  /**
    * Optional: User is the rados user name, default is admin More info:
    * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  val user: String = js.native
}

object CephFSPersistentVolumeSource {
  @scala.inline
  def apply(
    monitors: js.Array[String],
    path: String,
    readOnly: Boolean,
    secretFile: String,
    secretRef: SecretReference,
    user: String
  ): CephFSPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(monitors = monitors.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretFile = secretFile.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CephFSPersistentVolumeSource]
  }
  @scala.inline
  implicit class CephFSPersistentVolumeSourceOps[Self <: CephFSPersistentVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretFile")(value.asInstanceOf[js.Any])
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

