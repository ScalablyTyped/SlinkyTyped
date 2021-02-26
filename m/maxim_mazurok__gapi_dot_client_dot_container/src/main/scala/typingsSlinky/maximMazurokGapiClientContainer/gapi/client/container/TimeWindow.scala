package typingsSlinky.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeWindow extends StObject {
  
  /** The time that the window ends. The end time should take place after the start time. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The time that the window first starts. */
  var startTime: js.UndefOr[String] = js.native
}
object TimeWindow {
  
  @scala.inline
  def apply(): TimeWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeWindow]
  }
  
  @scala.inline
  implicit class TimeWindowMutableBuilder[Self <: TimeWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
