package typingsSlinky.jscrollpane

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JScrollPaneSettings extends js.Object {
  /**
  	 * The number of milliseconds taken to animate to a new position
  	*/
  var animateDuration: js.UndefOr[Double] = js.native
  /**
  	 * The type of easing to use when animating to a new position
  	*/
  var animateEase: js.UndefOr[String] = js.native
  /**
  	 * Whether to use animation when calling scrollTo or scrollBy. You can control the animation speed and easing by using
  	 * the animateDuration and animateEase settings or if you want to exercise more complete control then you can override
  	 * the animate API method. Demo. 
  	*/
  var animateScroll: js.UndefOr[Boolean] = js.native
  /**
  	 * A multiplier which is used to control the amount that the scrollpane scrolls each time on of the arrow buttons is pressed.
  	*/
  var arrowButtonSpeed: js.UndefOr[Double] = js.native
  /**
  	 * The number of milliseconds between each repeated scroll event when the mouse is held down over one of the arrow keys.
  	*/
  var arrowRepeatFreq: js.UndefOr[Double] = js.native
  /**
  	 * Whether the arrow buttons should cause the jScrollPane to scroll while you are hovering over them. 
  	*/
  var arrowScrollOnHover: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether jScrollPane should automatically reinitialise itself periodically after you have initially initialised it.
  	 * This can help with instances when the size of the content of the scrollpane (or the surrounding element) changes.
  	 * However, it does involve an overhead of running a javascript function on a timer so it is recommended only to activate
  	 * where necessary.
  	*/
  var autoReinitialise: js.UndefOr[Boolean] = js.native
  /**
  	 * The number of milliseconds between each reinitialisation (if autoReinitialise is true). 
  	*/
  var autoReinitialiseDelay: js.UndefOr[Double] = js.native
  /**
  	 * Whether clicking on the track (e.g. the area behind the drag) should scroll towards the point clicked on.
  	 * Defaults to true as this is the native behaviour in these situations. 
  	*/
  var clickOnTrack: js.UndefOr[Boolean] = js.native
  /**
  	 * The width of the content of the scroll pane. The default value of undefined will allow jScrollPane to calculate the
  	 * width of it's content. However, in some cases you will want to disable this (e.g. to prevent horizontal scrolling or
  	 * where the calculation of the size of the content doesn't return reliable results)
  	*/
  var contentWidth: js.UndefOr[Double] = js.native
  /**
  	 * Whether keyboard navigation should be enabled (e.g. whether the user can focus the scrollpane and then use
  	 * the arrow (and other) keys to navigate around. 
  	*/
  var enableKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether the focus outline should be hidden in all browsers. For best accessibility you should not change
  	 * this option. You can style the outline with the CSS property outline and outline-offset. 
  	*/
  var hideFocus: js.UndefOr[Boolean] = js.native
  /**
  	 * Whether internal links on the page should be hijacked so that if they point so content within a jScrollPane then
  	 * they automatically scroll the jScrollPane to the correct place.
  	*/
  var hijackInternalLinks: js.UndefOr[Boolean] = js.native
  /**
  	 * Where the horizontal arrows should appear relative to the horizontal track.
  	*/
  var horizontalArrowPositions: js.UndefOr[String] = js.native
  /**
  	 * The largest width that the horizontal drag can have. The size of the drag elements is based on the proportion of the
  	 * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
  	*/
  var horizontalDragMaxWidth: js.UndefOr[Double] = js.native
  /**
  	 * The smallest width that the horizontal drag can have. The size of the drag elements is based on the proportion of the
  	 * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
  	*/
  var horizontalDragMinWidth: js.UndefOr[Double] = js.native
  /**
  	 * The amount of space between the bottom of the content and the horizontal scrollbar. 
  	*/
  var horizontalGutter: js.UndefOr[Double] = js.native
  /**
  	 * Whether the scrollpane should attempt to maintain it's position whenever it is reinitialised.
  	 * If true then the viewport of the scrollpane will remain the same when it is reinitialised, if false
  		then the viewport will jump back up to the top when the scrollpane is reinitialised. See also stickToBottom and stickToRight. 
  	 */
  var maintainPosition: js.UndefOr[Boolean] = js.native
  /**
  	 * A multiplier which is used to control the amount that the scrollpane scrolls each time the mouse wheel is turned. 
  	*/
  var mouseWheelSpeed: js.UndefOr[Double] = js.native
  /**
  	 * Whether arrows should be shown on the generated scroll pane. When set to false only the scrollbar
  	 * track and drag will be shown, if set to true then arrows buttons will also be shown.
  	 */
  var showArrows: js.UndefOr[Boolean] = js.native
  /**
  	 * If maintainPosition is true and the scrollpane is scrolled to the bottom then the scrollpane then the scrollpane will
  	 * remain scrolled to the bottom even if new content is added to the pane which makes it taller. 
  	*/
  var stickToBottom: js.UndefOr[Boolean] = js.native
  /**
  	 * If maintainPosition is true and the scrollpane is scrolled to its right edge then the scrollpane then the scrollpane
  	 * will remain scrolled to the right edge even if new content is added to the pane which makes it wider. 
  	*/
  var stickToRight: js.UndefOr[Boolean] = js.native
  /**
  	 * The number of milliseconds between each repeated scroll event when the mouse is held down over the track. 
  	*/
  var trackClickRepeatFreq: js.UndefOr[Double] = js.native
  /**
  	 * A multiplier which is used to control the amount that the scrollpane scrolls each trackClickRepeatFreq
  	 * while the mouse button is held down over the track. 
  	*/
  var trackClickSpeed: js.UndefOr[Double] = js.native
  /**
  	 * Where the vertical arrows should appear relative to the vertical track.
  	*/
  var verticalArrowPositions: js.UndefOr[String] = js.native
  /**
  	 * The largest height that the vertical drag can have. The size of the drag elements is based on the proportion of the
  	 * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
  	*/
  var verticalDragMaxHeight: js.UndefOr[Double] = js.native
  /**
  	 * The smallest height that the vertical drag can have. The size of the drag elements is based on the proportion of the
  	 * size of the content to the size of the viewport but is contrained within the minimum and maximum dimensions given.
  	*/
  var verticalDragMinHeight: js.UndefOr[Double] = js.native
  /**
  	 * The amount of space between the side of the content and the vertical scrollbar. 
  	*/
  var verticalGutter: js.UndefOr[Double] = js.native
}

