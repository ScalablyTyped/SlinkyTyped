package typingsSlinky.graphqlCompose

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.AnonDescription
import typingsSlinky.graphql.AnonDirectives
import typingsSlinky.graphql.AnonMaxErrors
import typingsSlinky.graphql.VisitorKeyMapASTKindToNod
import typingsSlinky.graphql.astMod.ASTKindToNode
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.astMod.ArgumentNode
import typingsSlinky.graphql.astMod.BooleanValueNode
import typingsSlinky.graphql.astMod.DirectiveDefinitionNode
import typingsSlinky.graphql.astMod.DirectiveNode
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.astMod.EnumTypeDefinitionNode
import typingsSlinky.graphql.astMod.EnumTypeExtensionNode
import typingsSlinky.graphql.astMod.EnumValueDefinitionNode
import typingsSlinky.graphql.astMod.EnumValueNode
import typingsSlinky.graphql.astMod.FieldDefinitionNode
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.FloatValueNode
import typingsSlinky.graphql.astMod.FragmentDefinitionNode
import typingsSlinky.graphql.astMod.FragmentSpreadNode
import typingsSlinky.graphql.astMod.InlineFragmentNode
import typingsSlinky.graphql.astMod.InputObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode
import typingsSlinky.graphql.astMod.InputValueDefinitionNode
import typingsSlinky.graphql.astMod.IntValueNode
import typingsSlinky.graphql.astMod.InterfaceTypeDefinitionNode
import typingsSlinky.graphql.astMod.InterfaceTypeExtensionNode
import typingsSlinky.graphql.astMod.ListTypeNode
import typingsSlinky.graphql.astMod.ListValueNode
import typingsSlinky.graphql.astMod.NameNode
import typingsSlinky.graphql.astMod.NamedTypeNode
import typingsSlinky.graphql.astMod.NonNullTypeNode
import typingsSlinky.graphql.astMod.NullValueNode
import typingsSlinky.graphql.astMod.ObjectFieldNode
import typingsSlinky.graphql.astMod.ObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.ObjectTypeExtensionNode
import typingsSlinky.graphql.astMod.ObjectValueNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.astMod.OperationTypeDefinitionNode
import typingsSlinky.graphql.astMod.ScalarTypeDefinitionNode
import typingsSlinky.graphql.astMod.ScalarTypeExtensionNode
import typingsSlinky.graphql.astMod.SchemaDefinitionNode
import typingsSlinky.graphql.astMod.SchemaExtensionNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.astMod.StringValueNode
import typingsSlinky.graphql.astMod.TypeNode
import typingsSlinky.graphql.astMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.astMod.UnionTypeExtensionNode
import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.astMod.VariableDefinitionNode
import typingsSlinky.graphql.astMod.VariableNode
import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.buildClientSchemaMod.Options
import typingsSlinky.graphql.coerceInputValueMod.OnErrorCB
import typingsSlinky.graphql.coerceValueMod.CoercedValue
import typingsSlinky.graphql.definitionMod.GraphQLAbstractType
import typingsSlinky.graphql.definitionMod.GraphQLArgument
import typingsSlinky.graphql.definitionMod.GraphQLCompositeType
import typingsSlinky.graphql.definitionMod.GraphQLEnumTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLFieldResolver
import typingsSlinky.graphql.definitionMod.GraphQLInputField
import typingsSlinky.graphql.definitionMod.GraphQLInputObjectTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.definitionMod.GraphQLInterfaceTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLLeafType
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLNullableType
import typingsSlinky.graphql.definitionMod.GraphQLObjectTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLScalarTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.definitionMod.GraphQLUnionTypeConfig
import typingsSlinky.graphql.definitionMod.GraphQLWrappingType
import typingsSlinky.graphql.definitionMod._GraphQLList
import typingsSlinky.graphql.definitionMod._GraphQLNonNull
import typingsSlinky.graphql.directivesMod.GraphQLDirectiveConfig
import typingsSlinky.graphql.executeMod.ExecutionArgs
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.graphql.findBreakingChangesMod.BreakingChange
import typingsSlinky.graphql.findBreakingChangesMod.DangerousChange
import typingsSlinky.graphql.findBreakingChangesMod._BreakingChangeType
import typingsSlinky.graphql.findBreakingChangesMod._DangerousChangeType
import typingsSlinky.graphql.formatErrorMod.GraphQLFormattedError
import typingsSlinky.graphql.graphqlMod.GraphQLArgs
import typingsSlinky.graphql.introspectionQueryMod.IntrospectionOptions
import typingsSlinky.graphql.introspectionQueryMod.IntrospectionQuery_
import typingsSlinky.graphql.kindsMod._Kind
import typingsSlinky.graphql.lexerMod.Lexer
import typingsSlinky.graphql.locationMod.SourceLocation
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.parserMod.ParseOptions
import typingsSlinky.graphql.pathMod.Path
import typingsSlinky.graphql.promiseOrValueMod.PromiseOrValue
import typingsSlinky.graphql.schemaMod.GraphQLSchemaConfig
import typingsSlinky.graphql.sourceMod.Location
import typingsSlinky.graphql.subscribeMod.SubscriptionArgs
import typingsSlinky.graphql.tokenKindMod._TokenKind
import typingsSlinky.graphql.typeInfoMod.getFieldDef
import typingsSlinky.graphql.validationContextMod.ValidationRule
import typingsSlinky.graphql.visitorMod.VisitFn
import typingsSlinky.graphql.visitorMod.Visitor
import typingsSlinky.graphqlCompose.enumTypeComposerMod._EnumTypeComposeDefinition
import typingsSlinky.graphqlCompose.graphqlComposeStrings.`No longer supported`
import typingsSlinky.graphqlCompose.inputTypeComposerMod._InputTypeComposeDefinition
import typingsSlinky.graphqlCompose.scalarTypeComposerMod._ScalarTypeComposeDefinition
import typingsSlinky.std.AsyncIterable
import typingsSlinky.std.AsyncIterableIterator
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", JSImport.Namespace)
@js.native
object graphqlMod extends js.Object {
  @js.native
  class GraphQLDirective protected ()
    extends typingsSlinky.graphql.mod.GraphQLDirective {
    def this(config: GraphQLDirectiveConfig) = this()
  }
  
