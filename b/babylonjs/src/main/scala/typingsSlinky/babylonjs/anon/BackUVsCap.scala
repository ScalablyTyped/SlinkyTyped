package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Vector3
import typingsSlinky.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackUVsCap extends js.Object {
  
  var arc: js.UndefOr[Double] = js.native
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var cap: js.UndefOr[Double] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var instance: js.UndefOr[typingsSlinky.babylonjs.BABYLON.Mesh] = js.native
  
  var invertUV: js.UndefOr[Boolean] = js.native
  
  var path: js.Array[Vector3] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var radiusFunction: js.UndefOr[js.Function2[/* i */ Double, /* distance */ Double, Double]] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var tessellation: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
}
object BackUVsCap {
  
  @scala.inline
  def apply(path: js.Array[Vector3]): BackUVsCap = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackUVsCap]
  }
  
  @scala.inline
  implicit class BackUVsCapOps[Self <: BackUVsCap] (val x: Self) extends AnyVal {
    
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
    def setPathVarargs(value: Vector3*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[Vector3]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArc(value: Double): Self = this.set("arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArc: Self = this.set("arc", js.undefined)
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = this.set("backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackUVs: Self = this.set("backUVs", js.undefined)
    
    @scala.inline
    def setCap(value: Double): Self = this.set("cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCap: Self = this.set("cap", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = this.set("frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrontUVs: Self = this.set("frontUVs", js.undefined)
    
    @scala.inline
    def setInstance(value: typingsSlinky.babylonjs.BABYLON.Mesh): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setInvertUV(value: Boolean): Self = this.set("invertUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertUV: Self = this.set("invertUV", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRadiusFunction(value: (/* i */ Double, /* distance */ Double) => Double): Self = this.set("radiusFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRadiusFunction: Self = this.set("radiusFunction", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = this.set("sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideOrientation: Self = this.set("sideOrientation", js.undefined)
    
    @scala.inline
    def setTessellation(value: Double): Self = this.set("tessellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTessellation: Self = this.set("tessellation", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = this.set("updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatable: Self = this.set("updatable", js.undefined)
  }
}
