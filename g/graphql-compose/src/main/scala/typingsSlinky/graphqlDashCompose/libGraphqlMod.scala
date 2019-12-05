package typingsSlinky.graphqlDashCompose

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.Anon_Directives
import typingsSlinky.graphql.Anon_MaxErrors
import typingsSlinky.graphql.errorFormatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.executionExecuteMod.ExecutionArgs
import typingsSlinky.graphql.executionExecuteMod.ExecutionResult
import typingsSlinky.graphql.graphqlGraphqlMod.GraphQLArgs
import typingsSlinky.graphql.jsutilsPathMod.Path
import typingsSlinky.graphql.jsutilsPromiseOrValueMod.PromiseOrValue
import typingsSlinky.graphql.languageAstMod.ASTKindToNode
import typingsSlinky.graphql.languageAstMod.ASTNode
import typingsSlinky.graphql.languageAstMod.ArgumentNode
import typingsSlinky.graphql.languageAstMod.BooleanValueNode
import typingsSlinky.graphql.languageAstMod.DirectiveDefinitionNode
import typingsSlinky.graphql.languageAstMod.DirectiveNode
import typingsSlinky.graphql.languageAstMod.DocumentNode
import typingsSlinky.graphql.languageAstMod.EnumTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.EnumTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.EnumValueDefinitionNode
import typingsSlinky.graphql.languageAstMod.EnumValueNode
import typingsSlinky.graphql.languageAstMod.FieldDefinitionNode
import typingsSlinky.graphql.languageAstMod.FieldNode
import typingsSlinky.graphql.languageAstMod.FloatValueNode
import typingsSlinky.graphql.languageAstMod.FragmentDefinitionNode
import typingsSlinky.graphql.languageAstMod.FragmentSpreadNode
import typingsSlinky.graphql.languageAstMod.InlineFragmentNode
import typingsSlinky.graphql.languageAstMod.InputObjectTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.InputObjectTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.InputValueDefinitionNode
import typingsSlinky.graphql.languageAstMod.IntValueNode
import typingsSlinky.graphql.languageAstMod.InterfaceTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.InterfaceTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.ListTypeNode
import typingsSlinky.graphql.languageAstMod.ListValueNode
import typingsSlinky.graphql.languageAstMod.NameNode
import typingsSlinky.graphql.languageAstMod.NamedTypeNode
import typingsSlinky.graphql.languageAstMod.NonNullTypeNode
import typingsSlinky.graphql.languageAstMod.NullValueNode
import typingsSlinky.graphql.languageAstMod.ObjectFieldNode
import typingsSlinky.graphql.languageAstMod.ObjectTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.ObjectTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.ObjectValueNode
import typingsSlinky.graphql.languageAstMod.OperationDefinitionNode
import typingsSlinky.graphql.languageAstMod.OperationTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.ScalarTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.ScalarTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.SchemaDefinitionNode
import typingsSlinky.graphql.languageAstMod.SchemaExtensionNode
import typingsSlinky.graphql.languageAstMod.SelectionSetNode
import typingsSlinky.graphql.languageAstMod.StringValueNode
import typingsSlinky.graphql.languageAstMod.TypeNode
import typingsSlinky.graphql.languageAstMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.languageAstMod.UnionTypeExtensionNode
import typingsSlinky.graphql.languageAstMod.ValueNode
import typingsSlinky.graphql.languageAstMod.VariableDefinitionNode
import typingsSlinky.graphql.languageAstMod.VariableNode
import typingsSlinky.graphql.languageDirectiveLocationMod._DirectiveLocation
import typingsSlinky.graphql.languageKindsMod._Kind
import typingsSlinky.graphql.languageLexerMod.Lexer
import typingsSlinky.graphql.languageLocationMod.SourceLocation
import typingsSlinky.graphql.languageParserMod.ParseOptions
import typingsSlinky.graphql.languageSourceMod.Location
import typingsSlinky.graphql.languageTokenKindMod._TokenKind
import typingsSlinky.graphql.languageVisitorMod.VisitFn
import typingsSlinky.graphql.languageVisitorMod.Visitor
import typingsSlinky.graphql.languageVisitorMod.VisitorKeyMap
import typingsSlinky.graphql.subscriptionSubscribeMod.SubscriptionArgs
import typingsSlinky.graphql.tsutilsMaybeMod.Maybe
import typingsSlinky.graphql.typeDefinitionMod.GraphQLAbstractType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLArgument
import typingsSlinky.graphql.typeDefinitionMod.GraphQLCompositeType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLEnumTypeConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputField
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputObjectTypeConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInterfaceTypeConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLLeafType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLNamedType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLNullableType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectTypeConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLOutputType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarTypeConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.typeDefinitionMod.GraphQLUnionTypeConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLWrappingType
import typingsSlinky.graphql.typeDefinitionMod._GraphQLList
import typingsSlinky.graphql.typeDefinitionMod._GraphQLNonNull
import typingsSlinky.graphql.typeDirectivesMod.GraphQLDirectiveConfig
import typingsSlinky.graphql.typeSchemaMod.GraphQLSchemaConfig
import typingsSlinky.graphql.utilitiesBuildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.utilitiesBuildClientSchemaMod.Options
import typingsSlinky.graphql.utilitiesCoerceInputValueMod.OnErrorCB
import typingsSlinky.graphql.utilitiesCoerceValueMod.CoercedValue
import typingsSlinky.graphql.utilitiesFindBreakingChangesMod.BreakingChange
import typingsSlinky.graphql.utilitiesFindBreakingChangesMod.DangerousChange
import typingsSlinky.graphql.utilitiesFindBreakingChangesMod._BreakingChangeType
import typingsSlinky.graphql.utilitiesFindBreakingChangesMod._DangerousChangeType
import typingsSlinky.graphql.utilitiesIntrospectionQueryMod.IntrospectionOptions
import typingsSlinky.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import typingsSlinky.graphql.utilitiesTypeInfoMod.getFieldDef
import typingsSlinky.graphql.validationValidationContextMod.ValidationRule
import typingsSlinky.graphqlDashCompose.graphqlDashComposeStrings.`No longer supported`
import typingsSlinky.graphqlDashCompose.libEnumTypeComposerMod._EnumTypeComposeDefinition
import typingsSlinky.graphqlDashCompose.libInputTypeComposerMod._InputTypeComposeDefinition
import typingsSlinky.std.AsyncIterable
import typingsSlinky.std.AsyncIterableIterator
import typingsSlinky.std.Error
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", JSImport.Namespace)
@js.native
object libGraphqlMod extends js.Object {
  @js.native
  class GraphQLDirective protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLDirective {
    def this(config: GraphQLDirectiveConfig) = this()
  }
  
