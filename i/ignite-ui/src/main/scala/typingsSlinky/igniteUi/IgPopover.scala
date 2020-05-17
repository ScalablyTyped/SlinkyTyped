package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgPopover
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Sets the time popover fades in and out when showing/hiding
  	 *
  	 */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Controls where the popover DOM should be attached to.
  	 *
  	 *
  	 * Valid values:
  	 * "string" A valid jQuery selector for the element
  	 * "object" A reference to the parent jQuery object
  	 */
  var appendTo: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Controls whether the popover will close on blur or not
  	 *
  	 */
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  /**
  	 * Sets the containment for the popover. Accepts a jQuery object
  	 *
  	 */
  var containment: js.UndefOr[js.Any] = js.native
  /**
  	 * sets the content for the popover container. If left null the content will be get from the target.
  	 *
  	 *
  	 * Valid values:
  	 * "string" String content of the popover container
  	 * "function" Function which is a callback that should return the content. Use the 'this' value to access the target DOM element.
  	 */
  var contentTemplate: js.UndefOr[String | js.Function] = js.native
  /**
  	 * controls the direction in which the control shows relative to the target element
  	 *
  	 *
  	 * Valid values:
  	 * "auto" lets the control show on the side where enough space is available with the priority specified by the [directionPriority](ui.%%WidgetNameLowered%%#options:directionPriority) property
  	 * "left" shows popover on the left side of the target element
  	 * "right" shows popover on the right side of the target element
  	 * "top" shows popover on the top of the target element
  	 * "bottom" shows popover on the bottom of the target element
  	 */
  var direction: js.UndefOr[String] = js.native
  /**
  	 * Controls the priority in which the control searches for space to show relative to the target element.
  	 * This property has effect only if the [direction](ui.%%WidgetNameLowered%%#options:direction) property value is "auto" or unset.
  	 *
  	 */
  var directionPriority: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Sets the content for the popover header
  	 *
  	 */
  var headerTemplate: js.UndefOr[IgPopoverHeaderTemplate] = js.native
  /**
  	 * defines height for the popover. leave null for auto
  	 *
  	 */
  var height: js.UndefOr[Double | String] = js.native
  /**
  	 * Event fired after popover is hidden.
  	 */
  var hidden: js.UndefOr[HiddenEvent] = js.native
  /**
  	 * Event fired before popover is hidden.
  	 */
  var hiding: js.UndefOr[HidingEvent] = js.native
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
  	 * defines height the popover won't exceed even if no specific one is set.
  	 *
  	 */
  var maxHeight: js.UndefOr[Double | String] = js.native
  /**
  	 * defines width the popover won't exceed even if no specific one is set.
  	 *
  	 */
  var maxWidth: js.UndefOr[Double | String] = js.native
  /**
  	 * defines width the popover won't go under the value even if no specific one is set.
  	 *
  	 */
  var minWidth: js.UndefOr[Double | String] = js.native
  /**
  	 * controls the position of the popover according to the target element in case the popover is larger than the target on the side we want to position, if the popover is smaller it should always be in the middle of the visible area
  	 *
  	 *
  	 * Valid values:
  	 * "auto" lets the control choose a position depending on available space with the following priority balanced > end > start
  	 * "balanced" the popover is positioned at the middle of the target element
  	 * "start" the popover is positioned at the beginning of the target element
  	 * "end" the popover is positioned at the end of the target element
  	 */
  var position: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Selectors indicating which items should show popovers. The predefined value is [title]. Customize if you're using something other then the title attribute for the popover content, or if you need a different selector for event delegation. When changing this option, you likely need to also change the contentTemplate option
  	 *
  	 */
  var selectors: js.UndefOr[String] = js.native
  /**
  	 * sets the event on which the popover will be shown. Predefined values are "mouseenter", "click" and "focus"
  	 *
  	 *
  	 * Valid values:
  	 * "mouseenter" the popover is shown on mouse enter in the target element
  	 * "click" the popover is shown on click on the target element
  	 * "focus" the popover is shown on focusing the target element
  	 */
  var showOn: js.UndefOr[String] = js.native
  /**
  	 * Event fired before popover is shown.
  	 */
  var showing: js.UndefOr[ShowingEvent] = js.native
  /**
  	 * Event fired after popover is shown.
  	 */
  var shown: js.UndefOr[ShownEvent] = js.native
  /**
  	 * defines width for the popover. leave null for auto.
  	 *
  	 */
  var width: js.UndefOr[Double | String] = js.native
}

object IgPopover {
  @scala.inline
  def apply(): IgPopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPopover]
  }
  @scala.inline
  implicit class IgPopoverOps[Self <: IgPopover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendTo(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withContainment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containment")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionPriority(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTemplate(value: IgPopoverHeaderTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.undefined)
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
    def withHidden(value: (/* event */ Event, /* ui */ HiddenEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHiding(value: (/* event */ Event, /* ui */ HidingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiding")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHiding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiding")(js.undefined)
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
    def withMaxHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
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
    def withSelectors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowing(value: (/* event */ Event, /* ui */ ShowingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShowing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showing")(js.undefined)
        ret
    }
    @scala.inline
    def withShown(value: (/* event */ Event, /* ui */ ShownEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
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

