package typingsSlinky.amapJsApiMap3d.AMap

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object3DGroup[C /* <: Object3D */] extends Object3D {
  var children: js.Array[C] = js.native
  def add(object3d: C): Unit = js.native
  def remove(object3d: C): Unit = js.native
}

object Object3DGroup {
  @scala.inline
  def apply[C](
    DEPTH_TEST: Boolean,
    add: C => Unit,
    children: js.Array[C],
    geometry: Geometry3D,
    needUpdate: Boolean,
    reDraw: () => Unit,
    remove: C => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Object3DGroup[C] = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), children = children.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), remove = js.Any.fromFunction1(remove), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object3DGroup[C]]
  }
  @scala.inline
  implicit class Object3DGroupOps[Self[c] <: Object3DGroup[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withAdd(value: C => Unit): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[C]): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: C => Unit): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

