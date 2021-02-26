package typingsSlinky.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemParameters extends StObject {
  
  /**
    * Define system parameters. The parameters defined here will override the default parameters implemented by the system. If this field is missing from the service config, default
    * system parameters will be used. Default system parameters and names is implementation-dependent. Example: define api key for all methods system_parameters rules: - selector: "*"
    * parameters: - name: api_key url_query_parameter: api_key Example: define 2 api key names for a specific method. system_parameters rules: - selector: "/ListShelves" parameters: -
    * name: api_key http_header: Api-Key1 - name: api_key http_header: Api-Key2 **NOTE:** All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[SystemParameterRule]] = js.native
}
object SystemParameters {
  
  @scala.inline
  def apply(): SystemParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemParameters]
  }
  
  @scala.inline
  implicit class SystemParametersMutableBuilder[Self <: SystemParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[SystemParameterRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SystemParameterRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
