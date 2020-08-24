package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.NativeABI
import typingsSlinky.fridaGum.NativeCallbackImplementation
import typingsSlinky.fridaGum.NativeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("NativeCallback")
@js.native
class NativeCallback protected ()
  extends typingsSlinky.fridaGum.NativePointer {
  def this(func: NativeCallbackImplementation, retType: NativeType, argTypes: js.Array[NativeType]) = this()
  def this(
    func: NativeCallbackImplementation,
    retType: NativeType,
    argTypes: js.Array[NativeType],
    abi: NativeABI
  ) = this()
}

