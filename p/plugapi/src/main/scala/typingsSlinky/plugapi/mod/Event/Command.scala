package typingsSlinky.plugapi.mod.Event

import typingsSlinky.plugapi.mod.RawChatMessage
import typingsSlinky.plugapi.mod.User.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends Chat {
  
  var args: js.Array[String] = js.native
  
  var command: String = js.native
  
  def havePermission(args: js.Any*): Boolean = js.native
  
  def isFrom(args: js.Any*): Boolean = js.native
  
  def respond(args: js.Any*): js.Any = js.native
  
  def respondTimeout(args: js.Any*): js.Any = js.native
}
object Command {
  
  @scala.inline
  def apply(
    args: js.Array[String],
    command: String,
    from: User,
    havePermission: /* repeated */ js.Any => Boolean,
    id: String,
    isFrom: /* repeated */ js.Any => Boolean,
    mentions: js.Array[_],
    message: String,
    muted: Boolean,
    raw: RawChatMessage,
    respond: /* repeated */ js.Any => js.Any,
    respondTimeout: /* repeated */ js.Any => js.Any,
    `type`: String
  ): Command = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], havePermission = js.Any.fromFunction1(havePermission), id = id.asInstanceOf[js.Any], isFrom = js.Any.fromFunction1(isFrom), mentions = mentions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], respond = js.Any.fromFunction1(respond), respondTimeout = js.Any.fromFunction1(respondTimeout))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHavePermission(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "havePermission", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFrom(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "isFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRespond(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "respond", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRespondTimeout(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "respondTimeout", js.Any.fromFunction1(value))
  }
}
