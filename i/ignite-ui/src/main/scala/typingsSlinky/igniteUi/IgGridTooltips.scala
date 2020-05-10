package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridTooltips
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A list of custom column settings that specify custom tooltip settings for a specific column (whether tooltips are enabled / disabled)
  	 *
  	 */
  var columnSettings: js.UndefOr[IgGridTooltipsColumnSettings] = js.native
  /**
  	 * Sets the left position of the tooltip relative to the mouse cursor
  	 *
  	 */
  var cursorLeftOffset: js.UndefOr[Double] = js.native
  /**
  	 * Sets the top position of the tooltip relative to the mouse cursor
  	 *
  	 */
  var cursorTopOffset: js.UndefOr[Double] = js.native
  /**
  	 * Sets the time tooltip fades in and out when showing/hiding
  	 *
  	 */
  var fadeTimespan: js.UndefOr[Double] = js.native
  /**
  	 * Type="integer" The time in milliseconds after which tooltip hides when mouse
  	 * cursor gets outside of the cell.
  	 *
  	 */
  var hideDelay: js.UndefOr[Double] = js.native
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
  	 * The time in milliseconds after which tooltip will show when
  	 * mouse cursor is hovered over a cell.
  	 *
  	 */
  var showDelay: js.UndefOr[Double] = js.native
  /**
  	 * Controls the tooltip's style
  	 *
  	 *
  	 * Valid values:
  	 * "tooltip" The tooltip will be positioned according to the mouse cursor. Will render the tooltip content as plain text.
  	 * "popover" The tooltip will be positioned according to the target element with an arrow pointing the element. This style is more suitable for touch-supported environments. Will render the tooltip content as HTML.
  	 */
  var style: js.UndefOr[String] = js.native
  /**
  	 * Event fired after a tooltip is hidden
  	 */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.native
  /**
  	 * Event fired when the mouse has left an element and the tooltip is about to hide
  	 */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.native
  /**
  	 * Event fired when the mouse has hovered on an element long enough to display a tooltip
  	 */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.native
  /**
  	 * Event fired after a tooltip is shown
  	 */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  /**
  	 * Determines the tooltip visibility option
  	 *
  	 *
  	 * Valid values:
  	 * "always" tooltips always show for hovered elements
  	 * "never" tooltips do not show automatically
  	 * "overflow" tooltips show only when the underlying data overflows its container
  	 */
  var visibility: js.UndefOr[String] = js.native
}

object IgGridTooltips {
  @scala.inline
  def apply(): IgGridTooltips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridTooltips]
  }
  @scala.inline
  implicit class IgGridTooltipsOps[Self <: IgGridTooltips] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnSettings(value: IgGridTooltipsColumnSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorLeftOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorLeftOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorLeftOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorLeftOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorTopOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorTopOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorTopOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorTopOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeTimespan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeTimespan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeTimespan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeTimespan")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withInherit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherit")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipHidden(value: (/* event */ Event_, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipHiding(value: (/* event */ Event_, /* ui */ TooltipHidingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHiding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipHiding")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipShowing(value: (/* event */ Event_, /* ui */ TooltipShowingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShowing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShowing")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipShown(value: (/* event */ Event_, /* ui */ TooltipShownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTooltipShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

