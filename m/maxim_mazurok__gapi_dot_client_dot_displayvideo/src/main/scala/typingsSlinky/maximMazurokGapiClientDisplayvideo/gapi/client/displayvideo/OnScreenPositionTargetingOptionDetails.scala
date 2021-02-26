package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnScreenPositionTargetingOptionDetails extends StObject {
  
  /** Output only. The on screen position. */
  var onScreenPosition: js.UndefOr[String] = js.native
}
object OnScreenPositionTargetingOptionDetails {
  
  @scala.inline
  def apply(): OnScreenPositionTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnScreenPositionTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class OnScreenPositionTargetingOptionDetailsMutableBuilder[Self <: OnScreenPositionTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnScreenPosition(value: String): Self = StObject.set(x, "onScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScreenPositionUndefined: Self = StObject.set(x, "onScreenPosition", js.undefined)
  }
}
