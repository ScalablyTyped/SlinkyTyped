package typingsSlinky.apolloDashServerDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.cache
  import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.dataSources
  import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.debug
  import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.executor
  import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.fieldResolver
  import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.formatError
  import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.formatResponse
  import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.rootValue
  import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.tracing
  import typingsSlinky.apolloDashServerDashCore.apolloDashServerDashCoreStrings.validationRules
  import typingsSlinky.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
  import typingsSlinky.apolloDashServerDashPluginDashBase.apolloDashServerDashPluginDashBaseMod.ApolloServerPlugin
  import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
  import typingsSlinky.graphql.graphqlMod.GraphQLSchema
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Record

  type BaseConfig = Pick[
    GraphQLServerOptions[Context[js.Object], js.Any], 
    formatError | debug | rootValue | validationRules | executor | formatResponse | fieldResolver | tracing | dataSources | cache
  ]
  type Context[T] = T
  type ContextFunction[FunctionParams, ProducedContext] = js.Function1[/* context */ FunctionParams, ValueOrPromise[Context[ProducedContext]]]
  type PluginDefinition = (ApolloServerPlugin[Record[String, js.Any]]) | (js.Function0[ApolloServerPlugin[Record[String, js.Any]]])
  type SchemaChangeCallback = js.Function1[/* schema */ GraphQLSchema, Unit]
  type Unsubscriber = js.Function0[Unit]
}
