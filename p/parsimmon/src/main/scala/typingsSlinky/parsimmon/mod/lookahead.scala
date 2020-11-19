package typingsSlinky.parsimmon.mod

import typingsSlinky.parsimmon.parsimmonStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parsimmon", "lookahead")
@js.native
object lookahead extends js.Object {
  
  def apply(arg: String): Parser[_empty] = js.native
  /**
    * Parses using arg, but does not consume what it parses. Yields an empty string.
    */
  def apply(arg: Parser[_]): Parser[_empty] = js.native
  def apply(arg: js.RegExp): Parser[_empty] = js.native
}
