package typingsSlinky.openlayers.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.openlayers.mod.Tile.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "ImageTile")
@js.native
class ImageTile protected () extends Tile {
  /**
    * @param tileCoord Tile coordinate.
    * @param state State.
    * @param src Image source URI.
    * @param crossOrigin Cross origin.
    * @param tileLoadFunction Tile load function.
    */
  def this(tileCoord: TileCoord, state: State, src: String) = this()
  def this(tileCoord: TileCoord, state: State, src: String, crossOrigin: String) = this()
  def this(
    tileCoord: TileCoord,
    state: State,
    src: String,
    crossOrigin: js.UndefOr[scala.Nothing],
    tileLoadFunction: TileLoadFunctionType
  ) = this()
  def this(
    tileCoord: TileCoord,
    state: State,
    src: String,
    crossOrigin: String,
    tileLoadFunction: TileLoadFunctionType
  ) = this()
  
  /**
    * Get the image element for this tile.
    * @inheritDoc
    * @api
    */
  def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
  def getImage(opt_context: GlobalObject): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
}
