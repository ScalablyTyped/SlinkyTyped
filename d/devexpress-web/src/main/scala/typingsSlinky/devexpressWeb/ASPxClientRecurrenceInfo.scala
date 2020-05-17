package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withGetDayNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDayNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnd(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMonth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOccurrenceCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetOccurrenceCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPeriodicity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPeriodicity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRange(value: () => ASPxClientRecurrenceRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRecurrenceType(value: () => ASPxClientRecurrenceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRecurrenceType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStart(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeekDays(value: () => ASPxClientWeekDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWeekDays")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeekOfMonth(value: () => ASPxClientWeekOfMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetWeekOfMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDayNumber(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDayNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDuration(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnd(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMonth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOccurrenceCount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetOccurrenceCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPeriodicity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetPeriodicity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRange(value: ASPxClientRecurrenceRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRecurrenceType(value: ASPxClientRecurrenceType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetRecurrenceType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStart(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWeekDays(value: ASPxClientWeekDays => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWeekDays")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWeekOfMonth(value: ASPxClientWeekOfMonth => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetWeekOfMonth")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

