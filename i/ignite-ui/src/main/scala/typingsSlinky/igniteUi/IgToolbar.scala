package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgToolbar
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Get/Set whether the toolbar can be collapsed.
  	 *
  	 */
  var allowCollapsing: js.UndefOr[Boolean] = js.native
  /**
  	 * The css class that will be applied to collapseButtonIcon.
  	 *
  	 */
  var collapseButtonIcon: js.UndefOr[String] = js.native
  /**
  	 * Event fired after item is collapsed
  	 */
  var collapsed: js.UndefOr[CollapsedEvent] = js.native
  /**
  	 * Event is fired before item is collapsed.
  	 */
  var collapsing: js.UndefOr[CollapsingEvent] = js.native
  /**
  	 * Display Name of the widget.
  	 *
  	 */
  var displayName: js.UndefOr[String] = js.native
  /**
  	 * The css class that will be applied to the expand/collapse button icon.
  	 *
  	 */
  var expandButtonIcon: js.UndefOr[String] = js.native
  /**
  	 * Event fired after item is expanded
  	 */
  var expanded: js.UndefOr[ExpandedEvent] = js.native
  /**
  	 * Event fired before item is expanded
  	 */
  var expanding: js.UndefOr[ExpandingEvent] = js.native
  /**
  	 * Set/Get the widget height.
  	 *
  	 */
  var height: js.UndefOr[js.Any] = js.native
  /**
  	 * Get/Set whether the widget is expanded initially.
  	 *
  	 */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /**
  	 * Event fired after item is added
  	 */
  var itemAdded: js.UndefOr[ItemAddedEvent] = js.native
  /**
  	 * Fired after item is dissabled
  	 */
  var itemDisable: js.UndefOr[ItemDisableEvent] = js.native
  /**
  	 * Fired after item is enabled
  	 */
  var itemEnabled: js.UndefOr[ItemEnabledEvent] = js.native
  /**
  	 * Event fired after item is removed
  	 */
  var itemRemoved: js.UndefOr[ItemRemovedEvent] = js.native
  /**
  	 * Get/Set Toolbar's items.
  	 *
  	 */
  var items: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgToolbarLocale] = js.native
  /**
  	 * Formal name of the widget.
  	 *
  	 */
  var name: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Event fired after a click on any toolbar button
  	 */
  var toolbarButtonClick: js.UndefOr[ToolbarButtonClickEvent] = js.native
  /**
  	 * Event is fired before the toolbar is opened.
  	 */
  var toolbarComboOpening: js.UndefOr[ToolbarComboOpeningEvent] = js.native
  /**
  	 * Event fired after toolbar combo is selected
  	 */
  var toolbarComboSelected: js.UndefOr[ToolbarComboSelectedEvent] = js.native
  /**
  	 * Event fired after a click on custom item
  	 */
  var toolbarCustomItemClick: js.UndefOr[ToolbarCustomItemClickEvent] = js.native
  /**
  	 * Set/Get the widget width.
  	 *
  	 */
  var width: js.UndefOr[js.Any] = js.native
  /**
  	 * Fired after the window is resized
  	 */
  var windowResized: js.UndefOr[WindowResizedEvent] = js.native
}

object IgToolbar {
  @scala.inline
  def apply(): IgToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbar]
  }
  @scala.inline
  implicit class IgToolbarOps[Self <: IgToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCollapsing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCollapsing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCollapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseButtonIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseButtonIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseButtonIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseButtonIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: (/* event */ Event_, /* ui */ CollapsedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsing(value: (/* event */ Event_, /* ui */ CollapsingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandButtonIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandButtonIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandButtonIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandButtonIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: (/* event */ Event_, /* ui */ ExpandedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanding(value: (/* event */ Event_, /* ui */ ExpandingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExpanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanding")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
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
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withItemAdded(value: (/* event */ Event_, /* ui */ ItemAddedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemAdded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDisable(value: (/* event */ Event_, /* ui */ ItemDisableEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDisable")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDisable")(js.undefined)
        ret
    }
    @scala.inline
    def withItemEnabled(value: (/* event */ Event_, /* ui */ ItemEnabledEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemEnabled")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRemoved(value: (/* event */ Event_, /* ui */ ItemRemovedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRemoved")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: IgToolbarLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
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
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarButtonClick(value: (/* event */ Event_, /* ui */ ToolbarButtonClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarButtonClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToolbarButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarComboOpening(value: (/* event */ Event_, /* ui */ ToolbarComboOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarComboOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToolbarComboOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarComboOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarComboSelected(value: (/* event */ Event_, /* ui */ ToolbarComboSelectedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarComboSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToolbarComboSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarComboSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarCustomItemClick(value: (/* event */ Event_, /* ui */ ToolbarCustomItemClickEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarCustomItemClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToolbarCustomItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarCustomItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: js.Any): Self = {
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
    @scala.inline
    def withWindowResized(value: (/* event */ Event_, /* ui */ WindowResizedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResized")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWindowResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResized")(js.undefined)
        ret
    }
  }
  
}

