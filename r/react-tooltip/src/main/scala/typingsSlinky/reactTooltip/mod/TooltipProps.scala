package typingsSlinky.reactTooltip.mod

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactTooltip.AnonLeft
import typingsSlinky.reactTooltip.reactTooltipStrings.div
import typingsSlinky.reactTooltip.reactTooltipStrings.span
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipProps extends js.Object {
  // Callback after tooltip is hidden
  var afterHide: js.UndefOr[VoidFunc] = js.native
  // Callback after tooltip is shown
  var afterShow: js.UndefOr[VoidFunc] = js.native
  // Popup arrow color
  var arrowColor: js.UndefOr[String] = js.native
  // Popup background color
  var backgroundColor: js.UndefOr[String] = js.native
  // Listen to body events vs. individual events
  var bodyMode: js.UndefOr[Boolean] = js.native
  // Add 1px white border
  var border: js.UndefOr[Boolean] = js.native
  // Popup border color
  var borderColor: js.UndefOr[String] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  // Extra style class
  var `class`: js.UndefOr[String] = js.native
  // Extra style class
  var className: js.UndefOr[String] = js.native
  // Should the tooltip by clickable?
  var clickable: js.UndefOr[Boolean] = js.native
  // Time delay for hiding popup
  var delayHide: js.UndefOr[Double] = js.native
  // Time delay for showing popup
  var delayShow: js.UndefOr[Double] = js.native
  // Time delay for updating popup
  var delayUpdate: js.UndefOr[Double] = js.native
  // Manually disable the tooltip behavior
  var disable: js.UndefOr[Boolean] = js.native
  // Behavior of tooltip
  var effect: js.UndefOr[Effect] = js.native
  // Custom event to trigger tooltip
  var event: js.UndefOr[String] = js.native
  // Custom event to hide tooltip
  // (this requires the event prop as well)
  var eventOff: js.UndefOr[String] = js.native
  // Function to dynamically generate the tooltip content
  var getContent: js.UndefOr[GetContent] = js.native
  // Global event to hide tooltip
  var globalEventOff: js.UndefOr[String] = js.native
  // Inject raw HTML? (This is a security risk)
  var html: js.UndefOr[Boolean] = js.native
  // HTML id attribute
  var id: js.UndefOr[String] = js.native
  // Whether to inject the style header into the page
  // dynamically (violates CSP style-src, but is a convenient default);
  // default = true
  var insecure: js.UndefOr[Boolean] = js.native
  // When set to true, custom event's propagation
  // mode will be captue
  var isCapture: js.UndefOr[Boolean] = js.native
  // Support <br /> to make explicitly multiline tooltip comments
  var multiline: js.UndefOr[Boolean] = js.native
  // Global tooltip offset, e.g., offset={{ top: 10, left: 5 }}
  var offset: js.UndefOr[Offset] = js.native
  // Callback to override the tooltip position
  var overridePosition: js.UndefOr[
    js.Function8[
      /* position */ AnonLeft, 
      /* currentEvent */ Event_, 
      /* currentTarget */ EventTarget, 
      /* refNode */ Null | HTMLDivElement | HTMLSpanElement, 
      /* place */ Place, 
      /* desiredPlace */ Place, 
      /* effect */ Effect, 
      /* offset */ Offset, 
      AnonLeft
    ]
  ] = js.native
  // Placement of tooltip
  var place: js.UndefOr[Place] = js.native
  // List of potential custom events to trigger the popup (in body mode)
  var possibleCustomEvents: js.UndefOr[String] = js.native
  // List of potential custom events to hide the popup (in body mode)
  var possibleCustomEventsOff: js.UndefOr[String] = js.native
  // Hide the tooltip when risizing the window;
  // default = true
  var resizeHide: js.UndefOr[Boolean] = js.native
  // Hide the tooltip when scrolling;
  // default = true
  var scrollHide: js.UndefOr[Boolean] = js.native
  // Popup text color
  var textColor: js.UndefOr[String] = js.native
  // Tooltip styling theme
  var `type`: js.UndefOr[Type] = js.native
  var uuid: js.UndefOr[String] = js.native
  // The tooltip parent component;
  // default = 'div' 
  var wrapper: js.UndefOr[div | span] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterHide(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHide")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterShow(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowColor")(js.undefined)
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
    def withBodyMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
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
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayHide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayHide")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayShow")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayUpdate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withEffect(value: Effect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withEventOff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOff")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContentFunction1(value: /* toolTipStr */ String => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContent(value: GetContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalEventOff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalEventOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalEventOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalEventOff")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInsecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCapture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOverridePosition(
      value: (/* position */ AnonLeft, /* currentEvent */ Event_, /* currentTarget */ EventTarget, /* refNode */ Null | HTMLDivElement | HTMLSpanElement, /* place */ Place, /* desiredPlace */ Place, /* effect */ Effect, /* offset */ Offset) => AnonLeft
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridePosition")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withoutOverridePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withPlace(value: Place): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(js.undefined)
        ret
    }
    @scala.inline
    def withPossibleCustomEvents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possibleCustomEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPossibleCustomEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possibleCustomEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withPossibleCustomEventsOff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possibleCustomEventsOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPossibleCustomEventsOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possibleCustomEventsOff")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHide")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHide")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
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
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: div | span): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}

