package typingsSlinky.reactAuthKit

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.reactRouter.mod.RouteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateRouteMod extends Shortcut {
  
  /**
    * Private Route for Components
    *
    * @remarks
    * This Component is based on {@link https://reactrouter.com/web/api/Route | reactrouter.Route}.
    * So you need to install react-route-dom before use it
    *
    * @param props
    */
  @JSImport("react-auth-kit/PrivateRoute", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PrivateRouteProps] = js.native
  
  @js.native
  trait PrivateRouteProps extends RouteProps {
    
    var loginPath: String = js.native
  }
  object PrivateRouteProps {
    
    @scala.inline
    def apply(loginPath: String): PrivateRouteProps = {
      val __obj = js.Dynamic.literal(loginPath = loginPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateRouteProps]
    }
    
    @scala.inline
    implicit class PrivateRoutePropsMutableBuilder[Self <: PrivateRouteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoginPath(value: String): Self = StObject.set(x, "loginPath", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[PrivateRouteProps]
  
  /* This means you don't have to write `default`, but can instead just say `privateRouteMod.foo` */
  override def _to: ReactComponentClass[PrivateRouteProps] = default
}
