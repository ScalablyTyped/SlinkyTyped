package typingsSlinky.node.replMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates a recoverable error that a `REPLServer` can use to support multi-line input.
  *
  * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_recoverable_errors
  */
@JSImport("repl", "Recoverable")
@js.native
class Recoverable protected () extends Error {
  def this(err: js.Error) = this()
  
  var err: js.Error = js.native
}
