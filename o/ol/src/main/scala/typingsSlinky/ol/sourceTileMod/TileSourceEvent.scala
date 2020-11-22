package typingsSlinky.ol.sourceTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/Tile", "TileSourceEvent")
@js.native
class TileSourceEvent protected ()
  extends typingsSlinky.ol.eventMod.default {
  def this(`type`: String, tile: typingsSlinky.ol.olTileMod.default) = this()
  
  /**
    * The tile related to the event.
    */
  var tile: typingsSlinky.ol.olTileMod.default = js.native
}
