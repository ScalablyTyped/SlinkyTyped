package typingsSlinky.ol

import typingsSlinky.ol.graticuleMod.Options
import typingsSlinky.ol.graticuleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("ol/layer", "Graticule")
  @js.native
  class Graticule () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/layer", "Group")
  @js.native
  class Group ()
    extends typingsSlinky.ol.groupMod.default {
    def this(opt_options: typingsSlinky.ol.groupMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Heatmap")
  @js.native
  class Heatmap ()
    extends typingsSlinky.ol.heatmapMod.default {
    def this(opt_options: typingsSlinky.ol.heatmapMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Image")
  @js.native
  class Image ()
    extends typingsSlinky.ol.imageMod.default {
    def this(opt_options: typingsSlinky.ol.baseImageMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Layer")
  @js.native
  class Layer[SourceType /* <: typingsSlinky.ol.sourceSourceMod.default */] protected ()
    extends typingsSlinky.ol.layerLayerMod.default[SourceType] {
    def this(options: typingsSlinky.ol.layerLayerMod.Options) = this()
  }
  
  @JSImport("ol/layer", "MapboxVector")
  @js.native
  class MapboxVector protected ()
    extends typingsSlinky.ol.mapboxVectorMod.default {
    def this(options: typingsSlinky.ol.mapboxVectorMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Tile")
  @js.native
  class Tile ()
    extends typingsSlinky.ol.tileMod.default {
    def this(opt_options: typingsSlinky.ol.baseTileMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Vector")
  @js.native
  class Vector ()
    extends typingsSlinky.ol.vectorMod.default {
    def this(opt_options: typingsSlinky.ol.baseVectorMod.Options) = this()
  }
  
  @JSImport("ol/layer", "VectorImage")
  @js.native
  class VectorImage ()
    extends typingsSlinky.ol.vectorImageMod.default {
    def this(opt_options: typingsSlinky.ol.vectorImageMod.Options) = this()
  }
  
  @JSImport("ol/layer", "VectorTile")
  @js.native
  class VectorTile ()
    extends typingsSlinky.ol.vectorTileMod.default {
    def this(opt_options: typingsSlinky.ol.vectorTileMod.Options) = this()
  }
  
  @JSImport("ol/layer", "WebGLPoints")
  @js.native
  class WebGLPoints protected ()
    extends typingsSlinky.ol.webGLPointsMod.default {
    def this(options: typingsSlinky.ol.webGLPointsMod.Options) = this()
  }
}
