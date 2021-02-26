package typingsSlinky.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationLeafRoute[Params] extends StObject {
  
  /**
    * Index that represents the depth of the stack
    */
  var index: Double = js.native
  
  /**
    * Flag that indicates the transition state of the route
    */
  var isTransitioning: Boolean = js.native
  
  /**
    * React's key used by some navigators. No need to specify these manually,
    * they will be defined by the router.
    */
  var key: String = js.native
  
  /**
    * Params passed to this route when navigating to it,
    * e.g. `{ car_id: 123 }` in a route that displays a car.
    */
  var params: js.UndefOr[Params] = js.native
  
  /**
    * Path is an advanced feature used for deep linking and on the web.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * For example 'Home'.
    * This is used as a key in a route config when creating a navigator.
    */
  var routeName: String = js.native
  
  /**
    * Array containing the navigator's routes
    */
  var routes: js.Array[NavigationRoute[NavigationParams]] = js.native
}
object NavigationLeafRoute {
  
  @scala.inline
  def apply[Params](
    index: Double,
    isTransitioning: Boolean,
    key: String,
    routeName: String,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): NavigationLeafRoute[Params] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationLeafRoute[Params]]
  }
  
  @scala.inline
  implicit class NavigationLeafRouteMutableBuilder[Self <: NavigationLeafRoute[_], Params] (val x: Self with NavigationLeafRoute[Params]) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTransitioning(value: Boolean): Self = StObject.set(x, "isTransitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: js.Array[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: NavigationRoute[NavigationParams]*): Self = StObject.set(x, "routes", js.Array(value :_*))
  }
}
