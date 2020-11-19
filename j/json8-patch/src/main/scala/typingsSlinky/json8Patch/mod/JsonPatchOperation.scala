package typingsSlinky.json8Patch.mod

import typingsSlinky.json8Patch.json8PatchStrings.add
import typingsSlinky.json8Patch.json8PatchStrings.copy
import typingsSlinky.json8Patch.json8PatchStrings.move
import typingsSlinky.json8Patch.json8PatchStrings.remove
import typingsSlinky.json8Patch.json8PatchStrings.replace
import typingsSlinky.json8Patch.json8PatchStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.json8Patch.mod.AddOperation
  - typingsSlinky.json8Patch.mod.RemoveOperation
  - typingsSlinky.json8Patch.mod.ReplaceOperation
  - typingsSlinky.json8Patch.mod.MoveOperation
  - typingsSlinky.json8Patch.mod.CopyOperation
  - typingsSlinky.json8Patch.mod.TestOperation
*/
trait JsonPatchOperation extends js.Object
object JsonPatchOperation {
  
  @scala.inline
  def CopyOperation(from: js.Any, op: copy, path: String): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonPatchOperation]
  }
  
  @scala.inline
  def ReplaceOperation(op: replace, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonPatchOperation]
  }
  
  @scala.inline
  def MoveOperation(from: js.Any, op: move, path: String): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonPatchOperation]
  }
  
  @scala.inline
  def TestOperation(op: test, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonPatchOperation]
  }
  
  @scala.inline
  def RemoveOperation(op: remove, path: String): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonPatchOperation]
  }
  
  @scala.inline
  def AddOperation(op: add, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonPatchOperation]
  }
}
