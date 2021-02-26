package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to convert the text of all selected sentences to sentence case.
  */
@js.native
trait MakeTextSentenceCaseCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the MakeTextSentenceCaseCommand command.
    */
  def execute(): Boolean = js.native
}
object MakeTextSentenceCaseCommand {
  
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): MakeTextSentenceCaseCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MakeTextSentenceCaseCommand]
  }
  
  @scala.inline
  implicit class MakeTextSentenceCaseCommandMutableBuilder[Self <: MakeTextSentenceCaseCommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
