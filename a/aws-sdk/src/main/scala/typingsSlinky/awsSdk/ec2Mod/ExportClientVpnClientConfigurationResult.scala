package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportClientVpnClientConfigurationResult extends js.Object {
  /**
    * The contents of the Client VPN endpoint configuration file.
    */
  var ClientConfiguration: js.UndefOr[String] = js.native
}

object ExportClientVpnClientConfigurationResult {
  @scala.inline
  def apply(): ExportClientVpnClientConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportClientVpnClientConfigurationResult]
  }
  @scala.inline
  implicit class ExportClientVpnClientConfigurationResultOps[Self <: ExportClientVpnClientConfigurationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientConfiguration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientConfiguration")(js.undefined)
        ret
    }
  }
  
}

