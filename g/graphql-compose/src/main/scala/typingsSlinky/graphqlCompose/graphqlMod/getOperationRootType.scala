package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.astMod.OperationTypeDefinitionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/graphql", "getOperationRootType")
@js.native
object getOperationRootType extends js.Object {
  
  def apply(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, operation: OperationDefinitionNode): typingsSlinky.graphql.definitionMod.GraphQLObjectType[_, _] = js.native
  def apply(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, operation: OperationTypeDefinitionNode): typingsSlinky.graphql.definitionMod.GraphQLObjectType[_, _] = js.native
}
