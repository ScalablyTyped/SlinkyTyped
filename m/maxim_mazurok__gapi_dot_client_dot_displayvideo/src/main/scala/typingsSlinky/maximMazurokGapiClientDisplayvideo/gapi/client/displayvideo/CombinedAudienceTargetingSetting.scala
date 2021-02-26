package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedAudienceTargetingSetting extends StObject {
  
  /** Required. Combined audience id of combined audience targeting setting. This id is combined_audience_id. */
  var combinedAudienceId: js.UndefOr[String] = js.native
}
object CombinedAudienceTargetingSetting {
  
  @scala.inline
  def apply(): CombinedAudienceTargetingSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedAudienceTargetingSetting]
  }
  
  @scala.inline
  implicit class CombinedAudienceTargetingSettingMutableBuilder[Self <: CombinedAudienceTargetingSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombinedAudienceId(value: String): Self = StObject.set(x, "combinedAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombinedAudienceIdUndefined: Self = StObject.set(x, "combinedAudienceId", js.undefined)
  }
}
