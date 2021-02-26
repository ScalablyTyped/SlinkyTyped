package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetPoolsAddHealthCheckRequest extends StObject {
  
  /**
    * The HttpHealthCheck to add to the target pool.
    */
  var healthChecks: js.UndefOr[js.Array[SchemaHealthCheckReference]] = js.native
}
object SchemaTargetPoolsAddHealthCheckRequest {
  
  @scala.inline
  def apply(): SchemaTargetPoolsAddHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolsAddHealthCheckRequest]
  }
  
  @scala.inline
  implicit class SchemaTargetPoolsAddHealthCheckRequestMutableBuilder[Self <: SchemaTargetPoolsAddHealthCheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthChecks(value: js.Array[SchemaHealthCheckReference]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    @scala.inline
    def setHealthChecksVarargs(value: SchemaHealthCheckReference*): Self = StObject.set(x, "healthChecks", js.Array(value :_*))
  }
}
