package typingsSlinky.gapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmpUrl extends js.Object {
  /** The AMP URL pointing to the publisher's web server. */
  var ampUrl: js.UndefOr[String] = js.native
  /**
    * The [AMP Cache URL](/amp/cache/overview#amp-cache-url-format) pointing to
    * the cached document in the Google AMP Cache.
    */
  var cdnAmpUrl: js.UndefOr[String] = js.native
  /** The original non-AMP URL. */
  var originalUrl: js.UndefOr[String] = js.native
}

object AmpUrl {
  @scala.inline
  def apply(): AmpUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpUrl]
  }
  @scala.inline
  implicit class AmpUrlOps[Self <: AmpUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmpUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCdnAmpUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdnAmpUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdnAmpUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdnAmpUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalUrl")(js.undefined)
        ret
    }
  }
  
}

