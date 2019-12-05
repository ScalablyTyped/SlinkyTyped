package typingsSlinky.graphql

import typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.languageVisitorMod.ASTVisitor
import typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
import typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo
import typingsSlinky.graphql.validationValidationContextMod.ASTValidationContext
import typingsSlinky.graphql.validationValidationContextMod.SDLValidationContext
import typingsSlinky.graphql.validationValidationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation", JSImport.Namespace)
@js.native
object validationMod extends js.Object {
  @js.native
  class ValidationContext protected ()
    extends typingsSlinky.graphql.validationValidationContextMod.ValidationContext {
    def this(schema: GraphQLSchema, ast: DocumentNode, typeInfo: TypeInfo) = this()
    def this(
      schema: GraphQLSchema,
      ast: DocumentNode,
      typeInfo: TypeInfo,
      onError: js.Function1[/* err */ GraphQLError, Unit]
    ) = this()
  }
  
  val specifiedRules: js.Array[ValidationRule] = js.native
  def FieldsOnCorrectTypeRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def FragmentsOnCompositeTypesRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownArgumentNamesRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownDirectivesRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownFragmentNamesRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def KnownTypeNamesRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def LoneAnonymousOperationRule(context: ASTValidationContext): ASTVisitor = js.native
  def NoFragmentCyclesRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUndefinedVariablesRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUnusedFragmentsRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def NoUnusedVariablesRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def OverlappingFieldsCanBeMergedRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def PossibleFragmentSpreadsRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def ProvidedRequiredArgumentsRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def ScalarLeafsRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def SingleFieldSubscriptionsRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueArgumentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueDirectivesPerLocationRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueFragmentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueInputFieldNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueOperationNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def UniqueVariableNamesRule(context: ASTValidationContext): ASTVisitor = js.native
  def ValuesOfCorrectTypeRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def VariablesAreInputTypesRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
  def VariablesInAllowedPositionRule(context: typingsSlinky.graphql.validationValidationContextMod.ValidationContext): ASTVisitor = js.native
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
    options: Anon_MaxErrors
  ): js.Array[GraphQLError] = js.native
}

