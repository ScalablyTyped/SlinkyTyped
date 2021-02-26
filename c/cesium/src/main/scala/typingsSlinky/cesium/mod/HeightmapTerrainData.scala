package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.cesium.anon.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "HeightmapTerrainData")
@js.native
class HeightmapTerrainData protected () extends StObject {
  def this(options: Buffer) = this()
  
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
  
  var waterMask: js.typedarray.Uint8Array | HTMLImageElement | HTMLCanvasElement = js.native
}
