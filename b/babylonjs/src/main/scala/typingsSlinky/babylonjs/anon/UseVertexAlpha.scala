package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Color4
import typingsSlinky.babylonjs.BABYLON.LinesMesh
import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseVertexAlpha extends StObject {
  
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.native
  
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.native
  
  var lines: js.Array[js.Array[Vector3]] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var useVertexAlpha: js.UndefOr[Boolean] = js.native
}
object UseVertexAlpha {
  
  @scala.inline
  def apply(lines: js.Array[js.Array[Vector3]]): UseVertexAlpha = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseVertexAlpha]
  }
  
  @scala.inline
  implicit class UseVertexAlphaMutableBuilder[Self <: UseVertexAlpha] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: Nullable[js.Array[js.Array[Color4]]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsNull: Self = StObject.set(x, "colors", null)
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: js.Array[Color4]*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setInstance(value: Nullable[LinesMesh]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setLines(value: js.Array[js.Array[Vector3]]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: js.Array[Vector3]*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    @scala.inline
    def setUseVertexAlpha(value: Boolean): Self = StObject.set(x, "useVertexAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseVertexAlphaUndefined: Self = StObject.set(x, "useVertexAlpha", js.undefined)
  }
}
