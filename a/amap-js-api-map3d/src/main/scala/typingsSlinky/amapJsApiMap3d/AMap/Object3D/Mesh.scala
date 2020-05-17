package typingsSlinky.amapJsApiMap3d.AMap.Object3D

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mesh
  extends typingsSlinky.amapJsApiMap3d.AMap.Object3D {
  @JSName("geometry")
  val geometry_Mesh: typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Mesh = js.native
}

object Mesh {
  @scala.inline
  def apply(
    DEPTH_TEST: Boolean,
    geometry: typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Mesh,
    needUpdate: Boolean,
    reDraw: () => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Mesh = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mesh]
  }
  @scala.inline
  implicit class MeshOps[Self <: Mesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Mesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

