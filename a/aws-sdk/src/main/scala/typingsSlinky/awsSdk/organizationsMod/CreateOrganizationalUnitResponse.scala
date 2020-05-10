package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOrganizationalUnitResponse extends js.Object {
  /**
    * A structure that contains details about the newly created OU.
    */
  var OrganizationalUnit: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.OrganizationalUnit] = js.native
}

object CreateOrganizationalUnitResponse {
  @scala.inline
  def apply(): CreateOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrganizationalUnitResponse]
  }
  @scala.inline
  implicit class CreateOrganizationalUnitResponseOps[Self <: CreateOrganizationalUnitResponse] (val x: Self) extends AnyVal {
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

