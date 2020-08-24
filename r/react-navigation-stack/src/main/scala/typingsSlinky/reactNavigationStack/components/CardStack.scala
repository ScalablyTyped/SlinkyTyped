package typingsSlinky.reactNavigationStack.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.reactNavigation.mod.NavigationState
import typingsSlinky.reactNavigationStack.anon.Route
import typingsSlinky.reactNavigationStack.cardStackMod.Props
import typingsSlinky.reactNavigationStack.cardStackMod.default
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardMode
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardStack {
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardStack", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def onPageChangeCancel(value: () => Unit): this.type = set("onPageChangeCancel", js.Any.fromFunction0(value))
    @scala.inline
    def onPageChangeConfirm(value: () => Unit): this.type = set("onPageChangeConfirm", js.Any.fromFunction0(value))
    @scala.inline
    def onPageChangeStart(value: () => Unit): this.type = set("onPageChangeStart", js.Any.fromFunction0(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    closingRouteKeys: js.Array[String],
    descriptors: StackDescriptorMap,
    getGesturesEnabled: Route => Boolean,
    getPreviousRoute: Route => js.UndefOr[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]],
    headerMode: StackHeaderMode,
    insets: EdgeInsets,
    mode: StackCardMode,
    onCloseRoute: Route => Unit,
    onOpenRoute: Route => Unit,
    onTransitionEnd: (Route, Boolean) => Unit,
    onTransitionStart: (Route, Boolean) => Unit,
    openingRouteKeys: js.Array[String],
    renderHeader: typingsSlinky.reactNavigationStack.headerContainerMod.Props => ReactElement,
    renderScene: Route => ReactElement,
    routes: js.Array[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]],
    state: NavigationState
  ): Builder = {
    val __props = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], getGesturesEnabled = js.Any.fromFunction1(getGesturesEnabled), getPreviousRoute = js.Any.fromFunction1(getPreviousRoute), headerMode = headerMode.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1(onCloseRoute), onOpenRoute = js.Any.fromFunction1(onOpenRoute), onTransitionEnd = js.Any.fromFunction2(onTransitionEnd), onTransitionStart = js.Any.fromFunction2(onTransitionStart), openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), routes = routes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

