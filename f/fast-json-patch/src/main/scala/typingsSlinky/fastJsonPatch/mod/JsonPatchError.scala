package typingsSlinky.fastJsonPatch.mod

import typingsSlinky.fastJsonPatch.moduleHelpersMod.JsonPatchErrorName
import typingsSlinky.fastJsonPatch.moduleHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-json-patch", "JsonPatchError")
@js.native
class JsonPatchError protected () extends PatchError {
  def this(message: String, name: JsonPatchErrorName) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double) = this()
  def this(message: String, name: JsonPatchErrorName, index: js.UndefOr[scala.Nothing], operation: js.Any) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
  def this(
    message: String,
    name: JsonPatchErrorName,
    index: js.UndefOr[scala.Nothing],
    operation: js.UndefOr[scala.Nothing],
    tree: js.Any
  ) = this()
  def this(
    message: String,
    name: JsonPatchErrorName,
    index: js.UndefOr[scala.Nothing],
    operation: js.Any,
    tree: js.Any
  ) = this()
  def this(
    message: String,
    name: JsonPatchErrorName,
    index: Double,
    operation: js.UndefOr[scala.Nothing],
    tree: js.Any
  ) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
}
