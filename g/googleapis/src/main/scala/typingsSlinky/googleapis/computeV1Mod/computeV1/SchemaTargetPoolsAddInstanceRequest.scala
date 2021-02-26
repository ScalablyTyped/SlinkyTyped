package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetPoolsAddInstanceRequest extends StObject {
  
  /**
    * A full or partial URL to an instance to add to this target pool. This can
    * be a full or partial URL. For example, the following are valid URLs:   -
    * https://www.googleapis.com/compute/v1/projects/project-id/zones/zone/instances/instance-name
    * - projects/project-id/zones/zone/instances/instance-name  -
    * zones/zone/instances/instance-name
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceReference]] = js.native
}
object SchemaTargetPoolsAddInstanceRequest {
  
  @scala.inline
  def apply(): SchemaTargetPoolsAddInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolsAddInstanceRequest]
  }
  
  @scala.inline
  implicit class SchemaTargetPoolsAddInstanceRequestMutableBuilder[Self <: SchemaTargetPoolsAddInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[SchemaInstanceReference]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: SchemaInstanceReference*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
