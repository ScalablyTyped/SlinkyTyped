package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledJobTrigger extends StObject {
  
  var BeginDay: Double = js.native
  
  var BeginMonth: Double = js.native
  
  var BeginYear: Double = js.native
  
  def Clone(): IScheduledJobTrigger = js.native
  
  var EndDay: Double = js.native
  
  var EndMonth: Double = js.native
  
  var EndYear: Double = js.native
  
  var StartHour: Double = js.native
  
  var StartMinute: Double = js.native
  
  var Type: ITriggerType = js.native
  
  var ValidEndDate: Boolean = js.native
}
object IScheduledJobTrigger {
  
  @scala.inline
  def apply(
    BeginDay: Double,
    BeginMonth: Double,
    BeginYear: Double,
    Clone: () => IScheduledJobTrigger,
    EndDay: Double,
    EndMonth: Double,
    EndYear: Double,
    StartHour: Double,
    StartMinute: Double,
    Type: ITriggerType,
    ValidEndDate: Boolean
  ): IScheduledJobTrigger = {
    val __obj = js.Dynamic.literal(BeginDay = BeginDay.asInstanceOf[js.Any], BeginMonth = BeginMonth.asInstanceOf[js.Any], BeginYear = BeginYear.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), EndDay = EndDay.asInstanceOf[js.Any], EndMonth = EndMonth.asInstanceOf[js.Any], EndYear = EndYear.asInstanceOf[js.Any], StartHour = StartHour.asInstanceOf[js.Any], StartMinute = StartMinute.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], ValidEndDate = ValidEndDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledJobTrigger]
  }
  
  @scala.inline
  implicit class IScheduledJobTriggerMutableBuilder[Self <: IScheduledJobTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginDay(value: Double): Self = StObject.set(x, "BeginDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginMonth(value: Double): Self = StObject.set(x, "BeginMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginYear(value: Double): Self = StObject.set(x, "BeginYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IScheduledJobTrigger): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndDay(value: Double): Self = StObject.set(x, "EndDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMonth(value: Double): Self = StObject.set(x, "EndMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndYear(value: Double): Self = StObject.set(x, "EndYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHour(value: Double): Self = StObject.set(x, "StartHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMinute(value: Double): Self = StObject.set(x, "StartMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ITriggerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidEndDate(value: Boolean): Self = StObject.set(x, "ValidEndDate", value.asInstanceOf[js.Any])
  }
}
