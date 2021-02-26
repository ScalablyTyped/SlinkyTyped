package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatUser extends StObject {
  
  var iconUrl: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object ChatUser {
  
  @scala.inline
  def apply(): ChatUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatUser]
  }
  
  @scala.inline
  implicit class ChatUserMutableBuilder[Self <: ChatUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
