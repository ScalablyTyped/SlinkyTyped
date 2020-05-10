package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var path: Input[String] = js.native
  /**
    * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults
    * to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Server is the hostname or IP address of the NFS server. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var server: Input[String] = js.native
}

object NFSVolumeSource {
  @scala.inline
  def apply(path: Input[String], server: Input[String]): NFSVolumeSource = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[NFSVolumeSource]
  }
  @scala.inline
  implicit class NFSVolumeSourceOps[Self <: NFSVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
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

