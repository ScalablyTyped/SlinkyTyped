package typingsSlinky.openlayers.mod.source

import typingsSlinky.openlayers.mod.Attribution
import typingsSlinky.openlayers.mod.olx.source.BingMapsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Layer source for Bing Maps tile data.
  *
  * @param options Bing Maps options.
  * @api stable
  */
@JSImport("openlayers", "source.BingMaps")
@js.native
class BingMaps protected () extends TileImage {
  /**
    * @classdesc
    * Layer source for Bing Maps tile data.
    *
    * @param options Bing Maps options.
    * @api stable
    */
  def this(options: BingMapsOptions) = this()
}
/* static members */
@JSImport("openlayers", "source.BingMaps")
@js.native
object BingMaps extends js.Object {
  
  /**
    * The attribution containing a link to the Microsoft® Bing™ Maps Platform APIs’
    * Terms Of Use.
    * @const
    * @api
    */
  var TOS_ATTRIBUTION: Attribution = js.native
}
