package typingsSlinky.bingmaps.global.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.IHeatMapLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.HeatMapLayer")
@js.native
class HeatMapLayer protected ()
  extends typingsSlinky.bingmaps.Microsoft.Maps.HeatMapLayer {
  /**
    * @constructor
    * @requires The Microsoft.Maps.Heatmap module.
    * @param locations Set of locations to visualize as a heat map.
    * @param options Options for customizing how the heat map is rendered.
    */
  def this(locations: js.Array[
        typingsSlinky.bingmaps.Microsoft.Maps.Location | typingsSlinky.bingmaps.Microsoft.Maps.Pushpin
      ]) = this()
  def this(
    locations: js.Array[
        typingsSlinky.bingmaps.Microsoft.Maps.Location | typingsSlinky.bingmaps.Microsoft.Maps.Pushpin
      ],
    options: IHeatMapLayerOptions
  ) = this()
}
