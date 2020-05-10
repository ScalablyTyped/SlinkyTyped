package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support
  * ownership management or SELinux relabeling.
  */
@js.native
trait NFSVolumeSource extends js.Object {
  /**
    * Path that is exported by the NFS server. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val path: String = js.native
  /**
    * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults
    * to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val readOnly: Boolean = js.native
  /**
    * Server is the hostname or IP address of the NFS server. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  val server: String = js.native
}

object NFSVolumeSource {
  @scala.inline
  def apply(path: String, readOnly: Boolean, server: String): NFSVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[NFSVolumeSource]
  }
  @scala.inline
  implicit class NFSVolumeSourceOps[Self <: NFSVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

