package typingsSlinky.antDesignPro.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.authorizedRouteMod.IAuthorizedRouteProps
import typingsSlinky.antDesignPro.authorizedRouteMod.authority
import typingsSlinky.antDesignPro.authorizedRouteMod.default
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.RouteChildrenProps
import typingsSlinky.reactRouter.mod.RouteComponentProps
import typingsSlinky.reactRouter.mod.StaticContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthorizedRoute {
  
  @scala.inline
  def apply(authority: authority): Builder = {
    val __props = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IAuthorizedRouteProps]))
  }
  
  @JSImport("ant-design-pro/lib/Authorized/AuthorizedRoute", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
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
  
  def withProps(p: IAuthorizedRouteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
