package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProtocolClientCapabilities extends js.Object {
  var hostName: String = js.native
  var hostVersion: String = js.native
}

object DataProtocolClientCapabilities {
  @scala.inline
  def apply(hostName: String, hostVersion: String): DataProtocolClientCapabilities = {
    val __obj = js.Dynamic.literal(hostName = hostName.asInstanceOf[js.Any], hostVersion = hostVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProtocolClientCapabilities]
  }
  @scala.inline
  implicit class DataProtocolClientCapabilitiesOps[Self <: DataProtocolClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

