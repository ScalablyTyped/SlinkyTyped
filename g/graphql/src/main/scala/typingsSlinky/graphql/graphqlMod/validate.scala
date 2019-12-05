package typingsSlinky.graphql.graphqlMod

import typingsSlinky.graphql.Anon_MaxErrors
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.validationValidationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "validate")
@js.native
object validate extends js.Object {
  def apply(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo
  ): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def apply(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo,
    options: Anon_MaxErrors
  ): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
}

