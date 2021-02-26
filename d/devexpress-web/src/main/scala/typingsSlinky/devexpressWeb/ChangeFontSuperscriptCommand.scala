package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the superscript formatting of characters in a selected range.
  */
@js.native
trait ChangeFontSuperscriptCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ChangeFontSuperscriptCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontSuperscript true to apply superscript formatting to the text, false to remove superscript formatting.
    */
  def execute(): Boolean = js.native
  def execute(fontSuperscript: Boolean): Boolean = js.native
}
