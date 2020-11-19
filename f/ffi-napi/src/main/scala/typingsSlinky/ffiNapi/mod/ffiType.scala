package typingsSlinky.ffiNapi.mod

import typingsSlinky.ffiNapi.Buffer
import typingsSlinky.refNapi.mod.Type
import typingsSlinky.refStructDi.mod.StructType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ffi-napi", "ffiType")
@js.native
object ffiType extends js.Object {
  
  def apply(`type`: String): Buffer = js.native
  /** Get a `ffi_type *` Buffer appropriate for the given type. */
  def apply(`type`: Type): Buffer = js.native
  
  def FFI_TYPE(): js.Any = js.native
  /** Pass it an existing Buffer instance to use that as the backing buffer. */
  def FFI_TYPE(arg: typingsSlinky.node.Buffer): js.Any = js.native
  def FFI_TYPE(arg: typingsSlinky.node.Buffer, data: js.Object): js.Any = js.native
  def FFI_TYPE(data: js.Object): js.Any = js.native
  @JSName("FFI_TYPE")
  var FFI_TYPE_Original: StructType = js.native
}