  @js.native
  class GraphQLEnumType protected ()
    extends typingsSlinky.graphql.mod.GraphQLEnumType
       with _EnumTypeComposeDefinition {
    def this(config: GraphQLEnumTypeConfig) = this()
  }
  
  @js.native
  class GraphQLError protected ()
    extends typingsSlinky.graphql.mod.GraphQLError {
    def this(
      message: String,
      nodes: js.UndefOr[ASTNode | js.Array[ASTNode]],
      source: js.UndefOr[Maybe[typingsSlinky.graphql.sourceMod.Source]],
      positions: js.UndefOr[Maybe[js.Array[Double]]],
      path: js.UndefOr[Maybe[js.Array[Double | String]]],
      originalError: js.UndefOr[Maybe[js.Error]],
      extensions: js.UndefOr[Maybe[StringDictionary[_]]]
    ) = this()
  }
  
  @js.native
  class GraphQLInputObjectType protected ()
    extends typingsSlinky.graphql.mod.GraphQLInputObjectType
       with _InputTypeComposeDefinition {
    def this(config: GraphQLInputObjectTypeConfig) = this()
  }
  
  @js.native
  class GraphQLInterfaceType protected ()
    extends typingsSlinky.graphql.mod.GraphQLInterfaceType {
    def this(config: GraphQLInterfaceTypeConfig[_, _, StringDictionary[_]]) = this()
  }
  
  @js.native
  class GraphQLListCls protected ()
    extends typingsSlinky.graphql.mod.GraphQLListCls {
    def this(`type`: GraphQLType) = this()
  }
  
  @js.native
  class GraphQLNonNullCls protected ()
    extends typingsSlinky.graphql.mod.GraphQLNonNullCls {
    def this(`type`: GraphQLNullableType) = this()
  }
  
  @js.native
  class GraphQLObjectType[TSource, TContext, TArgs] protected ()
    extends typingsSlinky.graphql.mod.GraphQLObjectType[TSource, TContext, TArgs] {
    def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
  }
  
  @js.native
  class GraphQLScalarType protected ()
    extends typingsSlinky.graphql.mod.GraphQLScalarType
       with _ScalarTypeComposeDefinition {
    def this(config: GraphQLScalarTypeConfig[_, _]) = this()
  }
  
  @js.native
  class GraphQLSchema protected ()
    extends typingsSlinky.graphql.mod.GraphQLSchema {
    def this(config: GraphQLSchemaConfig) = this()
  }
  
  @js.native
  class GraphQLUnionType protected ()
    extends typingsSlinky.graphql.mod.GraphQLUnionType {
    def this(config: GraphQLUnionTypeConfig[_, _]) = this()
  }
  
