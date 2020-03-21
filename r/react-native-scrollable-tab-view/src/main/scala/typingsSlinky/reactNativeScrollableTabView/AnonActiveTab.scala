package typingsSlinky.reactNativeScrollableTabView

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveTab extends js.Object {
  var activeTab: js.UndefOr[Double] = js.undefined
  var containerWidth: js.UndefOr[Double] = js.undefined
  var goToPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
  var scrollValue: js.UndefOr[Value] = js.undefined
  var tabs: js.UndefOr[js.Array[ReactElement]] = js.undefined
}

object AnonActiveTab {
  @scala.inline
  def apply(
    activeTab: Int | Double = null,
    containerWidth: Int | Double = null,
    goToPage: /* pageNumber */ Double => Unit = null,
    scrollValue: Value = null,
    tabs: js.Array[ReactElement] = null
  ): AnonActiveTab = {
    val __obj = js.Dynamic.literal()
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (goToPage != null) __obj.updateDynamic("goToPage")(js.Any.fromFunction1(goToPage))
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveTab]
  }
}

