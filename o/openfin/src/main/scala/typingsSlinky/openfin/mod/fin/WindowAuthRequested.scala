package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowAuthRequested extends WindowEvent {
  
  var authInfo: Host = js.native
}
object WindowAuthRequested {
  
  @scala.inline
  def apply(authInfo: Host, name: String, topic: String, `type`: OpenFinApplicationEventType, uuid: String): WindowAuthRequested = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequested]
  }
  
  @scala.inline
  implicit class WindowAuthRequestedMutableBuilder[Self <: WindowAuthRequested] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthInfo(value: Host): Self = StObject.set(x, "authInfo", value.asInstanceOf[js.Any])
  }
}
