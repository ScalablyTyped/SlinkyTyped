package typingsSlinky.hookrouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HookRouter {
  type QueryParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RouteObject = org.scalablytyped.runtime.StringDictionary[
    js.Function1[/* params */ typingsSlinky.hookrouter.mod.HookRouter.QueryParams, js.Any]
  ]
}
