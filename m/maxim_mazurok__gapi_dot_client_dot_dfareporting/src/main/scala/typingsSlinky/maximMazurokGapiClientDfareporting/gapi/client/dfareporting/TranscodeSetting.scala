package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranscodeSetting extends StObject {
  
  /** Allowlist of video formats to be served to this placement. Set this list to null or empty to serve all video formats. */
  var enabledVideoFormats: js.UndefOr[js.Array[Double]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#transcodeSetting". */
  var kind: js.UndefOr[String] = js.native
}
object TranscodeSetting {
  
  @scala.inline
  def apply(): TranscodeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscodeSetting]
  }
  
  @scala.inline
  implicit class TranscodeSettingMutableBuilder[Self <: TranscodeSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabledVideoFormats(value: js.Array[Double]): Self = StObject.set(x, "enabledVideoFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledVideoFormatsUndefined: Self = StObject.set(x, "enabledVideoFormats", js.undefined)
    
    @scala.inline
    def setEnabledVideoFormatsVarargs(value: Double*): Self = StObject.set(x, "enabledVideoFormats", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
