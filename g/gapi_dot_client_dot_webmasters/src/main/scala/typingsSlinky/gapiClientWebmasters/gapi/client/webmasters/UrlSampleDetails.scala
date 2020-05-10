package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlSampleDetails extends js.Object {
  /** List of sitemaps pointing at this URL. */
  var containingSitemaps: js.UndefOr[js.Array[String]] = js.native
  /** A sample set of URLs linking to this URL. */
  var linkedFromUrls: js.UndefOr[js.Array[String]] = js.native
}

object UrlSampleDetails {
  @scala.inline
  def apply(): UrlSampleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlSampleDetails]
  }
  @scala.inline
  implicit class UrlSampleDetailsOps[Self <: UrlSampleDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainingSitemaps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containingSitemaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainingSitemaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containingSitemaps")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedFromUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedFromUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedFromUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedFromUrls")(js.undefined)
        ret
    }
  }
  
}

