package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IP Management configuration.
  */
@js.native
trait SchemaIpConfiguration extends js.Object {
  /**
    * The list of external networks that are allowed to connect to the instance
    * using the IP. In CIDR notation, also known as &#39;slash&#39; notation
    * (e.g. 192.168.100.0/24).
    */
  var authorizedNetworks: js.UndefOr[js.Array[SchemaAclEntry]] = js.native
  /**
    * Whether the instance should be assigned an IP address or not.
    */
  var ipv4Enabled: js.UndefOr[Boolean] = js.native
  /**
    * The resource link for the VPC network from which the Cloud SQL instance
    * is accessible for private IP. For example,
    * /projects/myProject/global/networks/default. This setting can be updated,
    * but it cannot be removed after it is set.
    */
  var privateNetwork: js.UndefOr[String] = js.native
  /**
    * Whether SSL connections over IP should be enforced or not.
    */
  var requireSsl: js.UndefOr[Boolean] = js.native
}

object SchemaIpConfiguration {
  @scala.inline
  def apply(): SchemaIpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIpConfiguration]
  }
  @scala.inline
  implicit class SchemaIpConfigurationOps[Self <: SchemaIpConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizedNetworks(value: js.Array[SchemaAclEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedNetworks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizedNetworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedNetworks")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv4Enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv4Enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv4Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSsl")(js.undefined)
        ret
    }
  }
  
}

