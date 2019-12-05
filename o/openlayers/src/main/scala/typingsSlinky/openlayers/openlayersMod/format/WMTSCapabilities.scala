package typingsSlinky.openlayers.openlayersMod.format

import typingsSlinky.openlayers.openlayersMod.GlobalObject
import typingsSlinky.std.Document
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Format for reading WMTS capabilities data.
  *
  * @api
  */
@JSImport("openlayers", "format.WMTSCapabilities")
@js.native
/**
  * @classdesc
  * Format for reading WMTS capabilities data.
  *
  * @api
  */
class WMTSCapabilities () extends XML {
  def read(source: String): GlobalObject = js.native
  /**
    * Read a WMTS capabilities document.
    *
    * @param source The XML source.
    * @return An object representing the WMTS capabilities.
    * @api
    */
  def read(source: Document): GlobalObject = js.native
  def read(source: Node): GlobalObject = js.native
}

