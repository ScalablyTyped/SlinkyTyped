package typingsSlinky.powerappsComponentFramework.ComponentFramework.UserSettingApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The interface for the Calendar exposed in DateFormattingInfo
		 */
@js.native
trait Calendar extends js.Object {
  /**
  			 * @example 1
  			 */
  var algorithmType: Double = js.native
  /**
  			 * @example 1
  			 */
  var calendarType: Double = js.native
  /**
  			 * @example "/Date(253402300799999)/"
  			 */
  var maxSupportedDateTime: js.Date = js.native
  /**
  			 * @example "/Date(-62135568000000)/"
  			 */
  var minSupportedDateTime: js.Date = js.native
  /**
  			 * @example  2029
  			 */
  var twoDigitYearMax: Double = js.native
}

object Calendar {
  @scala.inline
  def apply(
    algorithmType: Double,
    calendarType: Double,
    maxSupportedDateTime: js.Date,
    minSupportedDateTime: js.Date,
    twoDigitYearMax: Double
  ): Calendar = {
    val __obj = js.Dynamic.literal(algorithmType = algorithmType.asInstanceOf[js.Any], calendarType = calendarType.asInstanceOf[js.Any], maxSupportedDateTime = maxSupportedDateTime.asInstanceOf[js.Any], minSupportedDateTime = minSupportedDateTime.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  @scala.inline
  implicit class CalendarOps[Self <: Calendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSupportedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSupportedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSupportedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSupportedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoDigitYearMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoDigitYearMax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

