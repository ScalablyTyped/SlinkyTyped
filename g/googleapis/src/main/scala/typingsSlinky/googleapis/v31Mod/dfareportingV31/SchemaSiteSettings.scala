package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveViewOptOut(value: Boolean): Self = this.set("activeViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveViewOptOut: Self = this.set("activeViewOptOut", js.undefined)
    
    @scala.inline
    def setAdBlockingOptOut(value: Boolean): Self = this.set("adBlockingOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdBlockingOptOut: Self = this.set("adBlockingOptOut", js.undefined)
    
    @scala.inline
    def setCreativeSettings(value: SchemaCreativeSettings): Self = this.set("creativeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeSettings: Self = this.set("creativeSettings", js.undefined)
    
    @scala.inline
    def setDisableNewCookie(value: Boolean): Self = this.set("disableNewCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNewCookie: Self = this.set("disableNewCookie", js.undefined)
    
    @scala.inline
    def setLookbackConfiguration(value: SchemaLookbackConfiguration): Self = this.set("lookbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookbackConfiguration: Self = this.set("lookbackConfiguration", js.undefined)
    
    @scala.inline
    def setTagSetting(value: SchemaTagSetting): Self = this.set("tagSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSetting: Self = this.set("tagSetting", js.undefined)
    
    @scala.inline
    def setVideoActiveViewOptOutTemplate(value: Boolean): Self = this.set("videoActiveViewOptOutTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoActiveViewOptOutTemplate: Self = this.set("videoActiveViewOptOutTemplate", js.undefined)
    
    @scala.inline
    def setVpaidAdapterChoiceTemplate(value: String): Self = this.set("vpaidAdapterChoiceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpaidAdapterChoiceTemplate: Self = this.set("vpaidAdapterChoiceTemplate", js.undefined)
  }
}
