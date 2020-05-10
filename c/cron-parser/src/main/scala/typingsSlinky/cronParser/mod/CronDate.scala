package typingsSlinky.cronParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CronDate extends js.Object {
  def addDay(): Unit = js.native
  def addHour(): Unit = js.native
  def addMinute(): Unit = js.native
  def addMonth(): Unit = js.native
  def addSecond(): Unit = js.native
  def addYear(): Unit = js.native
  def getDate(): Double = js.native
  def getDay(): Double = js.native
  def getFullYear(): Double = js.native
  def getHours(): Double = js.native
  def getMilliseconds(): Double = js.native
  def getMinutes(): Double = js.native
  def getMonth(): Double = js.native
  def getSeconds(): Double = js.native
  def getTime(): Double = js.native
  def getUTCDate(): Double = js.native
  def getUTCDay(): Double = js.native
  def getUTCFullYear(): Double = js.native
  def getUTCHours(): Double = js.native
  def getUTCMinutes(): Double = js.native
  def getUTCMonth(): Double = js.native
  def getUTCSeconds(): Double = js.native
  def setDate(d: Double): Unit = js.native
  def setDay(d: Double): Unit = js.native
  def setFullYear(y: Double): Unit = js.native
  def setHours(h: Double): Unit = js.native
  def setMilliseconds(s: Double): Unit = js.native
  def setMinutes(m: Double): Unit = js.native
  def setMonth(m: Double): Unit = js.native
  def setSeconds(s: Double): Unit = js.native
  def subtractDay(): Unit = js.native
  def subtractHour(): Unit = js.native
  def subtractMinute(): Unit = js.native
  def subtractMonth(): Unit = js.native
  def subtractSecond(): Unit = js.native
  def subtractYear(): Unit = js.native
  def toDate(): js.Date = js.native
  def toISOString(): String = js.native
  def toJSON(): String = js.native
}

object CronDate {
  @scala.inline
  def apply(
    addDay: () => Unit,
    addHour: () => Unit,
    addMinute: () => Unit,
    addMonth: () => Unit,
    addSecond: () => Unit,
    addYear: () => Unit,
    getDate: () => Double,
    getDay: () => Double,
    getFullYear: () => Double,
    getHours: () => Double,
    getMilliseconds: () => Double,
    getMinutes: () => Double,
    getMonth: () => Double,
    getSeconds: () => Double,
    getTime: () => Double,
    getUTCDate: () => Double,
    getUTCDay: () => Double,
    getUTCFullYear: () => Double,
    getUTCHours: () => Double,
    getUTCMinutes: () => Double,
    getUTCMonth: () => Double,
    getUTCSeconds: () => Double,
    setDate: Double => Unit,
    setDay: Double => Unit,
    setFullYear: Double => Unit,
    setHours: Double => Unit,
    setMilliseconds: Double => Unit,
    setMinutes: Double => Unit,
    setMonth: Double => Unit,
    setSeconds: Double => Unit,
    subtractDay: () => Unit,
    subtractHour: () => Unit,
    subtractMinute: () => Unit,
    subtractMonth: () => Unit,
    subtractSecond: () => Unit,
    subtractYear: () => Unit,
    toDate: () => js.Date,
    toISOString: () => String,
    toJSON: () => String
  ): CronDate = {
    val __obj = js.Dynamic.literal(addDay = js.Any.fromFunction0(addDay), addHour = js.Any.fromFunction0(addHour), addMinute = js.Any.fromFunction0(addMinute), addMonth = js.Any.fromFunction0(addMonth), addSecond = js.Any.fromFunction0(addSecond), addYear = js.Any.fromFunction0(addYear), getDate = js.Any.fromFunction0(getDate), getDay = js.Any.fromFunction0(getDay), getFullYear = js.Any.fromFunction0(getFullYear), getHours = js.Any.fromFunction0(getHours), getMilliseconds = js.Any.fromFunction0(getMilliseconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getUTCDate = js.Any.fromFunction0(getUTCDate), getUTCDay = js.Any.fromFunction0(getUTCDay), getUTCFullYear = js.Any.fromFunction0(getUTCFullYear), getUTCHours = js.Any.fromFunction0(getUTCHours), getUTCMinutes = js.Any.fromFunction0(getUTCMinutes), getUTCMonth = js.Any.fromFunction0(getUTCMonth), getUTCSeconds = js.Any.fromFunction0(getUTCSeconds), setDate = js.Any.fromFunction1(setDate), setDay = js.Any.fromFunction1(setDay), setFullYear = js.Any.fromFunction1(setFullYear), setHours = js.Any.fromFunction1(setHours), setMilliseconds = js.Any.fromFunction1(setMilliseconds), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setSeconds = js.Any.fromFunction1(setSeconds), subtractDay = js.Any.fromFunction0(subtractDay), subtractHour = js.Any.fromFunction0(subtractHour), subtractMinute = js.Any.fromFunction0(subtractMinute), subtractMonth = js.Any.fromFunction0(subtractMonth), subtractSecond = js.Any.fromFunction0(subtractSecond), subtractYear = js.Any.fromFunction0(subtractYear), toDate = js.Any.fromFunction0(toDate), toISOString = js.Any.fromFunction0(toISOString), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[CronDate]
  }
  @scala.inline
  implicit class CronDateOps[Self <: CronDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddHour(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHour")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddMinute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMinute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddMonth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddSecond(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSecond")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddYear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDate(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDay(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFullYear(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFullYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHours(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHours")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMilliseconds(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMilliseconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinutes(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinutes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMonth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSeconds(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSeconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUTCDate(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUTCDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUTCDay(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUTCDay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUTCFullYear(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUTCFullYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUTCHours(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUTCHours")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUTCMinutes(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUTCMinutes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUTCMonth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUTCMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUTCSeconds(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUTCSeconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDay(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFullYear(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFullYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHours(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHours")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMilliseconds(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMilliseconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinutes(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMonth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSeconds(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSeconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubtractDay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtractDay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubtractHour(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtractHour")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubtractMinute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtractMinute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubtractMonth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtractMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubtractSecond(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtractSecond")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubtractYear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtractYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToDate(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToISOString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toISOString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

