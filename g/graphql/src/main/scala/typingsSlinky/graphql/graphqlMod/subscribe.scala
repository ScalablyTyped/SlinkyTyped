package typingsSlinky.graphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.executionExecuteMod.ExecutionResult
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.subscriptionSubscribeMod.SubscriptionArgs
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldResolver
import typingsSlinky.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "subscribe")
@js.native
object subscribe extends js.Object {
  def apply[TData](args: SubscriptionArgs): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def apply[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
}

