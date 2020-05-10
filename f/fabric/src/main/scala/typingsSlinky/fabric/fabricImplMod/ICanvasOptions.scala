package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvasOptions extends IStaticCanvasOptions {
  /**
  	 * Indicates which key enable alternate action on corner
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 * @default
  	 */
  var altActionKey: js.UndefOr[String] = js.native
  /**
  	 * Indicates which key enable alternative selection
  	 * in case of target overlapping with active object
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * For a series of reason that come from the general expectations on how
  	 * things should work, this feature works only for preserveObjectStacking true.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled.
  	 * @since 1.6.5
  	 * @type null|String
  	 * @default
  	 */
  var altSelectionKey: js.UndefOr[String | Null] = js.native
  /**
  	 * Indicates which key enable centered Transform
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 * @default
  	 */
  var centeredKey: js.UndefOr[String] = js.native
  /**
  	 * When true, objects use center point as the origin of rotate transformation.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredRotation: js.UndefOr[Boolean] = js.native
  /**
  	 * When true, objects use center point as the origin of scale transformation.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredScaling: js.UndefOr[Boolean] = js.native
  /**
  	 * Default element class that's given to wrapper (div) element of canvas
  	 */
  var containerClass: js.UndefOr[String] = js.native
  /**
  	 * Default cursor value used for the entire canvas
  	 */
  var defaultCursor: js.UndefOr[String] = js.native
  /**
  	 * Color of object's fill
  	 */
  var fill: js.UndefOr[String | Pattern | Gradient] = js.native
  /**
  	 * Indicates if the canvas can fire middle click events
  	 * @type Boolean
  	 * @since 1.7.8
  	 * @default
  	 */
  var fireMiddleClick: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates if the canvas can fire right click events
  	 * @type Boolean
  	 * @since 1.6.5
  	 * @default
  	 */
  var fireRightClick: js.UndefOr[Boolean] = js.native
  /**
  	 * Cursor value used during free drawing
  	 */
  var freeDrawingCursor: js.UndefOr[String] = js.native
  /**
  	 * Default cursor value used when hovering over an object on canvas
  	 */
  var hoverCursor: js.UndefOr[String] = js.native
  /**
  	 * Indicates that canvas is interactive. This property should not be changed.
  	 */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
  	 * When true, mouse events on canvas (mousedown/mousemove/mouseup) result in free drawing.
  	 * After mousedown, mousemove creates a shape,
  	 * and then mouseup finalizes it and adds an instance of `fabric.Path` onto canvas.
  	 */
  var isDrawingMode: js.UndefOr[Boolean] = js.native
  /**
  	 * Default cursor value used when moving an object on canvas
  	 */
  var moveCursor: js.UndefOr[String] = js.native
  /**
  	 * Cursor value used for disabled elements ( corners with disabled action )
  	 * @type String
  	 * @since 2.0.0
  	 * @default
  	 */
  var notAllowedCursor: js.UndefOr[String] = js.native
  /**
  	 * When true, object detection happens on per-pixel basis rather than on per-bounding-box
  	 */
  var perPixelTargetFind: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates whether objects should remain in current stack position when selected.
  	 * When false objects are brought to top and rendered as part of the selection group
  	 * @type Boolean
  	 */
  var preserveObjectStacking: js.UndefOr[Boolean] = js.native
  /**
  	 * Cursor value used for rotation point
  	 */
  var rotationCursor: js.UndefOr[String] = js.native
  /**
  	 * Indicates whether group selection should be enabled
  	 */
  var selection: js.UndefOr[Boolean] = js.native
  /**
  	 * Color of the border of selection (usually slightly darker than color of selection itself)
  	 */
  var selectionBorderColor: js.UndefOr[String] = js.native
  /**
  	 * Color of selection
  	 */
  var selectionColor: js.UndefOr[String] = js.native
  /**
  	 * Default dash array pattern
  	 * If not empty the selection border is dashed
  	 */
  var selectionDashArray: js.UndefOr[js.Array[Double]] = js.native
  /**
  	 * Select only shapes that are fully contained in the dragged selection rectangle.
  	 * @type Boolean
  	 * @default
  	 */
  var selectionFullyContained: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates which key or keys enable multiple click selection
  	 * Pass value as a string or array of strings
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or empty or containing any other string that is not a modifier key
  	 * feature is disabled.
  	 * @since 1.6.2
  	 * @type String|Array
  	 * @default
  	 */
  var selectionKey: js.UndefOr[String | js.Array[String]] = js.native
  /**
  	 * Width of a line used in object/group selection
  	 */
  var selectionLineWidth: js.UndefOr[Double] = js.native
  /**
  	 * When true, target detection is skipped when hovering over canvas. This can be used to improve performance.
  	 */
  var skipTargetFind: js.UndefOr[Boolean] = js.native
  /**
  	 * Indicates the angle that an object will lock to while rotating.
  	 * @type Number
  	 * @since 1.6.7
  	 */
  var snapAngle: js.UndefOr[Double] = js.native
  /**
  	 * Indicates the distance from the snapAngle the rotation will lock to the snapAngle.
  	 * When `null`, the snapThreshold will default to the snapAngle.
  	 * @type null|Number
  	 * @since 1.6.7
  	 * @default
  	 */
  var snapThreshold: js.UndefOr[Null | Double] = js.native
  /**
  	 * Indicates if the right click on canvas can output the context menu or not
  	 * @type Boolean
  	 * @since 1.6.5
  	 * @default
  	 */
  var stopContextMenu: js.UndefOr[Boolean] = js.native
  /**
  	 * Number of pixels around target pixel to tolerate (consider active) during object detection
  	 */
  var targetFindTolerance: js.UndefOr[Double] = js.native
  /**
  	 * Keep track of the subTargets for Mouse Events
  	 * @type {Array.<fabric.Object>}
  	 * @since 3.6.0
  	 * @default
  	 */
  var targets: js.UndefOr[js.Array[Object]] = js.native
  /**
  	 * Indicates which key enable unproportional scaling
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 */
  var uniScaleKey: js.UndefOr[String] = js.native
  /**
  	 * When true, objects can be transformed by one side (unproportionally)
  	 * @type Boolean
  	 */
  var uniScaleTransform: js.UndefOr[Boolean] = js.native
}

