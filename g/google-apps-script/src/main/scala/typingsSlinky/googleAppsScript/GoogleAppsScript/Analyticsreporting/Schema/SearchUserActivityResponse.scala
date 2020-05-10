package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchUserActivityResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var sampleRate: js.UndefOr[Double] = js.native
  var sessions: js.UndefOr[js.Array[UserActivitySession]] = js.native
  var totalRows: js.UndefOr[Double] = js.native
}

object SearchUserActivityResponse {
  @scala.inline
  def apply(): SearchUserActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUserActivityResponse]
  }
  @scala.inline
  implicit class SearchUserActivityResponseOps[Self <: SearchUserActivityResponse] (val x: Self) extends AnyVal {
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
    def withSessions(value: js.Array[UserActivitySession]): Self = {
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

