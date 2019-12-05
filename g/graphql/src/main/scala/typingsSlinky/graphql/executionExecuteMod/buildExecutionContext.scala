package typingsSlinky.graphql.executionExecuteMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.typeDefinitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "buildExecutionContext")
@js.native
object buildExecutionContext extends js.Object {
  def apply(
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    rawVariableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Array[GraphQLError] | ExecutionContext = js.native
  def apply(
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    rawVariableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]],
    typeResolver: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]
  ): js.Array[GraphQLError] | ExecutionContext = js.native
}

