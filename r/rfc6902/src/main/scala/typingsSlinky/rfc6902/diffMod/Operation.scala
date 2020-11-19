package typingsSlinky.rfc6902.diffMod

import typingsSlinky.rfc6902.rfc6902Strings.add
import typingsSlinky.rfc6902.rfc6902Strings.copy
import typingsSlinky.rfc6902.rfc6902Strings.move
import typingsSlinky.rfc6902.rfc6902Strings.remove
import typingsSlinky.rfc6902.rfc6902Strings.replace
import typingsSlinky.rfc6902.rfc6902Strings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rfc6902.diffMod.AddOperation
  - typingsSlinky.rfc6902.diffMod.RemoveOperation
  - typingsSlinky.rfc6902.diffMod.ReplaceOperation
  - typingsSlinky.rfc6902.diffMod.MoveOperation
  - typingsSlinky.rfc6902.diffMod.CopyOperation
  - typingsSlinky.rfc6902.diffMod.TestOperation
*/
trait Operation extends js.Object
object Operation {
  
  @scala.inline
  def CopyOperation(from: String, op: copy, path: String): Operation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  def TestOperation(op: test, path: String, value: js.Any): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  def AddOperation(op: add, path: String, value: js.Any): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  def RemoveOperation(op: remove, path: String): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  def MoveOperation(from: String, op: move, path: String): Operation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  def ReplaceOperation(op: replace, path: String, value: js.Any): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}
