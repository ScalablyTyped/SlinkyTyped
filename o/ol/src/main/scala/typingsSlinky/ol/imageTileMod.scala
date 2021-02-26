package typingsSlinky.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.ol.olTileMod.LoadFunction
import typingsSlinky.ol.olTileMod.Options
import typingsSlinky.ol.tileStateMod.TileState
import typingsSlinky.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageTileMod {
  
  @JSImport("ol/ImageTile", JSImport.Default)
  @js.native
  class default protected () extends ImageTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: LoadFunction,
      opt_options: Options
    ) = this()
  }
  
  @js.native
  trait ImageTile
    extends typingsSlinky.ol.olTileMod.default {
    
    /**
      * Get the HTML image element for this tile (may be a Canvas, Image, or Video).
      */
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
  }
}
