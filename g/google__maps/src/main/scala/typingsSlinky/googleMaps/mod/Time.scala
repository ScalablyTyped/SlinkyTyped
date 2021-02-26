package typingsSlinky.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Time extends StObject {
  
  /** the time specified as a string. The time is displayed in the time zone of the transit stop. */
  var text: String = js.native
  
  /**
    * contains the time zone of this station. The value is the name of the time zone as defined in the
    * [IANA Time Zone Database](http://www.iana.org/time-zones), e.g. "America/New_York".
    */
  var time_zone: String = js.native
  
  /** the time specified as a JavaScript `Date` object. */
  var value: js.Date = js.native
}
object Time {
  
  @scala.inline
  def apply(text: String, time_zone: String, value: js.Date): Time = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], time_zone = time_zone.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  @scala.inline
  implicit class TimeMutableBuilder[Self <: Time] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
