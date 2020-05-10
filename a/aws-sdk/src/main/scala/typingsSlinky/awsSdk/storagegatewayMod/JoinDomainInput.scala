package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinDomainInput extends js.Object {
  /**
    * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port number include it after the colon (“:”). For example, mydc.mydomain.com:389.
    */
  var DomainControllers: js.UndefOr[Hosts] = js.native
  /**
    * The name of the domain that you want the gateway to join.
    */
  var DomainName: typingsSlinky.awsSdk.storagegatewayMod.DomainName = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * The organizational unit (OU) is a container in an Active Directory that can hold users, groups, computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
    */
  var OrganizationalUnit: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.OrganizationalUnit] = js.native
  /**
    * Sets the password of the user who has permission to add the gateway to the Active Directory domain.
    */
  var Password: DomainUserPassword = js.native
  /**
    * Specifies the time in seconds, in which the JoinDomain operation must complete. The default is 20 seconds.
    */
  var TimeoutInSeconds: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TimeoutInSeconds] = js.native
  /**
    * Sets the user name of user who has permission to add the gateway to the Active Directory domain. The domain user account should be enabled to join computers to the domain. For example, you can use the domain administrator account or an account with delegated permissions to join computers to the domain.
    */
  var UserName: DomainUserName = js.native
}

object JoinDomainInput {
  @scala.inline
  def apply(
    DomainName: DomainName,
    GatewayARN: GatewayARN,
    Password: DomainUserPassword,
    UserName: DomainUserName
  ): JoinDomainInput = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinDomainInput]
  }
  @scala.inline
  implicit class JoinDomainInputOps[Self <: JoinDomainInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: DomainUserPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: DomainUserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainControllers(value: Hosts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainControllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainControllers")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalUnit(value: OrganizationalUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInSeconds(value: TimeoutInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutInSeconds")(js.undefined)
        ret
    }
  }
  
}

