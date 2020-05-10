package typingsSlinky.fabric.fabricImplMod

import typingsSlinky.fabric.AnonMl
import typingsSlinky.fabric.AnonTr
import typingsSlinky.fabric.fabricStrings.circle
import typingsSlinky.fabric.fabricStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectOptions extends js.Object {
  /**
  	 * Describe object's corner position in canvas object absolute coordinates
  	 * properties are tl,tr,bl,br and describe the four main corner.
  	 * each property is an object with x, y, instance of Fabric.Point.
  	 * The coordinates depends from this properties: width, height, scaleX, scaleY
  	 * skewX, skewY, angle, strokeWidth, top, left.
  	 * Those coordinates are usefull to understand where an object is. They get updated
  	 * with oCoords but they do not need to be updated when zoom or panning change.
  	 * The coordinates get updated with @method setCoords.
  	 * You can calculate them without updating with @method calcCoords(true);
  	 * @memberOf fabric.Object.prototype
  	 */
  var aCoords: js.UndefOr[AnonTr] = js.native
  /**
  	 * Meaningful ONLY when the object is used as clipPath.
  	 * if true, the clipPath will have its top and left relative to canvas, and will
  	 * not be influenced by the object transform. This will make the clipPath relative
  	 * to the canvas, but clipping just a particular object.
  	 * WARNING this is beta, this feature may change or be renamed.
  	 * since 2.4.0
  	 * @type boolean
  	 * @default false
  	 */
  var absolutePositioned: js.UndefOr[Boolean] = js.native
  /**
  	 * Angle of rotation of an object (in degrees)
  	 */
  var angle: js.UndefOr[Double] = js.native
  /**
  	 * Background color of an object. Only works with text objects at the moment.
  	 */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
  	 * Color of controlling borders of an object (when it's active)
  	 */
  var borderColor: js.UndefOr[String] = js.native
  /**
  	 * Array specifying dash pattern of an object's border (hasBorder must be true)
  	 */
  var borderDashArray: js.UndefOr[js.Array[Double]] = js.native
  /**
  	 * Opacity of object's controlling borders when object is active and moving
  	 */
  var borderOpacityWhenMoving: js.UndefOr[Double] = js.native
  /**
  	 * Scale factor of object's controlling borders
  	 */
  var borderScaleFactor: js.UndefOr[Double] = js.native
  /**
  	 * List of properties to consider when checking if cache needs refresh
  	 * Those properties are checked by statefullCache ON ( or lazy mode if we want ) or from single
  	 * calls to Object.set(key, value). If the key is in this list, the object is marked as dirty
  	 * and refreshed at the next render
  	 * @type Array
  	 */
  var cacheProperties: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * The canvas the object belongs to
  	 */
  var canvas: js.UndefOr[Canvas] = js.native
  /**
  	 * When true, this object will use center point as the origin of transformation
  	 * when being rotated via the controls.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredRotation: js.UndefOr[Boolean] = js.native
  /**
  	 * When true, this object will use center point as the origin of transformation
  	 * when being scaled via the controls.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredScaling: js.UndefOr[Boolean] = js.native
  /**
  	 * A fabricObject that, without stroke define a clipping area with their shape. filled in black
  	 * the clipPath object gets used when the object has rendered, and the context is placed in the center
  	 * of the object cacheCanvas.
  	 * If you want 0,0 of a clipPath to align with an object center, use clipPath.originX/Y to 'center'
  	 */
  var clipPath: js.UndefOr[Object] = js.native
  /**
  	 * Function that determines clipping of an object (context is passed as a first argument)
  	 * Note that context origin is at the object's center point (not left/top corner)
  	 */
  var clipTo: js.UndefOr[js.Function] = js.native
  /**
  	 * Color of controlling corners of an object (when it's active)
  	 */
  var cornerColor: js.UndefOr[String] = js.native
  /**
  	 * Array specifying dash pattern of an object's control (hasBorder must be true)
  	 */
  var cornerDashArray: js.UndefOr[js.Array[Double]] = js.native
  /**
  	 * Size of object's controlling corners (in pixels)
  	 */
  var cornerSize: js.UndefOr[Double] = js.native
  /**
  	 * Color of controlling corners of an object (when it's active and transparentCorners false)
  	 */
  var cornerStrokeColor: js.UndefOr[String] = js.native
  /**
  	 * Specify style of control, 'rect' or 'circle'
  	 */
  var cornerStyle: js.UndefOr[rect | circle] = js.native
  /**
  	 * Not used by fabric, just for convenience
  	 */
  var data: js.UndefOr[js.Any] = js.native
  /**
  	 * When set to `true`, object's cache will be rerendered next render call.
  	 */
  var dirty: js.UndefOr[Boolean] = js.native
  /**
  	 * When set to `false`, an object can not be a target of events. All events propagate through it. Introduced in v1.3.4
  	 */
  var evented: js.UndefOr[Boolean] = js.native
  /**
  	 * When `true`, object is not exported in OBJECT/JSON
  	 * since 1.6.3
  	 * @type Boolean
  	 * @default
  	 */
  var excludeFromExport: js.UndefOr[Boolean] = js.native
  /**
  	 * Color of object's fill
  	 */
  var fill: js.UndefOr[String | Pattern | Gradient] = js.native
  /**
  	 * Fill rule used to fill an object
  	 * accepted values are nonzero, evenodd
  	 * Backwards incompatibility note: This property was used for setting globalCompositeOperation until v1.4.12, use `globalCompositeOperation` instead
  	 */
  var fillRule: js.UndefOr[String] = js.native
  /**
  	 * When true, an object is rendered as flipped horizontally
  	 */
  var flipX: js.UndefOr[Boolean] = js.native
  /**
  	 * When true, an object is rendered as flipped vertically
  	 */
  var flipY: js.UndefOr[Boolean] = js.native
  /**
  	 * Composite rule used for canvas globalCompositeOperation
  	 */
  var globalCompositeOperation: js.UndefOr[String] = js.native
  /**
  	 * The group the object is part of
  	 */
  var group: js.UndefOr[Group] = js.native
  /**
  	 * When set to `false`, object's controlling borders are not rendered
  	 */
  var hasBorders: js.UndefOr[Boolean] = js.native
  /**
  	 * When set to `false`, object's controls are not displayed and can not be used to manipulate object
  	 */
  var hasControls: js.UndefOr[Boolean] = js.native
  /**
  	 * When set to `false`, object's controlling rotating point will not be visible or selectable
  	 */
  var hasRotatingPoint: js.UndefOr[Boolean] = js.native
  /**
  	 * Object height
  	 */
  var height: js.UndefOr[Double] = js.native
  /**
  	 * Default cursor value used when hovering over this object on canvas
  	 */
  var hoverCursor: js.UndefOr[String] = js.native
  /**
  	 * When `false`, default object's values are not included in its serialization
  	 */
  var includeDefaultValues: js.UndefOr[Boolean] = js.native
  /**
  	 * Meaningful ONLY when the object is used as clipPath.
  	 * if true, the clipPath will make the object clip to the outside of the clipPath
  	 * since 2.4.0
  	 * @type boolean
  	 * @default false
  	 */
  var inverted: js.UndefOr[Boolean] = js.native
  /**
  	 * Left position of an object. Note that by default it's relative to object center. You can change this by setting originX={left/center/right}
  	 */
  var left: js.UndefOr[Double] = js.native
  /**
  	 * When `true`, object horizontal movement is locked
  	 */
  var lockMovementX: js.UndefOr[Boolean] = js.native
  /**
  	 * When `true`, object vertical movement is locked
  	 */
  var lockMovementY: js.UndefOr[Boolean] = js.native
  /**
  	 * When `true`, object rotation is locked
  	 */
  var lockRotation: js.UndefOr[Boolean] = js.native
  /**
  	 * When `true`, object cannot be flipped by scaling into negative values
  	 */
  var lockScalingFlip: js.UndefOr[Boolean] = js.native
  /**
  	 * When `true`, object horizontal scaling is locked
  	 */
  var lockScalingX: js.UndefOr[Boolean] = js.native
  /**
  	 * When `true`, object vertical scaling is locked
  	 */
  var lockScalingY: js.UndefOr[Boolean] = js.native
  /**
  	 * When `true`, object horizontal skewing is locked
  	 * @type Boolean
  	 */
  var lockSkewingX: js.UndefOr[Boolean] = js.native
  /**
  	 * When `true`, object vertical skewing is locked
  	 * @type Boolean
  	 */
  var lockSkewingY: js.UndefOr[Boolean] = js.native
  /**
  	 * When `true`, object non-uniform scaling is locked
  	 */
  var lockUniScaling: js.UndefOr[Boolean] = js.native
  /**
  	 * storage for object full transform matrix
  	 */
  var matrixCache: js.UndefOr[js.Any] = js.native
  /**
  	 * Minimum allowed scale value of an object
  	 */
  var minScaleLimit: js.UndefOr[Double] = js.native
  /**
  	 * Default cursor value used when moving an object on canvas
  	 */
  var moveCursor: js.UndefOr[String] = js.native
  /**
  	 * Not used by fabric, just for convenience
  	 */
  var name: js.UndefOr[String] = js.native
  /**
  	 * When `true`, cache does not get updated during scaling. The picture will get blocky if scaled
  	 * too much and will be redrawn with correct details at the end of scaling.
  	 * this setting is performance and application dependant.
  	 * default to true
  	 * since 1.7.0
  	 * @type Boolean
  	 */
  var noScaleCache: js.UndefOr[Boolean] = js.native
  /**
  	 * Describe object's corner position in canvas element coordinates.
  	 * properties are tl,mt,tr,ml,mr,bl,mb,br,mtr for the main controls.
  	 * each property is an object with x, y and corner.
  	 * The `corner` property contains in a similar manner the 4 points of the
  	 * interactive area of the corner.
  	 * The coordinates depends from this properties: width, height, scaleX, scaleY
  	 * skewX, skewY, angle, strokeWidth, viewportTransform, top, left, padding.
  	 * The coordinates get updated with @method setCoords.
  	 * You can calculate them without updating with @method calcCoords;
  	 * @memberOf fabric.Object.prototype
  	 */
  var oCoords: js.UndefOr[AnonMl] = js.native
  /**
  	 * When `true`, object is cached on an additional canvas.
  	 */
  var objectCaching: js.UndefOr[Boolean] = js.native
  /**
  	 * Opacity of an object
  	 */
  var opacity: js.UndefOr[Double] = js.native
  /**
  	 * Horizontal origin of transformation of an object (one of "left", "right", "center")
  	 */
  var originX: js.UndefOr[String] = js.native
  /**
  	 * Vertical origin of transformation of an object (one of "top", "bottom", "center")
  	 */
  var originY: js.UndefOr[String] = js.native
  /**
  	 * storage for object transform matrix
  	 */
  var ownMatrixCache: js.UndefOr[js.Any] = js.native
  /**
  	 * Padding between object and its controlling borders (in pixels)
  	 */
  var padding: js.UndefOr[Double] = js.native
  /**
  	 * Determines if the fill or the stroke is drawn first (one of "fill" or "stroke")
  	 * @type String
  	 */
  var paintFirst: js.UndefOr[String] = js.native
  /**
  	 * When set to `true`, objects are "found" on canvas on per-pixel basis rather than according to bounding box
  	 */
  var perPixelTargetFind: js.UndefOr[Boolean] = js.native
  /**
  	 * Offset for object's controlling rotating point (when enabled via `hasRotatingPoint`)
  	 */
  var rotatingPointOffset: js.UndefOr[Double] = js.native
  /**
  	 * Object scale factor (horizontal)
  	 */
  var scaleX: js.UndefOr[Double] = js.native
  /**
  	 * Object scale factor (vertical)
  	 */
  var scaleY: js.UndefOr[Double] = js.native
  /**
  	 * When set to `false`, an object can not be selected for modification (using either point-click-based or group-based selection).
  	 * But events still fire on it.
  	 */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
  	 * Selection Background color of an object. colored layer behind the object when it is active.
  	 * does not mix good with globalCompositeOperation methods.
  	 * @type String
  	 */
  var selectionBackgroundColor: js.UndefOr[String] = js.native
  /**
  	 * Shadow object representing shadow of this shape
  	 */
  var shadow: js.UndefOr[Shadow | String] = js.native
  /**
  	 * Object skew factor (horizontal)
  	 */
  var skewX: js.UndefOr[Double] = js.native
  /**
  	 * Object skew factor (vertical)
  	 */
  var skewY: js.UndefOr[Double] = js.native
  /**
  	 * Indicates the angle that an object will lock to while rotating. Can get from canvas.
  	 */
  var snapAngle: js.UndefOr[Double] = js.native
  /**
  	 * Indicates the distance from the snapAngle the rotation will lock to the snapAngle. Can get from canvas.
  	 */
  var snapThreshold: js.UndefOr[Null | Double] = js.native
  /**
  	 * List of properties to consider when checking if state
  	 * of an object is changed (fabric.Object#hasStateChanged)
  	 * as well as for history (undo/redo) purposes
  	 * @type Array
  	 */
  var stateProperties: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * When `true`, object properties are checked for cache invalidation. In some particular
  	 * situation you may want this to be disabled ( spray brush, very big, groups)
  	 * or if your application does not allow you to modify properties for groups child you want
  	 * to disable it for groups.
  	 * default to false
  	 * since 1.7.0
  	 * @type Boolean
  	 * @default false
  	 */
  var statefullCache: js.UndefOr[Boolean] = js.native
  /**
  	 * When defined, an object is rendered via stroke and this property specifies its color
  	 */
  var stroke: js.UndefOr[String] = js.native
  /**
  	 * Array specifying dash pattern of an object's stroke (stroke must be defined)
  	 */
  var strokeDashArray: js.UndefOr[js.Array[Double]] = js.native
  /**
  	 * Line offset of an object's stroke
  	 * @type Number
  	 * @default
  	 */
  var strokeDashOffset: js.UndefOr[Double] = js.native
  /**
  	 * Line endings style of an object's stroke (one of "butt", "round", "square")
  	 */
  var strokeLineCap: js.UndefOr[String] = js.native
  /**
  	 * Corner style of an object's stroke (one of "bevil", "round", "miter")
  	 */
  var strokeLineJoin: js.UndefOr[String] = js.native
  /**
  	 * Maximum miter length (used for strokeLineJoin = "miter") of an object's stroke
  	 */
  var strokeMiterLimit: js.UndefOr[Double] = js.native
  /**
  	 * When `false`, the stoke width will scale with the object.
  	 * When `true`, the stroke will always match the exact pixel size entered for stroke width.
  	 * default to false
  	 * @since 2.6.0
  	 * @type Boolean
  	 * @default false
  	 * @type Boolean
  	 */
  var strokeUniform: js.UndefOr[Boolean] = js.native
  /**
  	 * Width of a stroke used to render this object
  	 */
  var strokeWidth: js.UndefOr[Double] = js.native
  /**
  	 * Top position of an object. Note that by default it's relative to object center. You can change this by setting originY={top/center/bottom}
  	 */
  var top: js.UndefOr[Double] = js.native
  /**
  	 * Transform matrix (similar to SVG's transform matrix)
  	 */
  var transformMatrix: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * When true, object's controlling corners are rendered as transparent inside (i.e. stroke instead of fill)
  	 */
  var transparentCorners: js.UndefOr[Boolean] = js.native
  /**
  	 * Type of an object (rect, circle, path, etc.).
  	 * Note that this property is meant to be read-only and not meant to be modified.
  	 * If you modify, certain parts of Fabric (such as JSON loading) won't work correctly.
  	 */
  var `type`: js.UndefOr[String] = js.native
  /**
  	 * When set to `false`, an object is not rendered on canvas
  	 */
  var visible: js.UndefOr[Boolean] = js.native
  /**
  	 * Object width
  	 */
  var width: js.UndefOr[Double] = js.native
}

object IObjectOptions {
  @scala.inline
  def apply(): IObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObjectOptions]
  }
  @scala.inline
  implicit class IObjectOptionsOps[Self <: IObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACoords(value: AnonTr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutACoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aCoords")(js.undefined)
        ret
    }
    @scala.inline
    def withAbsolutePositioned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePositioned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolutePositioned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePositioned")(js.undefined)
        ret
    }
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderDashArray(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashArray")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderOpacityWhenMoving(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOpacityWhenMoving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderOpacityWhenMoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOpacityWhenMoving")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderScaleFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderScaleFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withCanvas(value: Canvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(js.undefined)
        ret
    }
    @scala.inline
    def withCenteredRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenteredRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCenteredScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenteredScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withClipPath(value: Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPath")(js.undefined)
        ret
    }
    @scala.inline
    def withClipTo(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipTo")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerDashArray(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerDashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerDashArray")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerStrokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerStrokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCornerStyle(value: rect | circle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(js.undefined)
        ret
    }
    @scala.inline
    def withEvented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvented: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evented")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFromExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeFromExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromExport")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String | Pattern | Gradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipX")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalCompositeOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalCompositeOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalCompositeOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalCompositeOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withHasControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasControls")(js.undefined)
        ret
    }
    @scala.inline
    def withHasRotatingPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRotatingPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasRotatingPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRotatingPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDefaultValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefaultValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDefaultValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefaultValues")(js.undefined)
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withLockMovementX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockMovementX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockMovementX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockMovementX")(js.undefined)
        ret
    }
    @scala.inline
    def withLockMovementY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockMovementY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockMovementY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockMovementY")(js.undefined)
        ret
    }
    @scala.inline
    def withLockRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScalingFlip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScalingFlip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScalingFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScalingFlip")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScalingX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScalingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScalingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScalingX")(js.undefined)
        ret
    }
    @scala.inline
    def withLockScalingY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScalingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockScalingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockScalingY")(js.undefined)
        ret
    }
    @scala.inline
    def withLockSkewingX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockSkewingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockSkewingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockSkewingX")(js.undefined)
        ret
    }
    @scala.inline
    def withLockSkewingY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockSkewingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockSkewingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockSkewingY")(js.undefined)
        ret
    }
    @scala.inline
    def withLockUniScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockUniScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockUniScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockUniScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withMatrixCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatrixCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixCache")(js.undefined)
        ret
    }
    @scala.inline
    def withMinScaleLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScaleLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinScaleLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minScaleLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNoScaleCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noScaleCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoScaleCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noScaleCache")(js.undefined)
        ret
    }
    @scala.inline
    def withOCoords(value: AnonMl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oCoords")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectCaching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectCaching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectCaching")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originX")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originY")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnMatrixCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownMatrixCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnMatrixCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownMatrixCache")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPaintFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paintFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaintFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paintFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withPerPixelTargetFind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPixelTargetFind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerPixelTargetFind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perPixelTargetFind")(js.undefined)
        ret
    }
    @scala.inline
    def withRotatingPointOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatingPointOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotatingPointOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotatingPointOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Shadow | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewX")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewY")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapThresholdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapThreshold")(null)
        ret
    }
    @scala.inline
    def withStateProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withStatefullCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statefullCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatefullCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statefullCache")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDashArray(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashArray")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeDashOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLineCap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLineCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLineCap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeLineJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeLineJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLineJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeMiterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeUniform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeUniform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeUniform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeUniform")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformMatrix(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformMatrix")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparentCorners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentCorners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparentCorners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentCorners")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

