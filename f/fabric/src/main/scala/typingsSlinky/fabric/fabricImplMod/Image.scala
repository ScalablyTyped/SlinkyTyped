package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fabric.fabricImplMod.IObjectOptions because Already inherited
- typingsSlinky.fabric.fabricImplMod.IImageOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined crossOrigin, srcFromAttribute, minimumScaleTrigger, cacheKey, cropX, cropY, filters */ @JSImport("fabric/fabric-impl", "Image")
@js.native
/**
  * Constructor
  * @param element Image or Video element
  * @param [options] Options object
  */
class Image () extends Object {
  def this(element: String) = this()
  def this(element: HTMLImageElement) = this()
  def this(element: HTMLVideoElement) = this()
  def this(element: js.UndefOr[scala.Nothing], options: IImageOptions) = this()
  def this(element: String, options: IImageOptions) = this()
  def this(element: HTMLImageElement, options: IImageOptions) = this()
  def this(element: HTMLVideoElement, options: IImageOptions) = this()
  
  /**
    * Returns svg representation of an instance
    * @return {Array} an array of strings with the specific svg representation
    * of the instance
    */
  def _toSVG(): String = js.native
  
  /**
    * Applies filters assigned to this image (from "filters" array) or from filter param
    * @param {Array} filters to be applied
    * @return {thisArg} return the fabric.Image object
    * @chainable
    */
  def applyFilters(): Image = js.native
  def applyFilters(filters: js.Array[IBaseFilter]): Image = js.native
  
  def applyResizeFilters(): Unit = js.native
  
  /**
    * key used to retrieve the texture representing this image
    * @since 2.0.0
    * @type String
    */
  var cacheKey: js.UndefOr[String] = js.native
  
  /**
    * Image crop in pixels from original image size.
    * @since 2.0.0
    * @type Number
    */
  var cropX: js.UndefOr[Double] = js.native
  
  /**
    * Image crop in pixels from original image size.
    * @since 2.0.0
    * @type Number
    */
  var cropY: js.UndefOr[Double] = js.native
  
  /**
    * crossOrigin value (one of "", "anonymous", "allow-credentials")
    */
  var crossOrigin: js.UndefOr[String] = js.native
  
  /**
    * Delete textures, reference to elements and eventually JSDOM cleanup
    */
  def dispose(): Unit = js.native
  
  /**
    * Image filter array
    */
  var filters: js.UndefOr[js.Array[IBaseFilter]] = js.native
  
  /**
    * Returns image or video element which this instance is based on
    * @return Image or Video element
    */
  def getElement(): HTMLImageElement | HTMLVideoElement = js.native
  
  /**
    * Returns original size of an image
    * @return Object with "width" and "height" properties
    */
  def getOriginalSize(): Height = js.native
  
  /**
    * Returns source of an image
    * @return Source of an image
    */
  def getSrc(): String = js.native
  
  /**
    * Returns true if an image has crop applied, inspecting values of cropX,cropY,width,hight.
    * @return {Boolean}
    */
  def hasCrop(): Boolean = js.native
  
  /**
    * minimum scale factor under which any resizeFilter is triggered to resize the image
    * 0 will disable the automatic resize. 1 will trigger automatically always.
    * number bigger than 1 are not implemented yet.
    * @type Number
    */
  var minimumScaleTrigger: js.UndefOr[Double] = js.native
  
  /**
    * Calculate offset for center and scale factor for the image in order to respect
    * the preserveAspectRatio attribute
    * @private
    * @return {Object}
    */
  def parsePreserveAspectRatioAttribute(): js.Any = js.native
  
  /**
    * Delete a single texture if in webgl mode
    */
  def removeTexture(key: js.Any): Unit = js.native
  
  /**
    * Sets crossOrigin value (on an instance and corresponding image element)
    */
  def setCrossOrigin(value: String): Image = js.native
  
  /**
    * Sets image or video element for this instance to a specified one.
    * If filters defined they are applied to new image.
    * You might need to call `canvas.renderAll` and `object.setCoords` after replacing, to render new image and update controls area.
    * @param element image element
    * @param [options] Options object
    */
  def setElement(element: HTMLImageElement): Image = js.native
  def setElement(element: HTMLImageElement, options: IImageOptions): Image = js.native
  def setElement(element: HTMLVideoElement): Image = js.native
  def setElement(element: HTMLVideoElement, options: IImageOptions): Image = js.native
  
  /**
    * Sets source of an image
    * @param {String} src Source string (URL)
    * @param {Function} [callback] Callback is invoked when image has been loaded (and all filters have been applied)
    * @param {Object} [options] Options object
    * @return {fabric.Image} thisArg
    * @chainable
    */
  def setSrc(src: String): Image = js.native
  def setSrc(src: String, callback: js.UndefOr[scala.Nothing], options: IImageOptions): Image = js.native
  def setSrc(src: String, callback: js.Function): Image = js.native
  def setSrc(src: String, callback: js.Function, options: IImageOptions): Image = js.native
  
  /**
    * When calling {@link fabric.Image.getSrc}, return value from element src with `element.getAttribute('src')`.
    * This allows for relative urls as image src.
    * @since 2.7.0
    * @type Boolean
    */
  var srcFromAttribute: js.UndefOr[Boolean] = js.native
}
/* static members */
object Image {
  
  @JSImport("fabric/fabric-impl", "Image")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric/fabric-impl", "Image.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Default CSS class name for canvas
    */
  @JSImport("fabric/fabric-impl", "Image.CSS_CANVAS")
  @js.native
  def CSS_CANVAS: String = js.native
  @scala.inline
  def CSS_CANVAS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CSS_CANVAS")(x.asInstanceOf[js.Any])
  
  @JSImport("fabric/fabric-impl", "Image.filters")
  @js.native
  def filters: IAllFilters = js.native
  @scala.inline
  def filters_=(x: IAllFilters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filters")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Image instance from an SVG element
    * @param element Element to parse
    * @param callback Callback to execute when fabric.Image object is created
    * @param [options] Options object
    */
  @JSImport("fabric/fabric-impl", "Image.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function): Image = js.native
  @JSImport("fabric/fabric-impl", "Image.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function, options: IImageOptions): Image = js.native
  
  /**
    * Creates an instance of fabric.Image from an URL string
    * @param url URL to create an image from
    * @param [callback] Callback to invoke when image is created (newly created image is passed as a first argument)
    * @param [imgOptions] Options object
    */
  @JSImport("fabric/fabric-impl", "Image.fromURL")
  @js.native
  def fromURL(url: String): Image = js.native
  @JSImport("fabric/fabric-impl", "Image.fromURL")
  @js.native
  def fromURL(url: String, callback: js.UndefOr[scala.Nothing], imgOptions: IImageOptions): Image = js.native
  @JSImport("fabric/fabric-impl", "Image.fromURL")
  @js.native
  def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit]): Image = js.native
  @JSImport("fabric/fabric-impl", "Image.fromURL")
  @js.native
  def fromURL(url: String, callback: js.Function1[/* image */ this.type, Unit], imgOptions: IImageOptions): Image = js.native
}
