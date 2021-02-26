package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupsRemoveInstancesRequest extends StObject {
  
  /**
    * The list of instances to remove from the instance group.
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceReference]] = js.native
}
object SchemaInstanceGroupsRemoveInstancesRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupsRemoveInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupsRemoveInstancesRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupsRemoveInstancesRequestMutableBuilder[Self <: SchemaInstanceGroupsRemoveInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[SchemaInstanceReference]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: SchemaInstanceReference*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
