package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgZoombar
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies how the target widget's clone is rendered inside the Zoombar.
  	 * object A valid set of properties to initialize the clone with.
  	 *
  	 *
  	 * Valid values:
  	 * "auto" Options for initializing the clone will be inferred from the target widget. Certain properties will be altered to make the clone more suitable for using inside the Zoombar.
  	 * "none" No clone of the target widget will be initialized inside the Zoombar.
  	 */
  @JSName("clone")
  var clone_FIgZoombar: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Specifies the default zoom in percentages.
  	 *
  	 */
  var defaultZoomWindow: js.UndefOr[IgZoombarDefaultZoomWindow] = js.native
  /**
  	 * Specifies the height of the Zoombar.
  	 *
  	 *
  	 * Valid values:
  	 * "null" The Zoombar will stretch vertically to fit its container if it has height set, otherwise assumes 70px.
  	 */
  var height: js.UndefOr[Double | String] = js.native
  /**
  	 * Specifies the animation duration (in milliseconds) when hover style is applied or removed from elements.
  	 *
  	 */
  var hoverStyleAnimationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Specifies a provider class which interfaces the widget that is being zoomed.
  	 * object Provider class to use. The provider should implement all methods in the $.ig.ZoombarProviderDefault class and is suggested to be extended from it.
  	 */
  var provider: js.UndefOr[js.Any] = js.native
  /**
  	 * Event fired after a provider is created based on the options.provider value. If an instance is passed as a value for the option the event won't fire.
  	 * Use the event when utilizing a custom provider to assign options such as the zoomed widget's instance so that the provider's API is usable when igZoombar initializes its rendering.
  	 */
  var providerCreated: js.UndefOr[ProviderCreatedEvent] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Initial tabIndex for the Zoombar container elements.
  	 *
  	 */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
  	 * Specifies the element on which the widget the Zoombar is attached to is initialized.
  	 * object A valid jQuery object, the first element of which is that element.
  	 *
  	 */
  var target: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Specifies the width of the Zoombar.
  	 *
  	 *
  	 * Valid values:
  	 * "auto" The width of the Zoombar will be the same as the widget it is attached to.
  	 * "number" The widget width in pixels (px).
  	 * "string" The widget width can be set in pixels (px) and percentage (%).
  	 * "null" The Zoombar will stretch horizontally to fit its container if it has width set, otherwise assumes auto.
  	 */
  var width: js.UndefOr[String | Double] = js.native
  /**
  	 * Event fired when the user stops dragging the zoom window.
  	 */
  var windowDragEnded: js.UndefOr[WindowDragEndedEvent] = js.native
  /**
  	 * Event fired when the user attemtps to stop dragging the zoom window.
  	 */
  var windowDragEnding: js.UndefOr[WindowDragEndingEvent] = js.native
  /**
  	 * Event fired when the user starts dragging the zoom window.
  	 */
  var windowDragStarted: js.UndefOr[WindowDragStartedEvent] = js.native
  /**
  	 * Event fired when the user attempts to drag the zoom window.
  	 */
  var windowDragStarting: js.UndefOr[WindowDragStartingEvent] = js.native
  /**
  	 * Event fired when the user drags the zoom window.
  	 */
  var windowDragging: js.UndefOr[WindowDraggingEvent] = js.native
  /**
  	 * Specifies the pan duration (in milliseconds) when the window changes position. Set to 0 for snap.
  	 *
  	 */
  var windowPanDuration: js.UndefOr[Double] = js.native
  /**
  	 * Event fired after the user resizes the zoom window with the window"s handles.
  	 */
  var windowResized: js.UndefOr[WindowResizedEvent] = js.native
  /**
  	 * Event fired when the user resizes the zoom window with the window"s handles.
  	 */
  var windowResizing: js.UndefOr[WindowResizingEvent] = js.native
  /**
  	 * Specifies when the zoom effect is applied.
  	 *
  	 *
  	 * Valid values:
  	 * "immediate" The zoom action is applied as the end-user interacts with the zoom window.
  	 * "deferred" The zoom action is applied after the interaction with the zoom window completes.
  	 */
  var zoomAction: js.UndefOr[String] = js.native
  /**
  	 * Event fired after a zoom action is applied.
  	 */
  var zoomChanged: js.UndefOr[ZoomChangedEvent] = js.native
  /**
  	 * Event fired before a zoom action is applied
  	 */
  var zoomChanging: js.UndefOr[ZoomChangingEvent] = js.native
  /**
  	 * The minimal width the zoom window can have in percentages.
  	 *
  	 */
  var zoomWindowMinWidth: js.UndefOr[Double] = js.native
  /**
  	 * Specifies the distance (in percents) the zoom window moves when the left or right scroll bar buttons are clicked.
  	 *
  	 */
  var zoomWindowMoveDistance: js.UndefOr[Double] = js.native
}

object IgZoombar {
  @scala.inline
  def apply(): IgZoombar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgZoombar]
  }
  @scala.inline
  implicit class IgZoombarOps[Self <: IgZoombar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultZoomWindow(value: IgZoombarDefaultZoomWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultZoomWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultZoomWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultZoomWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withHoverStyleAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyleAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverStyleAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyleAnimationDuration")(js.undefined)
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
    def withProvider(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderCreated(value: (/* event */ Event, /* ui */ ProviderCreatedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerCreated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProviderCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerCreated")(js.undefined)
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
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
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
    @scala.inline
    def withWindowDragEnded(value: (/* event */ Event, /* ui */ WindowDragEndedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDragEnded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWindowDragEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDragEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowDragEnding(value: (/* event */ Event, /* ui */ WindowDragEndingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDragEnding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWindowDragEnding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDragEnding")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowDragStarted(value: (/* event */ Event, /* ui */ WindowDragStartedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDragStarted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWindowDragStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDragStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowDragStarting(value: (/* event */ Event, /* ui */ WindowDragStartingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDragStarting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWindowDragStarting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDragStarting")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowDragging(value: (/* event */ Event, /* ui */ WindowDraggingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDragging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWindowDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowPanDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPanDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowPanDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPanDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowResized(value: (/* event */ Event, /* ui */ WindowResizedEventUIParam) => Unit): Self = {
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
    @scala.inline
    def withWindowResizing(value: (/* event */ Event, /* ui */ WindowResizingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResizing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWindowResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomAction")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomChanged(value: (/* event */ Event, /* ui */ ZoomChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutZoomChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomChanging(value: (/* event */ Event, /* ui */ ZoomChangingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomChanging")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutZoomChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomWindowMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomWindowMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomWindowMoveDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowMoveDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomWindowMoveDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomWindowMoveDistance")(js.undefined)
        ret
    }
  }
  
}