  @js.native
  class GraphQLEnumType protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLEnumType
       with _EnumTypeComposeDefinition {
    def this(config: GraphQLEnumTypeConfig) = this()
  }
  
  @js.native
  class GraphQLError protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLError {
    def this(
      message: String,
      nodes: js.UndefOr[ASTNode | js.Array[ASTNode]],
      source: js.UndefOr[Maybe[typingsSlinky.graphql.languageSourceMod.Source]],
      positions: js.UndefOr[Maybe[js.Array[Double]]],
      path: js.UndefOr[Maybe[js.Array[Double | String]]],
      originalError: js.UndefOr[Maybe[js.Error]],
      extensions: js.UndefOr[Maybe[StringDictionary[_]]]
    ) = this()
  }
  
  @js.native
  class GraphQLInputObjectType protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLInputObjectType
       with _InputTypeComposeDefinition {
    def this(config: GraphQLInputObjectTypeConfig) = this()
  }
  
  @js.native
  class GraphQLInterfaceType protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLInterfaceType {
    def this(config: GraphQLInterfaceTypeConfig[_, _, StringDictionary[_]]) = this()
  }
  
  @js.native
  class GraphQLListCls protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLListCls {
    def this(`type`: GraphQLType) = this()
  }
  
  @js.native
  class GraphQLNonNullCls protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLNonNullCls {
    def this(`type`: GraphQLNullableType) = this()
  }
  
