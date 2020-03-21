package typingsSlinky.reactNativeTabView

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeTabView.pagerMod.Props
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGestureHandlerProps extends js.Object {
  var keyboardDismissMode: String
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var removeClippedSubviews: Boolean
  var swipeEnabled: Boolean
  var tabBarPosition: String
  def renderLazyPlaceholder(): Null
  def renderPager(props: Props[_]): ReactElement
  def renderTabBar[P /* <: Route */](props: typingsSlinky.reactNativeTabView.tabBarMod.Props[P]): ReactElement
}

object AnonGestureHandlerProps {
  @scala.inline
  def apply(
    keyboardDismissMode: String,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    removeClippedSubviews: Boolean,
    renderLazyPlaceholder: () => Null,
    renderPager: Props[_] => ReactElement,
    renderTabBar: typingsSlinky.reactNativeTabView.tabBarMod.Props[js.Any] => ReactElement,
    swipeEnabled: Boolean,
    tabBarPosition: String
  ): AnonGestureHandlerProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], removeClippedSubviews = removeClippedSubviews.asInstanceOf[js.Any], renderLazyPlaceholder = js.Any.fromFunction0(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderTabBar = js.Any.fromFunction1(renderTabBar), swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGestureHandlerProps]
  }
}

