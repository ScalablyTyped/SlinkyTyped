package typingsSlinky.openlayers.mod.format

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import typingsSlinky.openlayers.mod.GlobalObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
