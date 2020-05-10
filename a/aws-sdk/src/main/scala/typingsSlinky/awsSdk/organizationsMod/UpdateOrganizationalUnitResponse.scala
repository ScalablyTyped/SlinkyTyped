package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOrganizationalUnitResponse extends js.Object {
  /**
    * A structure that contains the details about the specified OU, including its new name.
    */
  var OrganizationalUnit: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.OrganizationalUnit] = js.native
}

object UpdateOrganizationalUnitResponse {
  @scala.inline
  def apply(): UpdateOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOrganizationalUnitResponse]
  }
  @scala.inline
  implicit class UpdateOrganizationalUnitResponseOps[Self <: UpdateOrganizationalUnitResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

