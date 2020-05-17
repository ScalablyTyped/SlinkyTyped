package typingsSlinky.gapiClientAdsensehost.gapi.client.adsensehost

import typingsSlinky.gapiClientAdsensehost.anon.Background
import typingsSlinky.gapiClientAdsensehost.anon.Family
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdStyle extends js.Object {
  /** The colors included in the style. These are represented as six hexadecimal characters, similar to HTML color codes, but without the leading hash. */
  var colors: js.UndefOr[Background] = js.native
  /** The style of the corners in the ad (deprecated: never populated, ignored). */
  var corners: js.UndefOr[String] = js.native
  /** The font which is included in the style. */
  var font: js.UndefOr[Family] = js.native
  /** Kind this is, in this case adsensehost#adStyle. */
  var kind: js.UndefOr[String] = js.native
}

object AdStyle {
  @scala.inline
  def apply(): AdStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdStyle]
  }
  @scala.inline
  implicit class AdStyleOps[Self <: AdStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: Background): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCorners(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corners")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: Family): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
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
  }
  
}

