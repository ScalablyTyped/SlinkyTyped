package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfManagedActiveDirectoryConfigurationUpdates extends js.Object {
  /**
    * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
    */
  var DnsIps: js.UndefOr[typingsSlinky.awsSdk.fsxMod.DnsIps] = js.native
  /**
    * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
    */
  var Password: js.UndefOr[DirectoryPassword] = js.native
  /**
    * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain. This account must have the permission to join computers to the domain in the organizational unit provided in OrganizationalUnitDistinguishedName.
    */
  var UserName: js.UndefOr[DirectoryUserName] = js.native
}

object SelfManagedActiveDirectoryConfigurationUpdates {
  @scala.inline
  def apply(): SelfManagedActiveDirectoryConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfManagedActiveDirectoryConfigurationUpdates]
  }
  @scala.inline
  implicit class SelfManagedActiveDirectoryConfigurationUpdatesOps[Self <: SelfManagedActiveDirectoryConfigurationUpdates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsIps(value: DnsIps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsIps")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: DirectoryPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: DirectoryUserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
  }
  
}

