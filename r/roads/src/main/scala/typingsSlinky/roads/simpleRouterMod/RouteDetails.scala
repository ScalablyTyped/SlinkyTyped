package typingsSlinky.roads.simpleRouterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.roads.roadMod.ResponseMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteDetails extends js.Object {
  
  var method: String = js.native
  
  var path: String = js.native
  
  def route(path: SimpleRouterURL, body: String, headers: StringDictionary[js.Any], next: ResponseMiddleware): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
  @JSName("route")
  var route_Original: Route = js.native
}
