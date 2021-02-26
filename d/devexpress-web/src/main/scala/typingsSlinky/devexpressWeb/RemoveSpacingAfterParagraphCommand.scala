package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove spacing after the selected paragraph.
  */
@js.native
trait RemoveSpacingAfterParagraphCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveSpacingAfterParagraphCommand command.
    */
  def execute(): Boolean = js.native
}
object RemoveSpacingAfterParagraphCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): RemoveSpacingAfterParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[RemoveSpacingAfterParagraphCommand]
  }
  
  @scala.inline
  implicit class RemoveSpacingAfterParagraphCommandMutableBuilder[Self <: RemoveSpacingAfterParagraphCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
