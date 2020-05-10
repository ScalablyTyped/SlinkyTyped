package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Directory Site Settings
  */
@js.native
trait SchemaDirectorySiteSettings extends js.Object {
  /**
    * Whether this directory site has disabled active view creatives.
    */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  /**
    * Directory site Ad Manager settings.
    */
  var dfpSettings: js.UndefOr[SchemaDfpSettings] = js.native
  /**
    * Whether this site accepts in-stream video ads.
    */
  var instreamVideoPlacementAccepted: js.UndefOr[Boolean] = js.native
  /**
    * Whether this site accepts interstitial ads.
    */
  var interstitialPlacementAccepted: js.UndefOr[Boolean] = js.native
}

object SchemaDirectorySiteSettings {
  @scala.inline
  def apply(): SchemaDirectorySiteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySiteSettings]
  }
  @scala.inline
  implicit class SchemaDirectorySiteSettingsOps[Self <: SchemaDirectorySiteSettings] (val x: Self) extends AnyVal {
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
    def withDfpSettings(value: SchemaDfpSettings): Self = {
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

