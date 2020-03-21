package typingsSlinky.graphql

import typingsSlinky.graphql.astMod.ListTypeNode
import typingsSlinky.graphql.astMod.NamedTypeNode
import typingsSlinky.graphql.astMod.NonNullTypeNode
import typingsSlinky.graphql.definitionMod.GraphQLList
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLNonNull
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/typeFromAST", JSImport.Namespace)
@js.native
object typeFromASTMod extends js.Object {
  def typeFromAST(schema: GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[GraphQLList[_]] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[GraphQLNonNull[_]] = js.native
}

