package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZoneResponse extends js.Object {
  /**
    * the offset for daylight-savings time in seconds.
    * This will be zero if the time zone is not in Daylight Savings Time during the specified `timestamp`.
    */
  var dstOffset: Double = js.native
  /** more detailed information about the reasons behind the given status code, if other than `OK`. */
  var errorMessage: String = js.native
  /** the offset from UTC (in seconds) for the given location. This does not take into effect daylight savings. */
  var rawOffset: Double = js.native
  /** a string indicating the status of the response. */
  var status: TimeZoneResponseStatus = js.native
  /**
    * a string containing the ID of the time zone, such as "America/Los_Angeles" or "Australia/Sydney".
    * These IDs are defined by [Unicode Common Locale Data Repository (CLDR) project](http://cldr.unicode.org/),
    * and currently available in file [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml).
    * When a timezone has several IDs, the canonical one is returned. In timezone.xml, this is the first alias of each timezone.
    * For example, "Asia/Calcutta" is returned, not "Asia/Kolkata".
    */
  var timeZoneId: String = js.native
  /**
    * a string containing the long form name of the time zone.
    * This field will be localized if the `language` parameter is set.
    * eg. "Pacific Daylight Time" or "Australian Eastern Daylight Time"
    */
  var timeZoneName: String = js.native
}

object TimeZoneResponse {
  @scala.inline
  def apply(
    dstOffset: Double,
    errorMessage: String,
    rawOffset: Double,
    status: TimeZoneResponseStatus,
    timeZoneId: String,
    timeZoneName: String
  ): TimeZoneResponse = {
    val __obj = js.Dynamic.literal(dstOffset = dstOffset.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], rawOffset = rawOffset.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeZoneId = timeZoneId.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneResponse]
  }
  @scala.inline
  implicit class TimeZoneResponseOps[Self <: TimeZoneResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDstOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: TimeZoneResponseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeZoneName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

