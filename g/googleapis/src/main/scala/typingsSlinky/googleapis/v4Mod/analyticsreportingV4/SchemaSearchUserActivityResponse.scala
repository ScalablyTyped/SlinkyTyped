package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from `userActivity:get` call.
  */
@js.native
trait SchemaSearchUserActivityResponse extends js.Object {
  /**
    * This token should be passed to
    * [SearchUserActivityRequest](#SearchUserActivityRequest) to retrieve the
    * next page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * This field represents the [sampling
    * rate](https://support.google.com/analytics/answer/2637192) for the given
    * request and is a number between 0.0 to 1.0. See [developer
    * guide](/analytics/devguides/reporting/core/v4/basics#sampling) for
    * details.
    */
  var sampleRate: js.UndefOr[Double] = js.native
  /**
    * Each record represents a session (device details, duration, etc).
    */
  var sessions: js.UndefOr[js.Array[SchemaUserActivitySession]] = js.native
  /**
    * Total rows returned by this query (across different pages).
    */
  var totalRows: js.UndefOr[Double] = js.native
}

object SchemaSearchUserActivityResponse {
  @scala.inline
  def apply(): SchemaSearchUserActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchUserActivityResponse]
  }
  @scala.inline
  implicit class SchemaSearchUserActivityResponseOps[Self <: SchemaSearchUserActivityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSessions(value: js.Array[SchemaUserActivitySession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessions")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalRows")(js.undefined)
        ret
    }
  }
  
}

