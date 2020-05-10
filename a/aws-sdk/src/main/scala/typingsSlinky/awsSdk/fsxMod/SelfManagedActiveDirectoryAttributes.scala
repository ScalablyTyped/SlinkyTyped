package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelfManagedActiveDirectoryAttributes extends js.Object {
  /**
    * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
    */
  var DnsIps: js.UndefOr[typingsSlinky.awsSdk.fsxMod.DnsIps] = js.native
  /**
    * The fully qualified domain name of the self-managed AD directory.
    */
  var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.native
  /**
    * The name of the domain group whose members have administrative privileges for the FSx file system.
    */
  var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName] = js.native
  /**
    * The fully qualified distinguished name of the organizational unit within the self-managed AD directory to which the Windows File Server instance is joined.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[typingsSlinky.awsSdk.fsxMod.OrganizationalUnitDistinguishedName] = js.native
  /**
    * The user name for the service account on your self-managed AD domain that FSx uses to join to your AD domain.
    */
  var UserName: js.UndefOr[DirectoryUserName] = js.native
}

object SelfManagedActiveDirectoryAttributes {
  @scala.inline
  def apply(): SelfManagedActiveDirectoryAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfManagedActiveDirectoryAttributes]
  }
  @scala.inline
  implicit class SelfManagedActiveDirectoryAttributesOps[Self <: SelfManagedActiveDirectoryAttributes] (val x: Self) extends AnyVal {
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
    def withDomainName(value: ActiveDirectoryFullyQualifiedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSystemAdministratorsGroup(value: FileSystemAdministratorsGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemAdministratorsGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystemAdministratorsGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemAdministratorsGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalUnitDistinguishedName(value: OrganizationalUnitDistinguishedName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitDistinguishedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnitDistinguishedName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitDistinguishedName")(js.undefined)
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

