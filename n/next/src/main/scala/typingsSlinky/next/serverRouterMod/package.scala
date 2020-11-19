package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serverRouterMod {
  
  type DynamicRoutes = js.Array[typingsSlinky.next.anon.Page]
  
  type PageChecker = js.Function1[/* pathname */ java.lang.String, js.Promise[scala.Boolean]]
  
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type RouteMatch = js.Function1[
    /* pathname */ js.UndefOr[java.lang.String | scala.Null], 
    typingsSlinky.next.nextBooleans.`false` | typingsSlinky.next.serverRouterMod.Params
  ]
}
