package typingsSlinky.amapJsApiMap3d.AMap.Object3D

import typingsSlinky.amapJsApi.AMap.LngLat
import typingsSlinky.amapJsApi.AMap.Pixel
import typingsSlinky.amapJsApiMap3d.AMap.Object3D.MeshLine.Options
import typingsSlinky.amapJsApiMap3d.AnonColor
import typingsSlinky.amapJsApiMap3d.AnonPath
import typingsSlinky.amapJsApiMap3d.AnonUnit
import typingsSlinky.amapJsApiMap3d.Geometry3DreadonlyvertexI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// inherit from WideLine
@JSGlobal("AMap.Object3D.MeshLine")
@js.native
class MeshLine protected ()
  extends typingsSlinky.amapJsApiMap3d.AMap.Object3D {
  def this(options: Options) = this()
  @JSName("geometry")
  val geometry_MeshLine: Geometry3DreadonlyvertexI = js.native
  var width: Double = js.native
  def setColor(color: String): Unit = js.native
  def setHeight(height: js.Array[Double]): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setPath(path: js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]): Unit = js.native
  def setWidth(width: Double): Unit = js.native
}

@JSGlobal("AMap.Object3D.MeshLine")
@js.native
object MeshLine extends js.Object {
  type Options = AnonColor with (AnonPath | AnonUnit)
}

