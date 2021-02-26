package typingsSlinky.openlayers

import typingsSlinky.openlayers.mod.OverlayPositioning
import typingsSlinky.openlayers.mod.RasterOperationType
import typingsSlinky.openlayers.mod.RendererType
import typingsSlinky.openlayers.mod.control.ScaleLine.Units
import typingsSlinky.openlayers.mod.format.IGCZ
import typingsSlinky.openlayers.mod.geom.GeometryLayout
import typingsSlinky.openlayers.mod.geom.GeometryType
import typingsSlinky.openlayers.mod.layer.VectorTileRenderType
import typingsSlinky.openlayers.mod.olx.layer.VectorRenderType
import typingsSlinky.openlayers.mod.olx.style.TextPlacement
import typingsSlinky.openlayers.mod.source.State
import typingsSlinky.openlayers.mod.source.WMTSRequestEncoding
import typingsSlinky.openlayers.mod.source.wms.ServerType
import typingsSlinky.openlayers.mod.style.IconAnchorUnits
import typingsSlinky.openlayers.mod.style.IconOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openlayersStrings {
  
  @js.native
  sealed trait Circle extends GeometryType
  @scala.inline
  def Circle: Circle = "Circle".asInstanceOf[Circle]
  
  @js.native
  sealed trait GeometryCollection extends GeometryType
  @scala.inline
  def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  
  @js.native
  sealed trait KVP extends WMTSRequestEncoding
  @scala.inline
  def KVP: KVP = "KVP".asInstanceOf[KVP]
  
  @js.native
  sealed trait LineString extends GeometryType
  @scala.inline
  def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @js.native
  sealed trait LinearRing extends GeometryType
  @scala.inline
  def LinearRing: LinearRing = "LinearRing".asInstanceOf[LinearRing]
  
  @js.native
  sealed trait MultiLineString extends GeometryType
  @scala.inline
  def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  
  @js.native
  sealed trait MultiPoint extends GeometryType
  @scala.inline
  def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  
  @js.native
  sealed trait MultiPolygon extends GeometryType
  @scala.inline
  def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  
  @js.native
  sealed trait Point extends GeometryType
  @scala.inline
  def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Polygon extends GeometryType
  @scala.inline
  def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  
  @js.native
  sealed trait REST extends WMTSRequestEncoding
  @scala.inline
  def REST: REST = "REST".asInstanceOf[REST]
  
  @js.native
  sealed trait XY extends GeometryLayout
  @scala.inline
  def XY: XY = "XY".asInstanceOf[XY]
  
  @js.native
  sealed trait XYM extends GeometryLayout
  @scala.inline
  def XYM: XYM = "XYM".asInstanceOf[XYM]
  
  @js.native
  sealed trait XYZ extends GeometryLayout
  @scala.inline
  def XYZ: XYZ = "XYZ".asInstanceOf[XYZ]
  
  @js.native
  sealed trait XYZM extends GeometryLayout
  @scala.inline
  def XYZM: XYZM = "XYZM".asInstanceOf[XYZM]
  
  @js.native
  sealed trait barometric extends IGCZ
  @scala.inline
  def barometric: barometric = "barometric".asInstanceOf[barometric]
  
  @js.native
  sealed trait `bottom-center` extends OverlayPositioning
  @scala.inline
  def `bottom-center`: `bottom-center` = "bottom-center".asInstanceOf[`bottom-center`]
  
  @js.native
  sealed trait `bottom-left`
    extends IconOrigin
       with OverlayPositioning
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @js.native
  sealed trait `bottom-right`
    extends IconOrigin
       with OverlayPositioning
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @js.native
  sealed trait canvas extends RendererType
  @scala.inline
  def canvas: canvas = "canvas".asInstanceOf[canvas]
  
  @js.native
  sealed trait carmentaserver extends ServerType
  @scala.inline
  def carmentaserver: carmentaserver = "carmentaserver".asInstanceOf[carmentaserver]
  
  @js.native
  sealed trait `center-center` extends OverlayPositioning
  @scala.inline
  def `center-center`: `center-center` = "center-center".asInstanceOf[`center-center`]
  
  @js.native
  sealed trait `center-left` extends OverlayPositioning
  @scala.inline
  def `center-left`: `center-left` = "center-left".asInstanceOf[`center-left`]
  
  @js.native
  sealed trait `center-right` extends OverlayPositioning
  @scala.inline
  def `center-right`: `center-right` = "center-right".asInstanceOf[`center-right`]
  
  @js.native
  sealed trait degrees
    extends Units
       with typingsSlinky.openlayers.mod.proj.Units
  @scala.inline
  def degrees: degrees = "degrees".asInstanceOf[degrees]
  
  @js.native
  sealed trait dom extends RendererType
  @scala.inline
  def dom: dom = "dom".asInstanceOf[dom]
  
  @js.native
  sealed trait error extends State
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fraction extends IconAnchorUnits
  @scala.inline
  def fraction: fraction = "fraction".asInstanceOf[fraction]
  
  @js.native
  sealed trait ft
    extends typingsSlinky.openlayers.mod.proj.Units
  @scala.inline
  def ft: ft = "ft".asInstanceOf[ft]
  
  @js.native
  sealed trait geoserver extends ServerType
  @scala.inline
  def geoserver: geoserver = "geoserver".asInstanceOf[geoserver]
  
  @js.native
  sealed trait gps extends IGCZ
  @scala.inline
  def gps: gps = "gps".asInstanceOf[gps]
  
  @js.native
  sealed trait hybrid extends VectorTileRenderType
  @scala.inline
  def hybrid: hybrid = "hybrid".asInstanceOf[hybrid]
  
  @js.native
  sealed trait image
    extends RasterOperationType
       with VectorRenderType
       with VectorTileRenderType
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait imperial extends Units
  @scala.inline
  def imperial: imperial = "imperial".asInstanceOf[imperial]
  
  @js.native
  sealed trait line extends TextPlacement
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait loading extends State
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait m
    extends typingsSlinky.openlayers.mod.proj.Units
  @scala.inline
  def m: m = "m".asInstanceOf[m]
  
  @js.native
  sealed trait mapserver extends ServerType
  @scala.inline
  def mapserver: mapserver = "mapserver".asInstanceOf[mapserver]
  
  @js.native
  sealed trait metric extends Units
  @scala.inline
  def metric: metric = "metric".asInstanceOf[metric]
  
  @js.native
  sealed trait nautical extends Units
  @scala.inline
  def nautical: nautical = "nautical".asInstanceOf[nautical]
  
  @js.native
  sealed trait none extends IGCZ
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait pixel extends RasterOperationType
  @scala.inline
  def pixel: pixel = "pixel".asInstanceOf[pixel]
  
  @js.native
  sealed trait pixels
    extends IconAnchorUnits
       with typingsSlinky.openlayers.mod.proj.Units
  @scala.inline
  def pixels: pixels = "pixels".asInstanceOf[pixels]
  
  @js.native
  sealed trait point_ extends TextPlacement
  @scala.inline
  def point_ : point_ = "point".asInstanceOf[point_]
  
  @js.native
  sealed trait qgis extends ServerType
  @scala.inline
  def qgis: qgis = "qgis".asInstanceOf[qgis]
  
  @js.native
  sealed trait ready extends State
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait `tile-pixels`
    extends typingsSlinky.openlayers.mod.proj.Units
  @scala.inline
  def `tile-pixels`: `tile-pixels` = "tile-pixels".asInstanceOf[`tile-pixels`]
  
  @js.native
  sealed trait `top-center` extends OverlayPositioning
  @scala.inline
  def `top-center`: `top-center` = "top-center".asInstanceOf[`top-center`]
  
  @js.native
  sealed trait `top-left`
    extends IconOrigin
       with OverlayPositioning
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right`
    extends IconOrigin
       with OverlayPositioning
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait undefined extends State
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait us extends Units
  @scala.inline
  def us: us = "us".asInstanceOf[us]
  
  @js.native
  sealed trait `us-ft`
    extends typingsSlinky.openlayers.mod.proj.Units
  @scala.inline
  def `us-ft`: `us-ft` = "us-ft".asInstanceOf[`us-ft`]
  
  @js.native
  sealed trait vector
    extends VectorRenderType
       with VectorTileRenderType
  @scala.inline
  def vector: vector = "vector".asInstanceOf[vector]
  
  @js.native
  sealed trait webgl extends RendererType
  @scala.inline
  def webgl: webgl = "webgl".asInstanceOf[webgl]
}
