package typingsSlinky.reactNativeTabView

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeTabView.pagerMod.Props
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGestureHandlerProps extends js.Object {
  var keyboardDismissMode: String = js.native
  var `lazy`: Boolean = js.native
  var lazyPreloadDistance: Double = js.native
  var removeClippedSubviews: Boolean = js.native
  var swipeEnabled: Boolean = js.native
  var tabBarPosition: String = js.native
  def renderLazyPlaceholder(): Null = js.native
  def renderPager(props: Props[_]): ReactElement = js.native
  def renderTabBar[P /* <: Route */](props: typingsSlinky.reactNativeTabView.tabBarMod.Props[P]): ReactElement = js.native
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
  @scala.inline
  implicit class AnonGestureHandlerPropsOps[Self <: AnonGestureHandlerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyboardDismissMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardDismissMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLazyPreloadDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyPreloadDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveClippedSubviews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderLazyPlaceholder(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLazyPlaceholder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderPager(value: Props[_] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPager")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderTabBar(value: typingsSlinky.reactNativeTabView.tabBarMod.Props[js.Any] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTabBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSwipeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabBarPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

