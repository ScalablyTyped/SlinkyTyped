package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.languageAstMod.ListTypeNode
import typingsSlinky.graphql.languageAstMod.NamedTypeNode
import typingsSlinky.graphql.languageAstMod.NonNullTypeNode
import typingsSlinky.graphql.typeDefinitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "typeFromAST")
@js.native
object typeFromAST extends js.Object {
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[typingsSlinky.graphql.typeDefinitionMod.GraphQLList[_]] = js.native
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[typingsSlinky.graphql.typeDefinitionMod.GraphQLNonNull[_]] = js.native
}

