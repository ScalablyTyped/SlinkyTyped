package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for dialog-related commands with a simple common command state.
  */
@js.native
trait CommandWithSimpleStateDialogBase extends StObject {
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}
object CommandWithSimpleStateDialogBase {
  
  @scala.inline
  def apply(getState: () => SimpleCommandState): CommandWithSimpleStateDialogBase = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[CommandWithSimpleStateDialogBase]
  }
  
  @scala.inline
  implicit class CommandWithSimpleStateDialogBaseMutableBuilder[Self <: CommandWithSimpleStateDialogBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetState(value: () => SimpleCommandState): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
  }
}
