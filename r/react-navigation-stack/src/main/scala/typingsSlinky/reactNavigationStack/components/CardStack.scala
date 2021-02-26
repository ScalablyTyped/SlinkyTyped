package typingsSlinky.reactNavigationStack.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.reactNavigation.mod.NavigationState
import typingsSlinky.reactNavigationStack.anon.Route
import typingsSlinky.reactNavigationStack.cardStackMod.default
import typingsSlinky.reactNavigationStack.headerContainerMod.Props
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardMode
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardStack {
  
  @scala.inline
  def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    getGesturesEnabled: Route => Boolean,
    getPreviousRoute: Route => js.UndefOr[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]],
    headerMode: StackHeaderMode,
    insets: EdgeInsets,
    isParentHeaderShown: Boolean,
    mode: StackCardMode,
    onCloseRoute: Route => Unit,
    onOpenRoute: Route => Unit,
    onTransitionEnd: (Route, Boolean) => Unit,
    onTransitionStart: (Route, Boolean) => Unit,
    openingRouteKeys: js.Array[String],
    renderHeader: Props => ReactElement,
    renderScene: Route => ReactElement,
    routes: js.Array[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]],
    state: NavigationState
  ): Builder = {
    val __props = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], getGesturesEnabled = js.Any.fromFunction1(getGesturesEnabled), getPreviousRoute = js.Any.fromFunction1(getPreviousRoute), headerMode = headerMode.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], isParentHeaderShown = isParentHeaderShown.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1(onCloseRoute), onOpenRoute = js.Any.fromFunction1(onOpenRoute), onTransitionEnd = js.Any.fromFunction2(onTransitionEnd), onTransitionStart = js.Any.fromFunction2(onTransitionStart), openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), routes = routes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactNavigationStack.cardStackMod.Props]))
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardStack", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def detachInactiveScreens(value: Boolean): this.type = set("detachInactiveScreens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onGestureCancel(value: /* props */ Route => Unit): this.type = set("onGestureCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onGestureEnd(value: /* props */ Route => Unit): this.type = set("onGestureEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onGestureStart(value: /* props */ Route => Unit): this.type = set("onGestureStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPageChangeCancel(value: () => Unit): this.type = set("onPageChangeCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def onPageChangeConfirm(value: /* force */ Boolean => Unit): this.type = set("onPageChangeConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPageChangeStart(value: () => Unit): this.type = set("onPageChangeStart", js.Any.fromFunction0(value))
  }
  
  def withProps(p: typingsSlinky.reactNavigationStack.cardStackMod.Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
