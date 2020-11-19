package typingsSlinky.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrganizationalUnit(value: OrganizationalUnit): Self = this.set("OrganizationalUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalUnit: Self = this.set("OrganizationalUnit", js.undefined)
  }
}
