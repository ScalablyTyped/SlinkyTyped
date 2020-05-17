package typingsSlinky.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfMatch extends js.Object {
  var contentDisposition: js.UndefOr[String] = js.native
  var ifMatch: js.UndefOr[String] = js.native
  var xAdsRegion: js.UndefOr[String] = js.native
}

object IfMatch {
  @scala.inline
  def apply(): IfMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfMatch]
  }
  @scala.inline
  implicit class IfMatchOps[Self <: IfMatch] (val x: Self) extends AnyVal {
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

