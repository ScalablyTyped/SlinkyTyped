package typingsSlinky.commandLineCommands

import typingsSlinky.commandLineCommands.anon.Argv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("command-line-commands", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(commands: js.Array[String | Null]): Argv = js.native
  def apply(commands: js.Array[String | Null], argv: js.Array[String]): Argv = js.native
}
