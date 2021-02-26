package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubExchangeTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the sub-exchange. */
  var displayName: js.UndefOr[String] = js.native
}
object SubExchangeTargetingOptionDetails {
  
  @scala.inline
  def apply(): SubExchangeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubExchangeTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class SubExchangeTargetingOptionDetailsMutableBuilder[Self <: SubExchangeTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
