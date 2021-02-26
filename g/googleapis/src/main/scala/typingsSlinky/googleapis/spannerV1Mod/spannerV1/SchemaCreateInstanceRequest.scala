package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for CreateInstance.
  */
@js.native
trait SchemaCreateInstanceRequest extends StObject {
  
  /**
    * Required. The instance to create.  The name may be omitted, but if
    * specified must be `&lt;parent&gt;/instances/&lt;instance_id&gt;`.
    */
  var instance: js.UndefOr[SchemaInstance] = js.native
  
  /**
    * Required. The ID of the instance to create.  Valid identifiers are of the
    * form `a-z*[a-z0-9]` and must be between 6 and 30 characters in length.
    */
  var instanceId: js.UndefOr[String] = js.native
}
object SchemaCreateInstanceRequest {
  
  @scala.inline
  def apply(): SchemaCreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateInstanceRequestMutableBuilder[Self <: SchemaCreateInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: SchemaInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
