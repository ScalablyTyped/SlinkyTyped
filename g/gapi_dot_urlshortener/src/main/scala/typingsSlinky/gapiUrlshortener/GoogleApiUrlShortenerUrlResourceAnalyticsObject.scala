package typingsSlinky.gapiUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiUrlShortenerUrlResourceAnalyticsObject extends js.Object {
  /**
    * Top browsers, e.g. "Chrome"; sorted by (descending) click counts. Only present if this data is available.
    */
  var browsers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject] = js.native
  /**
    * Top countries (expressed as country codes), e.g. "US" or "DE"; sorted by (descending) click counts. Only present if this data is available.
    */
  var countries: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject] = js.native
  /**
    * Number of clicks on all goo.gl short URLs pointing to this long URL.
    */
  var longUrlClicks: String = js.native
  /**
    * Top platforms or OSes, e.g. "Windows"; sorted by (descending) click counts. Only present if this data is available.
    */
  var platforms: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject] = js.native
  /**
    * Top referring hosts, e.g. "www.google.com"; sorted by (descending) click counts. Only present if this data is available.
    */
  var referrers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject] = js.native
  /**
    * Number of clicks on this short URL.
    */
  var shortUrlClicks: String = js.native
}

object GoogleApiUrlShortenerUrlResourceAnalyticsObject {
  @scala.inline
  def apply(
    browsers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    countries: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    longUrlClicks: String,
    platforms: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    referrers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    shortUrlClicks: String
  ): GoogleApiUrlShortenerUrlResourceAnalyticsObject = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], countries = countries.asInstanceOf[js.Any], longUrlClicks = longUrlClicks.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], referrers = referrers.asInstanceOf[js.Any], shortUrlClicks = shortUrlClicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResourceAnalyticsObject]
  }
  @scala.inline
  implicit class GoogleApiUrlShortenerUrlResourceAnalyticsObjectOps[Self <: GoogleApiUrlShortenerUrlResourceAnalyticsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowsers(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountries(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongUrlClicks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longUrlClicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatforms(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrers(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortUrlClicks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortUrlClicks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

