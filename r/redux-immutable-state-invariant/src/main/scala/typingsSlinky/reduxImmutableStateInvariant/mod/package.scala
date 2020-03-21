package typingsSlinky.reduxImmutableStateInvariant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type immutableStateInvariantMiddlewareInterface = js.Function1[
    /* options */ js.UndefOr[
      typingsSlinky.reduxImmutableStateInvariant.mod.immutableStateInvariantMiddlewareOptions
    ], 
    typingsSlinky.redux.mod.Middleware[
      js.Object, 
      js.Any, 
      typingsSlinky.redux.mod.Dispatch[typingsSlinky.redux.mod.AnyAction]
    ]
  ]
}
