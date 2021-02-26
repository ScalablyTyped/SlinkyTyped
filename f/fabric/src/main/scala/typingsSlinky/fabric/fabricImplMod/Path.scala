package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fabric.fabricImplMod.IObjectOptions because Already inherited
- typingsSlinky.fabric.fabricImplMod.IPathOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined path */ @JSImport("fabric/fabric-impl", "Path")
@js.native
/**
  * Constructor
  * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  * @param [options] Options object
  */
class Path () extends Object {
  def this(path: String) = this()
  def this(path: js.Array[Point]) = this()
  def this(path: js.UndefOr[scala.Nothing], options: IPathOptions) = this()
  def this(path: String, options: IPathOptions) = this()
  def this(path: js.Array[Point], options: IPathOptions) = this()
  
  /**
    * Array of path points
    */
  var path: js.UndefOr[js.Array[Point]] = js.native
  
  var pathOffset: Point = js.native
}
/* static members */
object Path {
  
  @JSImport("fabric/fabric-impl", "Path")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    */
  @JSImport("fabric/fabric-impl", "Path.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Creates an instance of fabric.Path from an SVG <path> element
    * @param element to parse
    * @param callback Callback to invoke when an fabric.Path instance is created
    * @param [options] Options object
    */
  @JSImport("fabric/fabric-impl", "Path.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function): Path = js.native
  @JSImport("fabric/fabric-impl", "Path.fromElement")
  @js.native
  def fromElement(element: SVGElement, callback: js.Function, options: IPathOptions): Path = js.native
  
  /**
    * Creates an instance of fabric.Path from an object
    * @param callback Callback to invoke when an fabric.Path instance is created
    */
  @JSImport("fabric/fabric-impl", "Path.fromObject")
  @js.native
  def fromObject(`object`: js.Any, callback: js.Function): Path = js.native
}
