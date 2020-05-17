package typingsSlinky.naverWhale.whale.privacy

import typingsSlinky.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Websites extends js.Object {
  /** @since Chrome 65. */
  var doNotTrackEnabled: ChromeSetting = js.native
  var hyperlinkAuditingEnabled: ChromeSetting = js.native
  /** @since Chrome 21. Available on Windows and ChromeOS only. */
  var protectedContentEnabled: ChromeSetting = js.native
  var referrersEnabled: ChromeSetting = js.native
  var thirdPartyCookiesAllowed: ChromeSetting = js.native
}

object Websites {
  @scala.inline
  def apply(
    doNotTrackEnabled: ChromeSetting,
    hyperlinkAuditingEnabled: ChromeSetting,
    protectedContentEnabled: ChromeSetting,
    referrersEnabled: ChromeSetting,
    thirdPartyCookiesAllowed: ChromeSetting
  ): Websites = {
    val __obj = js.Dynamic.literal(doNotTrackEnabled = doNotTrackEnabled.asInstanceOf[js.Any], hyperlinkAuditingEnabled = hyperlinkAuditingEnabled.asInstanceOf[js.Any], protectedContentEnabled = protectedContentEnabled.asInstanceOf[js.Any], referrersEnabled = referrersEnabled.asInstanceOf[js.Any], thirdPartyCookiesAllowed = thirdPartyCookiesAllowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Websites]
  }
  @scala.inline
  implicit class WebsitesOps[Self <: Websites] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoNotTrackEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doNotTrackEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperlinkAuditingEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkAuditingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectedContentEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedContentEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrersEnabled(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrersEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThirdPartyCookiesAllowed(value: ChromeSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyCookiesAllowed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