object JScrollPaneSettings {
  @scala.inline
  def apply(): JScrollPaneSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JScrollPaneSettings]
  }
  @scala.inline
  implicit class JScrollPaneSettingsOps[Self <: JScrollPaneSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateEase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateEase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateEase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateEase")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowButtonSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowButtonSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowButtonSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowButtonSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowRepeatFreq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRepeatFreq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowRepeatFreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRepeatFreq")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowScrollOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowScrollOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowScrollOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowScrollOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoReinitialise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReinitialise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReinitialise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReinitialise")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoReinitialiseDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReinitialiseDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoReinitialiseDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoReinitialiseDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withClickOnTrack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOnTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickOnTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickOnTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withContentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withHijackInternalLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hijackInternalLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHijackInternalLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hijackInternalLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalArrowPositions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalArrowPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalArrowPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalArrowPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalDragMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalDragMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalDragMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalDragMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalDragMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalDragMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalDragMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalDragMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGutter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheelSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withShowArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrows")(js.undefined)
        ret
    }
    @scala.inline
    def withStickToBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickToBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickToBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickToBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withStickToRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickToRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStickToRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stickToRight")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackClickRepeatFreq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackClickRepeatFreq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackClickRepeatFreq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackClickRepeatFreq")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackClickSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackClickSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackClickSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackClickSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalArrowPositions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArrowPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalArrowPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArrowPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalDragMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDragMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalDragMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDragMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalDragMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDragMinHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalDragMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDragMinHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGutter")(js.undefined)
        ret
    }
  }
  
}

