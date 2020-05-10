package typingsSlinky.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAnalyticsSnapshot extends js.Object {
  /**
    * Top browsers, e.g. &quot;Chrome&quot;; sorted by (descending) click
    * counts. Only present if this data is available.
    */
  var browsers: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  /**
    * Top countries (expressed as country codes), e.g. &quot;US&quot; or
    * &quot;DE&quot;; sorted by (descending) click counts. Only present if this
    * data is available.
    */
  var countries: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  /**
    * Number of clicks on all goo.gl short URLs pointing to this long URL.
    */
  var longUrlClicks: js.UndefOr[String] = js.native
  /**
    * Top platforms or OSes, e.g. &quot;Windows&quot;; sorted by (descending)
    * click counts. Only present if this data is available.
    */
  var platforms: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  /**
    * Top referring hosts, e.g. &quot;www.google.com&quot;; sorted by
    * (descending) click counts. Only present if this data is available.
    */
  var referrers: js.UndefOr[js.Array[SchemaStringCount]] = js.native
  /**
    * Number of clicks on this short URL.
    */
  var shortUrlClicks: js.UndefOr[String] = js.native
}

object SchemaAnalyticsSnapshot {
  @scala.inline
  def apply(): SchemaAnalyticsSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsSnapshot]
  }
  @scala.inline
  implicit class SchemaAnalyticsSnapshotOps[Self <: SchemaAnalyticsSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowsers(value: js.Array[SchemaStringCount]): Self = {
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
    def withCountries(value: js.Array[SchemaStringCount]): Self = {
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
    def withPlatforms(value: js.Array[SchemaStringCount]): Self = {
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
    def withReferrers(value: js.Array[SchemaStringCount]): Self = {
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

