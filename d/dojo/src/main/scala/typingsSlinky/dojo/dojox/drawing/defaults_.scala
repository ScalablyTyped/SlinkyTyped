package typingsSlinky.dojo.dojox.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.html
  *
  * Styles and defaults used for Drawing stencils and text.
  * This object contains defaults for objects used in Drawing.
  * To change one item's style, use item.attr();
  * To change all these styles, create a copy of this file
  * and point to it in the Drawing properties:
  *
  * <div dojoType="dojox.drawing.Drawing" id="drawing" defaults="MyCustom.defaults"></div>
  * See: Drawing.changeDefaults
  *
  */
@js.native
trait defaults_ extends js.Object {
  /**
    * Style for the anchor resize-points
    *
    */
  var anchors: js.Object = js.native
  /**
    * Line, arrows, vector and axes will all snap to this angle on mouse up
    * shown angle also reflects the snap
    * currently cannot accept less than 1 degree
    *
    */
  var angleSnap: Double = js.native
  /**
    * Size of arrows on vectors.
    * length is in pixels
    * width is actually an angle
    * but is close to pixels in size
    *
    */
  var arrows: js.Object = js.native
  /**
    *
    */
  var button: js.Object = js.native
  /**
    * Determines whether in draw or edit mode (whether stencils
    * are clickable.  If clickMode is false, the original
    * functionality of silently switching between select modes
    * is enabled.  If clickMode is true, it allows powerpoint-
    * like functionality.  Clickable is used by powerpoint to
    * distinguish when things can be selected and when they can't
    *
    */
  var clickMode: Boolean = js.native
  /**
    *
    */
  var clickable: Boolean = js.native
  /**
    * current will point to either null or selected
    *
    */
  var current: js.Object = js.native
  /**
    * currentHit will point to either hitNorm or hitSelected
    *
    */
  var currentHit: js.Object = js.native
  /**
    * Disabled or "locked" or "fade" style of all shapes
    *
    */
  var disabled: js.Object = js.native
  /**
    * Highlighted style of all shapes
    * NOT CURRENTLY BEING USED
    *
    */
  var highlighted: js.Object = js.native
  /**
    * Highlighted style of a hit area
    *
    */
  var hitHighlighted: js.Object = js.native
  /**
    * Normal style of a hit area
    *
    */
  var hitNorm: js.Object = js.native
  /**
    * Selected style of a hit area
    *
    */
  var hitSelected: js.Object = js.native
  /**
    * If true, the label text color will be the same as the
    * Stencil's line color.
    *
    */
  var labelSameColor: Boolean = js.native
  /**
    * Normal style of all shapes
    * will get overridden by
    * above andes styles
    *
    */
  var norm: js.Object = js.native
  /**
    * If true, renders a second layer for each Stencil, one
    * acting as a 'hit' object for a wider mouse-click area.
    * It also doubles as a hilight. If true, overrides
    * renderHitLines setting.
    *
    */
  var renderHitLayer: Boolean = js.native
  /**
    * If true, renders a second, larger layer for lines to make
    * them more easily clickable.
    *
    */
  var renderHitLines: Boolean = js.native
  /**
    * Selected style of all shapes
    * styles not shown will used from
    * norm
    *
    */
  var selected: js.Object = js.native
  /**
    * Style of text
    *
    */
  var text: js.Object = js.native
  /**
    * Style of disabled text
    *
    */
  var textDisabled: js.Object = js.native
  /**
    * These styles apply to the containing
    * text box (edit mode), and not the text itself
    *
    */
  var textMode: js.Object = js.native
  /**
    *
    */
  var useSelectedStyle: Boolean = js.native
  /**
    *
    */
  var zAngle: Double = js.native
  /**
    * If true, draw current object in z-direction.
    *
    */
  var zAxis: Boolean = js.native
  /**
    *
    */
  var zAxisEnabled: Boolean = js.native
  /**
    * Each shape gets its own copy
    * of these styles so that instances
    * do not change each other's styles
    *
    */
  def copy(): js.Any = js.native
}

object defaults_ {
  @scala.inline
  def apply(
    anchors: js.Object,
    angleSnap: Double,
    arrows: js.Object,
    button: js.Object,
    clickMode: Boolean,
    clickable: Boolean,
    copy: () => js.Any,
    current: js.Object,
    currentHit: js.Object,
    disabled: js.Object,
    highlighted: js.Object,
    hitHighlighted: js.Object,
    hitNorm: js.Object,
    hitSelected: js.Object,
    labelSameColor: Boolean,
    norm: js.Object,
    renderHitLayer: Boolean,
    renderHitLines: Boolean,
    selected: js.Object,
    text: js.Object,
    textDisabled: js.Object,
    textMode: js.Object,
    useSelectedStyle: Boolean,
    zAngle: Double,
    zAxis: Boolean,
    zAxisEnabled: Boolean
  ): defaults_ = {
    val __obj = js.Dynamic.literal(anchors = anchors.asInstanceOf[js.Any], angleSnap = angleSnap.asInstanceOf[js.Any], arrows = arrows.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], clickMode = clickMode.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), current = current.asInstanceOf[js.Any], currentHit = currentHit.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], hitHighlighted = hitHighlighted.asInstanceOf[js.Any], hitNorm = hitNorm.asInstanceOf[js.Any], hitSelected = hitSelected.asInstanceOf[js.Any], labelSameColor = labelSameColor.asInstanceOf[js.Any], norm = norm.asInstanceOf[js.Any], renderHitLayer = renderHitLayer.asInstanceOf[js.Any], renderHitLines = renderHitLines.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textDisabled = textDisabled.asInstanceOf[js.Any], textMode = textMode.asInstanceOf[js.Any], useSelectedStyle = useSelectedStyle.asInstanceOf[js.Any], zAngle = zAngle.asInstanceOf[js.Any], zAxis = zAxis.asInstanceOf[js.Any], zAxisEnabled = zAxisEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaults_]
  }
  @scala.inline
  implicit class defaults_Ops[Self <: defaults_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchors(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngleSnap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleSnap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrows(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrent(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentHit(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlighted(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitHighlighted(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitNorm(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitNorm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitSelected(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelSameColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSameColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorm(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("norm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderHitLayer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHitLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderHitLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHitLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDisabled(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextMode(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseSelectedStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSelectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZAxis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZAxisEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zAxisEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

