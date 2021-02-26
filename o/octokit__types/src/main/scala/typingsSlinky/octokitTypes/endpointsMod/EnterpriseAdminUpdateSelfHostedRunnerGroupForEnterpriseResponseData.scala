package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData extends StObject {
  
  var default: Boolean = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var runners_url: String = js.native
  
  var selected_organizations_url: String = js.native
  
  var visibility: String = js.native
}
object EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData {
  
  @scala.inline
  def apply(
    default: Boolean,
    id: Double,
    name: String,
    runners_url: String,
    selected_organizations_url: String,
    visibility: String
  ): EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], runners_url = runners_url.asInstanceOf[js.Any], selected_organizations_url = selected_organizations_url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseDataMutableBuilder[Self <: EnterpriseAdminUpdateSelfHostedRunnerGroupForEnterpriseResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunners_url(value: String): Self = StObject.set(x, "runners_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_organizations_url(value: String): Self = StObject.set(x, "selected_organizations_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
