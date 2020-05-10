package typingsSlinky.gapiClientUrlshortener.gapi.client.urlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsSnapshot extends js.Object {
  /** Top browsers, e.g. "Chrome"; sorted by (descending) click counts. Only present if this data is available. */
  var browsers: js.UndefOr[js.Array[StringCount]] = js.native
  /** Top countries (expressed as country codes), e.g. "US" or "DE"; sorted by (descending) click counts. Only present if this data is available. */
  var countries: js.UndefOr[js.Array[StringCount]] = js.native
  /** Number of clicks on all goo.gl short URLs pointing to this long URL. */
  var longUrlClicks: js.UndefOr[String] = js.native
  /** Top platforms or OSes, e.g. "Windows"; sorted by (descending) click counts. Only present if this data is available. */
  var platforms: js.UndefOr[js.Array[StringCount]] = js.native
  /** Top referring hosts, e.g. "www.google.com"; sorted by (descending) click counts. Only present if this data is available. */
  var referrers: js.UndefOr[js.Array[StringCount]] = js.native
  /** Number of clicks on this short URL. */
  var shortUrlClicks: js.UndefOr[String] = js.native
}

object AnalyticsSnapshot {
  @scala.inline
  def apply(): AnalyticsSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsSnapshot]
  }
  @scala.inline
  implicit class AnalyticsSnapshotOps[Self <: AnalyticsSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowsers(value: js.Array[StringCount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(js.undefined)
        ret
    }
    @scala.inline
    def withCountries(value: js.Array[StringCount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(js.undefined)
        ret
    }
    @scala.inline
    def withLongUrlClicks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longUrlClicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongUrlClicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longUrlClicks")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatforms(value: js.Array[StringCount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrers(value: js.Array[StringCount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrers")(js.undefined)
        ret
    }
    @scala.inline
    def withShortUrlClicks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortUrlClicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortUrlClicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortUrlClicks")(js.undefined)
        ret
    }
  }
  
}

