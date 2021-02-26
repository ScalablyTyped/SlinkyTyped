package typingsSlinky.ol

import typingsSlinky.ol.esriJSONMod.Options
import typingsSlinky.ol.esriJSONMod.default
import typingsSlinky.ol.iiifinfoMod.ImageInformationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("ol/format", "EsriJSON")
  @js.native
  class EsriJSON () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/format", "GML")
  @js.native
  def GML(): Unit = js.native
  @JSImport("ol/format", "GML")
  @js.native
  def GML(opt_options: typingsSlinky.ol.gmlbaseMod.Options): Unit = js.native
  
  @JSImport("ol/format", "GPX")
  @js.native
  class GPX ()
    extends typingsSlinky.ol.gpxMod.default {
    def this(opt_options: typingsSlinky.ol.gpxMod.Options) = this()
  }
  
  @JSImport("ol/format", "GeoJSON")
  @js.native
  class GeoJSON ()
    extends typingsSlinky.ol.geoJSONMod.default {
    def this(opt_options: typingsSlinky.ol.geoJSONMod.Options) = this()
  }
  
  @JSImport("ol/format", "IGC")
  @js.native
  class IGC ()
    extends typingsSlinky.ol.igcMod.default {
    def this(opt_options: typingsSlinky.ol.igcMod.Options) = this()
  }
  
  @JSImport("ol/format", "IIIFInfo")
  @js.native
  class IIIFInfo protected ()
    extends typingsSlinky.ol.iiifinfoMod.default {
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  @JSImport("ol/format", "KML")
  @js.native
  class KML ()
    extends typingsSlinky.ol.kmlMod.default {
    def this(opt_options: typingsSlinky.ol.kmlMod.Options) = this()
  }
  
  @JSImport("ol/format", "MVT")
  @js.native
  class MVT ()
    extends typingsSlinky.ol.mvtMod.default {
    def this(opt_options: typingsSlinky.ol.mvtMod.Options) = this()
  }
  
  @JSImport("ol/format", "OWS")
  @js.native
  class OWS ()
    extends typingsSlinky.ol.owsMod.default
  
  @JSImport("ol/format", "Polyline")
  @js.native
  class Polyline ()
    extends typingsSlinky.ol.polylineMod.default {
    def this(opt_options: typingsSlinky.ol.polylineMod.Options) = this()
  }
  
  @JSImport("ol/format", "TopoJSON")
  @js.native
  class TopoJSON ()
    extends typingsSlinky.ol.topoJSONMod.default {
    def this(opt_options: typingsSlinky.ol.topoJSONMod.Options) = this()
  }
  
  @JSImport("ol/format", "WFS")
  @js.native
  class WFS ()
    extends typingsSlinky.ol.wfsMod.default {
    def this(opt_options: typingsSlinky.ol.wfsMod.Options) = this()
  }
  
  @JSImport("ol/format", "WKT")
  @js.native
  class WKT ()
    extends typingsSlinky.ol.wktMod.default {
    def this(opt_options: typingsSlinky.ol.wktMod.Options) = this()
  }
  
  @JSImport("ol/format", "WMSCapabilities")
  @js.native
  class WMSCapabilities ()
    extends typingsSlinky.ol.wmscapabilitiesMod.default
  
  @JSImport("ol/format", "WMSGetFeatureInfo")
  @js.native
  class WMSGetFeatureInfo ()
    extends typingsSlinky.ol.wmsgetfeatureinfoMod.default {
    def this(opt_options: typingsSlinky.ol.wmsgetfeatureinfoMod.Options) = this()
  }
  
  @JSImport("ol/format", "WMTSCapabilities")
  @js.native
  class WMTSCapabilities ()
    extends typingsSlinky.ol.wmtscapabilitiesMod.default
}
