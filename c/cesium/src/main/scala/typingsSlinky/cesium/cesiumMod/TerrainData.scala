package typingsSlinky.cesium.cesiumMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TerrainData")
@js.native
class TerrainData () extends js.Object {
  var credits: js.Array[Credit] = js.native
  var waterMask: scala.scalajs.js.typedarray.Uint8Array | HTMLImageElement | HTMLCanvasElement = js.native
  def interpolateHeight(rectangle: Rectangle, longitude: Double, latitude: Double): Double = js.native
  def isChildAvailable(thisX: Double, thisY: Double, childX: Double, childY: Double): Boolean = js.native
  def upsample(
    tilingScheme: TilingScheme,
    thisX: Double,
    thisY: Double,
    thisLevel: Double,
    descendantX: Double,
    descendantY: Double,
    descendantLevel: Double
  ): js.Promise[TerrainData] = js.native
  def wasCreatedByUpsampling(): Boolean = js.native
}

