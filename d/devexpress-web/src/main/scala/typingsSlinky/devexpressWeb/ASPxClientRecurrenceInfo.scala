package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information defining the occurrences of a recurring client appointment.
  */
@js.native
trait ASPxClientRecurrenceInfo extends js.Object {
  
  /**
    * Gets the ordinal number of a day within a defined month.
    */
  def GetDayNumber(): Double = js.native
  
  /**
    * Gets the duration of the recurrence.
    */
  def GetDuration(): Double = js.native
  
  /**
    * Gets the recurrence end date.
    */
  def GetEnd(): js.Date = js.native
  
  /**
    * Gets the month (as a number) on which the corresponding appointment recurs.
    */
  def GetMonth(): Double = js.native
  
  /**
    * Gets how many times the appointment occurs.
    */
  def GetOccurrenceCount(): Double = js.native
  
  /**
    * Gets the frequency with which the corresponding appointment reoccurs (dependent on the recurrence Type).
    */
  def GetPeriodicity(): Double = js.native
  
  /**
    * Gets the type of the recurrence range.
    */
  def GetRange(): ASPxClientRecurrenceRange = js.native
  
  /**
    * Gets the time base for the frequency of the corresponding appointment reoccurrence.
    */
  def GetRecurrenceType(): ASPxClientRecurrenceType = js.native
  
  /**
    * Gets the recurrence start date.
    */
  def GetStart(): js.Date = js.native
  
  /**
    * Gets the day/days in a week on which the corresponding appointment occurs.
    */
  def GetWeekDays(): ASPxClientWeekDays = js.native
  
  /**
    * Gets the occurrence number of the week in a month for the recurrence pattern.
    */
  def GetWeekOfMonth(): ASPxClientWeekOfMonth = js.native
  
  /**
    * Sets the ordinal number of a day within a defined month.
    * @param dayNumber A positive integer value that specifies the day number within a month.
    */
  def SetDayNumber(dayNumber: Double): Unit = js.native
  
  /**
    * Sets the duration of the recurrence.
    * @param duration A TimeSpan object representing the duration.
    */
  def SetDuration(duration: js.Any): Unit = js.native
  
  /**
    * Sets the recurrence end date.
    * @param end A JavaScript Date object that specifies the end date for the recurrence.
    */
  def SetEnd(end: js.Date): Unit = js.native
  
  /**
    * Sets the month (as a number) on which the corresponding appointment occurs.
    * @param month A positive integer value that specifies the month's number.
    */
  def SetMonth(month: Double): Unit = js.native
  
  /**
    * Sets how many times the appointment occurs.
    * @param occurrenceCount An integer value that specifies how many times the appointment occurs.
    */
  def SetOccurrenceCount(occurrenceCount: Double): Unit = js.native
  
  /**
    * Sets the frequency with which the corresponding appointment occurs (dependent on the recurrence Type).
    * @param periodicity An integer value that specifies the frequency with which the corresponding appointment occurs.
    */
  def SetPeriodicity(periodicity: Double): Unit = js.native
  
  /**
    * Sets the type of the recurrence range.
    * @param range An ASPxClientRecurrenceRangeenumeration value that specifies the recurrence range type.
    */
  def SetRange(range: ASPxClientRecurrenceRange): Unit = js.native
  
  /**
    * Sets the time base for the frequency of the corresponding appointment occurrences.
    * @param type An ASPxClientRecurrenceType enumeration value that specifies the recurrence's frequency type.
    */
  def SetRecurrenceType(`type`: ASPxClientRecurrenceType): Unit = js.native
  
  /**
    * Sets the recurrence start date.
    * @param start A JavaScript date object value that specifies the start date for the recurrence.
    */
  def SetStart(start: js.Date): Unit = js.native
  
  /**
    * Sets the day/days in a week that the corresponding appointment recurs on.
    * @param weekDays The ASPxClientWeekDays enumeration value specifying the day/days in a week.
    */
  def SetWeekDays(weekDays: ASPxClientWeekDays): Unit = js.native
  
  /**
    * Sets the occurrence number of the week in a month for the recurrence pattern.
    * @param weekOfMonth A ASPxClientWeekOfMonth enumeration value that specifies a particular week in every month.
    */
  def SetWeekOfMonth(weekOfMonth: ASPxClientWeekOfMonth): Unit = js.native
}
object ASPxClientRecurrenceInfo {
  
