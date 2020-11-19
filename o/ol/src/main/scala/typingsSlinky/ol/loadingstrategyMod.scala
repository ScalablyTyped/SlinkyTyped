package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.tilegridTileGridMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/loadingstrategy", JSImport.Namespace)
@js.native
object loadingstrategyMod extends js.Object {
  
  def all(extent: Extent, resolution: Double): js.Array[Extent] = js.native
  
  def bbox(extent: Extent, resolution: Double): js.Array[Extent] = js.native
  
  def tile(tileGrid: default): js.Function2[/* p0 */ Extent, /* p1 */ Double, js.Array[Extent]] = js.native
}
