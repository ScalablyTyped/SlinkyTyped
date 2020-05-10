package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocaleDateTimeFormatDescriptor extends js.Object {
  var AMPMS: js.Array[String] = js.native
  var DAY: js.Array[String] = js.native
  var MONTH: js.Array[String] = js.native
  var SHORTDAY: js.Array[String] = js.native
  var SHORTMONTH: js.Array[String] = js.native
  var fullDate: String = js.native
  var longDate: String = js.native
  var medium: String = js.native
  var mediumDate: String = js.native
  var mediumTime: String = js.native
  var short: String = js.native
  var shortDate: String = js.native
  var shortTime: String = js.native
}

object ILocaleDateTimeFormatDescriptor {
  @scala.inline
  def apply(
    AMPMS: js.Array[String],
    DAY: js.Array[String],
    MONTH: js.Array[String],
    SHORTDAY: js.Array[String],
    SHORTMONTH: js.Array[String],
    fullDate: String,
    longDate: String,
    medium: String,
    mediumDate: String,
    mediumTime: String,
    short: String,
    shortDate: String,
    shortTime: String
  ): ILocaleDateTimeFormatDescriptor = {
    val __obj = js.Dynamic.literal(AMPMS = AMPMS.asInstanceOf[js.Any], DAY = DAY.asInstanceOf[js.Any], MONTH = MONTH.asInstanceOf[js.Any], SHORTDAY = SHORTDAY.asInstanceOf[js.Any], SHORTMONTH = SHORTMONTH.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumDate = mediumDate.asInstanceOf[js.Any], mediumTime = mediumTime.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocaleDateTimeFormatDescriptor]
  }
  @scala.inline
  implicit class ILocaleDateTimeFormatDescriptorOps[Self <: ILocaleDateTimeFormatDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAMPMS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AMPMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDAY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMONTH(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHORTDAY(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHORTDAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSHORTMONTH(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SHORTMONTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediumDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediumTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediumTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

