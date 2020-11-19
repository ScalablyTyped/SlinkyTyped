package typingsSlinky.ffi.mod

import typingsSlinky.ref.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ffi", "Function")
@js.native
class FunctionCls protected () extends Function {
  def this(retType: String, argTypes: js.Array[_]) = this()
  def this(retType: Type, argTypes: js.Array[_]) = this()
  def this(retType: String, argTypes: js.Array[_], abi: Double) = this()
  def this(retType: Type, argTypes: js.Array[_], abi: Double) = this()
}
