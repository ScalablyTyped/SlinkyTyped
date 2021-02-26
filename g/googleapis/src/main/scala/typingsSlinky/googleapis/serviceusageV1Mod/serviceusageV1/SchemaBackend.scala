package typingsSlinky.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `Backend` defines the backend configuration for a service.
  */
@js.native
trait SchemaBackend extends StObject {
  
  /**
    * A list of API backend rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaBackendRule]] = js.native
}
object SchemaBackend {
  
  @scala.inline
  def apply(): SchemaBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackend]
  }
  
  @scala.inline
  implicit class SchemaBackendMutableBuilder[Self <: SchemaBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[SchemaBackendRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaBackendRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