  @scala.inline
  def apply(
    GetDayNumber: () => Double,
    GetDuration: () => Double,
    GetEnd: () => js.Date,
    GetMonth: () => Double,
    GetOccurrenceCount: () => Double,
    GetPeriodicity: () => Double,
    GetRange: () => ASPxClientRecurrenceRange,
    GetRecurrenceType: () => ASPxClientRecurrenceType,
    GetStart: () => js.Date,
    GetWeekDays: () => ASPxClientWeekDays,
    GetWeekOfMonth: () => ASPxClientWeekOfMonth,
    SetDayNumber: Double => Unit,
    SetDuration: js.Any => Unit,
    SetEnd: js.Date => Unit,
    SetMonth: Double => Unit,
    SetOccurrenceCount: Double => Unit,
    SetPeriodicity: Double => Unit,
    SetRange: ASPxClientRecurrenceRange => Unit,
    SetRecurrenceType: ASPxClientRecurrenceType => Unit,
    SetStart: js.Date => Unit,
    SetWeekDays: ASPxClientWeekDays => Unit,
    SetWeekOfMonth: ASPxClientWeekOfMonth => Unit
  ): ASPxClientRecurrenceInfo = {
    val __obj = js.Dynamic.literal(GetDayNumber = js.Any.fromFunction0(GetDayNumber), GetDuration = js.Any.fromFunction0(GetDuration), GetEnd = js.Any.fromFunction0(GetEnd), GetMonth = js.Any.fromFunction0(GetMonth), GetOccurrenceCount = js.Any.fromFunction0(GetOccurrenceCount), GetPeriodicity = js.Any.fromFunction0(GetPeriodicity), GetRange = js.Any.fromFunction0(GetRange), GetRecurrenceType = js.Any.fromFunction0(GetRecurrenceType), GetStart = js.Any.fromFunction0(GetStart), GetWeekDays = js.Any.fromFunction0(GetWeekDays), GetWeekOfMonth = js.Any.fromFunction0(GetWeekOfMonth), SetDayNumber = js.Any.fromFunction1(SetDayNumber), SetDuration = js.Any.fromFunction1(SetDuration), SetEnd = js.Any.fromFunction1(SetEnd), SetMonth = js.Any.fromFunction1(SetMonth), SetOccurrenceCount = js.Any.fromFunction1(SetOccurrenceCount), SetPeriodicity = js.Any.fromFunction1(SetPeriodicity), SetRange = js.Any.fromFunction1(SetRange), SetRecurrenceType = js.Any.fromFunction1(SetRecurrenceType), SetStart = js.Any.fromFunction1(SetStart), SetWeekDays = js.Any.fromFunction1(SetWeekDays), SetWeekOfMonth = js.Any.fromFunction1(SetWeekOfMonth))
    __obj.asInstanceOf[ASPxClientRecurrenceInfo]
  }
  
  @scala.inline
  implicit class ASPxClientRecurrenceInfoOps[Self <: ASPxClientRecurrenceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDayNumber(value: () => Double): Self = this.set("GetDayNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("GetDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnd(value: () => js.Date): Self = this.set("GetEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMonth(value: () => Double): Self = this.set("GetMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOccurrenceCount(value: () => Double): Self = this.set("GetOccurrenceCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPeriodicity(value: () => Double): Self = this.set("GetPeriodicity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRange(value: () => ASPxClientRecurrenceRange): Self = this.set("GetRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecurrenceType(value: () => ASPxClientRecurrenceType): Self = this.set("GetRecurrenceType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStart(value: () => js.Date): Self = this.set("GetStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWeekDays(value: () => ASPxClientWeekDays): Self = this.set("GetWeekDays", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWeekOfMonth(value: () => ASPxClientWeekOfMonth): Self = this.set("GetWeekOfMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDayNumber(value: Double => Unit): Self = this.set("SetDayNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDuration(value: js.Any => Unit): Self = this.set("SetDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnd(value: js.Date => Unit): Self = this.set("SetEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMonth(value: Double => Unit): Self = this.set("SetMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOccurrenceCount(value: Double => Unit): Self = this.set("SetOccurrenceCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPeriodicity(value: Double => Unit): Self = this.set("SetPeriodicity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRange(value: ASPxClientRecurrenceRange => Unit): Self = this.set("SetRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecurrenceType(value: ASPxClientRecurrenceType => Unit): Self = this.set("SetRecurrenceType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStart(value: js.Date => Unit): Self = this.set("SetStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWeekDays(value: ASPxClientWeekDays => Unit): Self = this.set("SetWeekDays", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWeekOfMonth(value: ASPxClientWeekOfMonth => Unit): Self = this.set("SetWeekOfMonth", js.Any.fromFunction1(value))
  }
}
