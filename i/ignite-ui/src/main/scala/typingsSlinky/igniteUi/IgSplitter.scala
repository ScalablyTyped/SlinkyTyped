package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSplitter
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Fired after collapsing is performed
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 *                 Use ui.index to get an index of collapsed panel.
  	 */
  var collapsed: js.UndefOr[CollapsedEvent] = js.native
  /**
  	 * Specifies drag delta of the split bar. In order to start dragging "move", the mouse has to be moved specific distance from its original position.
  	 *
  	 */
  var dragDelta: js.UndefOr[Double] = js.native
  /**
  	 * Fired after expanding is performed
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 *                 Use ui.index to get an index of expanded panel.
  	 */
  var expanded: js.UndefOr[ExpandedEvent] = js.native
  /**
  	 * Gets/Sets the height of the container.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the tree inside its parent container, if no other widths are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Fired after the panels are refreshed because of browser"s resizing.
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 */
  var layoutRefreshed: js.UndefOr[LayoutRefreshedEvent] = js.native
  /**
  	 * Fired before the panels are refreshed because of browser"s resizing.
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 */
  var layoutRefreshing: js.UndefOr[LayoutRefreshingEvent] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies the orientation of the splitter.
  	 *
  	 *
  	 * Valid values:
  	 * "vertical"
  	 * "horizontal"
  	 */
  var orientation: js.UndefOr[String] = js.native
  /**
  	 * Array of objects options that specify the panels settings. The panels are no more than two. Settings are specified via enumeration.
  	 *
  	 */
  var panels: js.UndefOr[js.Array[IgSplitterPanel]] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Fired after split bar move is performed
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 */
  var resizeEnded: js.UndefOr[ResizeEndedEvent] = js.native
  /**
  	 * Specifies whether the other splitters on the page will be resized as this splitter resizes.
  	 *
  	 */
  var resizeOtherSplitters: js.UndefOr[Boolean] = js.native
  /**
  	 * Fired before split bar move is performed
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 */
  var resizeStarted: js.UndefOr[ResizeStartedEvent] = js.native
  /**
  	 * Fired while split bar move is performed
  	 *
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get a reference to the splitter instance.
  	 */
  var resizing: js.UndefOr[ResizingEvent] = js.native
  /**
  	 * Gets/Sets the width of the container.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will stretch to fit data, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgSplitter {
  @scala.inline
  def apply(): IgSplitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSplitter]
  }
  @scala.inline
  implicit class IgSplitterOps[Self <: IgSplitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit): Self = {
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
    def withDragDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit): Self = {
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
    def withHeight(value: String | Double): Self = {
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
    def withLayoutRefreshed(value: (/* event */ Event, /* ui */ LayoutRefreshedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutRefreshed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLayoutRefreshed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutRefreshed")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutRefreshing(value: (/* event */ Event, /* ui */ LayoutRefreshingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutRefreshing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLayoutRefreshing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutRefreshing")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
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
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPanels(value: js.Array[IgSplitterPanel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panels")(js.undefined)
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
    def withResizeEnded(value: (/* event */ Event, /* ui */ ResizeEndedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResizeEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeOtherSplitters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeOtherSplitters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeOtherSplitters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeOtherSplitters")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeStarted(value: (/* event */ Event, /* ui */ ResizeStartedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStarted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResizeStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withResizing(value: (/* event */ Event, /* ui */ ResizingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizing")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
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

