package typingsSlinky.jsonPatch.mod

import typingsSlinky.jsonPatch.jsonPatchStrings.add
import typingsSlinky.jsonPatch.jsonPatchStrings.copy
import typingsSlinky.jsonPatch.jsonPatchStrings.move
import typingsSlinky.jsonPatch.jsonPatchStrings.remove
import typingsSlinky.jsonPatch.jsonPatchStrings.replace
import typingsSlinky.jsonPatch.jsonPatchStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonPatch.mod.AddPatch
  - typingsSlinky.jsonPatch.mod.RemovePatch
  - typingsSlinky.jsonPatch.mod.ReplacePatch
  - typingsSlinky.jsonPatch.mod.MovePatch
  - typingsSlinky.jsonPatch.mod.CopyPatch
  - typingsSlinky.jsonPatch.mod.TestPatch
*/
trait OpPatch extends js.Object

object OpPatch {
  @scala.inline
  def MovePatch(from: String, op: move, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def ReplacePatch(op: replace, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def CopyPatch(from: String, op: copy, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def AddPatch(op: add, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def RemovePatch(op: remove, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def TestPatch(op: test, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
}

