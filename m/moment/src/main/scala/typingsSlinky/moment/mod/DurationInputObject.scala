package typingsSlinky.moment.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationInputObject
  extends MomentInputObject
     with _DurationInputArg1 {
  
  var Q: js.UndefOr[numberlike] = js.native
  
  var quarter: js.UndefOr[numberlike] = js.native
  
  var quarters: js.UndefOr[numberlike] = js.native
  
  var w: js.UndefOr[numberlike] = js.native
  
  var week: js.UndefOr[numberlike] = js.native
  
  var weeks: js.UndefOr[numberlike] = js.native
}
object DurationInputObject {
  
  @scala.inline
  def apply(): DurationInputObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationInputObject]
  }
  
  @scala.inline
  implicit class DurationInputObjectMutableBuilder[Self <: DurationInputObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQ(value: numberlike): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "Q", js.undefined)
    
    @scala.inline
    def setQuarter(value: numberlike): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
    
    @scala.inline
    def setQuarters(value: numberlike): Self = StObject.set(x, "quarters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartersUndefined: Self = StObject.set(x, "quarters", js.undefined)
    
    @scala.inline
    def setW(value: numberlike): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    @scala.inline
    def setWeek(value: numberlike): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
    
    @scala.inline
    def setWeeks(value: numberlike): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
  }
}
