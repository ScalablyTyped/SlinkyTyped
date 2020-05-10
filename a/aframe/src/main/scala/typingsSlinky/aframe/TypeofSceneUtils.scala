package typingsSlinky.aframe

import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSceneUtils extends js.Object {
  def attach(child: Object3D, scene: Scene, parent: Object3D): Unit = js.native
  def createMultiMaterialObject(geometry: Geometry, materials: js.Array[Material]): Object3D = js.native
  def detach(child: Object3D, parent: Object3D, scene: Scene): Unit = js.native
}

object TypeofSceneUtils {
  @scala.inline
  def apply(
    attach: (Object3D, Scene, Object3D) => Unit,
    createMultiMaterialObject: (Geometry, js.Array[Material]) => Object3D,
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
    def withAttach(value: (Object3D, Scene, Object3D) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attach")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCreateMultiMaterialObject(value: (Geometry, js.Array[Material]) => Object3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMultiMaterialObject")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDetach(value: (Object3D, Object3D, Scene) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

