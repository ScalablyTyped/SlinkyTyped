package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.anon.Directives
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.directivesMod.GraphQLDirective
import typingsSlinky.graphql.executeMod.ExecutionArgs
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.pathMod.Path
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/execution", JSImport.Namespace)
@js.native
object executionMod extends js.Object {
  
  val defaultFieldResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  
  val defaultTypeResolver: GraphQLTypeResolver[js.Any, js.Any] = js.native
  
  def execute(args: ExecutionArgs): PromiseOrValue[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
  def execute(
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _]]]
  ): PromiseOrValue[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
  
  def executeSync(args: ExecutionArgs): ExecutionResult[StringDictionary[_], StringDictionary[_]] = js.native
  
  def getDirectiveValues(directiveDef: GraphQLDirective, node: Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: Directives, variableValues: Maybe[StringDictionary[_]]): js.UndefOr[StringDictionary[js.Any]] = js.native
  
  def responsePathAsArray(path: Path): js.Array[String | Double] = js.native
}
