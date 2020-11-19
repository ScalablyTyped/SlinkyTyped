package typingsSlinky.graphql

import typingsSlinky.graphql.anon.MaxErrors
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import typingsSlinky.graphql.typeInfoMod.TypeInfo
import typingsSlinky.graphql.validationContextMod.ASTValidationContext
import typingsSlinky.graphql.validationContextMod.SDLValidationContext
import typingsSlinky.graphql.validationContextMod.ValidationRule
import typingsSlinky.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/validation", JSImport.Namespace)
@js.native
object validationMod extends js.Object {
  
  def ExecutableDefinitionsRule(context: ASTValidationContext): ASTVisitor = js.native
  
  def FieldsOnCorrectTypeRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def FragmentsOnCompositeTypesRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def KnownArgumentNamesRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def KnownDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def KnownFragmentNamesRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def KnownTypeNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownTypeNamesRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def LoneAnonymousOperationRule(context: ASTValidationContext): ASTVisitor = js.native
  
  def LoneSchemaDefinitionRule(context: SDLValidationContext): ASTVisitor = js.native
  
  def NoDeprecatedCustomRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def NoFragmentCyclesRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def NoSchemaIntrospectionCustomRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def NoUndefinedVariablesRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def NoUnusedFragmentsRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def NoUnusedVariablesRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def OverlappingFieldsCanBeMergedRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def PossibleFragmentSpreadsRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def PossibleTypeExtensionsRule(context: SDLValidationContext): ASTVisitor = js.native
  
  def ProvidedRequiredArgumentsRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def ScalarLeafsRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def SingleFieldSubscriptionsRule(context: ASTValidationContext): ASTVisitor = js.native
  
  def UniqueArgumentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  
  def UniqueDirectiveNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  
  def UniqueDirectivesPerLocationRule(context: ASTValidationContext): ASTVisitor = js.native
  
  def UniqueEnumValueNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  
  def UniqueFieldDefinitionNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  
  def UniqueFragmentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  
  def UniqueInputFieldNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  
  def UniqueOperationNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  
  def UniqueOperationTypesRule(context: SDLValidationContext): ASTVisitor = js.native
  
  def UniqueTypeNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  
  def UniqueVariableNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  
  def ValuesOfCorrectTypeRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def VariablesAreInputTypesRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  def VariablesInAllowedPositionRule(context: typingsSlinky.graphql.validationContextMod.ValidationContext): ASTVisitor = js.native
  
  val specifiedRules: js.Array[ValidationRule] = js.native
  
  def validate(schema: GraphQLSchema, documentAST: DocumentNode): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.UndefOr[scala.Nothing],
    typeInfo: js.UndefOr[scala.Nothing],
    options: MaxErrors
  ): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.UndefOr[scala.Nothing],
    typeInfo: TypeInfo
  ): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.UndefOr[scala.Nothing],
    typeInfo: TypeInfo,
    options: MaxErrors
  ): js.Array[GraphQLError] = js.native
  def validate(schema: GraphQLSchema, documentAST: DocumentNode, rules: js.Array[ValidationRule]): js.Array[GraphQLError] = js.native
  def validate(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: js.UndefOr[scala.Nothing],
    options: MaxErrors
  ): js.Array[GraphQLError] = js.native
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
  
  @js.native
  class ValidationContext protected ()
    extends typingsSlinky.graphql.validationContextMod.ValidationContext {
    def this(
      schema: GraphQLSchema,
      ast: DocumentNode,
      typeInfo: TypeInfo,
      onError: js.Function1[/* err */ GraphQLError, Unit]
    ) = this()
  }
}
