package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapSchedulerRecurrenceInfo extends js.Object {
  val instance: js.Any = js.native
  def getDayNumber(): Double = js.native
  def getDuration(): Double = js.native
  def getEnd(): js.Date = js.native
  def getMonth(): Double = js.native
  def getOccurrenceCount(): Double = js.native
  def getPeriodicity(): Double = js.native
  def getRange(): BootstrapSchedulerRecurrenceRange = js.native
  def getRecurrenceType(): BootstrapSchedulerRecurrenceType = js.native
  def getStart(): js.Date = js.native
  def getWeekDays(): WeekDays = js.native
  def getWeekOfMonth(): WeekOfMonth = js.native
  def setDayNumber(dayNumber: Double): Unit = js.native
  def setDuration(duration: Double): Unit = js.native
  def setEnd(end: js.Date): Unit = js.native
  def setMonth(month: Double): Unit = js.native
  def setOccurrenceCount(occurrenceCount: Double): Unit = js.native
  def setPeriodicity(periodicity: Double): Unit = js.native
  def setRange(range: BootstrapSchedulerRecurrenceRange): Unit = js.native
  def setRecurrenceType(`type`: BootstrapSchedulerRecurrenceType): Unit = js.native
  def setStart(start: js.Date): Unit = js.native
  def setWeekDays(weekDays: WeekDays): Unit = js.native
  def setWeekOfMonth(weekOfMonth: WeekOfMonth): Unit = js.native
}

object BootstrapSchedulerRecurrenceInfo {
  @scala.inline
  def apply(
    getDayNumber: () => Double,
    getDuration: () => Double,
    getEnd: () => js.Date,
    getMonth: () => Double,
    getOccurrenceCount: () => Double,
    getPeriodicity: () => Double,
    getRange: () => BootstrapSchedulerRecurrenceRange,
    getRecurrenceType: () => BootstrapSchedulerRecurrenceType,
    getStart: () => js.Date,
    getWeekDays: () => WeekDays,
    getWeekOfMonth: () => WeekOfMonth,
    instance: js.Any,
    setDayNumber: Double => Unit,
    setDuration: Double => Unit,
    setEnd: js.Date => Unit,
    setMonth: Double => Unit,
    setOccurrenceCount: Double => Unit,
    setPeriodicity: Double => Unit,
    setRange: BootstrapSchedulerRecurrenceRange => Unit,
    setRecurrenceType: BootstrapSchedulerRecurrenceType => Unit,
    setStart: js.Date => Unit,
    setWeekDays: WeekDays => Unit,
    setWeekOfMonth: WeekOfMonth => Unit
  ): BootstrapSchedulerRecurrenceInfo = {
    val __obj = js.Dynamic.literal(getDayNumber = js.Any.fromFunction0(getDayNumber), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getMonth = js.Any.fromFunction0(getMonth), getOccurrenceCount = js.Any.fromFunction0(getOccurrenceCount), getPeriodicity = js.Any.fromFunction0(getPeriodicity), getRange = js.Any.fromFunction0(getRange), getRecurrenceType = js.Any.fromFunction0(getRecurrenceType), getStart = js.Any.fromFunction0(getStart), getWeekDays = js.Any.fromFunction0(getWeekDays), getWeekOfMonth = js.Any.fromFunction0(getWeekOfMonth), instance = instance.asInstanceOf[js.Any], setDayNumber = js.Any.fromFunction1(setDayNumber), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setMonth = js.Any.fromFunction1(setMonth), setOccurrenceCount = js.Any.fromFunction1(setOccurrenceCount), setPeriodicity = js.Any.fromFunction1(setPeriodicity), setRange = js.Any.fromFunction1(setRange), setRecurrenceType = js.Any.fromFunction1(setRecurrenceType), setStart = js.Any.fromFunction1(setStart), setWeekDays = js.Any.fromFunction1(setWeekDays), setWeekOfMonth = js.Any.fromFunction1(setWeekOfMonth))
    __obj.asInstanceOf[BootstrapSchedulerRecurrenceInfo]
  }
  @scala.inline
  implicit class BootstrapSchedulerRecurrenceInfoOps[Self <: BootstrapSchedulerRecurrenceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDayNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDayNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnd(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMonth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOccurrenceCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOccurrenceCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPeriodicity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPeriodicity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRange(value: () => BootstrapSchedulerRecurrenceRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRecurrenceType(value: () => BootstrapSchedulerRecurrenceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecurrenceType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStart(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeekDays(value: () => WeekDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeekDays")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWeekOfMonth(value: () => WeekOfMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeekOfMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDayNumber(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDayNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDuration(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnd(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMonth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOccurrenceCount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOccurrenceCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPeriodicity(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPeriodicity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRange(value: BootstrapSchedulerRecurrenceRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRecurrenceType(value: BootstrapSchedulerRecurrenceType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecurrenceType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStart(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWeekDays(value: WeekDays => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWeekDays")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWeekOfMonth(value: WeekOfMonth => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWeekOfMonth")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

