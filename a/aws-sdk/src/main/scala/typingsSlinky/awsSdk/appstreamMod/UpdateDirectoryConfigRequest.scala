package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDirectoryConfigRequest extends js.Object {
  /**
    * The name of the Directory Config object.
    */
  var DirectoryName: typingsSlinky.awsSdk.appstreamMod.DirectoryName = js.native
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.native
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.ServiceAccountCredentials] = js.native
}

object UpdateDirectoryConfigRequest {
  @scala.inline
  def apply(DirectoryName: DirectoryName): UpdateDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDirectoryConfigRequest]
  }
  @scala.inline
  implicit class UpdateDirectoryConfigRequestOps[Self <: UpdateDirectoryConfigRequest] (val x: Self) extends AnyVal {
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
    def withoutOrganizationalUnitDistinguishedNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitDistinguishedNames")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountCredentials(value: ServiceAccountCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccountCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccountCredentials")(js.undefined)
        ret
    }
  }
  
}

