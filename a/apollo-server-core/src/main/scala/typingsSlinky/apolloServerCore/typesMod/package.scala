package typingsSlinky.apolloServerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Context[T] = T
  type ContextFunction[FunctionParams, ProducedContext] = js.Function1[
    /* context */ FunctionParams, 
    typingsSlinky.apolloServerTypes.mod.ValueOrPromise[typingsSlinky.apolloServerCore.typesMod.Context[ProducedContext]]
  ]
  type SchemaChangeCallback = js.Function1[/* schema */ typingsSlinky.graphql.mod.GraphQLSchema, scala.Unit]
  type Unsubscriber = js.Function0[scala.Unit]
}
