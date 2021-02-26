package typingsSlinky.ioredis.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends StObject {
  
  var args: js.Array[ValueType] = js.native
  
  def getKeys(): js.Array[String | Buffer] = js.native
  
  def getSlot(): Double | Null = js.native
  
  var isCustomCommand: Boolean = js.native
}
object Command {
  
  @scala.inline
  def apply(
    args: js.Array[ValueType],
    getKeys: () => js.Array[String | Buffer],
    getSlot: () => Double | Null,
    isCustomCommand: Boolean
  ): Command = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], getKeys = js.Any.fromFunction0(getKeys), getSlot = js.Any.fromFunction0(getSlot), isCustomCommand = isCustomCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[ValueType]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: ValueType*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setGetKeys(value: () => js.Array[String | Buffer]): Self = StObject.set(x, "getKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSlot(value: () => Double | Null): Self = StObject.set(x, "getSlot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCustomCommand(value: Boolean): Self = StObject.set(x, "isCustomCommand", value.asInstanceOf[js.Any])
  }
}
