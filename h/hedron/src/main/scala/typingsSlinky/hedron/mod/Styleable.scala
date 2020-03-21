package typingsSlinky.hedron.mod

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

trait Styleable extends js.Object {
  /**
    * Background Property
    */
  var background: js.UndefOr[String] = js.undefined
  /**
    * Border property
    */
  var border: js.UndefOr[String] = js.undefined
  /**
    * Display Property
    */
  var display: js.UndefOr[
    `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row`
  ] = js.undefined
  /**
    * Height Property
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * Controls hidden
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * The amount of padding added
    */
  var margin: js.UndefOr[String] = js.undefined
  /**
    * Opacity Property
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * The amount of padding added
    */
  var padding: js.UndefOr[String] = js.undefined
  /**
    * Visibilty Property
    */
  var visibility: js.UndefOr[visible | hidden | collapse | initial | inherit] = js.undefined
  /**
    * Width Property
    */
  var width: js.UndefOr[String] = js.undefined
}

object Styleable {
  @scala.inline
  def apply(
    background: String = null,
    border: String = null,
    display: `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row` = null,
    height: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    margin: String = null,
    opacity: Int | Double = null,
    padding: String = null,
    visibility: visible | hidden | collapse | initial | inherit = null,
    width: String = null
  ): Styleable = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styleable]
  }
}

