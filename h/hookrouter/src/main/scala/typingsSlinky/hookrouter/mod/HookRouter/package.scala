package typingsSlinky.hookrouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object HookRouter {
  
  type InterceptedPath = java.lang.String | scala.Null
  
  type QueryParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type RouteObject = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* params */ typingsSlinky.hookrouter.mod.HookRouter.QueryParams, js.Any]
  ]
}
