package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains a command.
  * @see XCommandProcessor
  */
@js.native
trait Command extends StObject {
  
  /** contains the argument of the command */
  var Argument: js.Any = js.native
  
  /**
    * contains an implementation specific handle for the command.
    *
    * It must be `-1` if the implementation has no handle. `0` is a valid command handle.
    */
  var Handle: Double = js.native
  
  /** contains the name of the command. */
  var Name: String = js.native
}
object Command {
  
  @scala.inline
  def apply(Argument: js.Any, Handle: Double, Name: String): Command = {
    val __obj = js.Dynamic.literal(Argument = Argument.asInstanceOf[js.Any], Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: js.Any): Self = StObject.set(x, "Argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: Double): Self = StObject.set(x, "Handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
