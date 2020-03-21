package typingsSlinky.graphql.subscribeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/subscription/subscribe", "createSourceEventStream")
@js.native
object createSourceEventStream extends js.Object {
  def apply[TData](schema: GraphQLSchema, document: DocumentNode): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def apply[TData](schema: GraphQLSchema, document: DocumentNode, rootValue: js.Any): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def apply[TData](schema: GraphQLSchema, document: DocumentNode, rootValue: js.Any, contextValue: js.Any): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def apply[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def apply[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def apply[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
}