  @js.native
  class GraphQLObjectType[TSource, TContext, TArgs] protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLObjectType[TSource, TContext, TArgs] {
    def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
  }
  
  @js.native
  class GraphQLScalarType protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLScalarType {
    def this(config: GraphQLScalarTypeConfig[_, _]) = this()
  }
  
  @js.native
  class GraphQLSchema protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLSchema {
    def this(config: GraphQLSchemaConfig) = this()
  }
  
  @js.native
  class GraphQLUnionType protected ()
    extends typingsSlinky.graphql.graphqlMod.GraphQLUnionType {
    def this(config: GraphQLUnionTypeConfig[_, _]) = this()
  }
  
  @js.native
  class Source protected ()
    extends typingsSlinky.graphql.graphqlMod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(body: String, name: String, locationOffset: Location) = this()
  }
  
  @js.native
  class TypeInfo protected ()
    extends typingsSlinky.graphql.graphqlMod.TypeInfo {
    def this(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema) = this()
    def this(
      schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef
    ) = this()
    def this(
      schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef,
      // Initial type may be provided in rare cases to facilitate traversals
    // beginning somewhere other than documents.
    initialType: GraphQLType
    ) = this()
  }
  
  @js.native
  class ValidationContext protected ()
    extends typingsSlinky.graphql.graphqlMod.ValidationContext {
    def this(
      schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
      ast: DocumentNode,
      typeInfo: typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo
    ) = this()
    def this(
      schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
      ast: DocumentNode,
      typeInfo: typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo,
      onError: js.Function1[/* err */ typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError, Unit]
    ) = this()
  }
  
  val BREAK: js.Any = js.native
  val BreakingChangeType: _BreakingChangeType = js.native
  val DEFAULT_DEPRECATION_REASON: `No longer supported` = js.native
  val DangerousChangeType: _DangerousChangeType = js.native
  val DirectiveLocation: _DirectiveLocation = js.native
  val GraphQLBoolean: typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLDeprecatedDirective: typingsSlinky.graphql.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLFloat: typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLID: typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLIncludeDirective: typingsSlinky.graphql.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLInt: typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLList: _GraphQLList[GraphQLType] = js.native
  val GraphQLNonNull: _GraphQLNonNull[GraphQLNullableType] = js.native
  val GraphQLSkipDirective: typingsSlinky.graphql.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLString: typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val Kind: _Kind = js.native
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TokenKind: _TokenKind = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Directive: typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __DirectiveLocation: typingsSlinky.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  val __EnumValue: typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Field: typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __InputValue: typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Schema: typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Type: typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __TypeKind: typingsSlinky.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  val defaultFieldResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val defaultTypeResolver: GraphQLTypeResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val introspectionQuery: String = js.native
  val introspectionTypes: js.Array[GraphQLType] = js.native
  val specifiedDirectives: js.Array[typingsSlinky.graphql.typeDirectivesMod.GraphQLDirective] = js.native
  val specifiedRules: js.Array[ValidationRule] = js.native
  val specifiedScalarTypes: js.Array[typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarType] = js.native
  val version: String = js.native
  def assertAbstractType(`type`: js.Any): GraphQLAbstractType = js.native
  def assertCompositeType(`type`: js.Any): GraphQLCompositeType = js.native
  def assertDirective(directive: js.Any): typingsSlinky.graphql.typeDirectivesMod.GraphQLDirective = js.native
  def assertEnumType(`type`: js.Any): typingsSlinky.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  def assertInputObjectType(`type`: js.Any): typingsSlinky.graphql.typeDefinitionMod.GraphQLInputObjectType = js.native
  def assertInputType(`type`: js.Any): GraphQLInputType = js.native
  def assertInterfaceType(`type`: js.Any): typingsSlinky.graphql.typeDefinitionMod.GraphQLInterfaceType = js.native
  def assertLeafType(`type`: js.Any): GraphQLLeafType = js.native
  def assertListType(`type`: js.Any): typingsSlinky.graphql.typeDefinitionMod.GraphQLList[_] = js.native
  def assertNamedType(`type`: js.Any): GraphQLNamedType = js.native
  def assertNonNullType(`type`: js.Any): typingsSlinky.graphql.typeDefinitionMod.GraphQLNonNull[_] = js.native
  def assertNullableType(`type`: js.Any): GraphQLNullableType = js.native
  def assertObjectType(`type`: js.Any): typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def assertOutputType(`type`: js.Any): GraphQLOutputType = js.native
  def assertScalarType(`type`: js.Any): typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  def assertSchema(schema: js.Any): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def assertType(`type`: js.Any): GraphQLType = js.native
  def assertUnionType(`type`: js.Any): typingsSlinky.graphql.typeDefinitionMod.GraphQLUnionType = js.native
  def assertValidName(name: String): String = js.native
  def assertValidSchema(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema): Unit = js.native
  def assertWrappingType(`type`: js.Any): GraphQLWrappingType = js.native
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
  def buildASTSchema(documentAST: DocumentNode): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildASTSchema(documentAST: DocumentNode, options: BuildSchemaOptions): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery, options: Options): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: String): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: String, options: BuildSchemaOptions with ParseOptions): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: typingsSlinky.graphql.languageSourceMod.Source): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(
    source: typingsSlinky.graphql.languageSourceMod.Source,
    options: BuildSchemaOptions with ParseOptions
  ): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
  def concatAST(asts: js.Array[DocumentNode]): DocumentNode = js.native
  def createLexer[TOptions](source: typingsSlinky.graphql.languageSourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
  def createSourceEventStream[TData](schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, document: DocumentNode): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def doTypesOverlap(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    typeA: GraphQLCompositeType,
    typeB: GraphQLCompositeType
  ): Boolean = js.native
  def execute[TData](args: ExecutionArgs): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): PromiseOrValue[ExecutionResult[TData]] = js.native
  def extendSchema(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, documentAST: DocumentNode): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def extendSchema(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    options: typingsSlinky.graphql.utilitiesExtendSchemaMod.Options
  ): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def findBreakingChanges(
    oldSchema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    newSchema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
  ): js.Array[BreakingChange] = js.native
  def findDangerousChanges(
    oldSchema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    newSchema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema
  ): js.Array[DangerousChange] = js.native
  def findDeprecatedUsages(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, ast: DocumentNode): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def formatError(error: typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  def getDescription(node: typingsSlinky.graphql.Anon_Description, options: Maybe[BuildSchemaOptions]): js.UndefOr[String] = js.native
  def getDirectiveValues(directiveDef: typingsSlinky.graphql.typeDirectivesMod.GraphQLDirective, node: Anon_Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(
    directiveDef: typingsSlinky.graphql.typeDirectivesMod.GraphQLDirective,
    node: Anon_Directives,
    variableValues: Maybe[StringDictionary[_]]
  ): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getIntrospectionQuery(): String = js.native
  def getIntrospectionQuery(options: IntrospectionOptions): String = js.native
  def getLocation(source: typingsSlinky.graphql.languageSourceMod.Source, position: Double): SourceLocation = js.native
  def getNamedType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNamedType(`type`: GraphQLType): GraphQLNamedType = js.native
  def getNullableType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType(`type`: typingsSlinky.graphql.typeDefinitionMod.GraphQLEnumType): typingsSlinky.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  def getNullableType(`type`: typingsSlinky.graphql.typeDefinitionMod.GraphQLInputObjectType): typingsSlinky.graphql.typeDefinitionMod.GraphQLInputObjectType = js.native
  def getNullableType(`type`: typingsSlinky.graphql.typeDefinitionMod.GraphQLInterfaceType): typingsSlinky.graphql.typeDefinitionMod.GraphQLInterfaceType = js.native
  def getNullableType(`type`: typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarType): typingsSlinky.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  def getNullableType(`type`: typingsSlinky.graphql.typeDefinitionMod.GraphQLUnionType): typingsSlinky.graphql.typeDefinitionMod.GraphQLUnionType = js.native
  def getNullableType[T /* <: (typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]]) | typingsSlinky.graphql.typeDefinitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def getNullableType[T /* <: GraphQLNullableType */](`type`: typingsSlinky.graphql.typeDefinitionMod.GraphQLNonNull[T]): T = js.native
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
  def getOperationRootType(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, operation: OperationDefinitionNode): typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getOperationRootType(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, operation: OperationTypeDefinitionNode): typingsSlinky.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getVisitFn(
    visitor: Visitor[
      _, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
  def graphql[TData](args: GraphQLArgs): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    source: typingsSlinky.graphql.languageSourceMod.Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphqlSync[TData](args: GraphQLArgs): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    source: typingsSlinky.graphql.languageSourceMod.Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def introspectionFromSchema(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema): IntrospectionQuery = js.native
  def introspectionFromSchema(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
  def isAbstractType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLAbstractType */ Boolean = js.native
  def isCompositeType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLCompositeType */ Boolean = js.native
  def isDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.DefinitionNode */ Boolean = js.native
  def isDirective(directive: js.Any): /* is graphql.graphql/type/directives.GraphQLDirective */ Boolean = js.native
  def isEnumType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLEnumType */ Boolean = js.native
  def isEqualType(typeA: GraphQLType, typeB: GraphQLType): Boolean = js.native
  def isExecutableDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.ExecutableDefinitionNode */ Boolean = js.native
  def isInputObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputObjectType */ Boolean = js.native
  def isInputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputType */ Boolean = js.native
  def isInterfaceType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInterfaceType */ Boolean = js.native
  def isIntrospectionType(`type`: js.Any): Boolean = js.native
  def isLeafType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLLeafType */ Boolean = js.native
  def isListType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLList<any> */ Boolean = js.native
  def isNamedType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNamedType */ Boolean = js.native
  def isNonNullType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNonNull<any> */ Boolean = js.native
  def isNullableType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNullableType */ Boolean = js.native
  def isObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLObjectType<any, any, {[key: string] : any}> */ Boolean = js.native
  def isOutputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLOutputType */ Boolean = js.native
  def isRequiredArgument(arg: GraphQLArgument): Boolean = js.native
  def isRequiredInputField(field: GraphQLInputField): Boolean = js.native
  def isScalarType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLScalarType */ Boolean = js.native
  def isSchema(schema: js.Any): /* is graphql.graphql/type/schema.GraphQLSchema */ Boolean = js.native
  def isSelectionNode(node: ASTNode): /* is graphql.graphql/language/ast.SelectionNode */ Boolean = js.native
  def isSpecifiedDirective(directive: js.Any): Boolean = js.native
  def isSpecifiedScalarType(`type`: js.Any): Boolean = js.native
  def isType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLType */ Boolean = js.native
  def isTypeDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeDefinitionNode */ Boolean = js.native
  def isTypeExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeExtensionNode */ Boolean = js.native
  def isTypeNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeNode */ Boolean = js.native
  def isTypeSubTypeOf(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    maybeSubType: GraphQLType,
    superType: GraphQLType
  ): Boolean = js.native
  def isTypeSystemDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemDefinitionNode */ Boolean = js.native
  def isTypeSystemExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemExtensionNode */ Boolean = js.native
  def isUnionType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLUnionType */ Boolean = js.native
  def isValidJSValue(value: js.Any, `type`: GraphQLInputType): js.Array[String] = js.native
  def isValidLiteralValue(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: String): js.UndefOr[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: String, node: ASTNode): js.UndefOr[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValueNode(node: ASTNode): /* is graphql.graphql/language/ast.ValueNode */ Boolean = js.native
  def isWrappingType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLWrappingType */ Boolean = js.native
  def lexicographicSortSchema(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema): typingsSlinky.graphql.typeSchemaMod.GraphQLSchema = js.native
  def locatedError(
    originalError: typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def parse(source: String): DocumentNode = js.native
  def parse(source: String, options: ParseOptions): DocumentNode = js.native
  def parse(source: typingsSlinky.graphql.languageSourceMod.Source): DocumentNode = js.native
  def parse(source: typingsSlinky.graphql.languageSourceMod.Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: typingsSlinky.graphql.languageSourceMod.Source): TypeNode = js.native
  def parseType(source: typingsSlinky.graphql.languageSourceMod.Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: typingsSlinky.graphql.languageSourceMod.Source): ValueNode = js.native
  def parseValue(source: typingsSlinky.graphql.languageSourceMod.Source, options: ParseOptions): ValueNode = js.native
  def print(ast: ASTNode): String = js.native
  def printError(error: typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError): String = js.native
  def printIntrospectionSchema(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema): String = js.native
  def printIntrospectionSchema(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    options: typingsSlinky.graphql.utilitiesSchemaPrinterMod.Options
  ): String = js.native
  def printLocation(location: typingsSlinky.graphql.languageAstMod.Location): String = js.native
  def printSchema(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema): String = js.native
  def printSchema(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    options: typingsSlinky.graphql.utilitiesSchemaPrinterMod.Options
  ): String = js.native
  def printSourceLocation(source: typingsSlinky.graphql.languageSourceMod.Source, sourceLocation: SourceLocation): String = js.native
  def printType(`type`: GraphQLNamedType): String = js.native
  def printType(`type`: GraphQLNamedType, options: typingsSlinky.graphql.utilitiesSchemaPrinterMod.Options): String = js.native
  def separateOperations(documentAST: DocumentNode): StringDictionary[DocumentNode] = js.native
  def stripIgnoredCharacters(source: String): String = js.native
  def stripIgnoredCharacters(source: typingsSlinky.graphql.languageSourceMod.Source): String = js.native
  def subscribe[TData](args: SubscriptionArgs): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def subscribe[TData](
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def syntaxError(source: typingsSlinky.graphql.languageSourceMod.Source, position: Double, description: String): typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def typeFromAST(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[typingsSlinky.graphql.typeDefinitionMod.GraphQLList[_]] = js.native
  def typeFromAST(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[typingsSlinky.graphql.typeDefinitionMod.GraphQLNonNull[_]] = js.native
  def validate(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo
  ): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo,
    options: Anon_MaxErrors
  ): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def validateSchema(schema: typingsSlinky.graphql.typeSchemaMod.GraphQLSchema): js.Array[typingsSlinky.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
    ]
  ): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMap[ASTKindToNode]
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        ASTKindToNode, 
        UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
      ]
    ]
  ): Visitor[
    ASTKindToNode, 
    UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: typingsSlinky.graphql.utilitiesTypeInfoMod.TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
    ]
  ): Visitor[
    ASTKindToNode, 
    UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
  ] = js.native
  @js.native
  object TypeKind extends js.Object {
    var ENUM: typingsSlinky.graphqlDashCompose.graphqlDashComposeStrings.ENUM = js.native
    var INPUT_OBJECT: typingsSlinky.graphqlDashCompose.graphqlDashComposeStrings.INPUT_OBJECT = js.native
    var INTERFACE: typingsSlinky.graphqlDashCompose.graphqlDashComposeStrings.INTERFACE = js.native
    var LIST: typingsSlinky.graphqlDashCompose.graphqlDashComposeStrings.LIST = js.native
    var NON_NULL: typingsSlinky.graphqlDashCompose.graphqlDashComposeStrings.NON_NULL = js.native
    var OBJECT: typingsSlinky.graphqlDashCompose.graphqlDashComposeStrings.OBJECT = js.native
    var SCALAR: typingsSlinky.graphqlDashCompose.graphqlDashComposeStrings.SCALAR = js.native
    var UNION: typingsSlinky.graphqlDashCompose.graphqlDashComposeStrings.UNION = js.native
  }
  
  @js.native
  object versionInfo extends js.Object {
    var major: Double = js.native
    var minor: Double = js.native
    var patch: Double = js.native
    var preReleaseTag: Double | Null = js.native
  }
  
}

