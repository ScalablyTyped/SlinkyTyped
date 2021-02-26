package typingsSlinky.aframe.anon

import typingsSlinky.three.bufferAttributeMod.BufferAttribute
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBufferGeometryUtils extends StObject {
  
  def computeTangents(geometry: BufferGeometry): Null = js.native
  
  def mergeBufferAttributes(attributes: js.Array[BufferAttribute]): BufferAttribute = js.native
  
  def mergeBufferGeometries(geometries: js.Array[BufferGeometry]): BufferGeometry = js.native
}
object TypeofBufferGeometryUtils {
  
  @scala.inline
  def apply(
    computeTangents: BufferGeometry => Null,
    mergeBufferAttributes: js.Array[BufferAttribute] => BufferAttribute,
    mergeBufferGeometries: js.Array[BufferGeometry] => BufferGeometry
  ): TypeofBufferGeometryUtils = {
    val __obj = js.Dynamic.literal(computeTangents = js.Any.fromFunction1(computeTangents), mergeBufferAttributes = js.Any.fromFunction1(mergeBufferAttributes), mergeBufferGeometries = js.Any.fromFunction1(mergeBufferGeometries))
    __obj.asInstanceOf[TypeofBufferGeometryUtils]
  }
  
  @scala.inline
  implicit class TypeofBufferGeometryUtilsMutableBuilder[Self <: TypeofBufferGeometryUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeTangents(value: BufferGeometry => Null): Self = StObject.set(x, "computeTangents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMergeBufferAttributes(value: js.Array[BufferAttribute] => BufferAttribute): Self = StObject.set(x, "mergeBufferAttributes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMergeBufferGeometries(value: js.Array[BufferGeometry] => BufferGeometry): Self = StObject.set(x, "mergeBufferGeometries", js.Any.fromFunction1(value))
  }
}
