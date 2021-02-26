package typingsSlinky.dateFormatJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Some common format strings
@js.native
trait DateFormatMasks extends StObject {
  
  var default: String = js.native
  
  var fullDate: String = js.native
  
  var isoDate: String = js.native
  
  var isoDateTime: String = js.native
  
  var isoTime: String = js.native
  
  var isoUtcDateTime: String = js.native
  
  var longDate: String = js.native
  
  var longTime: String = js.native
  
  var mediumDate: String = js.native
  
  var mediumTime: String = js.native
  
  var shortDate: String = js.native
  
  var shortTime: String = js.native
}
object DateFormatMasks {
  
  @scala.inline
  def apply(
    default: String,
    fullDate: String,
    isoDate: String,
    isoDateTime: String,
    isoTime: String,
    isoUtcDateTime: String,
    longDate: String,
    longTime: String,
    mediumDate: String,
    mediumTime: String,
    shortDate: String,
    shortTime: String
  ): DateFormatMasks = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], isoDate = isoDate.asInstanceOf[js.Any], isoDateTime = isoDateTime.asInstanceOf[js.Any], isoTime = isoTime.asInstanceOf[js.Any], isoUtcDateTime = isoUtcDateTime.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], mediumDate = mediumDate.asInstanceOf[js.Any], mediumTime = mediumTime.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormatMasks]
  }
  
  @scala.inline
  implicit class DateFormatMasksMutableBuilder[Self <: DateFormatMasks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDate(value: String): Self = StObject.set(x, "fullDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoDate(value: String): Self = StObject.set(x, "isoDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoDateTime(value: String): Self = StObject.set(x, "isoDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoTime(value: String): Self = StObject.set(x, "isoTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoUtcDateTime(value: String): Self = StObject.set(x, "isoUtcDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDate(value: String): Self = StObject.set(x, "longDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongTime(value: String): Self = StObject.set(x, "longTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumDate(value: String): Self = StObject.set(x, "mediumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumTime(value: String): Self = StObject.set(x, "mediumTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDate(value: String): Self = StObject.set(x, "shortDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortTime(value: String): Self = StObject.set(x, "shortTime", value.asInstanceOf[js.Any])
  }
}
