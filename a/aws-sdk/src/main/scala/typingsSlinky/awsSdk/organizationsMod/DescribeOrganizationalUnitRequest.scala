package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationalUnitRequest extends js.Object {
  
  /**
    * The unique identifier (ID) of the organizational unit that you want details about. You can get the ID from the ListOrganizationalUnitsForParent operation. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that contains the OU). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.
    */
  var OrganizationalUnitId: typingsSlinky.awsSdk.organizationsMod.OrganizationalUnitId = js.native
}
object DescribeOrganizationalUnitRequest {
  
  @scala.inline
  def apply(OrganizationalUnitId: OrganizationalUnitId): DescribeOrganizationalUnitRequest = {
    val __obj = js.Dynamic.literal(OrganizationalUnitId = OrganizationalUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationalUnitRequest]
  }
  
  @scala.inline
  implicit class DescribeOrganizationalUnitRequestOps[Self <: DescribeOrganizationalUnitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrganizationalUnitId(value: OrganizationalUnitId): Self = this.set("OrganizationalUnitId", value.asInstanceOf[js.Any])
  }
}
