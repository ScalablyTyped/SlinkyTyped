package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets a command to invoke the Export Range dialog to start a mail merge.
  */
@js.native
trait MailMergeDialogCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the MailMergeDialogCommand command.
    */
  def execute(): Boolean = js.native
}
object MailMergeDialogCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): MailMergeDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MailMergeDialogCommand]
  }
  
  @scala.inline
  implicit class MailMergeDialogCommandMutableBuilder[Self <: MailMergeDialogCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
