package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TerrainProvider")
@js.native
abstract class TerrainProvider () extends StObject {
  
  var availability: TileAvailability = js.native
  
  var credit: Credit = js.native
  
  var errorEvent: Event[js.Array[_]] = js.native
  
  def getLevelMaximumGeometricError(level: Double): Double = js.native
  
  def getTileDataAvailable(x: Double, y: Double, level: Double): Boolean = js.native
  
  var hasVertexNormals: Boolean = js.native
  
  var hasWaterMask: Boolean = js.native
  
  var ready: Boolean = js.native
  
  val readyPromise: js.Promise[Boolean] = js.native
  
  def requestTileGeometry(x: Double, y: Double, level: Double): js.Promise[TerrainData] = js.native
  def requestTileGeometry(x: Double, y: Double, level: Double, throttleRequests: Boolean): js.Promise[TerrainData] = js.native
  
  var tilingScheme: TilingScheme = js.native
}
object TerrainProvider {
  
  @JSImport("cesium", "TerrainProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "TerrainProvider.getEstimatedLevelZeroGeometricErrorForAHeightmap")
  @js.native
  def getEstimatedLevelZeroGeometricErrorForAHeightmap(ellipsoid: Ellipsoid, tileImageWidth: Double, numberOfTilesAtLevelZero: Double): Double = js.native
  
  /* static member */
  @JSImport("cesium", "TerrainProvider.getRegularGridIndices")
  @js.native
  def getRegularGridIndices(width: Double, height: Double): js.typedarray.Uint16Array = js.native
  
  /* static member */
  @JSImport("cesium", "TerrainProvider.heightmapTerrainQuality")
  @js.native
  def heightmapTerrainQuality: Double = js.native
  @scala.inline
  def heightmapTerrainQuality_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heightmapTerrainQuality")(x.asInstanceOf[js.Any])
}
