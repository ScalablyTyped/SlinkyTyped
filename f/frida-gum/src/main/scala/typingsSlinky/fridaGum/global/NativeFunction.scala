package typingsSlinky.fridaGum.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.fridaGum.NativeABI
import typingsSlinky.fridaGum.NativeFunctionConstructor
import typingsSlinky.fridaGum.NativeFunctionOptions
import typingsSlinky.fridaGum.NativePointerValue
import typingsSlinky.fridaGum.NativeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("NativeFunction")
@js.native
class NativeFunction protected ()
  extends typingsSlinky.fridaGum.NativeFunction {
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

@JSGlobal("NativeFunction")
@js.native
object NativeFunction extends TopLevel[NativeFunctionConstructor]

