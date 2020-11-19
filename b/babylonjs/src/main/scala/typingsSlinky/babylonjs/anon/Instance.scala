package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.linesMeshMod.LinesMesh
import typingsSlinky.babylonjs.mathColorMod.Color4
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.native
  
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.native
  
  var lines: js.Array[js.Array[Vector3]] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var useVertexAlpha: js.UndefOr[Boolean] = js.native
}
object Instance {
  
  @scala.inline
  def apply(lines: js.Array[js.Array[Vector3]]): Instance = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLinesVarargs(value: js.Array[Vector3]*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[js.Array[Vector3]]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: js.Array[Color4]*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: Nullable[js.Array[js.Array[Color4]]]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setColorsNull: Self = this.set("colors", null)
    
    @scala.inline
    def setInstance(value: Nullable[LinesMesh]): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setInstanceNull: Self = this.set("instance", null)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = this.set("updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatable: Self = this.set("updatable", js.undefined)
    
    @scala.inline
    def setUseVertexAlpha(value: Boolean): Self = this.set("useVertexAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseVertexAlpha: Self = this.set("useVertexAlpha", js.undefined)
  }
}
