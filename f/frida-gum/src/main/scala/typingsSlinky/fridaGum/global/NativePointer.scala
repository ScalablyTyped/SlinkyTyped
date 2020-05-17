package typingsSlinky.fridaGum.global

import typingsSlinky.fridaGum.Int64
import typingsSlinky.fridaGum.NativePointerValue
import typingsSlinky.fridaGum.UInt64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a native pointer value whose size depends on Process#pointerSize.
  */
@JSGlobal("NativePointer")
@js.native
class NativePointer protected ()
  extends typingsSlinky.fridaGum.NativePointer {
  /**
    * Creates a new NativePointer from `v`, which is either a string containing the memory address in decimal,
    * or hexadecimal if prefixed with “0x”, or a number. You may use the ptr(v) short-hand for brevity.
    */
  def this(v: String) = this()
  def this(v: Double) = this()
  def this(v: Int64) = this()
  def this(v: NativePointerValue) = this()
  def this(v: UInt64) = this()
}

