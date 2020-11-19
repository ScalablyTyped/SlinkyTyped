package typingsSlinky.ol.utfgridMod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/UTFGrid", "CustomTile")
@js.native
class CustomTile protected ()
  extends typingsSlinky.ol.olTileMod.default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    extent: Extent,
    preemptive: Boolean,
    jsonp: Boolean
  ) = this()
  
  def forDataAtCoordinate(coordinate: Coordinate, callback: js.Function1[/* p0 */ js.Any, Unit]): Unit = js.native
  def forDataAtCoordinate(coordinate: Coordinate, callback: js.Function1[/* p0 */ js.Any, Unit], opt_request: Boolean): Unit = js.native
  
  def getData(coordinate: Coordinate): js.Any = js.native
  
  def getImage(): HTMLImageElement = js.native
}
