package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionInstanceGroupManagersDeleteInstancesRequest extends StObject {
  
  /**
    * The URLs of one or more instances to delete. This can be a full URL or a
    * partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
}
object SchemaRegionInstanceGroupManagersDeleteInstancesRequest {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersDeleteInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersDeleteInstancesRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersDeleteInstancesRequestMutableBuilder[Self <: SchemaRegionInstanceGroupManagersDeleteInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
