package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the
  * pod's hosts file.
  */
@js.native
trait HostAlias extends js.Object {
  /**
    * Hostnames for the above IP address.
    */
  var hostnames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * IP address of the host file entry.
    */
  var ip: js.UndefOr[Input[String]] = js.native
}

object HostAlias {
  @scala.inline
  def apply(): HostAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostAlias]
  }
  @scala.inline
  implicit class HostAliasOps[Self <: HostAlias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostnames(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostnames")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
  }
  
}

