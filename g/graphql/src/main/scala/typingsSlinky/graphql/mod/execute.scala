package typingsSlinky.graphql.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.executeMod.ExecutionArgs
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "execute")
@js.native
object execute extends js.Object {
  
  def apply(args: ExecutionArgs): PromiseOrValue[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
  def apply(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _]]]
  ): PromiseOrValue[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
}
