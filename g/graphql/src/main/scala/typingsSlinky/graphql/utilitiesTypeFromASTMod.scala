package typingsSlinky.graphql

import typingsSlinky.graphql.languageAstMod.ListTypeNode
import typingsSlinky.graphql.languageAstMod.NamedTypeNode
import typingsSlinky.graphql.languageAstMod.NonNullTypeNode
import typingsSlinky.graphql.typeDefinitionMod.GraphQLList
import typingsSlinky.graphql.typeDefinitionMod.GraphQLNamedType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLNonNull
import typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/typeFromAST", JSImport.Namespace)
@js.native
object utilitiesTypeFromASTMod extends js.Object {
  def typeFromAST(schema: GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[GraphQLList[_]] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[GraphQLNonNull[_]] = js.native
}

