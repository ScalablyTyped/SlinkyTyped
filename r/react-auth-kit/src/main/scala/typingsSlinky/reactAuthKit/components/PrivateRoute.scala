package typingsSlinky.reactAuthKit.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactAuthKit.privateRouteMod.PrivateRouteProps
import typingsSlinky.reactRouter.mod.RouteChildrenProps
import typingsSlinky.reactRouter.mod.RouteComponentProps
import typingsSlinky.reactRouter.mod.StaticContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrivateRoute {
  
  @scala.inline
  def apply(loginPath: String): Builder = {
    val __props = js.Dynamic.literal(loginPath = loginPath.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PrivateRouteProps]))
  }
  
  @JSImport("react-auth-kit", "PrivateRoute")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(
      value: (js.Function1[/* props */ RouteChildrenProps[_, LocationState], ReactElement]) | ReactElement
    ): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* props */ RouteChildrenProps[_, LocationState] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactComponentClass[_ | (RouteComponentProps[_, StaticContext, LocationState])]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[_ | (RouteComponentProps[_, StaticContext, LocationState])]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[_ | (RouteComponentProps[_, StaticContext, LocationState])]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def exact(value: Boolean): this.type = set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def location(value: Location[LocationState]): this.type = set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def path(value: String | js.Array[String]): this.type = set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pathVarargs(value: String*): this.type = set("path", js.Array(value :_*))
    
    @scala.inline
    def render(value: /* props */ RouteComponentProps[_, StaticContext, LocationState] => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def sensitive(value: Boolean): this.type = set("sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strict(value: Boolean): this.type = set("strict", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PrivateRouteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
