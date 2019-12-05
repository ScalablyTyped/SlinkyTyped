package typingsSlinky.graphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.languageAstMod.OperationDefinitionNode
import typingsSlinky.graphql.languageAstMod.OperationTypeDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "getOperationRootType")
@js.native
object getOperationRootType extends js.Object {
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, operation: OperationDefinitionNode): typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, operation: OperationTypeDefinitionNode): typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
}

