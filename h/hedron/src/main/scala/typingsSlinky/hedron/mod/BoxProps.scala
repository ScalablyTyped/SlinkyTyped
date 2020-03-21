package typingsSlinky.hedron.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hedron.hedronStrings.`inline-block`
import typingsSlinky.hedron.hedronStrings.`inline-flex`
import typingsSlinky.hedron.hedronStrings.`inline-grid`
import typingsSlinky.hedron.hedronStrings.`inline-table`
import typingsSlinky.hedron.hedronStrings.`inline`
import typingsSlinky.hedron.hedronStrings.`list-item`
import typingsSlinky.hedron.hedronStrings.`run-in`
import typingsSlinky.hedron.hedronStrings.`table-caption`
import typingsSlinky.hedron.hedronStrings.`table-cell`
import typingsSlinky.hedron.hedronStrings.`table-column-group`
import typingsSlinky.hedron.hedronStrings.`table-column`
import typingsSlinky.hedron.hedronStrings.`table-footer-group`
import typingsSlinky.hedron.hedronStrings.`table-header-group`
import typingsSlinky.hedron.hedronStrings.`table-row-group`
import typingsSlinky.hedron.hedronStrings.`table-row`
import typingsSlinky.hedron.hedronStrings.block
import typingsSlinky.hedron.hedronStrings.collapse
import typingsSlinky.hedron.hedronStrings.contents
import typingsSlinky.hedron.hedronStrings.flex
import typingsSlinky.hedron.hedronStrings.grid
import typingsSlinky.hedron.hedronStrings.hidden
import typingsSlinky.hedron.hedronStrings.inherit
import typingsSlinky.hedron.hedronStrings.initial
import typingsSlinky.hedron.hedronStrings.none
import typingsSlinky.hedron.hedronStrings.table
import typingsSlinky.hedron.hedronStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxProps
  extends Styleable
     with /**
  *  Allow for customer props due to ability to add
  * custom breakpoints
  */
/* x */ StringDictionary[js.Any] {
  /**
    * Draws all child columns with 'bounding boxes' for easy
    * visualization of the grid. This enables debug mode for all the
    * children of this component
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets whether the Box should fill up all available space
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls the CSS flex property
    */
  var flex: js.UndefOr[String] = js.undefined
  /**
    * Convenience property for disabling padding
    */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /**
    * Shifts the box to the bottom of the parent Bounds
    */
  var shiftDown: js.UndefOr[Boolean] = js.undefined
  /**
    * Shifts the box to the left of the parent Bounds
    */
  var shiftLeft: js.UndefOr[Boolean] = js.undefined
  /**
    * Shifts the box to the right of the parent Bounds
    */
  var shiftRight: js.UndefOr[Boolean] = js.undefined
  /**
    * Shifts the box to the top of the parent Bounds
    */
  var shiftUp: js.UndefOr[Boolean] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    *  Allow for customer props due to ability to add
    * custom breakpoints
    */
  /* x */ StringDictionary[js.Any] = null,
    background: String = null,
    border: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    display: `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row` = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    flex: String = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    margin: String = null,
    opacity: Int | Double = null,
    padding: String = null,
    shiftDown: js.UndefOr[Boolean] = js.undefined,
    shiftLeft: js.UndefOr[Boolean] = js.undefined,
    shiftRight: js.UndefOr[Boolean] = js.undefined,
    shiftUp: js.UndefOr[Boolean] = js.undefined,
    visibility: visible | hidden | collapse | initial | inherit = null,
    width: String = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftDown)) __obj.updateDynamic("shiftDown")(shiftDown.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftLeft)) __obj.updateDynamic("shiftLeft")(shiftLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftRight)) __obj.updateDynamic("shiftRight")(shiftRight.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftUp)) __obj.updateDynamic("shiftUp")(shiftUp.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

