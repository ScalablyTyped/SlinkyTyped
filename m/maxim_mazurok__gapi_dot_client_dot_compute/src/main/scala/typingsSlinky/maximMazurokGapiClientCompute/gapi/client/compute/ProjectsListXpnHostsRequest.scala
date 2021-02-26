package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsListXpnHostsRequest extends StObject {
  
  /** Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host projects. If not specified, the organization will be inferred from the project. */
  var organization: js.UndefOr[String] = js.native
}
object ProjectsListXpnHostsRequest {
  
  @scala.inline
  def apply(): ProjectsListXpnHostsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectsListXpnHostsRequest]
  }
  
  @scala.inline
  implicit class ProjectsListXpnHostsRequestMutableBuilder[Self <: ProjectsListXpnHostsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
  }
}
