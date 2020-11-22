package typingsSlinky.reactOnsenui.mod

import typingsSlinky.reactOnsenui.anon.Key
import typingsSlinky.reactOnsenui.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-onsenui", "RouterUtil")
@js.native
object RouterUtil extends js.Object {
  
  def init(routes: js.Array[Route]): RouteConfig = js.native
  
  def pop(config: Options): RouteConfig = js.native
  
  def postPop(routeConfig: RouteConfig): RouteConfig = js.native
  
  def postPush(routeConfig: RouteConfig): RouteConfig = js.native
  
  def push(config: Key): RouteConfig = js.native
  
  def replace(config: Key): RouteConfig = js.native
  
  def reset(config: Key): RouteConfig = js.native
}
