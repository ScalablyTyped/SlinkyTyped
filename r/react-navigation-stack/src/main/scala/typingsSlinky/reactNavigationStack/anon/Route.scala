package typingsSlinky.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends StObject {
  
  var route: typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String] = js.native
}
object Route {
  
  @scala.inline
  def apply(route: typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]): Route = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoute(value: typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
