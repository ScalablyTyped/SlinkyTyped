package typingsSlinky.apolloServerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Context[T] = T
  
  type ContextFunction[FunctionParams, ProducedContext] = js.Function1[
    /* context */ FunctionParams, 
    typingsSlinky.apolloServerTypes.mod.ValueOrPromise[typingsSlinky.apolloServerCore.typesMod.Context[ProducedContext]]
  ]
  
  type PluginDefinition = typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin[typingsSlinky.apolloServerTypes.mod.BaseContext] | (js.Function0[
    typingsSlinky.apolloServerPluginBase.mod.ApolloServerPlugin[typingsSlinky.apolloServerTypes.mod.BaseContext]
  ])
  
  type SchemaChangeCallback = js.Function1[/* schema */ typingsSlinky.graphql.mod.GraphQLSchema, scala.Unit]
  
  type Unsubscriber = js.Function0[scala.Unit]
}
