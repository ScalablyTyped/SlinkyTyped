package typingsSlinky.next.routeLoaderMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.next.routeLoaderMod.LoadedRouteSuccess
  - typingsSlinky.next.routeLoaderMod.LoadedRouteFailure
*/
trait RouteLoaderEntry extends js.Object
object RouteLoaderEntry {
  
  @scala.inline
  def LoadedRouteSuccess(component: ReactComponentClass[js.Object], exports: js.Any, styles: js.Array[RouteStyleSheet]): RouteLoaderEntry = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLoaderEntry]
  }
  
  @scala.inline
  def LoadedRouteFailure(error: js.Any): RouteLoaderEntry = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLoaderEntry]
  }
}
