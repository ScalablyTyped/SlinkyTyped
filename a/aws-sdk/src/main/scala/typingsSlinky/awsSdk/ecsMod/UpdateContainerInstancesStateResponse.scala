package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContainerInstancesStateResponse extends StObject {
  
  /**
    * The list of container instances.
    */
  var containerInstances: js.UndefOr[ContainerInstances] = js.native
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
}
object UpdateContainerInstancesStateResponse {
  
  @scala.inline
  def apply(): UpdateContainerInstancesStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContainerInstancesStateResponse]
  }
  
  @scala.inline
  implicit class UpdateContainerInstancesStateResponseMutableBuilder[Self <: UpdateContainerInstancesStateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerInstances(value: ContainerInstances): Self = StObject.set(x, "containerInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInstancesUndefined: Self = StObject.set(x, "containerInstances", js.undefined)
    
    @scala.inline
    def setContainerInstancesVarargs(value: ContainerInstance*): Self = StObject.set(x, "containerInstances", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: Failures): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: Failure*): Self = StObject.set(x, "failures", js.Array(value :_*))
  }
}
