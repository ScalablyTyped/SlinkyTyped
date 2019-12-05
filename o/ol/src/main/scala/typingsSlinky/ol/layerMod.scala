package typingsSlinky.ol

import typingsSlinky.ol.layerGroupMod.Options
import typingsSlinky.ol.layerGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer", JSImport.Namespace)
@js.native
object layerMod extends js.Object {
  @js.native
  class Group () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class Heatmap ()
    extends typingsSlinky.ol.layerHeatmapMod.default {
    def this(opt_options: typingsSlinky.ol.layerHeatmapMod.Options) = this()
  }
  
  @js.native
  class Image ()
    extends typingsSlinky.ol.layerImageMod.default {
    def this(opt_options: typingsSlinky.ol.layerImageMod.Options) = this()
  }
  
  @js.native
  class Layer protected ()
    extends typingsSlinky.ol.layerLayerMod.default {
    def this(options: typingsSlinky.ol.layerLayerMod.Options) = this()
  }
  
  @js.native
  class Tile ()
    extends typingsSlinky.ol.layerTileMod.default {
    def this(opt_options: typingsSlinky.ol.layerTileMod.Options) = this()
  }
  
  @js.native
  class Vector ()
    extends typingsSlinky.ol.layerVectorMod.default {
    def this(opt_options: typingsSlinky.ol.layerVectorMod.Options) = this()
  }
  
  @js.native
  class VectorTile ()
    extends typingsSlinky.ol.layerVectorTileMod.default {
    def this(opt_options: typingsSlinky.ol.layerVectorTileMod.Options) = this()
  }
  
}

