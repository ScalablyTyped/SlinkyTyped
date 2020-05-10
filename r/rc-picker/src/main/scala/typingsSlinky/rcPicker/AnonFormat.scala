package typingsSlinky.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormat[DateType] extends js.Object {
  /** A proxy for getting locale with moment or other locale library */
  var getShortMonths: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.native
  /** A proxy for getting locale with moment or other locale library */
  var getShortWeekDays: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.native
  def format(locale: String, date: DateType, format: String): String = js.native
  def getWeek(locale: String, value: DateType): Double = js.native
  def getWeekFirstDay(locale: String): Double = js.native
  /** Should only return validate date instance */
  def parse(locale: String, text: String, formats: js.Array[String]): DateType | Null = js.native
}

object AnonFormat {
  @scala.inline
  def apply[DateType](
    format: (String, DateType, String) => String,
    getWeek: (String, DateType) => Double,
    getWeekFirstDay: String => Double,
    parse: (String, String, js.Array[String]) => DateType | Null
  ): AnonFormat[DateType] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), getWeek = js.Any.fromFunction2(getWeek), getWeekFirstDay = js.Any.fromFunction1(getWeekFirstDay), parse = js.Any.fromFunction3(parse))
    __obj.asInstanceOf[AnonFormat[DateType]]
  }
  @scala.inline
  implicit class AnonFormatOps[Self[datetype] <: AnonFormat[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withFormat(value: (String, DateType, String) => String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetWeek(value: (String, DateType) => Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeek")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetWeekFirstDay(value: String => Double): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWeekFirstDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParse(value: (String, String, js.Array[String]) => DateType | Null): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetShortMonths(value: /* locale */ String => js.Array[String]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShortMonths")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetShortMonths: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShortMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withGetShortWeekDays(value: /* locale */ String => js.Array[String]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShortWeekDays")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetShortWeekDays: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShortWeekDays")(js.undefined)
        ret
    }
  }
  
}

