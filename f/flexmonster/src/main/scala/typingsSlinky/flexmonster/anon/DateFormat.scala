package typingsSlinky.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateFormat extends StObject {
  
  var dateFormat: js.UndefOr[String] = js.native
  
  var liveSearch: js.UndefOr[Boolean] = js.native
  
  var timezoneOffset: js.UndefOr[Double] = js.native
  
  var weekOffset: js.UndefOr[Double] = js.native
}
object DateFormat {
  
  @scala.inline
  def apply(): DateFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFormat]
  }
  
  @scala.inline
  implicit class DateFormatMutableBuilder[Self <: DateFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setLiveSearch(value: Boolean): Self = StObject.set(x, "liveSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveSearchUndefined: Self = StObject.set(x, "liveSearch", js.undefined)
    
    @scala.inline
    def setTimezoneOffset(value: Double): Self = StObject.set(x, "timezoneOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneOffsetUndefined: Self = StObject.set(x, "timezoneOffset", js.undefined)
    
    @scala.inline
    def setWeekOffset(value: Double): Self = StObject.set(x, "weekOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekOffsetUndefined: Self = StObject.set(x, "weekOffset", js.undefined)
  }
}
