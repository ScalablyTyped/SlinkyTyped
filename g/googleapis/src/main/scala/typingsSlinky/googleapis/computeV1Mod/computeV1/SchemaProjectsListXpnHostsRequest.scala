package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProjectsListXpnHostsRequest extends StObject {
  
  /**
    * Optional organization ID managed by Cloud Resource Manager, for which to
    * list shared VPC host projects. If not specified, the organization will be
    * inferred from the project.
    */
  var organization: js.UndefOr[String] = js.native
}
object SchemaProjectsListXpnHostsRequest {
  
  @scala.inline
  def apply(): SchemaProjectsListXpnHostsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsListXpnHostsRequest]
  }
  
  @scala.inline
  implicit class SchemaProjectsListXpnHostsRequestMutableBuilder[Self <: SchemaProjectsListXpnHostsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
  }
}
