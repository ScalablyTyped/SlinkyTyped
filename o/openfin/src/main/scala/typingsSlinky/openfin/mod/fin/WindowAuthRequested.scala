package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.anon.Host
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
  implicit class WindowAuthRequestedOps[Self <: WindowAuthRequested] (val x: Self) extends AnyVal {
    
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
    def setAuthInfo(value: Host): Self = this.set("authInfo", value.asInstanceOf[js.Any])
  }
}
