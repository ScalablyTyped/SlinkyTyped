package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceChannelRequest extends StObject {
  
  /**
    * Specifies whether to enable the voice channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}
object VoiceChannelRequest {
  
  @scala.inline
  def apply(): VoiceChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceChannelRequest]
  }
  
  @scala.inline
  implicit class VoiceChannelRequestMutableBuilder[Self <: VoiceChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
