package typingsSlinky.reduxLittleRouter.mod

import typingsSlinky.reduxLittleRouter.anon.BaseUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpressRouterArgs extends StObject {
  
  var request: BaseUrl = js.native
  
  var routes: Routes = js.native
}
object ExpressRouterArgs {
  
  @scala.inline
  def apply(request: BaseUrl, routes: Routes): ExpressRouterArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressRouterArgs]
  }
  
  @scala.inline
  implicit class ExpressRouterArgsMutableBuilder[Self <: ExpressRouterArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: BaseUrl): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: Routes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
  }
}
