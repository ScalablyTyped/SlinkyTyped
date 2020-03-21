package typingsSlinky.cesium.mod

import typingsSlinky.cesium.AnonEllipsoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CesiumTerrainProvider")
@js.native
class CesiumTerrainProvider protected () extends TerrainProvider {
  def this(options: AnonEllipsoid) = this()
  var requestVertexNormals: Boolean = js.native
  var requestWaterMask: Boolean = js.native
}

