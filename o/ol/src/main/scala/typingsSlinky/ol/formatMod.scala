package typingsSlinky.ol

import typingsSlinky.ol.formatEsriJSONMod.Options
import typingsSlinky.ol.formatEsriJSONMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format", JSImport.Namespace)
@js.native
object formatMod extends js.Object {
  @js.native
  class EsriJSON () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class GPX ()
    extends typingsSlinky.ol.formatGPXMod.default {
    def this(opt_options: typingsSlinky.ol.formatGPXMod.Options) = this()
  }
  
  @js.native
  class GeoJSON ()
    extends typingsSlinky.ol.formatGeoJSONMod.default {
    def this(opt_options: typingsSlinky.ol.formatGeoJSONMod.Options) = this()
  }
  
  @js.native
  class IGC ()
    extends typingsSlinky.ol.formatIGCMod.default {
    def this(opt_options: typingsSlinky.ol.formatIGCMod.Options) = this()
  }
  
  @js.native
  class KML ()
    extends typingsSlinky.ol.formatKMLMod.default {
    def this(opt_options: typingsSlinky.ol.formatKMLMod.Options) = this()
  }
  
  @js.native
  class MVT ()
    extends typingsSlinky.ol.formatMVTMod.default {
    def this(opt_options: typingsSlinky.ol.formatMVTMod.Options) = this()
  }
  
  @js.native
  class OWS ()
    extends typingsSlinky.ol.formatOWSMod.default
  
  @js.native
  class Polyline ()
    extends typingsSlinky.ol.formatPolylineMod.default {
    def this(opt_options: typingsSlinky.ol.formatPolylineMod.Options) = this()
  }
  
  @js.native
  class TopoJSON ()
    extends typingsSlinky.ol.formatTopoJSONMod.default {
    def this(opt_options: typingsSlinky.ol.formatTopoJSONMod.Options) = this()
  }
  
  @js.native
  class WFS ()
    extends typingsSlinky.ol.formatWFSMod.default {
    def this(opt_options: typingsSlinky.ol.formatWFSMod.Options) = this()
  }
  
  @js.native
  class WKT ()
    extends typingsSlinky.ol.formatWKTMod.default {
    def this(opt_options: typingsSlinky.ol.formatWKTMod.Options) = this()
  }
  
  @js.native
  class WMSCapabilities ()
    extends typingsSlinky.ol.formatWMSCapabilitiesMod.default
  
  @js.native
  class WMSGetFeatureInfo ()
    extends typingsSlinky.ol.formatWMSGetFeatureInfoMod.default {
    def this(opt_options: typingsSlinky.ol.formatWMSGetFeatureInfoMod.Options) = this()
  }
  
  @js.native
  class WMTSCapabilities ()
    extends typingsSlinky.ol.formatWMTSCapabilitiesMod.default
  
  val GML: typingsSlinky.ol.formatGML3Mod.default = js.native
}

