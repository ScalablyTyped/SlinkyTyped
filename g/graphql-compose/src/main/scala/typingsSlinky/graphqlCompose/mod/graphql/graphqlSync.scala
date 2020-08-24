package typingsSlinky.graphqlCompose.mod.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.graphqlMod.GraphQLArgs
import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.graphqlSync")
@js.native
object graphqlSync extends js.Object {
  def apply(args: GraphQLArgs): ExecutionResult[StringDictionary[_], StringDictionary[_]] = js.native
  def apply(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    source: typingsSlinky.graphql.sourceMod.Source | String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _]]]
  ): ExecutionResult[StringDictionary[_], StringDictionary[_]] = js.native
}