object ICanvasOptions {
  @scala.inline
  def apply(): ICanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvasOptions]
  }
  @scala.inline
  implicit class ICanvasOptionsOps[Self <: ICanvasOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltActionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altActionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltActionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altActionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAltSelectionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altSelectionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltSelectionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altSelectionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAltSelectionKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altSelectionKey")(null)
        ret
    }
    @scala.inline
    def withCenteredKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenteredKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centeredKey")(js.undefined)
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
    def withContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCursor")(js.undefined)
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
    def withFireMiddleClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireMiddleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFireMiddleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireMiddleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withFireRightClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireRightClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFireRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireRightClick")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeDrawingCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeDrawingCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeDrawingCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeDrawingCursor")(js.undefined)
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
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDrawingMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDrawingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDrawingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDrawingMode")(js.undefined)
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
    def withNotAllowedCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAllowedCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAllowedCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAllowedCursor")(js.undefined)
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
    def withPreserveObjectStacking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveObjectStacking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveObjectStacking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveObjectStacking")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionDashArray(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionDashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionDashArray")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionFullyContained(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionFullyContained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionFullyContained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionFullyContained")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionKey(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipTargetFind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTargetFind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipTargetFind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTargetFind")(js.undefined)
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
    def withStopContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetFindTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetFindTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetFindTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetFindTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(js.undefined)
        ret
    }
    @scala.inline
    def withUniScaleKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniScaleKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniScaleKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniScaleKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUniScaleTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniScaleTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniScaleTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniScaleTransform")(js.undefined)
        ret
    }
  }
  
}

