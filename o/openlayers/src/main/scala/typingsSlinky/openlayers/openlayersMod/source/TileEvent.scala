package typingsSlinky.openlayers.openlayersMod.source

import typingsSlinky.openlayers.openlayersMod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(`type`: String, tile: typingsSlinky.openlayers.openlayersMod.Tile) = this()
  /**
    * The tile related to the event.
    * @api
    */
  var tile: typingsSlinky.openlayers.openlayersMod.Tile = js.native
}

