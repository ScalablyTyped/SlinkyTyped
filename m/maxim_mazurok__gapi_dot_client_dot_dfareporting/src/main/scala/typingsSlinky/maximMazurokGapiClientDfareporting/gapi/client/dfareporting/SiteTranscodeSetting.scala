package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteTranscodeSetting extends js.Object {
  
  /** Allowlist of video formats to be served to this site template. Set this list to null or empty to serve all video formats. */
  var enabledVideoFormats: js.UndefOr[js.Array[Double]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#siteTranscodeSetting". */
  var kind: js.UndefOr[String] = js.native
}
object SiteTranscodeSetting {
  
  @scala.inline
  def apply(): SiteTranscodeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteTranscodeSetting]
  }
  
  @scala.inline
  implicit class SiteTranscodeSettingOps[Self <: SiteTranscodeSetting] (val x: Self) extends AnyVal {
    
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
    def setEnabledVideoFormatsVarargs(value: Double*): Self = this.set("enabledVideoFormats", js.Array(value :_*))
    
    @scala.inline
    def setEnabledVideoFormats(value: js.Array[Double]): Self = this.set("enabledVideoFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledVideoFormats: Self = this.set("enabledVideoFormats", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
