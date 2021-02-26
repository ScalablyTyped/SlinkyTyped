package typingsSlinky.openlayers.mod.olx

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.openlayers.mod.ColorLike_
import typingsSlinky.openlayers.mod.Color_
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.Size
import typingsSlinky.openlayers.mod.StyleGeometryFunction
import typingsSlinky.openlayers.mod.geom.Geometry
import typingsSlinky.openlayers.mod.style.AtlasManager
import typingsSlinky.openlayers.mod.style.Fill
import typingsSlinky.openlayers.mod.style.IconAnchorUnits
import typingsSlinky.openlayers.mod.style.IconOrigin
import typingsSlinky.openlayers.mod.style.Image
import typingsSlinky.openlayers.mod.style.Stroke
import typingsSlinky.openlayers.mod.style.Text
import typingsSlinky.openlayers.openlayersStrings.point_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object style {
  
  @js.native
  trait AtlasManagerOptions extends StObject {
    
    var initialSize: js.UndefOr[Double] = js.native
    
    var maxSize: js.UndefOr[Double] = js.native
    
    var space: js.UndefOr[Double] = js.native
  }
  object AtlasManagerOptions {
    
    @scala.inline
    def apply(): AtlasManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AtlasManagerOptions]
    }
    
    @scala.inline
    implicit class AtlasManagerOptionsMutableBuilder[Self <: AtlasManagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialSize(value: Double): Self = StObject.set(x, "initialSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSizeUndefined: Self = StObject.set(x, "initialSize", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  @js.native
  trait CircleOptions extends StObject {
    
    var atlasManager: js.UndefOr[AtlasManager] = js.native
    
    var fill: js.UndefOr[Fill] = js.native
    
    var radius: Double = js.native
    
    var snapToPixel: js.UndefOr[Boolean] = js.native
    
    var stroke: js.UndefOr[Stroke] = js.native
  }
  object CircleOptions {
    
    @scala.inline
    def apply(radius: Double): CircleOptions = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleOptions]
    }
    
    @scala.inline
    implicit class CircleOptionsMutableBuilder[Self <: CircleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtlasManager(value: AtlasManager): Self = StObject.set(x, "atlasManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtlasManagerUndefined: Self = StObject.set(x, "atlasManager", js.undefined)
      
      @scala.inline
      def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToPixel(value: Boolean): Self = StObject.set(x, "snapToPixel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToPixelUndefined: Self = StObject.set(x, "snapToPixel", js.undefined)
      
      @scala.inline
      def setStroke(value: Stroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  @js.native
  trait FillOptions extends StObject {
    
    var color: js.UndefOr[Color_ | ColorLike_] = js.native
  }
  object FillOptions {
    
    @scala.inline
    def apply(): FillOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillOptions]
    }
    
    @scala.inline
    implicit class FillOptionsMutableBuilder[Self <: FillOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color_ | ColorLike_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorCanvasGradient(value: CanvasGradient): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorCanvasPattern(value: CanvasPattern): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  @js.native
  trait IconOptions extends StObject {
    
    var anchor: js.UndefOr[js.Array[Double]] = js.native
    
    var anchorOrigin: js.UndefOr[IconOrigin] = js.native
    
    var anchorXUnits: js.UndefOr[IconAnchorUnits] = js.native
    
    var anchorYUnits: js.UndefOr[IconAnchorUnits] = js.native
    
    var color: js.UndefOr[Color_ | String] = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var img: js.UndefOr[HTMLImageElement | HTMLCanvasElement] = js.native
    
    var imgSize: js.UndefOr[Size] = js.native
    
    var offset: js.UndefOr[js.Array[Double]] = js.native
    
    var offsetOrigin: js.UndefOr[IconOrigin] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var rotateWithView: js.UndefOr[Boolean] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Size] = js.native
    
    var snapToPixel: js.UndefOr[Boolean] = js.native
    
    var src: js.UndefOr[String] = js.native
  }
  object IconOptions {
    
    @scala.inline
    def apply(): IconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconOptions]
    }
    
    @scala.inline
    implicit class IconOptionsMutableBuilder[Self <: IconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: js.Array[Double]): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOrigin(value: IconOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAnchorVarargs(value: Double*): Self = StObject.set(x, "anchor", js.Array(value :_*))
      
      @scala.inline
      def setAnchorXUnits(value: IconAnchorUnits): Self = StObject.set(x, "anchorXUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorXUnitsUndefined: Self = StObject.set(x, "anchorXUnits", js.undefined)
      
      @scala.inline
      def setAnchorYUnits(value: IconAnchorUnits): Self = StObject.set(x, "anchorYUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorYUnitsUndefined: Self = StObject.set(x, "anchorYUnits", js.undefined)
      
      @scala.inline
      def setColor(value: Color_ | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setImg(value: HTMLImageElement | HTMLCanvasElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgSize(value: Size): Self = StObject.set(x, "imgSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgSizeUndefined: Self = StObject.set(x, "imgSize", js.undefined)
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetOrigin(value: IconOrigin): Self = StObject.set(x, "offsetOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetOriginUndefined: Self = StObject.set(x, "offsetOrigin", js.undefined)
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSnapToPixel(value: Boolean): Self = StObject.set(x, "snapToPixel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToPixelUndefined: Self = StObject.set(x, "snapToPixel", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  /**
    * Specify radius for regular polygons, or radius1 and radius2 for stars.
    */
  @js.native
  trait RegularShapeOptions extends StObject {
    
    var angle: js.UndefOr[Double] = js.native
    
    var fill: js.UndefOr[Fill] = js.native
    
    var points: Double = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var radius1: js.UndefOr[Double] = js.native
    
    var radius2: js.UndefOr[Double] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var snapToPixel: js.UndefOr[Boolean] = js.native
    
    var stroke: js.UndefOr[Stroke] = js.native
  }
  object RegularShapeOptions {
    
    @scala.inline
    def apply(points: Double): RegularShapeOptions = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegularShapeOptions]
    }
    
    @scala.inline
    implicit class RegularShapeOptionsMutableBuilder[Self <: RegularShapeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius1(value: Double): Self = StObject.set(x, "radius1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius1Undefined: Self = StObject.set(x, "radius1", js.undefined)
      
      @scala.inline
      def setRadius2(value: Double): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setSnapToPixel(value: Boolean): Self = StObject.set(x, "snapToPixel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToPixelUndefined: Self = StObject.set(x, "snapToPixel", js.undefined)
      
      @scala.inline
      def setStroke(value: Stroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  @js.native
  trait StrokeOptions extends StObject {
    
    var color: js.UndefOr[Color_ | String] = js.native
    
    var lineCap: js.UndefOr[String] = js.native
    
    var lineDash: js.UndefOr[js.Array[Double]] = js.native
    
    var lineDashOffset: js.UndefOr[Double] = js.native
    
    var lineJoin: js.UndefOr[String] = js.native
    
    var miterLimit: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object StrokeOptions {
    
    @scala.inline
    def apply(): StrokeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrokeOptions]
    }
    
    @scala.inline
    implicit class StrokeOptionsMutableBuilder[Self <: StrokeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color_ | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      @scala.inline
      def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
      
      @scala.inline
      def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      @scala.inline
      def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
      
      @scala.inline
      def setLineJoin(value: String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      @scala.inline
      def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait StyleOptions extends StObject {
    
    var fill: js.UndefOr[Fill] = js.native
    
    var geometry: js.UndefOr[String | Geometry | StyleGeometryFunction] = js.native
    
    var image: js.UndefOr[Image] = js.native
    
    var stroke: js.UndefOr[Stroke] = js.native
    
    var text: js.UndefOr[Text] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object StyleOptions {
    
    @scala.inline
    def apply(): StyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleOptions]
    }
    
    @scala.inline
    implicit class StyleOptionsMutableBuilder[Self <: StyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGeometry(value: String | Geometry | StyleGeometryFunction): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryFunction1(
        value: /* feature */ Feature | typingsSlinky.openlayers.mod.render.Feature => Geometry | typingsSlinky.openlayers.mod.render.Feature
      ): Self = StObject.set(x, "geometry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      @scala.inline
      def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setStroke(value: Stroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait TextOptions extends StObject {
    
    var backgroundFill: js.UndefOr[Fill] = js.native
    
    var backgroundStroke: js.UndefOr[Stroke] = js.native
    
    var fill: js.UndefOr[Fill] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var maxAngle: js.UndefOr[Boolean] = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var overflow: js.UndefOr[Boolean] = js.native
    
    var padding: js.UndefOr[js.Array[Double]] = js.native
    
    var placement: js.UndefOr[TextPlacement] = js.native
    
    var rotateWithView: js.UndefOr[Boolean] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var stroke: js.UndefOr[Stroke] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var textAlign: js.UndefOr[String] = js.native
    
    var textBaseline: js.UndefOr[String] = js.native
  }
  object TextOptions {
    
    @scala.inline
    def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    @scala.inline
    implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundFill(value: Fill): Self = StObject.set(x, "backgroundFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundFillUndefined: Self = StObject.set(x, "backgroundFill", js.undefined)
      
      @scala.inline
      def setBackgroundStroke(value: Stroke): Self = StObject.set(x, "backgroundStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundStrokeUndefined: Self = StObject.set(x, "backgroundStroke", js.undefined)
      
      @scala.inline
      def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setMaxAngle(value: Boolean): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPlacement(value: TextPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setStroke(value: Stroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /**
    * Text placement. One of `'point'`, `'line'`. Default is `'point'`. Note that
    * `'line'` requires the underlying geometry to be a {@link ol.geom.LineString},
    * {@link ol.geom.Polygon}, {@link ol.geom.MultiLineString} or
    * {@link ol.geom.MultiPolygon}.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openlayers.openlayersStrings.point_
    - typingsSlinky.openlayers.openlayersStrings.line
  */
  trait TextPlacement extends StObject
  object TextPlacement {
    
    @scala.inline
    def line: typingsSlinky.openlayers.openlayersStrings.line = "line".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.line]
    
    @scala.inline
    def point: point_ = "point".asInstanceOf[point_]
  }
}
