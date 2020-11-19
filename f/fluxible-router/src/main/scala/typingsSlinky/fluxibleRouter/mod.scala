package typingsSlinky.fluxibleRouter

import typingsSlinky.fluxible.baseStoreMod.^
import typingsSlinky.fluxible.mod.FluxibleContext
import typingsSlinky.fluxibleRouter.anon.TypeofComponent
import typingsSlinky.fluxibleRouter.anon.TypeofRouteStore
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluxible-router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def handleHistory(Component: TypeofComponent): TypeofComponent = js.native
  def handleHistory(Component: TypeofComponent, opts: js.Object): TypeofComponent = js.native
  
  def navigateAction(context: FluxibleContext, params: js.Object): js.UndefOr[scala.Nothing] = js.native
  
  @js.native
  class NavLink ()
    extends Component[NavLinkProps, js.Any, js.Any]
  
  @js.native
  class NavLinkProps () extends js.Object {
    
    var activeStyle: js.UndefOr[js.Object] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var preserveScrollPosition: js.UndefOr[Boolean] = js.native
    
    var routeName: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  
  @js.native
  class RouteStore ()
    extends ^[js.Object] {
    
    @JSName("dehydrate")
    def dehydrate_MRouteStore(): js.Any = js.native
    @JSName("dehydrate")
    def dehydrate_MRouteStore(context: FluxibleContext): js.Any = js.native
    
    @JSName("rehydrate")
    def rehydrate_MRouteStore(state: js.Any): Unit = js.native
  }
  /* static members */
  @js.native
  object RouteStore extends js.Object {
    
    def withStaticRoutes(routes: js.Object): TypeofRouteStore = js.native
  }
}
