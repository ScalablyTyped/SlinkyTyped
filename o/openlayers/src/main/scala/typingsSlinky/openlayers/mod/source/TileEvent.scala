package typingsSlinky.openlayers.mod.source

import typingsSlinky.openlayers.mod.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Events emitted by {@link ol.source.Tile} instances are instances of this
  * type.
  *
  * @param type Type.
  * @param tile The tile.
  */
@JSImport("openlayers", "source.TileEvent")
@js.native
class TileEvent protected () extends Event {
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Tile} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param tile The tile.
    */
  def this(`type`: String, tile: typingsSlinky.openlayers.mod.Tile) = this()
  
  /**
    * The tile related to the event.
    * @api
    */
  var tile: typingsSlinky.openlayers.mod.Tile = js.native
}
