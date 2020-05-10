package typingsSlinky.emscripten

import typingsSlinky.emscripten.Emscripten.CType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("allocate")
@js.native
object allocate extends js.Object {
  def apply(slab: js.Array[Double], types: js.Array[CType], allocator: Double): Double = js.native
  def apply(slab: js.Array[Double], types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  def apply(slab: js.Array[Double], types: CType, allocator: Double): Double = js.native
  def apply(slab: js.Array[Double], types: CType, allocator: Double, ptr: Double): Double = js.native
  def apply(slab: Double, types: js.Array[CType], allocator: Double): Double = js.native
  def apply(slab: Double, types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  def apply(slab: Double, types: CType, allocator: Double): Double = js.native
  def apply(slab: Double, types: CType, allocator: Double, ptr: Double): Double = js.native
  def apply(slab: js.typedarray.ArrayBufferView, types: js.Array[CType], allocator: Double): Double = js.native
  def apply(slab: js.typedarray.ArrayBufferView, types: js.Array[CType], allocator: Double, ptr: Double): Double = js.native
  def apply(slab: js.typedarray.ArrayBufferView, types: CType, allocator: Double): Double = js.native
  def apply(slab: js.typedarray.ArrayBufferView, types: CType, allocator: Double, ptr: Double): Double = js.native
}

