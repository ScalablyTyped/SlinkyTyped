package typingsSlinky.graphqlCompose.mod.graphql

import typingsSlinky.graphql.astMod.ListTypeNode
import typingsSlinky.graphql.astMod.NamedTypeNode
import typingsSlinky.graphql.astMod.NonNullTypeNode
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose", "graphql.typeFromAST")
@js.native
object typeFromAST extends js.Object {
  
  def apply(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLList[_]] = js.native
  def apply(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def apply(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLNonNull[_]] = js.native
}
