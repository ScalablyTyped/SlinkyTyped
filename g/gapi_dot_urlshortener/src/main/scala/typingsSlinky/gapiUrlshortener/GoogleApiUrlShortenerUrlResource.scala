package typingsSlinky.gapiUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiUrlShortenerUrlResource extends js.Object {
  /**
    * A summary of the click analytics for the short and long URL. Might not be present if not requested or currently unavailable.
    */
  var analytics: AnonAllTime = js.native
  /**
    * Time the short URL was created; ISO 8601 representation using the yyyy-MM-dd'T'HH:mm:ss.SSSZZ format.
    */
  var created: String = js.native
  /**
    * Short URL
    */
  var id: String = js.native
  /**
    * The fixed string "urlshortener#url".
    */
  var kind: String = js.native
  /**
    * Long URL
    */
  var longUrl: String = js.native
  /**
    * Status of the target URL. Possible values: "OK", "MALWARE", "PHISHING", or "REMOVED".
    */
  var status: String = js.native
}

object GoogleApiUrlShortenerUrlResource {
  @scala.inline
  def apply(analytics: AnonAllTime, created: String, id: String, kind: String, longUrl: String, status: String): GoogleApiUrlShortenerUrlResource = {
    val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], longUrl = longUrl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResource]
  }
  @scala.inline
  implicit class GoogleApiUrlShortenerUrlResourceOps[Self <: GoogleApiUrlShortenerUrlResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalytics(value: AnonAllTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

