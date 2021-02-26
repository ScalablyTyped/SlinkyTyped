package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexDatatype extends StObject
@JSImport("cesium", "IndexDatatype")
@js.native
object IndexDatatype extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexDatatype with Double] = js.native
  
  @js.native
  sealed trait UNSIGNED_BYTE extends IndexDatatype
  /* 0 */ val UNSIGNED_BYTE: typingsSlinky.cesium.mod.IndexDatatype.UNSIGNED_BYTE with Double = js.native
  
  @js.native
  sealed trait UNSIGNED_INT extends IndexDatatype
  /* 2 */ val UNSIGNED_INT: typingsSlinky.cesium.mod.IndexDatatype.UNSIGNED_INT with Double = js.native
  
  @js.native
  sealed trait UNSIGNED_SHORT extends IndexDatatype
  /* 1 */ val UNSIGNED_SHORT: typingsSlinky.cesium.mod.IndexDatatype.UNSIGNED_SHORT with Double = js.native
  
  def createTypedArray(numberOfVertices: Double, indicesLengthOrArray: js.Any): js.typedarray.Uint16Array | js.typedarray.Uint32Array = js.native
  
  def createTypedArrayFromArrayBuffer(
    numberOfVertices: Double,
    sourceArray: js.typedarray.ArrayBuffer,
    byteOffset: Double,
    length: Double
  ): js.typedarray.Uint16Array | js.typedarray.Uint32Array = js.native
  
  def getSizeInBytes(indexDatatype: IndexDatatype): Double = js.native
  
  def validate(indexDatatype: IndexDatatype): Boolean = js.native
}
