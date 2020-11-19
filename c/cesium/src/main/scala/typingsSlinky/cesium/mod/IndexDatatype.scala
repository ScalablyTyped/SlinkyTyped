package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexDatatype extends js.Object
@JSImport("cesium", "IndexDatatype")
@js.native
object IndexDatatype extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexDatatype with Double] = js.native
  
  def createTypedArray(numberOfVertices: Double, indicesLengthOrArray: js.Any): js.typedarray.Uint16Array | js.typedarray.Uint32Array = js.native
  
  def createTypedArrayFromArrayBuffer(
    numberOfVertices: Double,
    sourceArray: js.typedarray.ArrayBuffer,
    byteOffset: Double,
    length: Double
  ): js.typedarray.Uint16Array | js.typedarray.Uint32Array = js.native
  
  def getSizeInBytes(indexDatatype: IndexDatatype): Double = js.native
  
  def validate(indexDatatype: IndexDatatype): Boolean = js.native
  
  @js.native
  sealed trait UNSIGNED_BYTE extends IndexDatatype
  /* 0 */ @js.native
  object UNSIGNED_BYTE extends TopLevel[UNSIGNED_BYTE with Double]
  
  @js.native
  sealed trait UNSIGNED_INT extends IndexDatatype
  /* 2 */ @js.native
  object UNSIGNED_INT extends TopLevel[UNSIGNED_INT with Double]
  
  @js.native
  sealed trait UNSIGNED_SHORT extends IndexDatatype
  /* 1 */ @js.native
  object UNSIGNED_SHORT extends TopLevel[UNSIGNED_SHORT with Double]
}
