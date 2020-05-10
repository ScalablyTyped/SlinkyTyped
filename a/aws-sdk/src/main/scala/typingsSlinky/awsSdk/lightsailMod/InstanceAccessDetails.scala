package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAccessDetails extends js.Object {
  /**
    * For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey-cert.pub.
    */
  var certKey: js.UndefOr[String] = js.native
  /**
    * For SSH access, the date on which the temporary keys expire.
    */
  var expiresAt: js.UndefOr[js.Date] = js.native
  /**
    * Describes the public SSH host keys or the RDP certificate.
    */
  var hostKeys: js.UndefOr[HostKeysList] = js.native
  /**
    * The name of this Amazon Lightsail instance.
    */
  var instanceName: js.UndefOr[ResourceName] = js.native
  /**
    * The public IP address of the Amazon Lightsail instance.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.native
  /**
    * For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the password for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the instance to be ready.  If you create an instance using any key pair other than the default (LightsailDefaultKeyPair), password will always be an empty string. If you change the Administrator password on the instance, Lightsail will continue to return the original password value. When accessing the instance using RDP, you need to manually enter the Administrator password after changing it from the default. 
    */
  var password: js.UndefOr[String] = js.native
  /**
    * For a Windows Server-based instance, an object with the data you can use to retrieve your password. This is only needed if password is empty and the instance is not new (and therefore the password is not ready yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
    */
  var passwordData: js.UndefOr[PasswordData] = js.native
  /**
    * For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save this value to tempkey).
    */
  var privateKey: js.UndefOr[String] = js.native
  /**
    * The protocol for these Amazon Lightsail instance access details.
    */
  var protocol: js.UndefOr[InstanceAccessProtocol] = js.native
  /**
    * The user name to use when logging in to the Amazon Lightsail instance.
    */
  var username: js.UndefOr[String] = js.native
}

object InstanceAccessDetails {
  @scala.inline
  def apply(): InstanceAccessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAccessDetails]
  }
  @scala.inline
  implicit class InstanceAccessDetailsOps[Self <: InstanceAccessDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certKey")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiresAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresAt")(js.undefined)
        ret
    }
    @scala.inline
    def withHostKeys(value: HostKeysList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddress(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordData(value: PasswordData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordData")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: InstanceAccessProtocol): Self = {
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
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

