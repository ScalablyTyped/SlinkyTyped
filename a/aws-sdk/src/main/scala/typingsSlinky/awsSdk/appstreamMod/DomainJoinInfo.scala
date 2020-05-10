package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainJoinInfo extends js.Object {
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.DirectoryName] = js.native
  /**
    * The distinguished name of the organizational unit for computer accounts.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.OrganizationalUnitDistinguishedName] = js.native
}

object DomainJoinInfo {
  @scala.inline
  def apply(): DomainJoinInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainJoinInfo]
  }
  @scala.inline
  implicit class DomainJoinInfoOps[Self <: DomainJoinInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryName(value: DirectoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryName")(js.undefined)
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
  }
  
}

