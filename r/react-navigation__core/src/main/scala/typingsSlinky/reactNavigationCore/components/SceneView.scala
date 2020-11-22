package typingsSlinky.reactNavigationCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNavigationCore.anon.PartialStateNavigationSta
import typingsSlinky.reactNavigationCore.sceneViewMod.Props
import typingsSlinky.reactNavigationCore.typesMod.EventMapBase
import typingsSlinky.reactNavigationCore.typesMod.NavigationProp
import typingsSlinky.reactNavigationCore.typesMod.RouteConfig
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.reactNavigationRouters.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneView {
  
  @JSImport("@react-navigation/core/lib/typescript/src/SceneView", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def routeState(value: NavigationState[ParamListBase] | PartialStateNavigationSta): this.type = set("routeState", value.asInstanceOf[js.Any])
  }
  
  def withProps[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](p: Props[State, ScreenOptions, EventMap]): Builder[State, ScreenOptions, EventMap] = new Builder[State, ScreenOptions, EventMap](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
    getState: () => State,
    navigation: NavigationProp[ParamListBase, String, State, ScreenOptions, js.Object],
    options: js.Object,
    route: Route[String, js.UndefOr[js.Object]],
    screen: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap],
    setState: State => Unit
  ): Builder[State, ScreenOptions, EventMap] = {
    val __props = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], setState = js.Any.fromFunction1(setState))
    new Builder[State, ScreenOptions, EventMap](js.Array(this.component, __props.asInstanceOf[Props[State, ScreenOptions, EventMap]]))
  }
}
