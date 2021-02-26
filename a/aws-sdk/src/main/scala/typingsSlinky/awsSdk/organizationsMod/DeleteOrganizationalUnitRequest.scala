package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOrganizationalUnitRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the organizational unit that you want to delete. You can get the ID from the ListOrganizationalUnitsForParent operation. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that contains the OU). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.
    */
  var OrganizationalUnitId: typingsSlinky.awsSdk.organizationsMod.OrganizationalUnitId = js.native
}
object DeleteOrganizationalUnitRequest {
  
  @scala.inline
  def apply(OrganizationalUnitId: OrganizationalUnitId): DeleteOrganizationalUnitRequest = {
    val __obj = js.Dynamic.literal(OrganizationalUnitId = OrganizationalUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOrganizationalUnitRequest]
  }
  
  @scala.inline
  implicit class DeleteOrganizationalUnitRequestMutableBuilder[Self <: DeleteOrganizationalUnitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationalUnitId(value: OrganizationalUnitId): Self = StObject.set(x, "OrganizationalUnitId", value.asInstanceOf[js.Any])
  }
}
