package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.AnonAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevAppDetails extends js.Object {
  var channel: js.UndefOr[String] = js.native
  var commPort: Double = js.native
  var interfaces: js.Array[AnonAddress] = js.native
  var port: Double = js.native
}

object DevAppDetails {
  @scala.inline
  def apply(commPort: Double, interfaces: js.Array[AnonAddress], port: Double): DevAppDetails = {
    val __obj = js.Dynamic.literal(commPort = commPort.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevAppDetails]
  }
  @scala.inline
  implicit class DevAppDetailsOps[Self <: DevAppDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterfaces(value: js.Array[AnonAddress]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
  }
  
}

