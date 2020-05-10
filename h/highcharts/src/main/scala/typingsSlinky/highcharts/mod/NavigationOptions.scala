package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged
    * into all annotations.
    */
  var annotationsOptions: js.UndefOr[AnnotationsOptions | NavigationAnnotationsOptions] = js.native
  /**
    * (Highcharts, Highstock) Bindings definitions for custom HTML buttons.
    * Each binding implements simple event-driven interface:
    *
    * - `className`: classname used to bind event to
    *
    * - `init`: initial event, fired on button click
    *
    * - `start`: fired on first click on a chart
    *
    * - `steps`: array of sequential events fired one after another on each of
    * users clicks
    *
    * - `end`: last event to be called after last step event
    */
  var bindings: js.UndefOr[NavigationBindingsOptions | Dictionary[StockToolsBindingsObject]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name where all
    * bindings will be attached to. Multiple charts on the same page should
    * have separate class names to prevent duplicating events.
    *
    * Default value of versions < 7.0.4 `highcharts-bindings-wrapper`
    */
  var bindingsClassName: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
    * buttons appearing in the exporting module.
    *
    * In styled mode, the buttons are styled with the
    * `.highcharts-contextbutton` and `.highcharts-button-symbol` classes.
    */
  var buttonOptions: js.UndefOr[NavigationButtonOptions] = js.native
  /**
    * (Highcharts, Highstock) Events to communicate between Stock Tools and
    * custom GUI.
    */
  var events: js.UndefOr[NavigationEventsOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
    * for icons. Change this to use icons from a different server.
    */
  var iconsURL: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the hover state
    * of the individual items within the popup menu appearing by default when
    * the export icon is clicked. The menu items are rendered in HTML.
    */
  var menuItemHoverStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the individual
    * items within the popup menu appearing by default when the export icon is
    * clicked. The menu items are rendered in HTML. Font size defaults to
    * `11px` on desktop and `14px` on touch devices.
    */
  var menuItemStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the popup menu
    * appearing by default when the export icon is clicked. This menu is
    * rendered in HTML.
    */
  var menuStyle: js.UndefOr[CSSObject] = js.native
}

object NavigationOptions {
  @scala.inline
  def apply(): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationOptions]
  }
  @scala.inline
  implicit class NavigationOptionsOps[Self <: NavigationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationsOptions(value: AnnotationsOptions | NavigationAnnotationsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotationsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBindings(value: NavigationBindingsOptions | Dictionary[StockToolsBindingsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withBindingsClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingsClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingsClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingsClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonOptions(value: NavigationButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: NavigationEventsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withIconsURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconsURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsURL")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemHoverStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemHoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItemHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemHoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuStyle")(js.undefined)
        ret
    }
  }
  
}

