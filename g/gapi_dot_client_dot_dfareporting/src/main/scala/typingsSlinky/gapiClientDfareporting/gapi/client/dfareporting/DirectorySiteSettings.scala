package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySiteSettings extends js.Object {
  /** Whether this directory site has disabled active view creatives. */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  /** Directory site DFP settings. */
  var dfpSettings: js.UndefOr[DfpSettings] = js.native
  /** Whether this site accepts in-stream video ads. */
  var instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.native
  /** Whether this site accepts interstitial ads. */
  var interstitialPlacementAccepted: js.UndefOr[Boolean] = js.native
  /** Whether this directory site has disabled Nielsen OCR reach ratings. */
  var nielsenOcrOptOut: js.UndefOr[Boolean] = js.native
  /** Whether this directory site has disabled generation of Verification ins tags. */
  var verificationTagOptOut: js.UndefOr[Boolean] = js.native
  /** Whether this directory site has disabled active view for in-stream video creatives. This is a read-only field. */
  var videoActiveViewOptOut: js.UndefOr[Boolean] = js.native
}

object DirectorySiteSettings {
  @scala.inline
  def apply(): DirectorySiteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySiteSettings]
  }
  @scala.inline
  implicit class DirectorySiteSettingsOps[Self <: DirectorySiteSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveViewOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeViewOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveViewOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeViewOptOut")(js.undefined)
        ret
    }
    @scala.inline
    def withDfpSettings(value: DfpSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfpSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDfpSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfpSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withInstreamVideoPlacementAccepted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instreamVideoPlacementAccepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstreamVideoPlacementAccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instreamVideoPlacementAccepted")(js.undefined)
        ret
    }
    @scala.inline
    def withInterstitialPlacementAccepted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interstitialPlacementAccepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterstitialPlacementAccepted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interstitialPlacementAccepted")(js.undefined)
        ret
    }
    @scala.inline
    def withNielsenOcrOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nielsenOcrOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNielsenOcrOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nielsenOcrOptOut")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationTagOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationTagOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationTagOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationTagOptOut")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoActiveViewOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoActiveViewOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoActiveViewOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoActiveViewOptOut")(js.undefined)
        ret
    }
  }
  
}