  @js.native
  class Source protected ()
    extends typingsSlinky.graphql.mod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(body: String, name: String, locationOffset: Location) = this()
  }
  
  @js.native
  class TypeInfo protected ()
    extends typingsSlinky.graphql.mod.TypeInfo {
    def this(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema) = this()
    def this(
      schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef
    ) = this()
    def this(
      schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
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
    extends typingsSlinky.graphql.mod.ValidationContext {
    def this(
      schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
      ast: DocumentNode,
      typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo
    ) = this()
    def this(
      schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
      ast: DocumentNode,
      typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo,
      onError: js.Function1[/* err */ typingsSlinky.graphql.graphQLErrorMod.GraphQLError, Unit]
    ) = this()
  }
  
  val BREAK: js.Any = js.native
  val BreakingChangeType: _BreakingChangeType = js.native
  val DEFAULT_DEPRECATION_REASON: `No longer supported` = js.native
  val DangerousChangeType: _DangerousChangeType = js.native
  @JSName("__Directive")
  val Directive: typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val DirectiveLocation: typingsSlinky.graphql.directiveLocationMod._DirectiveLocation = js.native
  @JSName("__EnumValue")
  val EnumValue: typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__Field")
  val Field: typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val GraphQLBoolean: typingsSlinky.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLDeprecatedDirective: typingsSlinky.graphql.directivesMod.GraphQLDirective = js.native
  val GraphQLFloat: typingsSlinky.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLID: typingsSlinky.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLIncludeDirective: typingsSlinky.graphql.directivesMod.GraphQLDirective = js.native
  val GraphQLInt: typingsSlinky.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLList: _GraphQLList[GraphQLType] = js.native
  val GraphQLNonNull: _GraphQLNonNull[GraphQLNullableType] = js.native
  val GraphQLSkipDirective: typingsSlinky.graphql.directivesMod.GraphQLDirective = js.native
  val GraphQLString: typingsSlinky.graphql.definitionMod.GraphQLScalarType = js.native
  @JSName("__InputValue")
  val InputValue: typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val Kind: _Kind = js.native
  @JSName("__Schema")
  val Schema: typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TokenKind: _TokenKind = js.native
  @JSName("__Type")
  val Type: typingsSlinky.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__DirectiveLocation")
  val _DirectiveLocation: typingsSlinky.graphql.definitionMod.GraphQLEnumType = js.native
  @JSName("__TypeKind")
  val _TypeKind: typingsSlinky.graphql.definitionMod.GraphQLEnumType = js.native
  val defaultFieldResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val defaultTypeResolver: GraphQLTypeResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val introspectionQuery: String = js.native
  val introspectionTypes: js.Array[GraphQLType] = js.native
  val specifiedDirectives: js.Array[typingsSlinky.graphql.directivesMod.GraphQLDirective] = js.native
  val specifiedRules: js.Array[ValidationRule] = js.native
  val specifiedScalarTypes: js.Array[typingsSlinky.graphql.definitionMod.GraphQLScalarType] = js.native
  val version: String = js.native
  def assertAbstractType(`type`: js.Any): GraphQLAbstractType = js.native
  def assertCompositeType(`type`: js.Any): GraphQLCompositeType = js.native
  def assertDirective(directive: js.Any): typingsSlinky.graphql.directivesMod.GraphQLDirective = js.native
  def assertEnumType(`type`: js.Any): typingsSlinky.graphql.definitionMod.GraphQLEnumType = js.native
  def assertInputObjectType(`type`: js.Any): typingsSlinky.graphql.definitionMod.GraphQLInputObjectType = js.native
  def assertInputType(`type`: js.Any): GraphQLInputType = js.native
  def assertInterfaceType(`type`: js.Any): typingsSlinky.graphql.definitionMod.GraphQLInterfaceType = js.native
  def assertLeafType(`type`: js.Any): GraphQLLeafType = js.native
  def assertListType(`type`: js.Any): typingsSlinky.graphql.definitionMod.GraphQLList[_] = js.native
  def assertNamedType(`type`: js.Any): GraphQLNamedType = js.native
  def assertNonNullType(`type`: js.Any): typingsSlinky.graphql.definitionMod.GraphQLNonNull[_] = js.native
  def assertNullableType(`type`: js.Any): GraphQLNullableType = js.native
  def assertObjectType(`type`: js.Any): typingsSlinky.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def assertOutputType(`type`: js.Any): GraphQLOutputType = js.native
  def assertScalarType(`type`: js.Any): typingsSlinky.graphql.definitionMod.GraphQLScalarType = js.native
  def assertSchema(schema: js.Any): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def assertType(`type`: js.Any): GraphQLType = js.native
  def assertUnionType(`type`: js.Any): typingsSlinky.graphql.definitionMod.GraphQLUnionType = js.native
  def assertValidName(name: String): String = js.native
  def assertValidSchema(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema): Unit = js.native
  def assertWrappingType(`type`: js.Any): GraphQLWrappingType = js.native
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
  def buildASTSchema(documentAST: DocumentNode): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def buildASTSchema(documentAST: DocumentNode, options: BuildSchemaOptions): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery_): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery_, options: Options): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: String): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: String, options: BuildSchemaOptions with ParseOptions): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: typingsSlinky.graphql.sourceMod.Source): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: typingsSlinky.graphql.sourceMod.Source, options: BuildSchemaOptions with ParseOptions): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
  def concatAST(asts: js.Array[DocumentNode]): DocumentNode = js.native
  def createLexer[TOptions](source: typingsSlinky.graphql.sourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
  def createSourceEventStream[TData](schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, document: DocumentNode): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, document: DocumentNode, rootValue: js.Any): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def doTypesOverlap(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    typeA: GraphQLCompositeType,
    typeB: GraphQLCompositeType
  ): Boolean = js.native
  def execute[TData](args: ExecutionArgs): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): PromiseOrValue[ExecutionResult[TData]] = js.native
  def extendSchema(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def extendSchema(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    options: typingsSlinky.graphql.extendSchemaMod.Options
  ): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def findBreakingChanges(
    oldSchema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    newSchema: typingsSlinky.graphql.schemaMod.GraphQLSchema
  ): js.Array[BreakingChange] = js.native
  def findDangerousChanges(
    oldSchema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    newSchema: typingsSlinky.graphql.schemaMod.GraphQLSchema
  ): js.Array[DangerousChange] = js.native
  def findDeprecatedUsages(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, ast: DocumentNode): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def formatError(error: typingsSlinky.graphql.graphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  def getDescription(node: AnonDescription, options: Maybe[BuildSchemaOptions]): js.UndefOr[String] = js.native
  def getDirectiveValues(directiveDef: typingsSlinky.graphql.directivesMod.GraphQLDirective, node: AnonDirectives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(
    directiveDef: typingsSlinky.graphql.directivesMod.GraphQLDirective,
    node: AnonDirectives,
    variableValues: Maybe[StringDictionary[_]]
  ): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getIntrospectionQuery(): String = js.native
  def getIntrospectionQuery(options: IntrospectionOptions): String = js.native
  def getLocation(source: typingsSlinky.graphql.sourceMod.Source, position: Double): SourceLocation = js.native
  def getNamedType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNamedType(`type`: GraphQLType): GraphQLNamedType = js.native
  def getNullableType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType(`type`: typingsSlinky.graphql.definitionMod.GraphQLEnumType): typingsSlinky.graphql.definitionMod.GraphQLEnumType = js.native
  def getNullableType(`type`: typingsSlinky.graphql.definitionMod.GraphQLInputObjectType): typingsSlinky.graphql.definitionMod.GraphQLInputObjectType = js.native
  def getNullableType(`type`: typingsSlinky.graphql.definitionMod.GraphQLInterfaceType): typingsSlinky.graphql.definitionMod.GraphQLInterfaceType = js.native
  def getNullableType(`type`: typingsSlinky.graphql.definitionMod.GraphQLScalarType): typingsSlinky.graphql.definitionMod.GraphQLScalarType = js.native
  def getNullableType(`type`: typingsSlinky.graphql.definitionMod.GraphQLUnionType): typingsSlinky.graphql.definitionMod.GraphQLUnionType = js.native
  def getNullableType[T /* <: (typingsSlinky.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]]) | typingsSlinky.graphql.definitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def getNullableType[T /* <: GraphQLNullableType */](`type`: typingsSlinky.graphql.definitionMod.GraphQLNonNull[T]): T = js.native
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
  def getOperationRootType(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, operation: OperationDefinitionNode): typingsSlinky.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getOperationRootType(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, operation: OperationTypeDefinitionNode): typingsSlinky.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
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
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    source: typingsSlinky.graphql.sourceMod.Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphqlSync[TData](args: GraphQLArgs): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    source: typingsSlinky.graphql.sourceMod.Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def introspectionFromSchema(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema): IntrospectionQuery_ = js.native
  def introspectionFromSchema(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery_ = js.native
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
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    maybeSubType: GraphQLType,
    superType: GraphQLType
  ): Boolean = js.native
  def isTypeSystemDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemDefinitionNode */ Boolean = js.native
  def isTypeSystemExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemExtensionNode */ Boolean = js.native
  def isUnionType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLUnionType */ Boolean = js.native
  def isValidJSValue(value: js.Any, `type`: GraphQLInputType): js.Array[String] = js.native
  def isValidLiteralValue(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: String): js.UndefOr[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: String, node: ASTNode): js.UndefOr[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def isValueNode(node: ASTNode): /* is graphql.graphql/language/ast.ValueNode */ Boolean = js.native
  def isWrappingType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLWrappingType */ Boolean = js.native
  def lexicographicSortSchema(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema): typingsSlinky.graphql.schemaMod.GraphQLSchema = js.native
  def locatedError(
    originalError: typingsSlinky.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: js.Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def parse(source: String): DocumentNode = js.native
  def parse(source: String, options: ParseOptions): DocumentNode = js.native
  def parse(source: typingsSlinky.graphql.sourceMod.Source): DocumentNode = js.native
  def parse(source: typingsSlinky.graphql.sourceMod.Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: typingsSlinky.graphql.sourceMod.Source): TypeNode = js.native
  def parseType(source: typingsSlinky.graphql.sourceMod.Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: typingsSlinky.graphql.sourceMod.Source): ValueNode = js.native
  def parseValue(source: typingsSlinky.graphql.sourceMod.Source, options: ParseOptions): ValueNode = js.native
  def print(ast: ASTNode): String = js.native
  def printError(error: typingsSlinky.graphql.graphQLErrorMod.GraphQLError): String = js.native
  def printIntrospectionSchema(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema): String = js.native
  def printIntrospectionSchema(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    options: typingsSlinky.graphql.schemaPrinterMod.Options
  ): String = js.native
  def printLocation(location: typingsSlinky.graphql.astMod.Location): String = js.native
  def printSchema(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema): String = js.native
  def printSchema(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    options: typingsSlinky.graphql.schemaPrinterMod.Options
  ): String = js.native
  def printSourceLocation(source: typingsSlinky.graphql.sourceMod.Source, sourceLocation: SourceLocation): String = js.native
  def printType(`type`: GraphQLNamedType): String = js.native
  def printType(`type`: GraphQLNamedType, options: typingsSlinky.graphql.schemaPrinterMod.Options): String = js.native
  def separateOperations(documentAST: DocumentNode): StringDictionary[DocumentNode] = js.native
  def stripIgnoredCharacters(source: String): String = js.native
  def stripIgnoredCharacters(source: typingsSlinky.graphql.sourceMod.Source): String = js.native
  def subscribe[TData](args: SubscriptionArgs): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def subscribe[TData](
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def syntaxError(source: typingsSlinky.graphql.sourceMod.Source, position: Double, description: String): typingsSlinky.graphql.graphQLErrorMod.GraphQLError = js.native
  def typeFromAST(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLList[_]] = js.native
  def typeFromAST(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLNonNull[_]] = js.native
  def validate(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo
  ): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typingsSlinky.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo,
    options: AnonMaxErrors
  ): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validateSchema(schema: typingsSlinky.graphql.schemaMod.GraphQLSchema): js.Array[typingsSlinky.graphql.graphQLErrorMod.GraphQLError] = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMapASTKindToNod
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        ASTKindToNode, 
        EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
      ]
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: typingsSlinky.graphql.typeInfoMod.TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
  @js.native
  object TypeKind extends js.Object {
    var ENUM: typingsSlinky.graphqlCompose.graphqlComposeStrings.ENUM = js.native
    var INPUT_OBJECT: typingsSlinky.graphqlCompose.graphqlComposeStrings.INPUT_OBJECT = js.native
    var INTERFACE: typingsSlinky.graphqlCompose.graphqlComposeStrings.INTERFACE = js.native
    var LIST: typingsSlinky.graphqlCompose.graphqlComposeStrings.LIST = js.native
    var NON_NULL: typingsSlinky.graphqlCompose.graphqlComposeStrings.NON_NULL = js.native
    var OBJECT: typingsSlinky.graphqlCompose.graphqlComposeStrings.OBJECT = js.native
    var SCALAR: typingsSlinky.graphqlCompose.graphqlComposeStrings.SCALAR = js.native
    var UNION: typingsSlinky.graphqlCompose.graphqlComposeStrings.UNION = js.native
  }
  
  @js.native
  object versionInfo extends js.Object {
    var major: Double = js.native
    var minor: Double = js.native
    var patch: Double = js.native
    var preReleaseTag: Double | Null = js.native
  }
  
}

