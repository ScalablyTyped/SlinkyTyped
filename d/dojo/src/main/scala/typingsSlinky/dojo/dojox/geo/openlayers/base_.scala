package typingsSlinky.dojo.dojox.geo.openlayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.html
  *
  *
  */
@js.native
trait base_ extends js.Object {
  /**
    * Defines the base layer types to be used at Map construction time or
    * with the setBaseLayerType function.
    *
    */
  var BaseLayerType: js.Object = js.native
  /**
    *
    */
  var EPSG4326: js.Object = js.native
  /**
    *
    */
  var GreatCircle: js.Object = js.native
  /**
    *
    */
  var widget: js.Object = js.native
  /**
    *
    */
  def Collection(): Unit = js.native
  /**
    *
    */
  def Feature(): Unit = js.native
  /**
    *
    */
  def Geometry(): Unit = js.native
  /**
    *
    */
  def GeometryFeature(): Unit = js.native
  /**
    *
    */
  def GfxLayer(): Unit = js.native
  /**
    *
    */
  def JsonImport(): Unit = js.native
  /**
    *
    */
  def Layer(): Unit = js.native
  /**
    *
    */
  def LineString(): Unit = js.native
  /**
    *
    */
  def Map(): Unit = js.native
  /**
    *
    */
  def Point(): Unit = js.native
  /**
    *
    */
  def TouchInteractionSupport(): Unit = js.native
  /**
    *
    */
  def WidgetFeature(): Unit = js.native
  /**
    * Parses the specified string and returns degree minute second or decimal degree.
    * Parses the specified string and returns degree minute second or decimal degree.
    *
    * @param v The string to parse
    * @param toDecimal Specifies if the result should be returned in decimal degrees or in an arraycontaining the degrees, minutes, seconds values.
    */
  def parseDMS(v: String, toDecimal: Boolean): Double = js.native
}

object base_ {
  @scala.inline
  def apply(
    BaseLayerType: js.Object,
    Collection: () => Unit,
    EPSG4326: js.Object,
    Feature: () => Unit,
    Geometry: () => Unit,
    GeometryFeature: () => Unit,
    GfxLayer: () => Unit,
    GreatCircle: js.Object,
    JsonImport: () => Unit,
    Layer: () => Unit,
    LineString: () => Unit,
    Map: () => Unit,
    Point: () => Unit,
    TouchInteractionSupport: () => Unit,
    WidgetFeature: () => Unit,
    parseDMS: (String, Boolean) => Double,
    widget: js.Object
  ): base_ = {
    val __obj = js.Dynamic.literal(BaseLayerType = BaseLayerType.asInstanceOf[js.Any], Collection = js.Any.fromFunction0(Collection), EPSG4326 = EPSG4326.asInstanceOf[js.Any], Feature = js.Any.fromFunction0(Feature), Geometry = js.Any.fromFunction0(Geometry), GeometryFeature = js.Any.fromFunction0(GeometryFeature), GfxLayer = js.Any.fromFunction0(GfxLayer), GreatCircle = GreatCircle.asInstanceOf[js.Any], JsonImport = js.Any.fromFunction0(JsonImport), Layer = js.Any.fromFunction0(Layer), LineString = js.Any.fromFunction0(LineString), Map = js.Any.fromFunction0(Map), Point = js.Any.fromFunction0(Point), TouchInteractionSupport = js.Any.fromFunction0(TouchInteractionSupport), WidgetFeature = js.Any.fromFunction0(WidgetFeature), parseDMS = js.Any.fromFunction2(parseDMS), widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[base_]
  }
  @scala.inline
  implicit class base_Ops[Self <: base_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseLayerType(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseLayerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Collection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEPSG4326(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EPSG4326")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeature(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Feature")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGeometry(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGeometryFeature(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeometryFeature")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGfxLayer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GfxLayer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGreatCircle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreatCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonImport(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonImport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLayer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Layer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLineString(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Map")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPoint(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Point")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTouchInteractionSupport(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TouchInteractionSupport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidgetFeature(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidgetFeature")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParseDMS(value: (String, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDMS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWidget(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

