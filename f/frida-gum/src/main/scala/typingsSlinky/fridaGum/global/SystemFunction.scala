package typingsSlinky.fridaGum.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.fridaGum.NativeABI
import typingsSlinky.fridaGum.NativeFunctionOptions
import typingsSlinky.fridaGum.NativePointerValue
import typingsSlinky.fridaGum.NativeType
import typingsSlinky.fridaGum.SystemFunctionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SystemFunction")
@js.native
class SystemFunction protected ()
  extends typingsSlinky.fridaGum.SystemFunction {
  def this(address: NativePointerValue, retType: NativeType, argTypes: js.Array[NativeType]) = this()
  def this(
    address: NativePointerValue,
    retType: NativeType,
    argTypes: js.Array[NativeType],
    abiOrOptions: NativeABI
  ) = this()
  def this(
    address: NativePointerValue,
    retType: NativeType,
    argTypes: js.Array[NativeType],
    abiOrOptions: NativeFunctionOptions
  ) = this()
}

@JSGlobal("SystemFunction")
@js.native
object SystemFunction extends TopLevel[SystemFunctionConstructor]

