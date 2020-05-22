package typingsSlinky.amapJsApiMap3d.AMap.Object3D

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line
  extends typingsSlinky.amapJsApiMap3d.AMap.Object3D {
  @JSName("geometry")
  val geometry_Line: typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Line
}

object Line {
  @scala.inline
  def apply(
    DEPTH_TEST: Boolean,
    geometry: typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Line,
    needUpdate: Boolean,
    reDraw: () => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Line = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

