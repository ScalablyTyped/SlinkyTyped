package typingsSlinky.expressGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to configure the graphqlHTTP middleware by providing a schema
  * and other configuration options.
  *
  * Options can be provided as an Object, a Promise for an Object, or a Function
  * that returns an Object or a Promise for an Object.
  */
/* Rewritten from type alias, can be one of: 
  - js.Function3[
/ * request * / typingsSlinky.expressGraphql.mod.Request, 
/ * response * / typingsSlinky.expressGraphql.mod.Response, 
/ * params * / js.UndefOr[typingsSlinky.expressGraphql.mod.GraphQLParams], 
typingsSlinky.expressGraphql.mod.OptionsResult]
  - typingsSlinky.expressGraphql.mod.OptionsResult
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(
    value: js.Function3[
      /* request */ Request, 
      /* response */ Response, 
      /* params */ js.UndefOr[GraphQLParams], 
      OptionsResult
    ]
  ): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: OptionsResult): Options = value.asInstanceOf[Options]
}

