package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Various utilities and convenience functions for executing code at various phases of browser frames.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html)
  */
@js.native
trait scheduling extends StObject {
  
  /**
    * Registers a frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#addFrameTask)
    */
  def addFrameTask(phases: PhaseCallbacks): FrameTaskHandle = js.native
  
  /**
    * Schedules the execution of a `callback` function at the next web browser tick.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#schedule)
    */
  def schedule(callback: js.Function): js.Any = js.native
}
object scheduling {
  
  @scala.inline
  def apply(addFrameTask: PhaseCallbacks => FrameTaskHandle, schedule: js.Function => js.Any): scheduling = {
    val __obj = js.Dynamic.literal(addFrameTask = js.Any.fromFunction1(addFrameTask), schedule = js.Any.fromFunction1(schedule))
    __obj.asInstanceOf[scheduling]
  }
  
  @scala.inline
  implicit class schedulingMutableBuilder[Self <: scheduling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddFrameTask(value: PhaseCallbacks => FrameTaskHandle): Self = StObject.set(x, "addFrameTask", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSchedule(value: js.Function => js.Any): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
  }
}
