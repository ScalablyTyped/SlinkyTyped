package typingsSlinky.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIfMatch extends js.Object {
  var contentDisposition: js.UndefOr[String] = js.native
  var ifMatch: js.UndefOr[String] = js.native
  var xAdsRegion: js.UndefOr[String] = js.native
}

object AnonIfMatch {
  @scala.inline
  def apply(): AnonIfMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIfMatch]
  }
  @scala.inline
  implicit class AnonIfMatchOps[Self <: AnonIfMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDisposition")(js.undefined)
        ret
    }
    @scala.inline
    def withIfMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withXAdsRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAdsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAdsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAdsRegion")(js.undefined)
        ret
    }
  }
  
}

