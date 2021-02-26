package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationalUnitResponse extends StObject {
  
  /**
    * A structure that contains details about the specified OU.
    */
  var OrganizationalUnit: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.OrganizationalUnit] = js.native
}
object DescribeOrganizationalUnitResponse {
  
  @scala.inline
  def apply(): DescribeOrganizationalUnitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationalUnitResponse]
  }
  
  @scala.inline
  implicit class DescribeOrganizationalUnitResponseMutableBuilder[Self <: DescribeOrganizationalUnitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganizationalUnit(value: OrganizationalUnit): Self = StObject.set(x, "OrganizationalUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitUndefined: Self = StObject.set(x, "OrganizationalUnit", js.undefined)
  }
}
