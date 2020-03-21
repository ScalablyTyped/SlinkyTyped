package typingsSlinky.ol

import typingsSlinky.ol.groupMod.Options
import typingsSlinky.ol.groupMod.default
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
    extends typingsSlinky.ol.heatmapMod.default {
    def this(opt_options: typingsSlinky.ol.heatmapMod.Options) = this()
  }
  
  @js.native
  class Image ()
    extends typingsSlinky.ol.imageMod.default {
    def this(opt_options: typingsSlinky.ol.baseImageMod.Options) = this()
  }
  
  @js.native
  class Layer[SourceType /* <: typingsSlinky.ol.sourceSourceMod.default */] protected ()
    extends typingsSlinky.ol.layerLayerMod.default[SourceType] {
    def this(options: typingsSlinky.ol.layerLayerMod.Options) = this()
  }
  
  @js.native
  class Tile ()
    extends typingsSlinky.ol.tileMod.default {
    def this(opt_options: typingsSlinky.ol.baseTileMod.Options) = this()
  }
  
  @js.native
  class Vector ()
    extends typingsSlinky.ol.vectorMod.default {
    def this(opt_options: typingsSlinky.ol.baseVectorMod.Options) = this()
  }
  
  @js.native
  class VectorImage ()
    extends typingsSlinky.ol.vectorImageMod.default {
    def this(opt_options: typingsSlinky.ol.vectorImageMod.Options) = this()
  }
  
  @js.native
  class VectorTile ()
    extends typingsSlinky.ol.vectorTileMod.default {
    def this(opt_options: typingsSlinky.ol.vectorTileMod.Options) = this()
  }
  
}

