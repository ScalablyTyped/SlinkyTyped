package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the underline formatting of characters in a selected range.
  */
@js.native
trait ChangeFontUnderlineCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ChangeFontUnderlineCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontUnderline true to apply underline formatting to the text, false to remove underline formatting.
    */
  def execute(): Boolean = js.native
  def execute(fontUnderline: Boolean): Boolean = js.native
}
