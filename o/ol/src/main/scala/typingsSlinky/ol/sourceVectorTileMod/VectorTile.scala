package typingsSlinky.ol.sourceVectorTileMod

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorTile
  extends typingsSlinky.ol.urlTileMod.default {
  
  def getFeaturesInExtent(extent: Extent): js.Array[FeatureLike] = js.native
  
  def getOverlaps(): Boolean = js.native
  
  def getSourceTiles(
    pixelRatio: Double,
    projection: typingsSlinky.ol.projectionMod.default,
    tile: typingsSlinky.ol.vectorRenderTileMod.default
  ): js.Array[typingsSlinky.ol.olVectorTileMod.default] = js.native
  
  var tileClass: typingsSlinky.ol.olVectorTileMod.default = js.native
}
