package typingsSlinky.cesium.cesiumMod

import typingsSlinky.std.Float32Array
import typingsSlinky.std.Float64Array
import typingsSlinky.std.Int16Array
import typingsSlinky.std.Int8Array
import typingsSlinky.std.Uint16Array
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComponentDatatype extends js.Object

@JSImport("cesium", "ComponentDatatype")
@js.native
object ComponentDatatype extends js.Object {
  @js.native
  sealed trait BYTE extends ComponentDatatype
  
  @js.native
  sealed trait DOUBLE extends ComponentDatatype
  
  @js.native
  sealed trait FLOAT extends ComponentDatatype
  
  @js.native
  sealed trait SHORT extends ComponentDatatype
  
  @js.native
  sealed trait UNSIGNED_BYTE extends ComponentDatatype
  
  @js.native
  sealed trait UNSIGNED_SHORT extends ComponentDatatype
  
  /* 0 */ val BYTE: typingsSlinky.cesium.cesiumMod.ComponentDatatype.BYTE with Double = js.native
  /* 5 */ val DOUBLE: typingsSlinky.cesium.cesiumMod.ComponentDatatype.DOUBLE with Double = js.native
  /* 4 */ val FLOAT: typingsSlinky.cesium.cesiumMod.ComponentDatatype.FLOAT with Double = js.native
  /* 2 */ val SHORT: typingsSlinky.cesium.cesiumMod.ComponentDatatype.SHORT with Double = js.native
  /* 1 */ val UNSIGNED_BYTE: typingsSlinky.cesium.cesiumMod.ComponentDatatype.UNSIGNED_BYTE with Double = js.native
  /* 3 */ val UNSIGNED_SHORT: typingsSlinky.cesium.cesiumMod.ComponentDatatype.UNSIGNED_SHORT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentDatatype with Double] = js.native
  def createArrayBufferView(componentDatatype: ComponentDatatype, buffer: scala.scalajs.js.typedarray.ArrayBuffer): scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array = js.native
  def createArrayBufferView(
    componentDatatype: ComponentDatatype,
    buffer: scala.scalajs.js.typedarray.ArrayBuffer,
    byteOffset: Double
  ): scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array = js.native
  def createArrayBufferView(
    componentDatatype: ComponentDatatype,
    buffer: scala.scalajs.js.typedarray.ArrayBuffer,
    byteOffset: Double,
    length: Double
  ): scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array = js.native
  def createTypedArray(componentDatatype: ComponentDatatype, valuesOrLength: js.Array[_]): scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array = js.native
  def createTypedArray(componentDatatype: ComponentDatatype, valuesOrLength: Double): scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array = js.native
  def fromTypedArray(array: Float32Array): ComponentDatatype = js.native
  def fromTypedArray(array: Float64Array): ComponentDatatype = js.native
  def fromTypedArray(array: Int16Array): ComponentDatatype = js.native
  def fromTypedArray(array: Int8Array): ComponentDatatype = js.native
  def fromTypedArray(array: Uint16Array): ComponentDatatype = js.native
  def fromTypedArray(array: Uint8Array): ComponentDatatype = js.native
  def getSizeInBytes(componentDatatype: ComponentDatatype): Double = js.native
  def validate(componentDatatype: ComponentDatatype): Boolean = js.native
}

