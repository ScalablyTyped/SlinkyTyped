package typingsSlinky.openlayers.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.openlayers.mod.geom.Geometry
import typingsSlinky.openlayers.mod.olx.style.AtlasManagerOptions
import typingsSlinky.openlayers.mod.olx.style.CircleOptions
import typingsSlinky.openlayers.mod.olx.style.FillOptions
import typingsSlinky.openlayers.mod.olx.style.IconOptions
import typingsSlinky.openlayers.mod.olx.style.RegularShapeOptions
import typingsSlinky.openlayers.mod.olx.style.StrokeOptions
import typingsSlinky.openlayers.mod.olx.style.StyleOptions
import typingsSlinky.openlayers.mod.olx.style.TextOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object style {
  
  /**
    * Manages the creation of image atlases.
    *
    * Images added to this manager will be inserted into an atlas, which
    * will be used for rendering.
    * The `size` given in the constructor is the size for the first
    * atlas. After that, when new atlases are created, they will have
    * twice the size as the latest atlas (until `maxSize` is reached).
    *
    * If an application uses many images or very large images, it is recommended
    * to set a higher `size` value to avoid the creation of too many atlases.
    *
    * @struct
    * @api
    * @param opt_options Options.
    */
  /* tslint:disable-next-line:no-unnecessary-class */
  @JSImport("openlayers", "style.AtlasManager")
  @js.native
  /**
    * Manages the creation of image atlases.
    *
    * Images added to this manager will be inserted into an atlas, which
    * will be used for rendering.
    * The `size` given in the constructor is the size for the first
    * atlas. After that, when new atlases are created, they will have
    * twice the size as the latest atlas (until `maxSize` is reached).
    *
    * If an application uses many images or very large images, it is recommended
    * to set a higher `size` value to avoid the creation of too many atlases.
    *
    * @struct
    * @api
    * @param opt_options Options.
    */
  class AtlasManager () extends StObject {
    def this(opt_options: AtlasManagerOptions) = this()
  }
  
  /**
    * @classdesc
    * Set circle style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @JSImport("openlayers", "style.Circle")
  @js.native
  /**
    * @classdesc
    * Set circle style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  class Circle ()
    extends typingsSlinky.openlayers.mod.style.Image {
    def this(opt_options: CircleOptions) = this()
    
    /**
      * Get the fill style for the circle.
      * @return Fill style.
      * @api
      */
    def getFill(): Fill = js.native
    
    /**
      * Get the image used to render the circle.
      * @param pixelRatio Pixel ratio.
      * @return Canvas element.
      * @api
      */
    def getImage(pixelRatio: Double): HTMLCanvasElement = js.native
    
    /**
      * Get the circle radius.
      * @return Radius.
      * @api
      */
    def getRadius(): Double = js.native
    
    /**
      * Get the stroke style for the circle.
      * @return Stroke style.
      * @api
      */
    def getStroke(): Stroke = js.native
    
    /**
      * Set the circle radius.
      *
      * @param radius Circle radius.
      * @api
      */
    def setRadius(radius: Double): Unit = js.native
  }
  
  /**
    * @classdesc
    * Set fill style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @JSImport("openlayers", "style.Fill")
  @js.native
  /**
    * @classdesc
    * Set fill style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  class Fill () extends StObject {
    def this(opt_options: FillOptions) = this()
    
    /**
      * Get the fill color.
      * @return Color.
      * @api
      */
    def getColor(): Color_ | ColorLike_ = js.native
    
    /**
      * Set the color.
      *
      * @param color Color.
      * @api
      */
    def setColor(color: ColorLike_ | Color_): Unit = js.native
  }
  
  /**
    * @classdesc
    * Set icon style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @JSImport("openlayers", "style.Icon")
  @js.native
  /**
    * @classdesc
    * Set icon style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  class Icon ()
    extends typingsSlinky.openlayers.mod.style.Image {
    def this(opt_options: IconOptions) = this()
    
    /**
      * @inheritDoc
      * @api
      */
    def getAnchor(): js.Array[Double] = js.native
    
    /**
      * Get the image icon.
      * @param pixelRatio Pixel ratio.
      * @return Image or Canvas element.
      * @api
      */
    def getImage(pixelRatio: Double): typingsSlinky.openlayers.mod.style.Image | HTMLCanvasElement = js.native
    
    /**
      * @inheritDoc
      * @api
      */
    def getOrigin(): js.Array[Double] = js.native
    
    /**
      * @inheritDoc
      * @api
      */
    def getSize(): Size = js.native
    
    /**
      * Get the image URL.
      * @return Image src.
      * @api
      */
    def getSrc(): String = js.native
    
    /**
      * Load not yet loaded URI.
      * When rendering a feature with an icon style, the vector renderer will
      * automatically call this method. However, you might want to call this
      * method yourself for preloading or other purposes.
      * @api
      */
    def load(): Unit = js.native
  }
  
  /**
    * @classdesc
    * A base class used for creating subclasses and not instantiated in
    * apps. Base class for {@link ol.style.Icon}, {@link ol.style.Circle} and
    * {@link ol.style.RegularShape}.
    *
    * @param options Options.
    * @api
    */
  @JSImport("openlayers", "style.Image")
  @js.native
  class Image protected () extends StObject {
    /**
      * @classdesc
      * A base class used for creating subclasses and not instantiated in
      * apps. Base class for {@link ol.style.Icon}, {@link ol.style.Circle} and
      * {@link ol.style.RegularShape}.
      *
      * @param options Options.
      * @api
      */
    def this(options: StyleImageOptions) = this()
    
    /**
      * Get the symbolizer opacity.
      * @return Opacity.
      * @api
      */
    def getOpacity(): Double = js.native
    
    /**
      * Determine whether the symbolizer rotates with the map.
      * @return Rotate with map.
      * @api
      */
    def getRotateWithView(): Boolean = js.native
    
    /**
      * Get the symoblizer rotation.
      * @return Rotation.
      * @api
      */
    def getRotation(): Double = js.native
    
    /**
      * Get the symbolizer scale.
      * @return Scale.
      * @api
      */
    def getScale(): Double = js.native
    
    /**
      * Determine whether the symbolizer should be snapped to a pixel.
      * @return The symbolizer should snap to a pixel.
      * @api
      */
    def getSnapToPixel(): Boolean = js.native
    
    /**
      * Set the opacity.
      *
      * @param opacity Opacity.
      * @api
      */
    def setOpacity(opacity: Double): Unit = js.native
    
    /**
      * Set the rotation.
      *
      * @param rotation Rotation.
      * @api
      */
    def setRotation(rotation: Double): Unit = js.native
    
    /**
      * Set the scale.
      *
      * @param scale Scale.
      * @api
      */
    def setScale(scale: Double): Unit = js.native
  }
  
  /**
    * @classdesc
    * Set regular shape style for vector features. The resulting shape will be
    * a regular polygon when `radius` is provided, or a star when `radius1` and
    * `radius2` are provided.
    *
    * @param options Options.
    * @api
    */
  @JSImport("openlayers", "style.RegularShape")
  @js.native
  class RegularShape protected ()
    extends typingsSlinky.openlayers.mod.style.Image {
    /**
      * @classdesc
      * Set regular shape style for vector features. The resulting shape will be
      * a regular polygon when `radius` is provided, or a star when `radius1` and
      * `radius2` are provided.
      *
      * @param options Options.
      * @api
      */
    def this(options: RegularShapeOptions) = this()
    
    /**
      * @inheritDoc
      * @api
      */
    def getAnchor(): js.Array[Double] = js.native
    
    /**
      * Get the angle used in generating the shape.
      * @return Shape's rotation in radians.
      * @api
      */
    def getAngle(): Double = js.native
    
    /**
      * Get the fill style for the shape.
      * @return Fill style.
      * @api
      */
    def getFill(): Fill = js.native
    
    /**
      * @inheritDoc
      * @api
      */
    def getImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | typingsSlinky.openlayers.mod.style.Image = js.native
    
    /**
      * @inheritDoc
      * @api
      */
    def getOrigin(): js.Array[Double] = js.native
    
    /**
      * Get the number of points for generating the shape.
      * @return Number of points for stars and regular polygons.
      * @api
      */
    def getPoints(): Double = js.native
    
    /**
      * Get the (primary) radius for the shape.
      * @return Radius.
      * @api
      */
    def getRadius(): Double = js.native
    
    /**
      * Get the secondary radius for the shape.
      * @return Radius2.
      * @api
      */
    def getRadius2(): Double = js.native
    
    /**
      * @inheritDoc
      * @api
      */
    def getSize(): Size = js.native
    
    /**
      * Get the stroke style for the shape.
      * @return Stroke style.
      * @api
      */
    def getStroke(): Stroke = js.native
  }
  
  /**
    * @classdesc
    * Set stroke style for vector features.
    * Note that the defaults given are the Canvas defaults, which will be used if
    * option is not defined. The `get` functions return whatever was entered in
    * the options; they will not return the default.
    *
    * @param opt_options Options.
    * @api
    */
  @JSImport("openlayers", "style.Stroke")
  @js.native
  /**
    * @classdesc
    * Set stroke style for vector features.
    * Note that the defaults given are the Canvas defaults, which will be used if
    * option is not defined. The `get` functions return whatever was entered in
    * the options; they will not return the default.
    *
    * @param opt_options Options.
    * @api
    */
  class Stroke () extends StObject {
    def this(opt_options: StrokeOptions) = this()
    
    /**
      * Get the stroke color.
      * @return Color.
      * @api
      */
    def getColor(): Color_ | String = js.native
    
    /**
      * Get the line cap type for the stroke.
      * @return Line cap.
      * @api
      */
    def getLineCap(): String = js.native
    
    /**
      * Get the line dash style for the stroke.
      * @return Line dash.
      * @api
      */
    def getLineDash(): js.Array[Double] = js.native
    
    /**
      * Get the line dash offset style for the stroke.
      * @return Line dash offset
      * @api
      */
    def getLineDashOffset(): Double = js.native
    
    /**
      * Get the line join type for the stroke.
      * @return Line join.
      * @api
      */
    def getLineJoin(): String = js.native
    
    /**
      * Get the miter limit for the stroke.
      * @return Miter limit.
      * @api
      */
    def getMiterLimit(): Double = js.native
    
    /**
      * Get the stroke width.
      * @return Width.
      * @api
      */
    def getWidth(): Double = js.native
    
    def setColor(color: String): Unit = js.native
    /**
      * Set the color.
      *
      * @param color Color.
      * @api
      */
    def setColor(color: Color_): Unit = js.native
    
    /**
      * Set the line cap.
      *
      * @param lineCap Line cap.
      * @api
      */
    def setLineCap(lineCap: String): Unit = js.native
    
    /**
      * Set the line dash.
      *
      * Please note that Internet Explorer 10 and lower [do not support][mdn] the
      * `setLineDash` method on the `CanvasRenderingContext2D` and therefore this
      * property will have no visual effect in these browsers.
      *
      * [mdn]: https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash#Browser_compatibility
      *
      * @param lineDash Line dash.
      * @api
      */
    def setLineDash(lineDash: js.Array[Double]): Unit = js.native
    
    /**
      * Set the line dash offset.
      *
      * @param lineDashOffset Line dash offset.
      * @api
      */
    def setLineDashOffset(lineDashOffset: Double): Unit = js.native
    
    /**
      * Set the line join.
      *
      * @param lineJoin Line join.
      * @api
      */
    def setLineJoin(lineJoin: String): Unit = js.native
    
    /**
      * Set the miter limit.
      *
      * @param miterLimit Miter limit.
      * @api
      */
    def setMiterLimit(miterLimit: Double): Unit = js.native
    
    /**
      * Set the width.
      *
      * @param width Width.
      * @api
      */
    def setWidth(width: Double): Unit = js.native
  }
  
  /**
    * @classdesc
    * Container for vector feature rendering styles. Any changes made to the style
    * or its children through `set*()` methods will not take effect until the
    * feature or layer that uses the style is re-rendered.
    *
    * @struct
    * @param opt_options Style options.
    * @api
    */
  @JSImport("openlayers", "style.Style")
  @js.native
  /**
    * @classdesc
    * Container for vector feature rendering styles. Any changes made to the style
    * or its children through `set*()` methods will not take effect until the
    * feature or layer that uses the style is re-rendered.
    *
    * @struct
    * @param opt_options Style options.
    * @api
    */
  class Style () extends StObject {
    def this(opt_options: StyleOptions) = this()
    
    /**
      * Get the fill style.
      * @return Fill style.
      * @api
      */
    def getFill(): Fill = js.native
    
    /**
      * Get the geometry to be rendered.
      * @return Feature property or geometry or function that returns the geometry that will
      *     be rendered with this style.
      * @api
      */
    def getGeometry(): String | Geometry | StyleGeometryFunction = js.native
    
    /**
      * Get the function used to generate a geometry for rendering.
      * @return Function that is called with a feature
      * and returns the geometry to render instead of the feature's geometry.
      * @api
      */
    def getGeometryFunction(): StyleGeometryFunction = js.native
    
    /**
      * Get the image style.
      * @return Image style.
      * @api
      */
    def getImage(): typingsSlinky.openlayers.mod.style.Image = js.native
    
    /**
      * Get the stroke style.
      * @return Stroke style.
      * @api
      */
    def getStroke(): Stroke = js.native
    
    /**
      * Get the text style.
      * @return Text style.
      * @api
      */
    def getText(): Text = js.native
    
    /**
      * Get the z-index for the style.
      * @return ZIndex.
      * @api
      */
    def getZIndex(): Double = js.native
    
    /**
      * Set the fill style.
      * @param fill Fill style.
      * @api
      */
    def setFill(fill: Fill): Unit = js.native
    
    /**
      * Set a geometry that is rendered instead of the feature's geometry.
      *
      * @param geometry
      *     Feature property or geometry or function returning a geometry to render
      *     for this style.
      * @api
      */
    def setGeometry(geometry: String): Unit = js.native
    def setGeometry(geometry: StyleGeometryFunction): Unit = js.native
    def setGeometry(geometry: Geometry): Unit = js.native
    
    /**
      * Set the image style.
      * @param image Image style.
      * @api
      */
    def setImage(image: typingsSlinky.openlayers.mod.style.Image): Unit = js.native
    
    /**
      * Set the stroke style.
      * @param stroke Stroke style.
      * @api
      */
    def setStroke(stroke: Stroke): Unit = js.native
    
    /**
      * Set the text style.
      * @param text Text style.
      * @api
      */
    def setText(text: Text): Unit = js.native
    
    /**
      * Set the z-index.
      *
      * @param zIndex ZIndex.
      * @api
      */
    def setZIndex(zIndex: Double): Unit = js.native
  }
  
  /**
    * @classdesc
    * Set text style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @JSImport("openlayers", "style.Text")
  @js.native
  /**
    * @classdesc
    * Set text style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  class Text () extends StObject {
    def this(opt_options: TextOptions) = this()
    
    /**
      * Get the fill style for the text.
      * @return Fill style.
      * @api
      */
    def getFill(): Fill = js.native
    
    /**
      * Get the font name.
      * @return Font.
      * @api
      */
    def getFont(): String = js.native
    
    /**
      * Get the x-offset for the text.
      * @return Horizontal text offset.
      * @api
      */
    def getOffsetX(): Double = js.native
    
    /**
      * Get the y-offset for the text.
      * @return Vertical text offset.
      * @api
      */
    def getOffsetY(): Double = js.native
    
    /**
      * Determine whether the text rotates with the map.
      * @return Rotate with map.
      * @api
      */
    def getRotateWithView(): Boolean = js.native
    
    /**
      * Get the text rotation.
      * @return Rotation.
      * @api
      */
    def getRotation(): Double = js.native
    
    /**
      * Get the text scale.
      * @return Scale.
      * @api
      */
    def getScale(): Double = js.native
    
    /**
      * Get the stroke style for the text.
      * @return Stroke style.
      * @api
      */
    def getStroke(): Stroke = js.native
    
    /**
      * Get the text to be rendered.
      * @return Text.
      * @api
      */
    def getText(): String = js.native
    
    /**
      * Get the text alignment.
      * @return Text align.
      * @api
      */
    def getTextAlign(): String = js.native
    
    /**
      * Get the text baseline.
      * @return Text baseline.
      * @api
      */
    def getTextBaseline(): String = js.native
    
    /**
      * Set the fill.
      *
      * @param fill Fill style.
      * @api
      */
    def setFill(fill: Fill): Unit = js.native
    
    /**
      * Set the font.
      *
      * @param font Font.
      * @api
      */
    def setFont(font: String): Unit = js.native
    
    /**
      * Set the x offset.
      *
      * @param offsetX Horizontal text offset.
      * @api
      */
    def setOffsetX(offsetX: Double): Unit = js.native
    
    /**
      * Set the y offset.
      *
      * @param offsetY Vertical text offset.
      * @api
      */
    def setOffsetY(offsetY: Double): Unit = js.native
    
    /**
      * Set the rotation.
      *
      * @param rotation Rotation.
      * @api
      */
    def setRotation(rotation: Double): Unit = js.native
    
    /**
      * Set the scale.
      *
      * @param scale Scale.
      * @api
      */
    def setScale(scale: Double): Unit = js.native
    
    /**
      * Set the stroke.
      *
      * @param stroke Stroke style.
      * @api
      */
    def setStroke(stroke: Stroke): Unit = js.native
    
    /**
      * Set the text.
      *
      * @param text Text.
      * @api
      */
    def setText(text: String): Unit = js.native
    
    /**
      * Set the text alignment.
      *
      * @param textAlign Text align.
      * @api
      */
    def setTextAlign(textAlign: String): Unit = js.native
    
    /**
      * Set the text baseline.
      *
      * @param textBaseline Text baseline.
      * @api
      */
    def setTextBaseline(textBaseline: String): Unit = js.native
  }
  
  /**
    * Icon anchor units. One of 'fraction', 'pixels'.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openlayers.openlayersStrings.fraction
    - typingsSlinky.openlayers.openlayersStrings.pixels
  */
  trait IconAnchorUnits extends StObject
  object IconAnchorUnits {
    
    @scala.inline
    def fraction: typingsSlinky.openlayers.openlayersStrings.fraction = "fraction".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.fraction]
    
    @scala.inline
    def pixels: typingsSlinky.openlayers.openlayersStrings.pixels = "pixels".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.pixels]
  }
  
  /**
    * Icon origin. One of 'bottom-left', 'bottom-right', 'top-left', 'top-right'.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openlayers.openlayersStrings.`bottom-left`
    - typingsSlinky.openlayers.openlayersStrings.`bottom-right`
    - typingsSlinky.openlayers.openlayersStrings.`top-left`
    - typingsSlinky.openlayers.openlayersStrings.`top-right`
  */
  trait IconOrigin extends StObject
  object IconOrigin {
    
    @scala.inline
    def `bottom-left`: typingsSlinky.openlayers.openlayersStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typingsSlinky.openlayers.openlayersStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.`bottom-right`]
    
    @scala.inline
    def `top-left`: typingsSlinky.openlayers.openlayersStrings.`top-left` = "top-left".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typingsSlinky.openlayers.openlayersStrings.`top-right` = "top-right".asInstanceOf[typingsSlinky.openlayers.openlayersStrings.`top-right`]
  }
}
