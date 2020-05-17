package typingsSlinky.amapJsApiMap3d.AMap

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object3D_ extends js.Object {
  var DEPTH_TEST: Boolean = js.native
  val geometry: Geometry3D = js.native
  var needUpdate: Boolean = js.native
  var textures: js.Array[String | HTMLCanvasElement] = js.native
  var transparent: Boolean = js.native
  def reDraw(): Unit = js.native
  // internal
  def reset(): Unit = js.native
}

object Object3D_ {
  @scala.inline
  def apply(
    DEPTH_TEST: Boolean,
    geometry: Geometry3D,
    needUpdate: Boolean,
    reDraw: () => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Object3D_ = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object3D_]
  }
  @scala.inline
  implicit class Object3D_Ops[Self <: Object3D_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEPTH_TEST(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEPTH_TEST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: Geometry3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReDraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reDraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTextures(value: js.Array[String | HTMLCanvasElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

