package typingsSlinky.atFeathersjsFeathers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFeathersjsFeathersMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersStrings.__feathersSkipHooks
  import typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersStrings.paginate
  import typingsSlinky.atFeathersjsFeathers.atFeathersjsFeathersStrings.query
  import typingsSlinky.std.Pick

  type ClientSideParams = Pick[Params, query | paginate]
  // tslint:disable-next-line void-return
  type Hook = js.Function1[
    /* hook */ HookContext[js.Any], 
    (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
  ]
  type Id = Double | String
  type NullableId = Id | Null
  type Query = StringDictionary[js.Any]
  type ServerSideParams = Params
  type Service[T] = ServiceOverloads[T] with ServiceAddons[T] with ServiceMethods[T]
  type SkipSymbol = js.Symbol | __feathersSkipHooks
}
