package typingsSlinky.roads.simpleRouterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.roads.roadMod.ResponseMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteDetails extends js.Object {
  var method: String = js.native
  var path: String = js.native
  @JSName("route")
  var route_Original: Route = js.native
  def route(path: String, body: String, headers: StringDictionary[js.Any], next: ResponseMiddleware): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
}

