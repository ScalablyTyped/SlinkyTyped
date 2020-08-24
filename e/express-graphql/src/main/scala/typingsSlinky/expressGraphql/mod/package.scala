package typingsSlinky.expressGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MaybePromise[T] = js.Promise[T] | T
  type Middleware = js.Function2[
    /* request */ typingsSlinky.expressGraphql.mod.Request, 
    /* response */ typingsSlinky.expressGraphql.mod.Response, 
    js.Promise[scala.Unit]
  ]
  type Options = (js.Function3[
    /* request */ typingsSlinky.expressGraphql.mod.Request, 
    /* response */ typingsSlinky.expressGraphql.mod.Response, 
    /* params */ js.UndefOr[typingsSlinky.expressGraphql.mod.GraphQLParams], 
    typingsSlinky.expressGraphql.mod.MaybePromise[typingsSlinky.expressGraphql.mod.OptionsData]
  ]) | typingsSlinky.expressGraphql.mod.MaybePromise[typingsSlinky.expressGraphql.mod.OptionsData]
  type Request = typingsSlinky.node.httpMod.IncomingMessage
}
