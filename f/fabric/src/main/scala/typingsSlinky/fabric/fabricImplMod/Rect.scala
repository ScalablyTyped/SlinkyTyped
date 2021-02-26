package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fabric.fabricImplMod.IObjectOptions because Already inherited
- typingsSlinky.fabric.fabricImplMod.IRectOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined rx, ry */ @JSImport("fabric/fabric-impl", "Rect")
@js.native
/**
  * Constructor
  * @param [options] Options object
  */
class Rect () extends Object {
  def this(options: IRectOptions) = this()
  
  /**
    * Horizontal border radius
    */
  var rx: js.UndefOr[Double] = js.native
  
  /**
    * Vertical border radius
    */
  var ry: js.UndefOr[Double] = js.native
}
/* static members */
object Rect {
  
  @JSImport("fabric/fabric-impl", "Rect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Rect.fromElement`)
    */
  @JSImport("fabric/fabric-impl", "Rect.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Rect instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  @JSImport("fabric/fabric-impl", "Rect.fromElement")
  @js.native
  def fromElement(element: SVGElement): Rect = js.native
  @JSImport("fabric/fabric-impl", "Rect.fromElement")
  @js.native
  def fromElement(element: SVGElement, options: IRectOptions): Rect = js.native
  
  /**
    * Returns Rect instance from an object representation
    * @param object Object to create an instance from
    */
  @JSImport("fabric/fabric-impl", "Rect.fromObject")
  @js.native
  def fromObject(`object`: js.Any): Rect = js.native
}
