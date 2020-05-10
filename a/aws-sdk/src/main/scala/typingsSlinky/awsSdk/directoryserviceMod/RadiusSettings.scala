package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadiusSettings extends js.Object {
  /**
    * The protocol specified for your RADIUS endpoints.
    */
  var AuthenticationProtocol: js.UndefOr[RadiusAuthenticationProtocol] = js.native
  /**
    * Not currently used.
    */
  var DisplayLabel: js.UndefOr[RadiusDisplayLabel] = js.native
  /**
    * The port that your RADIUS server is using for communications. Your on-premises network must allow inbound traffic over this port from the AWS Directory Service servers.
    */
  var RadiusPort: js.UndefOr[PortNumber] = js.native
  /**
    * The maximum number of times that communication with the RADIUS server is attempted.
    */
  var RadiusRetries: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RadiusRetries] = js.native
  /**
    * An array of strings that contains the IP addresses of the RADIUS server endpoints, or the IP addresses of your RADIUS server load balancer.
    */
  var RadiusServers: js.UndefOr[Servers] = js.native
  /**
    * The amount of time, in seconds, to wait for the RADIUS server to respond.
    */
  var RadiusTimeout: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RadiusTimeout] = js.native
  /**
    * Required for enabling RADIUS on the directory.
    */
  var SharedSecret: js.UndefOr[RadiusSharedSecret] = js.native
  /**
    * Not currently used.
    */
  var UseSameUsername: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.UseSameUsername] = js.native
}

object RadiusSettings {
  @scala.inline
  def apply(): RadiusSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadiusSettings]
  }
  @scala.inline
  implicit class RadiusSettingsOps[Self <: RadiusSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationProtocol(value: RadiusAuthenticationProtocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLabel(value: RadiusDisplayLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusPort(value: PortNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusPort")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusRetries(value: RadiusRetries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusServers(value: Servers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusServers")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusTimeout(value: RadiusTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedSecret(value: RadiusSharedSecret): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSameUsername(value: UseSameUsername): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseSameUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSameUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseSameUsername")(js.undefined)
        ret
    }
  }
  
}

