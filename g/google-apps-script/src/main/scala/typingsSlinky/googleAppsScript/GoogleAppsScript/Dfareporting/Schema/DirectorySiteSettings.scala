package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySiteSettings extends js.Object {
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  var dfpSettings: js.UndefOr[DfpSettings] = js.native
  var instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.native
  var interstitialPlacementAccepted: js.UndefOr[Boolean] = js.native
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
  }
  
}

