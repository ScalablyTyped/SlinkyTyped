package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RichMediaExitOverride extends StObject {
  
  /** Click-through URL of this rich media exit override. Applicable if the enabled field is set to true. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.native
  
  /** Whether to use the clickThroughUrl. If false, the creative-level exit will be used. */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** ID for the override to refer to a specific exit in the creative. */
  var exitId: js.UndefOr[String] = js.native
}
object RichMediaExitOverride {
  
  @scala.inline
  def apply(): RichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichMediaExitOverride]
  }
  
  @scala.inline
  implicit class RichMediaExitOverrideMutableBuilder[Self <: RichMediaExitOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickThroughUrl(value: ClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setExitId(value: String): Self = StObject.set(x, "exitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitIdUndefined: Self = StObject.set(x, "exitId", js.undefined)
  }
}
