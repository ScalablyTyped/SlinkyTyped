package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVPCEConfigurationResult extends js.Object {
  /**
    * An object that contains information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.native
}

object UpdateVPCEConfigurationResult {
  @scala.inline
  def apply(): UpdateVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVPCEConfigurationResult]
  }
  @scala.inline
  implicit class UpdateVPCEConfigurationResultOps[Self <: UpdateVPCEConfigurationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVpceConfiguration(value: VPCEConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpceConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfiguration")(js.undefined)
        ret
    }
  }
  
}

