package typingsSlinky.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReindexRethrottleParams extends GenericParams {
  
  var requestsPerSecond: Double = js.native
  
  var taskId: String = js.native
}
object ReindexRethrottleParams {
  
  @scala.inline
  def apply(requestsPerSecond: Double, taskId: String): ReindexRethrottleParams = {
    val __obj = js.Dynamic.literal(requestsPerSecond = requestsPerSecond.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexRethrottleParams]
  }
  
  @scala.inline
  implicit class ReindexRethrottleParamsMutableBuilder[Self <: ReindexRethrottleParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestsPerSecond(value: Double): Self = StObject.set(x, "requestsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
