package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeZoneRequest extends js.Object {
  /**
    * The language in which to return results.
    * Note that we often update supported languages so this list may not be exhaustive.
    *
    * @default Language.English
    */
  var language: js.UndefOr[Language] = js.native
  /** a comma-separated `lat,lng` tuple (eg. `location=-33.86,151.20`), representing the location to look up. */
  var location: LatLng = js.native
  /**
    * specifies the desired time as seconds since midnight, January 1, 1970 UTC.
    * The Time Zone API uses the timestamp to determine whether or not Daylight Savings should be applied,
    * based on the time zone of the location. Note that the API does not take historical time zones into account.
    * That is, if you specify a past timestamp, the API does not take into account the possibility that
    * the location was previously in a different time zone.
    */
  var timestamp: js.UndefOr[js.Date | Double] = js.native
}

object TimeZoneRequest {
  @scala.inline
  def apply(location: LatLng): TimeZoneRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneRequest]
  }
  @scala.inline
  implicit class TimeZoneRequestOps[Self <: TimeZoneRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

