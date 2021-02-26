package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a section break and start a new section on the next odd-numbered page.
  */
@js.native
trait InsertSectionBreakOddPageCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertSectionBreakOddPageCommand command.
    */
  def execute(): Boolean = js.native
}
object InsertSectionBreakOddPageCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertSectionBreakOddPageCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertSectionBreakOddPageCommand]
  }
  
  @scala.inline
  implicit class InsertSectionBreakOddPageCommandMutableBuilder[Self <: InsertSectionBreakOddPageCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
