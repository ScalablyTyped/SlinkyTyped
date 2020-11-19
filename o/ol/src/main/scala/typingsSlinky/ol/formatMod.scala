package typingsSlinky.ol

import typingsSlinky.ol.esriJSONMod.default
import typingsSlinky.ol.gmlbaseMod.Options
import typingsSlinky.ol.iiifinfoMod.ImageInformationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/format", JSImport.Namespace)
@js.native
object formatMod extends js.Object {
  
  def GML(): Unit = js.native
  def GML(opt_options: Options): Unit = js.native
  
  @js.native
  class EsriJSON () extends default {
    def this(opt_options: typingsSlinky.ol.esriJSONMod.Options) = this()
  }
  
  @js.native
  class GPX ()
    extends typingsSlinky.ol.gpxMod.default {
    def this(opt_options: typingsSlinky.ol.gpxMod.Options) = this()
  }
  
  @js.native
  class GeoJSON ()
    extends typingsSlinky.ol.geoJSONMod.default {
    def this(opt_options: typingsSlinky.ol.geoJSONMod.Options) = this()
  }
  
  @js.native
  class IGC ()
    extends typingsSlinky.ol.igcMod.default {
    def this(opt_options: typingsSlinky.ol.igcMod.Options) = this()
  }
  
  @js.native
  class IIIFInfo protected ()
    extends typingsSlinky.ol.iiifinfoMod.default {
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  @js.native
  class KML ()
    extends typingsSlinky.ol.kmlMod.default {
    def this(opt_options: typingsSlinky.ol.kmlMod.Options) = this()
  }
  
  @js.native
  class MVT ()
    extends typingsSlinky.ol.mvtMod.default {
    def this(opt_options: typingsSlinky.ol.mvtMod.Options) = this()
  }
  
  @js.native
  class OWS ()
    extends typingsSlinky.ol.owsMod.default
  
  @js.native
  class Polyline ()
    extends typingsSlinky.ol.polylineMod.default {
    def this(opt_options: typingsSlinky.ol.polylineMod.Options) = this()
  }
  
  @js.native
  class TopoJSON ()
    extends typingsSlinky.ol.topoJSONMod.default {
    def this(opt_options: typingsSlinky.ol.topoJSONMod.Options) = this()
  }
  
  @js.native
  class WFS ()
    extends typingsSlinky.ol.wfsMod.default {
    def this(opt_options: typingsSlinky.ol.wfsMod.Options) = this()
  }
  
  @js.native
  class WKT ()
    extends typingsSlinky.ol.wktMod.default {
    def this(opt_options: typingsSlinky.ol.wktMod.Options) = this()
  }
  
  @js.native
  class WMSCapabilities ()
    extends typingsSlinky.ol.wmscapabilitiesMod.default
  
  @js.native
  class WMSGetFeatureInfo ()
    extends typingsSlinky.ol.wmsgetfeatureinfoMod.default {
    def this(opt_options: typingsSlinky.ol.wmsgetfeatureinfoMod.Options) = this()
  }
  
  @js.native
  class WMTSCapabilities ()
    extends typingsSlinky.ol.wmtscapabilitiesMod.default
}
