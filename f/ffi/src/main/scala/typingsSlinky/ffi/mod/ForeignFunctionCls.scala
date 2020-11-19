package typingsSlinky.ffi.mod

import typingsSlinky.ffi.Buffer
import typingsSlinky.ref.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ffi", "ForeignFunction")
@js.native
class ForeignFunctionCls protected () extends ForeignFunction {
  def this(ptr: Buffer, retType: String, argTypes: js.Array[_]) = this()
  def this(ptr: Buffer, retType: Type, argTypes: js.Array[_]) = this()
  def this(ptr: Buffer, retType: String, argTypes: js.Array[_], abi: Double) = this()
  def this(ptr: Buffer, retType: Type, argTypes: js.Array[_], abi: Double) = this()
}
