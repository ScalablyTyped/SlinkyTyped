package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CesiumTerrainProvider")
@js.native
class CesiumTerrainProvider protected () extends TerrainProvider {
  def this(options: typingsSlinky.cesium.anon.Ellipsoid) = this()
  
  var requestVertexNormals: Boolean = js.native
  
  var requestWaterMask: Boolean = js.native
}
