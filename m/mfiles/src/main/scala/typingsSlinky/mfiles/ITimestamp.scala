package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimestamp extends js.Object {
  var Day: Double = js.native
  var Fraction: Double = js.native
  var Hour: Double = js.native
  var Minute: Double = js.native
  var Month: Double = js.native
  var Second: Double = js.native
  var Year: Double = js.native
  def Clone(): ITimestamp = js.native
  def GetValue(): js.Any = js.native
  def LocalTimeToUtc(): ITimestamp = js.native
  def SetValue(Value: js.Any): Unit = js.native
  def UtcToLocalTime(): ITimestamp = js.native
}

object ITimestamp {
  @scala.inline
  def apply(
    Clone: () => ITimestamp,
    Day: Double,
    Fraction: Double,
    GetValue: () => js.Any,
    Hour: Double,
    LocalTimeToUtc: () => ITimestamp,
    Minute: Double,
    Month: Double,
    Second: Double,
    SetValue: js.Any => Unit,
    UtcToLocalTime: () => ITimestamp,
    Year: Double
  ): ITimestamp = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Day = Day.asInstanceOf[js.Any], Fraction = Fraction.asInstanceOf[js.Any], GetValue = js.Any.fromFunction0(GetValue), Hour = Hour.asInstanceOf[js.Any], LocalTimeToUtc = js.Any.fromFunction0(LocalTimeToUtc), Minute = Minute.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any], SetValue = js.Any.fromFunction1(SetValue), UtcToLocalTime = js.Any.fromFunction0(UtcToLocalTime), Year = Year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimestamp]
  }
  @scala.inline
  implicit class ITimestampOps[Self <: ITimestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalTimeToUtc(value: () => ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalTimeToUtc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUtcToLocalTime(value: () => ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UtcToLocalTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Year")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

