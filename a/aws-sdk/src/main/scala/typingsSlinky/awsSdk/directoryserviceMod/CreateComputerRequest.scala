package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateComputerRequest extends js.Object {
  /**
    * An array of Attribute objects that contain any LDAP attributes to apply to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.native
  /**
    * The name of the computer account.
    */
  var ComputerName: typingsSlinky.awsSdk.directoryserviceMod.ComputerName = js.native
  /**
    * The identifier of the directory in which to create the computer account.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The fully-qualified distinguished name of the organizational unit to place the computer account in.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN] = js.native
  /**
    * A one-time password that is used to join the computer to the directory. You should generate a random, strong password to use for this parameter.
    */
  var Password: ComputerPassword = js.native
}

object CreateComputerRequest {
  @scala.inline
  def apply(ComputerName: ComputerName, DirectoryId: DirectoryId, Password: ComputerPassword): CreateComputerRequest = {
    val __obj = js.Dynamic.literal(ComputerName = ComputerName.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComputerRequest]
  }
  @scala.inline
  implicit class CreateComputerRequestOps[Self <: CreateComputerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputerName(value: ComputerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: ComputerPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputerAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputerAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalUnitDistinguishedName(value: OrganizationalUnitDN): Self = {
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

