package typingsSlinky.momentDurationFormat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDATE extends js.Object {
  var DATE: String = js.native
  var DATETIME_LOCAL: String = js.native
  var DATETIME_LOCAL_MS: String = js.native
  var DATETIME_LOCAL_SECONDS: String = js.native
  var MONTH: String = js.native
  var TIME: String = js.native
  var TIME_MS: String = js.native
  var TIME_SECONDS: String = js.native
  var WEEK: String = js.native
}

object AnonDATE {
  @scala.inline
  def apply(
    DATE: String,
    DATETIME_LOCAL: String,
    DATETIME_LOCAL_MS: String,
    DATETIME_LOCAL_SECONDS: String,
    MONTH: String,
    TIME: String,
    TIME_MS: String,
    TIME_SECONDS: String,
    WEEK: String
  ): AnonDATE = {
    val __obj = js.Dynamic.literal(DATE = DATE.asInstanceOf[js.Any], DATETIME_LOCAL = DATETIME_LOCAL.asInstanceOf[js.Any], DATETIME_LOCAL_MS = DATETIME_LOCAL_MS.asInstanceOf[js.Any], DATETIME_LOCAL_SECONDS = DATETIME_LOCAL_SECONDS.asInstanceOf[js.Any], MONTH = MONTH.asInstanceOf[js.Any], TIME = TIME.asInstanceOf[js.Any], TIME_MS = TIME_MS.asInstanceOf[js.Any], TIME_SECONDS = TIME_SECONDS.asInstanceOf[js.Any], WEEK = WEEK.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDATE]
  }
  @scala.inline
  implicit class AnonDATEOps[Self <: AnonDATE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDATE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDATETIME_LOCAL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDATETIME_LOCAL_MS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_MS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDATETIME_LOCAL_SECONDS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATETIME_LOCAL_SECONDS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMONTH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIME_MS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIME_MS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIME_SECONDS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIME_SECONDS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWEEK(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WEEK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

