package typingsSlinky.amapJsApiMap3d.AMap.Object3D

import org.scalajs.dom.raw.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Points
  extends typingsSlinky.amapJsApiMap3d.AMap.Object3D {
  var borderColor: String
  var borderWeight: Double
  @JSName("geometry")
  val geometry_Points: typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Points
}

object Points {
  @scala.inline
  def apply(
    DEPTH_TEST: Boolean,
    borderColor: String,
    borderWeight: Double,
    geometry: typingsSlinky.amapJsApiMap3d.AMap.Geometry3D.Points,
    needUpdate: Boolean,
    reDraw: () => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Points = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWeight = borderWeight.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
}

