package typingsSlinky.expo.anon

import typingsSlinky.expo.expoStrings.day
import typingsSlinky.expo.expoStrings.hour
import typingsSlinky.expo.expoStrings.minute
import typingsSlinky.expo.expoStrings.month
import typingsSlinky.expo.expoStrings.week
import typingsSlinky.expo.expoStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalMs extends StObject {
  
  var intervalMs: js.UndefOr[Double] = js.native
  
  var repeat: js.UndefOr[minute | hour | day | week | month | year] = js.native
  
  var time: js.UndefOr[js.Date | Double] = js.native
}
object IntervalMs {
  
  @scala.inline
  def apply(): IntervalMs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntervalMs]
  }
  
  @scala.inline
  implicit class IntervalMsMutableBuilder[Self <: IntervalMs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntervalMs(value: Double): Self = StObject.set(x, "intervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalMsUndefined: Self = StObject.set(x, "intervalMs", js.undefined)
    
    @scala.inline
    def setRepeat(value: minute | hour | day | week | month | year): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setTime(value: js.Date | Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDate(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
