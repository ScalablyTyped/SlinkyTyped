package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.fabric.anon.Axis1
import typingsSlinky.fabric.anon.Center
import typingsSlinky.fabric.anon.X1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fabric.fabricImplMod.IObjectOptions because Already inherited
- typingsSlinky.fabric.fabricImplMod.ILineOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined x1, x2, y1, y2 */ @JSImport("fabric/fabric-impl", "Line")
@js.native
/**
  * Constructor
  * @param [points] Array of points
  * @param [options] Options object
  */
class Line () extends Object {
  def this(points: js.Array[Double]) = this()
  def this(points: js.UndefOr[scala.Nothing], objObjects: ILineOptions) = this()
  def this(points: js.Array[Double], objObjects: ILineOptions) = this()
  
  /**
    * Returns svg representation of an instance
    * @return {Array} an array of strings with the specific svg representation
    * of the instance
    */
  def _toSVG(): String = js.native
  
  /**
    * Recalculates line points given width and height
    * @private
    */
  def calcLinePoints(): X1 = js.native
  
  /**
    * Produces a function that calculates distance from canvas edge to Line origin.
    */
  def makeEdgeToOriginGetter(propertyNames: Axis1, originValues: Center): js.Function = js.native
  
  /**
    * x value or first line edge
    */
  var x1: js.UndefOr[Double] = js.native
  
  /**
    * x value or second line edge
    */
  var x2: js.UndefOr[Double] = js.native
  
  /**
    * y value or first line edge
    */
  var y1: js.UndefOr[Double] = js.native
  
  /**
    * y value or second line edge
    */
  var y2: js.UndefOr[Double] = js.native
}
/* static members */
@JSImport("fabric/fabric-impl", "Line")
@js.native
object Line extends js.Object {
  
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Returns fabric.Line instance from an SVG element
    * @static
    * @memberOf fabric.Line
    * @param {SVGElement} element Element to parse
    * @param {Object} [options] Options object
    * @param {Function} [callback] callback function invoked after parsing
    */
  def fromElement(element: SVGElement): Line = js.native
  def fromElement(element: SVGElement, callback: js.UndefOr[scala.Nothing], options: ILineOptions): Line = js.native
  def fromElement(element: SVGElement, callback: js.Function): Line = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: ILineOptions): Line = js.native
  
  /**
    * Returns fabric.Line instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: js.Any): Line = js.native
}
