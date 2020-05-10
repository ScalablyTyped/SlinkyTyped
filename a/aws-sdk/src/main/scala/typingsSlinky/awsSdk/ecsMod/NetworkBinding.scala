package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkBinding extends js.Object {
  /**
    * The IP address that the container is bound to on the container instance.
    */
  var bindIP: js.UndefOr[String] = js.native
  /**
    * The port number on the container that is used with the network binding.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The port number on the host that is used with the network binding.
    */
  var hostPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The protocol used for the network binding.
    */
  var protocol: js.UndefOr[TransportProtocol] = js.native
}

object NetworkBinding {
  @scala.inline
  def apply(): NetworkBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkBinding]
  }
  @scala.inline
  implicit class NetworkBindingOps[Self <: NetworkBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindIP")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerPort(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPort")(js.undefined)
        ret
    }
    @scala.inline
    def withHostPort(value: BoxedInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPort")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: TransportProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
  }
  
}

