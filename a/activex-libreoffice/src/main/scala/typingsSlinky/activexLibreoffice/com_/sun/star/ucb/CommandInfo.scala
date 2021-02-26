package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a command.
  * @see XCommandProcessor
  */
@js.native
trait CommandInfo extends StObject {
  
  /** contains the type of the command's argument. */
  var ArgType: `type` = js.native
  
  /**
    * contains an implementation specific handle for the command.
    *
    * It may be `-1` if the implementation has no handle.
    */
  var Handle: Double = js.native
  
  /** contains the name of a command. */
  var Name: String = js.native
}
object CommandInfo {
  
  @scala.inline
  def apply(ArgType: `type`, Handle: Double, Name: String): CommandInfo = {
    val __obj = js.Dynamic.literal(ArgType = ArgType.asInstanceOf[js.Any], Handle = Handle.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandInfo]
  }
  
  @scala.inline
  implicit class CommandInfoMutableBuilder[Self <: CommandInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgType(value: `type`): Self = StObject.set(x, "ArgType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandle(value: Double): Self = StObject.set(x, "Handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
