package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle the display of grid lines for a table with no borders applied - on/off.
  */
@js.native
trait ShowTableGridLinesCommand extends CommandWithBooleanStateBase {
  
  /**
    * Executes the ShowTableGridLinesCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param showTableGridLines true to display table grid lines, false to hide table grid lines.
    */
  def execute(): Boolean = js.native
  def execute(showTableGridLines: Boolean): Boolean = js.native
}
