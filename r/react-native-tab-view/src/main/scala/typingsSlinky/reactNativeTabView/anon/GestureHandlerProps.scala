package typingsSlinky.reactNativeTabView.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeTabView.pagerMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GestureHandlerProps extends js.Object {
  
  var keyboardDismissMode: String = js.native
  
  var `lazy`: Boolean = js.native
  
  var lazyPreloadDistance: Double = js.native
  
  var removeClippedSubviews: Boolean = js.native
  
  def renderLazyPlaceholder(): Null = js.native
  
  def renderPager(props: Props[_]): ReactElement = js.native
  
  def renderTabBar[P /* <: typingsSlinky.reactNativeTabView.typesMod.Route */](props: typingsSlinky.reactNativeTabView.tabBarMod.Props[P]): ReactElement = js.native
  
  var swipeEnabled: Boolean = js.native
  
  var tabBarPosition: String = js.native
}
object GestureHandlerProps {
  
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
  ): GestureHandlerProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], removeClippedSubviews = removeClippedSubviews.asInstanceOf[js.Any], renderLazyPlaceholder = js.Any.fromFunction0(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderTabBar = js.Any.fromFunction1(renderTabBar), swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerProps]
  }
  
  @scala.inline
  implicit class GestureHandlerPropsOps[Self <: GestureHandlerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyboardDismissMode(value: String): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyPreloadDistance(value: Double): Self = this.set("lazyPreloadDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderLazyPlaceholder(value: () => Null): Self = this.set("renderLazyPlaceholder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderPager(value: Props[_] => ReactElement): Self = this.set("renderPager", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderTabBar(value: typingsSlinky.reactNativeTabView.tabBarMod.Props[js.Any] => ReactElement): Self = this.set("renderTabBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwipeEnabled(value: Boolean): Self = this.set("swipeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarPosition(value: String): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
  }
}
