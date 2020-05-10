package typingsSlinky.nodeOsUtils.netstatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetStatInfo extends js.Object {
  var inputBytes: String = js.native
  var interface: String = js.native
  var outputBytes: String = js.native
}

object NetStatInfo {
  @scala.inline
  def apply(inputBytes: String, interface: String, outputBytes: String): NetStatInfo = {
    val __obj = js.Dynamic.literal(inputBytes = inputBytes.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any], outputBytes = outputBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetStatInfo]
  }
  @scala.inline
  implicit class NetStatInfoOps[Self <: NetStatInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputBytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

