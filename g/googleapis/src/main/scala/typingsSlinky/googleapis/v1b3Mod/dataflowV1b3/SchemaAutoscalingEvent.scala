package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structured message reporting an autoscaling decision made by the Dataflow
  * service.
  */
@js.native
trait SchemaAutoscalingEvent extends StObject {
  
  /**
    * The current number of workers the job has.
    */
  var currentNumWorkers: js.UndefOr[String] = js.native
  
  /**
    * A message describing why the system decided to adjust the current number
    * of workers, why it failed, or why the system decided to not make any
    * changes to the number of workers.
    */
  var description: js.UndefOr[SchemaStructuredMessage] = js.native
  
  /**
    * The type of autoscaling event to report.
    */
  var eventType: js.UndefOr[String] = js.native
  
  /**
    * The target number of workers the worker pool wants to resize to use.
    */
  var targetNumWorkers: js.UndefOr[String] = js.native
  
  /**
    * The time this event was emitted to indicate a new target or current
    * num_workers value.
    */
  var time: js.UndefOr[String] = js.native
  
  /**
    * A short and friendly name for the worker pool this event refers to,
    * populated from the value of PoolStageRelation::user_pool_name.
    */
  var workerPool: js.UndefOr[String] = js.native
}
object SchemaAutoscalingEvent {
  
  @scala.inline
  def apply(): SchemaAutoscalingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingEvent]
  }
  
  @scala.inline
  implicit class SchemaAutoscalingEventMutableBuilder[Self <: SchemaAutoscalingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentNumWorkers(value: String): Self = StObject.set(x, "currentNumWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentNumWorkersUndefined: Self = StObject.set(x, "currentNumWorkers", js.undefined)
    
    @scala.inline
    def setDescription(value: SchemaStructuredMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    @scala.inline
    def setTargetNumWorkers(value: String): Self = StObject.set(x, "targetNumWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNumWorkersUndefined: Self = StObject.set(x, "targetNumWorkers", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setWorkerPool(value: String): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
