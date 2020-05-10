package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.cesium.AnonBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HeightmapTerrainData")
@js.native
class HeightmapTerrainData protected () extends js.Object {
  def this(options: AnonBuffer) = this()
  var waterMask: js.typedarray.Uint8Array | HTMLImageElement | HTMLCanvasElement = js.native
  def createMesh(tilingScheme: TilingScheme, x: Double, y: Double, level: Double): js.Promise[TerrainMesh] = js.native
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
  ): js.Promise[HeightmapTerrainData] = js.native
  def wasCreatedByUpsampling(): Boolean = js.native
}

