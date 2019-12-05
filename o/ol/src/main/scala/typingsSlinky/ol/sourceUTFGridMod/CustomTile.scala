package typingsSlinky.ol.sourceUTFGridMod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/UTFGrid", "CustomTile")
@js.native
class CustomTile protected ()
  extends typingsSlinky.ol.tileMod.default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    extent: Extent,
    preemptive: Boolean,
    jsonp: Boolean
  ) = this()
  def forDataAtCoordinate[T](coordinate: Coordinate, callback: js.ThisFunction1[/* this */ T, /* p0 */ js.Any, Unit]): Unit = js.native
  def forDataAtCoordinate[T](
    coordinate: Coordinate,
    callback: js.ThisFunction1[/* this */ T, /* p0 */ js.Any, Unit],
    opt_this: T
  ): Unit = js.native
  def forDataAtCoordinate[T](
    coordinate: Coordinate,
    callback: js.ThisFunction1[/* this */ T, /* p0 */ js.Any, Unit],
    opt_this: T,
    opt_request: Boolean
  ): Unit = js.native
  def getData(coordinate: Coordinate): js.Any = js.native
  def getImage(): HTMLImageElement = js.native
}

