package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDirectoryConfigRequest extends js.Object {
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: typingsSlinky.awsSdk.appstreamMod.DirectoryName = js.native
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList = js.native
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: typingsSlinky.awsSdk.appstreamMod.ServiceAccountCredentials = js.native
}

object CreateDirectoryConfigRequest {
  @scala.inline
  def apply(
    DirectoryName: DirectoryName,
    OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList,
    ServiceAccountCredentials: ServiceAccountCredentials
  ): CreateDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any], OrganizationalUnitDistinguishedNames = OrganizationalUnitDistinguishedNames.asInstanceOf[js.Any], ServiceAccountCredentials = ServiceAccountCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryConfigRequest]
  }
  @scala.inline
  implicit class CreateDirectoryConfigRequestOps[Self <: CreateDirectoryConfigRequest] (val x: Self) extends AnyVal {
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
    def withOrganizationalUnitDistinguishedNames(value: OrganizationalUnitDistinguishedNamesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitDistinguishedNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceAccountCredentials(value: ServiceAccountCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccountCredentials")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

