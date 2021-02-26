package typingsSlinky.babylonjs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylonjs.bufferMod.VertexBuffer
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var data: StringDictionary[js.typedarray.Float32Array] = js.native
  
  var sizes: StringDictionary[Double] = js.native
  
  var strides: StringDictionary[Double] = js.native
  
  var vertexBuffers: StringDictionary[Nullable[VertexBuffer]] = js.native
}
object Data {
  
  @scala.inline
  def apply(
    data: StringDictionary[js.typedarray.Float32Array],
    sizes: StringDictionary[Double],
    strides: StringDictionary[Double],
    vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], vertexBuffers = vertexBuffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: StringDictionary[js.typedarray.Float32Array]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizes(value: StringDictionary[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: StringDictionary[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexBuffers(value: StringDictionary[Nullable[VertexBuffer]]): Self = StObject.set(x, "vertexBuffers", value.asInstanceOf[js.Any])
  }
}
