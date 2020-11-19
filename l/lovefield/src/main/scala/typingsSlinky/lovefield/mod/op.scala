package typingsSlinky.lovefield.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// module schema
@JSImport("lovefield", "op")
@js.native
object op extends js.Object {
  
  def and(args: Predicate*): Predicate = js.native
  
  def not(operand: Predicate): Predicate = js.native
  
  def or(args: Predicate*): Predicate = js.native
}
