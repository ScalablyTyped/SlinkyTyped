package typingsSlinky.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrl extends js.Object {
  /**
    * A summary of the click analytics for the short and long URL. Might not be
    * present if not requested or currently unavailable.
    */
  var analytics: js.UndefOr[SchemaAnalyticsSummary] = js.native
  /**
    * Time the short URL was created; ISO 8601 representation using the
    * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ format, e.g.
    * &quot;2010-10-14T19:01:24.944+00:00&quot;.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Short URL, e.g. &quot;http://goo.gl/l6MS&quot;.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The fixed string &quot;urlshortener#url&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Long URL, e.g. &quot;http://www.google.com/&quot;. Might not be present
    * if the status is &quot;REMOVED&quot;.
    */
  var longUrl: js.UndefOr[String] = js.native
  /**
    * Status of the target URL. Possible values: &quot;OK&quot;,
    * &quot;MALWARE&quot;, &quot;PHISHING&quot;, or &quot;REMOVED&quot;. A URL
    * might be marked &quot;REMOVED&quot; if it was flagged as spam, for
    * example.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaUrl {
  @scala.inline
  def apply(): SchemaUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrl]
  }
  @scala.inline
  implicit class SchemaUrlOps[Self <: SchemaUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalytics(value: SchemaAnalyticsSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLongUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

