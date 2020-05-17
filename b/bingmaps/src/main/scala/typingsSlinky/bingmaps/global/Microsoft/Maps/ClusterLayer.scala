package typingsSlinky.bingmaps.global.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.IClusterLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.ClusterLayer")
@js.native
class ClusterLayer protected ()
  extends typingsSlinky.bingmaps.Microsoft.Maps.ClusterLayer {
  /**
    * @constructor
    * @requires The Microsoft.Maps.Clustering module.
    * @param pushpins An array of pushpins to cluster in the layer.
    * @param options The options used to customize how the ClusterLayer functions.
    */
  def this(pushpins: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Pushpin]) = this()
  def this(pushpins: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Pushpin], options: IClusterLayerOptions) = this()
}

