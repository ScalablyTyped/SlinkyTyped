package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Timestamp. For documentation of this class, see java.sql.Timestamp
  * .
  */
@js.native
trait JdbcTimestamp extends js.Object {
  def after(when: JdbcTimestamp): Boolean = js.native
  def before(when: JdbcTimestamp): Boolean = js.native
  def getDate(): Integer = js.native
  def getHours(): Integer = js.native
  def getMinutes(): Integer = js.native
  def getMonth(): Integer = js.native
  def getNanos(): Integer = js.native
  def getSeconds(): Integer = js.native
  def getTime(): Integer = js.native
  def getYear(): Integer = js.native
  def setDate(date: Integer): Unit = js.native
  def setHours(hours: Integer): Unit = js.native
  def setMinutes(minutes: Integer): Unit = js.native
  def setMonth(month: Integer): Unit = js.native
  def setNanos(nanoseconds: Integer): Unit = js.native
  def setSeconds(seconds: Integer): Unit = js.native
  def setTime(milliseconds: Integer): Unit = js.native
  def setYear(year: Integer): Unit = js.native
}

object JdbcTimestamp {
  @scala.inline
  def apply(
    after: JdbcTimestamp => Boolean,
    before: JdbcTimestamp => Boolean,
    getDate: () => Integer,
    getHours: () => Integer,
    getMinutes: () => Integer,
    getMonth: () => Integer,
    getNanos: () => Integer,
    getSeconds: () => Integer,
    getTime: () => Integer,
    getYear: () => Integer,
    setDate: Integer => Unit,
    setHours: Integer => Unit,
    setMinutes: Integer => Unit,
    setMonth: Integer => Unit,
    setNanos: Integer => Unit,
    setSeconds: Integer => Unit,
    setTime: Integer => Unit,
    setYear: Integer => Unit
  ): JdbcTimestamp = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), getDate = js.Any.fromFunction0(getDate), getHours = js.Any.fromFunction0(getHours), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getNanos = js.Any.fromFunction0(getNanos), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getYear = js.Any.fromFunction0(getYear), setDate = js.Any.fromFunction1(setDate), setHours = js.Any.fromFunction1(setHours), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setNanos = js.Any.fromFunction1(setNanos), setSeconds = js.Any.fromFunction1(setSeconds), setTime = js.Any.fromFunction1(setTime), setYear = js.Any.fromFunction1(setYear))
    __obj.asInstanceOf[JdbcTimestamp]
  }
  @scala.inline
  implicit class JdbcTimestampOps[Self <: JdbcTimestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: JdbcTimestamp => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBefore(value: JdbcTimestamp => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDate(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHours(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHours")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinutes(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinutes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMonth(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNanos(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNanos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSeconds(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSeconds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTime(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetYear(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDate(value: Integer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHours(value: Integer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHours")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinutes(value: Integer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinutes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMonth(value: Integer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNanos(value: Integer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNanos")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSeconds(value: Integer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSeconds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTime(value: Integer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetYear(value: Integer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYear")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

