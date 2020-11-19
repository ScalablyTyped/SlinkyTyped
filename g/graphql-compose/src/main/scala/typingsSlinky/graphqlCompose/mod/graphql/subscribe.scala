package typingsSlinky.graphqlCompose.mod.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.subscribeMod.SubscriptionArgs
import typingsSlinky.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose", "graphql.subscribe")
@js.native
object subscribe extends js.Object {
  
  def apply(args: SubscriptionArgs): js.Promise[
    (AsyncIterableIterator[ExecutionResult[StringDictionary[_], StringDictionary[_]]]) | (ExecutionResult[StringDictionary[_], StringDictionary[_]])
  ] = js.native
  def apply(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[
    (AsyncIterableIterator[ExecutionResult[StringDictionary[_], StringDictionary[_]]]) | (ExecutionResult[StringDictionary[_], StringDictionary[_]])
  ] = js.native
}
