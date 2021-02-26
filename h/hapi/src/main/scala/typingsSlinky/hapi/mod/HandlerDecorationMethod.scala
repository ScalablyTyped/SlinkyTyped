package typingsSlinky.hapi.mod

import typingsSlinky.hapi.mod.Lifecycle.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandlerDecorationMethod extends StObject {
  
  def apply(route: RouteOptions, options: js.Any): Method = js.native
  
  var defaults: js.UndefOr[RouteOptions | (js.Function1[/* method */ js.Any, RouteOptions])] = js.native
}
