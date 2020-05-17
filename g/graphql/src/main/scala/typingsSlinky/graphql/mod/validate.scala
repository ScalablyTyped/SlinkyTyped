package typingsSlinky.graphql.mod

import typingsSlinky.graphql.anon.MaxErrors
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.validationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "validate")
@js.native
object validate extends js.Object {
  def apply(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo
  ): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo,
    options: MaxErrors
  ): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
}

