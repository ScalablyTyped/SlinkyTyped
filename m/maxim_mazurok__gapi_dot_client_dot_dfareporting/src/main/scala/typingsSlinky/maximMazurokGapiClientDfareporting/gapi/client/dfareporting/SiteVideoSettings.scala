package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteVideoSettings extends js.Object {
  
  /** Settings for the companion creatives of video creatives served to this site. */
  var companionSettings: js.UndefOr[SiteCompanionSetting] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#siteVideoSettings". */
  var kind: js.UndefOr[String] = js.native
  
  /** Whether OBA icons are enabled for this placement. */
  var obaEnabled: js.UndefOr[Boolean] = js.native
  
  /** Settings for the OBA icon of video creatives served to this site. This will act as default for new placements created under this site. */
  var obaSettings: js.UndefOr[ObaIcon] = js.native
  
  /** Orientation of a site template used for video. This will act as default for new placements created under this site. */
  var orientation: js.UndefOr[String] = js.native
  
  /** Settings for the skippability of video creatives served to this site. This will act as default for new placements created under this site. */
  var skippableSettings: js.UndefOr[SiteSkippableSetting] = js.native
  
  /** Settings for the transcodes of video creatives served to this site. This will act as default for new placements created under this site. */
  var transcodeSettings: js.UndefOr[SiteTranscodeSetting] = js.native
}
object SiteVideoSettings {
  
  @scala.inline
  def apply(): SiteVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteVideoSettings]
  }
  
  @scala.inline
  implicit class SiteVideoSettingsOps[Self <: SiteVideoSettings] (val x: Self) extends AnyVal {
    
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
    def setCompanionSettings(value: SiteCompanionSetting): Self = this.set("companionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanionSettings: Self = this.set("companionSettings", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setObaEnabled(value: Boolean): Self = this.set("obaEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObaEnabled: Self = this.set("obaEnabled", js.undefined)
    
    @scala.inline
    def setObaSettings(value: ObaIcon): Self = this.set("obaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObaSettings: Self = this.set("obaSettings", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setSkippableSettings(value: SiteSkippableSetting): Self = this.set("skippableSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippableSettings: Self = this.set("skippableSettings", js.undefined)
    
    @scala.inline
    def setTranscodeSettings(value: SiteTranscodeSetting): Self = this.set("transcodeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscodeSettings: Self = this.set("transcodeSettings", js.undefined)
  }
}
