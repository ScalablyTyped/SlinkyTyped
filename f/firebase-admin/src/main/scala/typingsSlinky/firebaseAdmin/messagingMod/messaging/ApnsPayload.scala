package typingsSlinky.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApnsPayload
  extends /* customData */ StringDictionary[js.Object] {
  
  /**
    * The `aps` dictionary to be included in the message.
    */
  var aps: Aps = js.native
}
object ApnsPayload {
  
  @scala.inline
  def apply(aps: Aps): ApnsPayload = {
    val __obj = js.Dynamic.literal(aps = aps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApnsPayload]
  }
  
  @scala.inline
  implicit class ApnsPayloadMutableBuilder[Self <: ApnsPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAps(value: Aps): Self = StObject.set(x, "aps", value.asInstanceOf[js.Any])
  }
}
