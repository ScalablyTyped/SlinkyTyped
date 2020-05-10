package typingsSlinky.reactNative.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.reactNativeStrings.Dragging
import typingsSlinky.reactNative.reactNativeStrings.Idle
import typingsSlinky.reactNative.reactNativeStrings.Settling
import typingsSlinky.reactNative.reactNativeStrings.`on-drag`
import typingsSlinky.reactNative.reactNativeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewPagerAndroidProps extends ViewProps {
  /**
    * Index of initial page that should be selected. Use `setPage` method to
    * update the page, and `onPageSelected` to monitor page changes
    */
  var initialPage: js.UndefOr[Double] = js.native
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    *   - 'none' (the default), drags do not dismiss the keyboard.
    *   - 'on-drag', the keyboard is dismissed when a drag begins.
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.native
  /**
    * Executed when transitioning between pages (ether because of animation for
    * the requested page change or when user is swiping/dragging between pages)
    * The `event.nativeEvent` object for this callback will carry following data:
    *  - position - index of first page from the left that is currently visible
    *  - offset - value from range [0,1) describing stage between page transitions.
    *    Value x means that (1 - x) fraction of the page at "position" index is
    *    visible, and x fraction of the next page is visible.
    */
  var onPageScroll: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, ViewPagerAndroidOnPageScrollEventData], Unit]
  ] = js.native
  /**
    * Function called when the page scrolling state has changed.
    * The page scrolling state can be in 3 states:
    * - idle, meaning there is no interaction with the page scroller happening at the time
    * - dragging, meaning there is currently an interaction with the page scroller
    * - settling, meaning that there was an interaction with the page scroller, and the
    *   page scroller is now finishing it's closing or opening animation
    */
  var onPageScrollStateChanged: js.UndefOr[js.Function1[/* state */ Idle | Dragging | Settling, Unit]] = js.native
  /**
    * This callback will be called once ViewPager finish navigating to selected page
    * (when user swipes between pages). The `event.nativeEvent` object passed to this
    * callback will have following fields:
    *  - position - index of page that has been selected
    */
  var onPageSelected: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, ViewPagerAndroidOnPageSelectedEventData], Unit]
  ] = js.native
  /**
    * Blank space to show between pages. This is only visible while scrolling, pages are still
    * edge-to-edge.
    */
  var pageMargin: js.UndefOr[Double] = js.native
  /**
    * When false, the content does not scroll.
    * The default value is true.
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.native
}

object ViewPagerAndroidProps {
  @scala.inline
  def apply(): ViewPagerAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPagerAndroidProps]
  }
  @scala.inline
  implicit class ViewPagerAndroidPropsOps[Self <: ViewPagerAndroidProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPage")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardDismissMode(value: none | `on-drag`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardDismissMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageScroll(value: SyntheticEvent[NodeHandle, ViewPagerAndroidOnPageScrollEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageScrollStateChanged(value: /* state */ Idle | Dragging | Settling => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScrollStateChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageScrollStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageScrollStateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageSelected(value: SyntheticEvent[NodeHandle, ViewPagerAndroidOnPageSelectedEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withPageMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(js.undefined)
        ret
    }
  }
  
}

