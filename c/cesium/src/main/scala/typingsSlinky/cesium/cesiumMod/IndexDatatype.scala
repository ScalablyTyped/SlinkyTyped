package typingsSlinky.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexDatatype extends js.Object

@JSImport("cesium", "IndexDatatype")
@js.native
object IndexDatatype extends js.Object {
  @js.native
  sealed trait UNSIGNED_BYTE extends IndexDatatype
  
  @js.native
  sealed trait UNSIGNED_INT extends IndexDatatype
  
  @js.native
  sealed trait UNSIGNED_SHORT extends IndexDatatype
  
  /* 0 */ val UNSIGNED_BYTE: typingsSlinky.cesium.cesiumMod.IndexDatatype.UNSIGNED_BYTE with Double = js.native
  /* 2 */ val UNSIGNED_INT: typingsSlinky.cesium.cesiumMod.IndexDatatype.UNSIGNED_INT with Double = js.native
  /* 1 */ val UNSIGNED_SHORT: typingsSlinky.cesium.cesiumMod.IndexDatatype.UNSIGNED_SHORT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexDatatype with Double] = js.native
  def createTypedArray(numberOfVertices: Double, indicesLengthOrArray: js.Any): scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array = js.native
  def createTypedArrayFromArrayBuffer(
    numberOfVertices: Double,
    sourceArray: scala.scalajs.js.typedarray.ArrayBuffer,
    byteOffset: Double,
    length: Double
  ): scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array = js.native
  def getSizeInBytes(indexDatatype: IndexDatatype): Double = js.native
  def validate(indexDatatype: IndexDatatype): Boolean = js.native
}

