package typingsSlinky.iitc.hooksMod.global

import org.scalajs.dom.raw.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventNicknameClicked extends StObject {
  
  var event: MouseEvent = js.native
  
  var nickname: String = js.native
}
object EventNicknameClicked {
  
  @scala.inline
  def apply(event: MouseEvent, nickname: String): EventNicknameClicked = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventNicknameClicked]
  }
  
  @scala.inline
  implicit class EventNicknameClickedMutableBuilder[Self <: EventNicknameClicked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
  }
}
