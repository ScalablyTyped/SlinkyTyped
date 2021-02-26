package typingsSlinky.agoraRtcSdk.anon

import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.error
import typingsSlinky.agoraRtcSdk.agoraRtcSdkStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends StObject {
  
  var info: js.UndefOr[String] = js.native
  
  var msg: String = js.native
  
  var `type`: warning | error = js.native
}
object Info {
  
  @scala.inline
  def apply(msg: String, `type`: warning | error): Info = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: warning | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
