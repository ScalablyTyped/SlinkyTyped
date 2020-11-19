package typingsSlinky.aframe.anon

import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSceneUtils extends js.Object {
  
  def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = js.native
  
  def createMultiMaterialObject(geometry: Geometry, materials: js.Array[typingsSlinky.three.materialMod.Material]): Object3D = js.native
  
  def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = js.native
}
object TypeofSceneUtils {
  
  @scala.inline
  def apply(
    attach: (Object3D, Scene, Object3D) => Unit,
    createMultiMaterialObject: (Geometry, js.Array[typingsSlinky.three.materialMod.Material]) => Object3D,
    detach: (Object3D, Object3D, Scene) => Unit
  ): TypeofSceneUtils = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction3(attach), createMultiMaterialObject = js.Any.fromFunction2(createMultiMaterialObject), detach = js.Any.fromFunction3(detach))
    __obj.asInstanceOf[TypeofSceneUtils]
  }
  
  @scala.inline
  implicit class TypeofSceneUtilsOps[Self <: TypeofSceneUtils] (val x: Self) extends AnyVal {
    
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
    def setAttach(value: (Object3D, Scene, Object3D) => Unit): Self = this.set("attach", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateMultiMaterialObject(value: (Geometry, js.Array[typingsSlinky.three.materialMod.Material]) => Object3D): Self = this.set("createMultiMaterialObject", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDetach(value: (Object3D, Object3D, Scene) => Unit): Self = this.set("detach", js.Any.fromFunction3(value))
  }
}
