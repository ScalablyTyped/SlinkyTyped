package typingsSlinky.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILocaleDateTimeFormatDescriptor extends StObject {
  
  var AMPMS: js.Array[String] = js.native
  
  var DAY: js.Array[String] = js.native
  
  var MONTH: js.Array[String] = js.native
  
  var SHORTDAY: js.Array[String] = js.native
  
  var SHORTMONTH: js.Array[String] = js.native
  
  var fullDate: String = js.native
  
  var longDate: String = js.native
  
  var medium: String = js.native
  
  var mediumDate: String = js.native
  
  var mediumTime: String = js.native
  
  var short: String = js.native
  
  var shortDate: String = js.native
  
  var shortTime: String = js.native
}
object ILocaleDateTimeFormatDescriptor {
  
  @scala.inline
  def apply(
    AMPMS: js.Array[String],
    DAY: js.Array[String],
    MONTH: js.Array[String],
    SHORTDAY: js.Array[String],
    SHORTMONTH: js.Array[String],
    fullDate: String,
    longDate: String,
    medium: String,
    mediumDate: String,
    mediumTime: String,
    short: String,
    shortDate: String,
    shortTime: String
  ): ILocaleDateTimeFormatDescriptor = {
    val __obj = js.Dynamic.literal(AMPMS = AMPMS.asInstanceOf[js.Any], DAY = DAY.asInstanceOf[js.Any], MONTH = MONTH.asInstanceOf[js.Any], SHORTDAY = SHORTDAY.asInstanceOf[js.Any], SHORTMONTH = SHORTMONTH.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumDate = mediumDate.asInstanceOf[js.Any], mediumTime = mediumTime.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocaleDateTimeFormatDescriptor]
  }
  
  @scala.inline
  implicit class ILocaleDateTimeFormatDescriptorMutableBuilder[Self <: ILocaleDateTimeFormatDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAMPMS(value: js.Array[String]): Self = StObject.set(x, "AMPMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAMPMSVarargs(value: String*): Self = StObject.set(x, "AMPMS", js.Array(value :_*))
    
    @scala.inline
    def setDAY(value: js.Array[String]): Self = StObject.set(x, "DAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAYVarargs(value: String*): Self = StObject.set(x, "DAY", js.Array(value :_*))
    
    @scala.inline
    def setFullDate(value: String): Self = StObject.set(x, "fullDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDate(value: String): Self = StObject.set(x, "longDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMONTH(value: js.Array[String]): Self = StObject.set(x, "MONTH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMONTHVarargs(value: String*): Self = StObject.set(x, "MONTH", js.Array(value :_*))
    
    @scala.inline
    def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumDate(value: String): Self = StObject.set(x, "mediumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumTime(value: String): Self = StObject.set(x, "mediumTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHORTDAY(value: js.Array[String]): Self = StObject.set(x, "SHORTDAY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHORTDAYVarargs(value: String*): Self = StObject.set(x, "SHORTDAY", js.Array(value :_*))
    
    @scala.inline
    def setSHORTMONTH(value: js.Array[String]): Self = StObject.set(x, "SHORTMONTH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHORTMONTHVarargs(value: String*): Self = StObject.set(x, "SHORTMONTH", js.Array(value :_*))
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDate(value: String): Self = StObject.set(x, "shortDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortTime(value: String): Self = StObject.set(x, "shortTime", value.asInstanceOf[js.Any])
  }
}
