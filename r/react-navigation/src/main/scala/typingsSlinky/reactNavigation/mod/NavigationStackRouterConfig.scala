package typingsSlinky.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationStackRouterConfig extends StObject {
  
  var initialRouteKey: js.UndefOr[String] = js.native
  
  var initialRouteName: js.UndefOr[String] = js.native
  
  var initialRouteParams: js.UndefOr[NavigationParams] = js.native
  
  var paths: js.UndefOr[NavigationPathsConfig] = js.native
}
object NavigationStackRouterConfig {
  
  @scala.inline
  def apply(): NavigationStackRouterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationStackRouterConfig]
  }
  
  @scala.inline
  implicit class NavigationStackRouterConfigMutableBuilder[Self <: NavigationStackRouterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialRouteKey(value: String): Self = StObject.set(x, "initialRouteKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRouteKeyUndefined: Self = StObject.set(x, "initialRouteKey", js.undefined)
    
    @scala.inline
    def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    @scala.inline
    def setInitialRouteParams(value: NavigationParams): Self = StObject.set(x, "initialRouteParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRouteParamsUndefined: Self = StObject.set(x, "initialRouteParams", js.undefined)
    
    @scala.inline
    def setPaths(value: NavigationPathsConfig): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
  }
}
