package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortForwardingConfig extends js.Object {
  /**
    * The port mappings for the configuration.
    */
  var portMappings: js.UndefOr[PortMappingList] = js.native
}

object PortForwardingConfig {
  @scala.inline
  def apply(): PortForwardingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortForwardingConfig]
  }
  @scala.inline
  implicit class PortForwardingConfigOps[Self <: PortForwardingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPortMappings(value: PortMappingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMappings")(js.undefined)
        ret
    }
  }
  
}

