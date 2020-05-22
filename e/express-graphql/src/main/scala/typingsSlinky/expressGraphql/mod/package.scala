package typingsSlinky.expressGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Middleware = js.Function2[
    /* request */ typingsSlinky.expressGraphql.mod.Request, 
    /* response */ typingsSlinky.expressGraphql.mod.Response, 
    js.Promise[js.UndefOr[scala.Nothing]]
  ]
  /**
    * Used to configure the graphqlHTTP middleware by providing a schema
    * and other configuration options.
    *
    * Options can be provided as an Object, a Promise for an Object, or a Function
    * that returns an Object or a Promise for an Object.
    */
  type Options = (js.Function3[
    /* request */ typingsSlinky.expressGraphql.mod.Request, 
    /* response */ typingsSlinky.expressGraphql.mod.Response, 
    /* params */ js.UndefOr[typingsSlinky.expressGraphql.mod.GraphQLParams], 
    typingsSlinky.expressGraphql.mod.OptionsResult
  ]) | typingsSlinky.expressGraphql.mod.OptionsResult
  type OptionsResult = typingsSlinky.expressGraphql.mod.OptionsData | js.Promise[typingsSlinky.expressGraphql.mod.OptionsData]
  type Request = typingsSlinky.node.httpMod.IncomingMessage
  type Response = typingsSlinky.node.httpMod.ServerResponse
}
