package typingsSlinky.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeRange extends StObject {
  
  /** The end of the time range. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The start of the time range. */
  var startTime: js.UndefOr[String] = js.native
}
object TimeRange {
  
  @scala.inline
  def apply(): TimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRange]
  }
  
  @scala.inline
  implicit class TimeRangeMutableBuilder[Self <: TimeRange] (val x: Self) extends AnyVal {
    
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
