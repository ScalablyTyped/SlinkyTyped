package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationalUnitsForParentResponse extends js.Object {
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.NextToken] = js.native
  /**
    * A list of the OUs in the specified root or parent OU.
    */
  var OrganizationalUnits: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.OrganizationalUnits] = js.native
}

object ListOrganizationalUnitsForParentResponse {
  @scala.inline
  def apply(): ListOrganizationalUnitsForParentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationalUnitsForParentResponse]
  }
  @scala.inline
  implicit class ListOrganizationalUnitsForParentResponseOps[Self <: ListOrganizationalUnitsForParentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalUnits(value: OrganizationalUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnits")(js.undefined)
        ret
    }
  }
  
}

