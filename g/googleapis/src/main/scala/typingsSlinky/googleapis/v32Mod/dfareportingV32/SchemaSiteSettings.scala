package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Site Settings
  */
@js.native
trait SchemaSiteSettings extends js.Object {
  /**
    * Whether active view creatives are disabled for this site.
    */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  /**
    * Whether this site opts out of ad blocking. When true, ad blocking is
    * disabled for all placements under the site, regardless of the individual
    * placement settings. When false, the campaign and placement settings take
    * effect.
    */
  var adBlockingOptOut: js.UndefOr[Boolean] = js.native
  /**
    * Site-wide creative settings.
    */
  var creativeSettings: js.UndefOr[SchemaCreativeSettings] = js.native
  /**
    * Whether new cookies are disabled for this site.
    */
  var disableNewCookie: js.UndefOr[Boolean] = js.native
  /**
    * Lookback window settings for this site.
    */
  var lookbackConfiguration: js.UndefOr[SchemaLookbackConfiguration] = js.native
  /**
    * Configuration settings for dynamic and image floodlight tags.
    */
  var tagSetting: js.UndefOr[SchemaTagSetting] = js.native
  /**
    * Whether Verification and ActiveView for in-stream video creatives are
    * disabled by default for new placements created under this site. This
    * value will be used to populate the placement.videoActiveViewOptOut field,
    * when no value is specified for the new placement.
    */
  var videoActiveViewOptOutTemplate: js.UndefOr[Boolean] = js.native
  /**
    * Default VPAID adapter setting for new placements created under this site.
    * This value will be used to populate the placements.vpaidAdapterChoice
    * field, when no value is specified for the new placement. Controls which
    * VPAID format the measurement adapter will use for in-stream video
    * creatives assigned to the placement. The publisher&#39;s specifications
    * will typically determine this setting. For VPAID creatives, the adapter
    * format will match the VPAID format (HTML5 VPAID creatives use the HTML5
    * adapter).  Note: Flash is no longer supported. This field now defaults to
    * HTML5 when the following values are provided: FLASH, BOTH.
    */
  var vpaidAdapterChoiceTemplate: js.UndefOr[String] = js.native
}

object SchemaSiteSettings {
  @scala.inline
  def apply(): SchemaSiteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteSettings]
  }
  @scala.inline
  implicit class SchemaSiteSettingsOps[Self <: SchemaSiteSettings] (val x: Self) extends AnyVal {
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
    def withAdBlockingOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBlockingOptOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdBlockingOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBlockingOptOut")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeSettings(value: SchemaCreativeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNewCookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNewCookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNewCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNewCookie")(js.undefined)
        ret
    }
    @scala.inline
    def withLookbackConfiguration(value: SchemaLookbackConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookbackConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookbackConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookbackConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTagSetting(value: SchemaTagSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoActiveViewOptOutTemplate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoActiveViewOptOutTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoActiveViewOptOutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoActiveViewOptOutTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withVpaidAdapterChoiceTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpaidAdapterChoiceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpaidAdapterChoiceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpaidAdapterChoiceTemplate")(js.undefined)
        ret
    }
  }
  
}

