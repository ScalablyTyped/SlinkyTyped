package typingsSlinky.graphql

import typingsSlinky.graphql.anon.MaxErrors
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import typingsSlinky.graphql.typeInfoMod.TypeInfo
import typingsSlinky.graphql.validationContextMod.SDLValidationRule
import typingsSlinky.graphql.validationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/validate", JSImport.Namespace)
@js.native
object validationValidateMod extends js.Object {
  def assertValidSDL(documentAST: DocumentNode): js.UndefOr[scala.Nothing] = js.native
  def assertValidSDLExtension(documentAST: DocumentNode, schema: GraphQLSchema): js.UndefOr[scala.Nothing] = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode): js.Array[GraphQLError] = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode, rules: js.Array[ValidationRule]): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: TypeInfo
  ): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: TypeInfo,
    options: MaxErrors
  ): js.Array[GraphQLError] = js.native
  def validateSDL(documentAST: DocumentNode): js.Array[GraphQLError] = js.native
  def validateSDL(documentAST: DocumentNode, schemaToExtend: Maybe[GraphQLSchema]): js.Array[GraphQLError] = js.native
  def validateSDL(
    documentAST: DocumentNode,
    schemaToExtend: Maybe[GraphQLSchema],
    rules: js.Array[SDLValidationRule]
  ): js.Array[GraphQLError] = js.native
}

