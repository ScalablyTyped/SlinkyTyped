package typingsSlinky.rcPicker.generateMod

import typingsSlinky.rcPicker.anon.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateConfig[DateType] extends js.Object {
  var locale: Format[DateType] = js.native
  def addDate(value: DateType, diff: Double): DateType = js.native
  def addMonth(value: DateType, diff: Double): DateType = js.native
  def addYear(value: DateType, diff: Double): DateType = js.native
  def getDate(value: DateType): Double = js.native
  def getHour(value: DateType): Double = js.native
  def getMinute(value: DateType): Double = js.native
  def getMonth(value: DateType): Double = js.native
  def getNow(): DateType = js.native
  def getSecond(value: DateType): Double = js.native
  def getWeekDay(value: DateType): Double = js.native
  def getYear(value: DateType): Double = js.native
  def isAfter(date1: DateType, date2: DateType): Boolean = js.native
  def isValidate(date: DateType): Boolean = js.native
  def setDate(value: DateType, date: Double): DateType = js.native
  def setHour(value: DateType, hour: Double): DateType = js.native
  def setMinute(value: DateType, minute: Double): DateType = js.native
  def setMonth(value: DateType, month: Double): DateType = js.native
  def setSecond(value: DateType, second: Double): DateType = js.native
  def setYear(value: DateType, year: Double): DateType = js.native
}

object GenerateConfig {
  @scala.inline
  def apply[DateType](
    addDate: (DateType, Double) => DateType,
    addMonth: (DateType, Double) => DateType,
    addYear: (DateType, Double) => DateType,
    getDate: DateType => Double,
    getHour: DateType => Double,
    getMinute: DateType => Double,
    getMonth: DateType => Double,
    getNow: () => DateType,
    getSecond: DateType => Double,
    getWeekDay: DateType => Double,
    getYear: DateType => Double,
    isAfter: (DateType, DateType) => Boolean,
    isValidate: DateType => Boolean,
    locale: Format[DateType],
    setDate: (DateType, Double) => DateType,
    setHour: (DateType, Double) => DateType,
    setMinute: (DateType, Double) => DateType,
    setMonth: (DateType, Double) => DateType,
    setSecond: (DateType, Double) => DateType,
    setYear: (DateType, Double) => DateType
  ): GenerateConfig[DateType] = {
    val __obj = js.Dynamic.literal(addDate = js.Any.fromFunction2(addDate), addMonth = js.Any.fromFunction2(addMonth), addYear = js.Any.fromFunction2(addYear), getDate = js.Any.fromFunction1(getDate), getHour = js.Any.fromFunction1(getHour), getMinute = js.Any.fromFunction1(getMinute), getMonth = js.Any.fromFunction1(getMonth), getNow = js.Any.fromFunction0(getNow), getSecond = js.Any.fromFunction1(getSecond), getWeekDay = js.Any.fromFunction1(getWeekDay), getYear = js.Any.fromFunction1(getYear), isAfter = js.Any.fromFunction2(isAfter), isValidate = js.Any.fromFunction1(isValidate), locale = locale.asInstanceOf[js.Any], setDate = js.Any.fromFunction2(setDate), setHour = js.Any.fromFunction2(setHour), setMinute = js.Any.fromFunction2(setMinute), setMonth = js.Any.fromFunction2(setMonth), setSecond = js.Any.fromFunction2(setSecond), setYear = js.Any.fromFunction2(setYear))
    __obj.asInstanceOf[GenerateConfig[DateType]]
  }
  @scala.inline
  implicit class GenerateConfigOps[Self[datetype] <: GenerateConfig[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withAddDate(value: (DateType, Double) => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddMonth(value: (DateType, Double) => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMonth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddYear(value: (DateType, Double) => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addYear")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDate(value: DateType => Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHour(value: DateType => Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHour")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMinute(value: DateType => Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMonth(value: DateType => Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNow(value: () => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSecond(value: DateType => Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSecond")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWeekDay(value: DateType => Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeekDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetYear(value: DateType => Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsAfter(value: (DateType, DateType) => Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAfter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsValidate(value: DateType => Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocale(value: Format[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDate(value: (DateType, Double) => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetHour(value: (DateType, Double) => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHour")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMinute(value: (DateType, Double) => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetMonth(value: (DateType, Double) => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMonth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSecond(value: (DateType, Double) => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSecond")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetYear(value: (DateType, Double) => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYear")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

