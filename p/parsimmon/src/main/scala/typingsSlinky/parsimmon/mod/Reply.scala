package typingsSlinky.parsimmon.mod

import typingsSlinky.parsimmon.parsimmonBooleans.`false`
import typingsSlinky.parsimmon.parsimmonBooleans.`true`
import typingsSlinky.parsimmon.parsimmonNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.parsimmon.mod.SuccessReply[T]
  - typingsSlinky.parsimmon.mod.FailureReply
*/
trait Reply[T] extends js.Object
object Reply {
  
  @scala.inline
  def SuccessReply[T](expected: js.Array[String], furthest: `-1`, index: Double, status: `true`, value: T): Reply[T] = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reply[T]]
  }
  
  @scala.inline
  def FailureReply[T](expected: js.Array[String], furthest: Double, index: `-1`, status: `false`, value: Null): Reply[T] = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reply[T]]
  }
}
