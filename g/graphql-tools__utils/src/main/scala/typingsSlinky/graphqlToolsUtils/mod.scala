package typingsSlinky.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.astMod.ArgumentNode
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.astMod.InlineFragmentNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.astMod.SelectionSetNode
import typingsSlinky.graphql.astMod.TypeNode
import typingsSlinky.graphql.astMod.VariableDefinitionNode
import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.definitionMod.GraphQLArgument
import typingsSlinky.graphql.definitionMod.GraphQLArgumentConfig
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigMap
import typingsSlinky.graphql.definitionMod.GraphQLInputField
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphql.mod.GraphQLEnumType
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLScalarType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.GraphQLUnionType
import typingsSlinky.graphql.parserMod.ParseOptions
import typingsSlinky.graphql.schemaMod.GraphQLSchemaValidationOptions
import typingsSlinky.graphqlToolsUtils.anon.ArgNames
import typingsSlinky.graphqlToolsUtils.anon.Args
import typingsSlinky.graphqlToolsUtils.anon.Delimeter
import typingsSlinky.graphqlToolsUtils.anon.Directives
import typingsSlinky.graphqlToolsUtils.anon.Document
import typingsSlinky.graphqlToolsUtils.anon.FieldFilter
import typingsSlinky.graphqlToolsUtils.anon.Force
import typingsSlinky.graphqlToolsUtils.anon.Mutation
import typingsSlinky.graphqlToolsUtils.anon.SkipPruning
import typingsSlinky.graphqlToolsUtils.getDirectivesMod.DirectableGraphQLObject
import typingsSlinky.graphqlToolsUtils.getDirectivesMod.DirectiveUseMap
import typingsSlinky.graphqlToolsUtils.getFieldsWithDirectivesMod.TypeAndFieldToDirectives
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsNumbers.`-1`
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsNumbers.`0`
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsNumbers.`1`
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.`object`
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.input
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.interface
import typingsSlinky.graphqlToolsUtils.graphqlToolsUtilsStrings.output
import typingsSlinky.graphqlToolsUtils.interfacesMod.ExecutionResult
import typingsSlinky.graphqlToolsUtils.interfacesMod.GraphQLExecutionContext
import typingsSlinky.graphqlToolsUtils.interfacesMod.IDefaultValueIteratorFn
import typingsSlinky.graphqlToolsUtils.interfacesMod.IFieldIteratorFn
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.graphqlToolsUtils.interfacesMod.Request
import typingsSlinky.graphqlToolsUtils.interfacesMod.SchemaMapper
import typingsSlinky.graphqlToolsUtils.interfacesMod.SchemaVisitorMap
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.graphqlToolsUtils.interfacesMod.VisitorSelector
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import typingsSlinky.graphqlToolsUtils.observableToAsyncIterableMod.Observable
import typingsSlinky.graphqlToolsUtils.pruneMod.PruneSchemaOptions
import typingsSlinky.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitorClass
import typingsSlinky.graphqlToolsUtils.transformInputValueMod.InputValueTransformer
import typingsSlinky.graphqlToolsUtils.typesMod.SchemaPrintOptions
import typingsSlinky.graphqlToolsUtils.validateDocumentsMod.LoadDocumentError
import typingsSlinky.graphqlToolsUtils.validateDocumentsMod.ValidationRule
import typingsSlinky.graphqlToolsUtils.visitResultMod.ErrorVisitorMap
import typingsSlinky.graphqlToolsUtils.visitResultMod.ResultVisitorMap
import typingsSlinky.graphqlToolsUtils.visitResultMod.ValueVisitor
import typingsSlinky.std.AsyncIterator
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SchemaDirectiveVisitor[TArgs, TContext] protected ()
    extends typingsSlinky.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitor[TArgs, TContext] {
    protected def this(config: Args[TArgs, TContext]) = this()
  }
  
  @js.native
  abstract class SchemaVisitor ()
    extends typingsSlinky.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor
  
  val ERROR_SYMBOL: js.Symbol = js.native
  def addTypes(schema: GraphQLSchema, newTypesOrDirectives: js.Array[GraphQLNamedType | GraphQLDirective]): GraphQLSchema = js.native
  def appendObjectFields(schema: GraphQLSchema, typeName: String, additionalFields: GraphQLFieldConfigMap[_, _]): GraphQLSchema = js.native
  def applyRequestTransforms(originalRequest: Request, transforms: js.Array[Transform[Record[String, _]]]): Request = js.native
  def applyResultTransforms(originalResult: js.Any, transforms: js.Array[Transform[Record[String, _]]]): js.Any = js.native
  def applySchemaTransforms(originalSchema: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
  def argsToFieldConfigArgumentMap(args: js.Array[GraphQLArgument]): GraphQLFieldConfigArgumentMap = js.native
  def argumentToArgumentConfig(arg: GraphQLArgument): GraphQLArgumentConfig = js.native
  def asArray[T](fns: T): js.Array[T] = js.native
  def asArray[T](fns: js.Array[T]): js.Array[T] = js.native
  def buildOperationNodeForField(hasSchemaKindFieldModelsIgnoreDepthLimitCircularReferenceDepthArgNamesSelectedFields: ArgNames): OperationDefinitionNode = js.native
  def checkValidationErrors(loadDocumentErrors: js.Array[LoadDocumentError]): Unit | scala.Nothing = js.native
  def cloneDirective(directive: GraphQLDirective): GraphQLDirective = js.native
  def cloneSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def cloneType(`type`: GraphQLNamedType): GraphQLNamedType = js.native
  def collectFields(
    exeContext: GraphQLExecutionContext,
    runtimeType: GraphQLObjectType[_, _],
    selectionSet: SelectionSetNode,
    fields: Record[String, js.Array[FieldNode]],
    visitedFragmentNames: Record[String, Boolean]
  ): Record[String, js.Array[FieldNode]] = js.native
  def compareNodes(a: ASTNode, b: ASTNode): Double = js.native
  def compareNodes(a: ASTNode, b: ASTNode, customFn: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): Double = js.native
  def compareStrings[A, B](a: A, b: B): `0` | `1` | `-1` = js.native
  def concatInlineFragments(`type`: String, fragments: js.Array[InlineFragmentNode]): InlineFragmentNode = js.native
  def correctASTNodes(`type`: GraphQLEnumType): GraphQLEnumType = js.native
  def correctASTNodes(`type`: GraphQLInputObjectType): GraphQLInputObjectType = js.native
  def correctASTNodes(`type`: GraphQLInterfaceType): GraphQLInterfaceType = js.native
  def correctASTNodes(`type`: GraphQLObjectType[_, _]): GraphQLObjectType[_, _] = js.native
  @JSName("createNamedStub")
  def createNamedStub_input(name: String, `type`: input): GraphQLInputObjectType = js.native
  @JSName("createNamedStub")
  def createNamedStub_interface(name: String, `type`: interface): GraphQLInterfaceType = js.native
  @JSName("createNamedStub")
  def createNamedStub_object(name: String, `type`: `object`): GraphQLObjectType[_, _] = js.native
  def createSchemaDefinition(`def`: Mutation): String = js.native
  def createSchemaDefinition(`def`: Mutation, config: Force): String = js.native
  @JSName("createStub")
  def createStub_input(node: TypeNode, `type`: input): GraphQLInputType = js.native
  @JSName("createStub")
  def createStub_input_GraphQLType(node: TypeNode, `type`: input): GraphQLType = js.native
  @JSName("createStub")
  def createStub_output(node: TypeNode, `type`: output): GraphQLType = js.native
  @JSName("createStub")
  def createStub_output_GraphQLOutputType(node: TypeNode, `type`: output): GraphQLOutputType = js.native
  def debugLog(args: js.Any*): Unit = js.native
  def fieldToFieldConfig(field: GraphQLField[_, _, StringDictionary[_]]): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def filterSchema(hasSchemaRootFieldFilterTypeFilterFieldFilter: FieldFilter): GraphQLSchema = js.native
  def fixSchemaAst(schema: GraphQLSchema, options: BuildSchemaOptions with SchemaPrintOptions): GraphQLSchema = js.native
  def fixWindowsPath(path: String): String = js.native
  def flattenArray(arr: js.Any): js.Array[_] = js.native
  def forEachDefaultValue(schema: GraphQLSchema, fn: IDefaultValueIteratorFn): Unit = js.native
  def forEachField(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
  def getBuiltInForStub(`type`: GraphQLNamedType): GraphQLNamedType = js.native
  def getDirectives(schema: GraphQLSchema, node: DirectableGraphQLObject): DirectiveUseMap = js.native
  def getErrors(result: js.Any, pathSegment: String): js.Array[GraphQLError] = js.native
  def getErrorsByPathSegment(errors: js.Array[GraphQLError]): Record[String, js.Array[GraphQLError]] = js.native
  def getFieldsWithDirectives(documentNode: DocumentNode): TypeAndFieldToDirectives = js.native
  def getImplementingTypes(interfaceName: String, schema: GraphQLSchema): js.Array[String] = js.native
  def getResolversFromSchema(schema: GraphQLSchema): IResolvers[_, _, Record[String, _], _] = js.native
  def getResponseKeyFromInfo(info: GraphQLResolveInfo): String = js.native
  def getUserTypesFromSchema(schema: GraphQLSchema): js.Array[GraphQLObjectType[_, _]] = js.native
  def healSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def healTypes(originalTypeMap: Record[String, GraphQLNamedType | Null], directives: js.Array[GraphQLDirective]): Unit = js.native
  def healTypes(
    originalTypeMap: Record[String, GraphQLNamedType | Null],
    directives: js.Array[GraphQLDirective],
    config: SkipPruning
  ): Unit = js.native
  def hoistFieldNodes(hasFieldNodeFieldNamesPathDelimeterFragments: Delimeter): js.Array[FieldNode] = js.native
  def implementsAbstractType(schema: GraphQLSchema, typeA: GraphQLType, typeB: GraphQLType): Boolean = js.native
  def inputFieldToFieldConfig(field: GraphQLInputField): GraphQLInputFieldConfig = js.native
  def isDocumentString(str: String): Boolean = js.native
  def isEqual[T](a: T, b: T): Boolean = js.native
  def isNamedStub(`type`: GraphQLNamedType): Boolean = js.native
  def isNotEqual[T](a: T, b: T): Boolean = js.native
  def isValidPath(str: String): Boolean = js.native
  def mapAsyncIterator[T, U](
    iterator: AsyncIterator[T, _, js.UndefOr[scala.Nothing]],
    callback: js.Function1[/* value */ T, js.Promise[U] | U]
  ): AsyncIterator[U, _, js.UndefOr[scala.Nothing]] = js.native
  def mapAsyncIterator[T, U](
    iterator: AsyncIterator[T, _, js.UndefOr[scala.Nothing]],
    callback: js.Function1[/* value */ T, js.Promise[U] | U],
    rejectCallback: js.Any
  ): AsyncIterator[U, _, js.UndefOr[scala.Nothing]] = js.native
  def mapSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def mapSchema(schema: GraphQLSchema, schemaMapper: SchemaMapper): GraphQLSchema = js.native
  def mergeDeep(target: js.Any, sources: js.Any*): js.Any = js.native
  def modifyObjectFields(
    schema: GraphQLSchema,
    typeName: String,
    testFn: js.Function2[
      /* fieldName */ String, 
      /* field */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
      Boolean
    ],
    newFields: GraphQLFieldConfigMap[_, _]
  ): js.Tuple2[GraphQLSchema, GraphQLFieldConfigMap[_, _]] = js.native
  def nodeToString(a: ASTNode): String = js.native
  def observableToAsyncIterable[T](observable: Observable[T]): (AsyncIterator[T, _, js.UndefOr[scala.Nothing]]) with typingsSlinky.graphqlToolsUtils.anon.AsyncIterator[T] = js.native
  def parseFragmentToInlineFragment(definitions: String): InlineFragmentNode = js.native
  def parseGraphQLJSON(
    location: String,
    jsonContent: String,
    options: SchemaPrintOptions with ParseOptions with GraphQLSchemaValidationOptions
  ): Source = js.native
  def parseGraphQLSDL(location: String, rawSDL: String, options: ParseOptions): Document = js.native
  def parseInputValue(`type`: GraphQLInputType, value: js.Any): js.Any = js.native
  def parseInputValueLiteral(`type`: GraphQLInputType, value: js.Any): js.Any = js.native
  def parseSelectionSet(selectionSet: String): SelectionSetNode = js.native
  def preAliasFieldNode(fieldNode: FieldNode, str: String): FieldNode = js.native
  def printSchemaWithDirectives(schema: GraphQLSchema): String = js.native
  def printSchemaWithDirectives(schema: GraphQLSchema, _options: SchemaPrintOptions): String = js.native
  def pruneSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def pruneSchema(schema: GraphQLSchema, options: PruneSchemaOptions): GraphQLSchema = js.native
  def relocatedError(originalError: GraphQLError): GraphQLError = js.native
  def relocatedError(originalError: GraphQLError, path: js.Array[String | Double]): GraphQLError = js.native
  def removeObjectFields(
    schema: GraphQLSchema,
    typeName: String,
    testFn: js.Function2[
      /* fieldName */ String, 
      /* field */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
      Boolean
    ]
  ): js.Tuple2[GraphQLSchema, GraphQLFieldConfigMap[_, _]] = js.native
  def renameFieldNode(fieldNode: FieldNode, name: String): FieldNode = js.native
  def renameType(`type`: GraphQLNamedType, newTypeName: String): GraphQLNamedType = js.native
  def renameType(`type`: GraphQLEnumType, newTypeName: String): GraphQLEnumType = js.native
  def renameType(`type`: GraphQLInputObjectType, newTypeName: String): GraphQLInputObjectType = js.native
  def renameType(`type`: GraphQLInterfaceType, newTypeName: String): GraphQLInterfaceType = js.native
  def renameType(`type`: GraphQLObjectType[_, _], newTypeName: String): GraphQLObjectType[_, _] = js.native
  def renameType(`type`: GraphQLScalarType, newTypeName: String): GraphQLScalarType = js.native
  def renameType(`type`: GraphQLUnionType, newTypeName: String): GraphQLUnionType = js.native
  def rewireTypes(originalTypeMap: Record[String, GraphQLNamedType | Null], directives: js.Array[GraphQLDirective]): Directives = js.native
  def rewireTypes(
    originalTypeMap: Record[String, GraphQLNamedType | Null],
    directives: js.Array[GraphQLDirective],
    options: SkipPruning
  ): Directives = js.native
  def selectObjectFields(
    schema: GraphQLSchema,
    typeName: String,
    testFn: js.Function2[
      /* fieldName */ String, 
      /* field */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
      Boolean
    ]
  ): GraphQLFieldConfigMap[_, _] = js.native
  def serializeInputValue(`type`: GraphQLInputType, value: js.Any): js.Any = js.native
  def setErrors(result: js.Any, errors: js.Array[GraphQLError]): Unit = js.native
  def slicedError(originalError: GraphQLError): GraphQLError = js.native
  def transformInputValue(`type`: GraphQLInputType, value: js.Any, transformer: InputValueTransformer): js.Any = js.native
  def typeContainsSelectionSet(`type`: GraphQLObjectType[_, _], selectionSet: SelectionSetNode): Boolean = js.native
  def updateArgument(
    argName: String,
    argType: GraphQLInputType,
    argumentNodes: Record[String, ArgumentNode],
    variableDefinitionsMap: Record[String, VariableDefinitionNode],
    variableValues: Record[String, _],
    newArg: js.Any
  ): Unit = js.native
  def validateGraphQlDocuments(schema: GraphQLSchema, documentFiles: js.Array[Source]): js.Promise[js.Array[LoadDocumentError]] = js.native
  def validateGraphQlDocuments(schema: GraphQLSchema, documentFiles: js.Array[Source], effectiveRules: js.Array[ValidationRule]): js.Promise[js.Array[LoadDocumentError]] = js.native
  def visitData(data: js.Any): js.Any = js.native
  def visitData(data: js.Any, enter: js.UndefOr[scala.Nothing], leave: ValueVisitor): js.Any = js.native
  def visitData(data: js.Any, enter: ValueVisitor): js.Any = js.native
  def visitData(data: js.Any, enter: ValueVisitor, leave: ValueVisitor): js.Any = js.native
  def visitErrors(errors: js.Array[GraphQLError], visitor: js.Function1[/* error */ GraphQLError, GraphQLError]): js.Array[GraphQLError] = js.native
  def visitResult(result: ExecutionResult[Record[String, _]], request: Request, schema: GraphQLSchema): js.Any = js.native
  def visitResult(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: js.UndefOr[scala.Nothing],
    errorVisitorMap: ErrorVisitorMap
  ): js.Any = js.native
  def visitResult(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: ResultVisitorMap
  ): js.Any = js.native
  def visitResult(
    result: ExecutionResult[Record[String, _]],
    request: Request,
    schema: GraphQLSchema,
    resultVisitorMap: ResultVisitorMap,
    errorVisitorMap: ErrorVisitorMap
  ): js.Any = js.native
  def visitSchema(
    schema: GraphQLSchema,
    visitorOrVisitorSelector: js.Array[
      typingsSlinky.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor | SchemaVisitorMap
    ]
  ): GraphQLSchema = js.native
  def visitSchema(schema: GraphQLSchema, visitorOrVisitorSelector: SchemaVisitorMap): GraphQLSchema = js.native
  def visitSchema(schema: GraphQLSchema, visitorOrVisitorSelector: VisitorSelector): GraphQLSchema = js.native
  def visitSchema(
    schema: GraphQLSchema,
    visitorOrVisitorSelector: typingsSlinky.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor
  ): GraphQLSchema = js.native
  def wrapFieldNode(fieldNode: FieldNode, path: js.Array[String]): FieldNode = js.native
  @js.native
  object MapperKind extends js.Object {
    /* "MapperKind.ABSTRACT_TYPE" */ val ABSTRACT_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.ABSTRACT_TYPE with String = js.native
    /* "MapperKind.ARGUMENT" */ val ARGUMENT: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.ARGUMENT with String = js.native
    /* "MapperKind.COMPOSITE_FIELD" */ val COMPOSITE_FIELD: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.COMPOSITE_FIELD with String = js.native
    /* "MapperKind.COMPOSITE_TYPE" */ val COMPOSITE_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.COMPOSITE_TYPE with String = js.native
    /* "MapperKind.DIRECTIVE" */ val DIRECTIVE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.DIRECTIVE with String = js.native
    /* "MapperKind.ENUM_TYPE" */ val ENUM_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.ENUM_TYPE with String = js.native
    /* "MapperKind.ENUM_VALUE" */ val ENUM_VALUE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.ENUM_VALUE with String = js.native
    /* "MapperKind.FIELD" */ val FIELD: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.FIELD with String = js.native
    /* "MapperKind.INPUT_OBJECT_FIELD" */ val INPUT_OBJECT_FIELD: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.INPUT_OBJECT_FIELD with String = js.native
    /* "MapperKind.INPUT_OBJECT_TYPE" */ val INPUT_OBJECT_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.INPUT_OBJECT_TYPE with String = js.native
    /* "MapperKind.INTERFACE_FIELD" */ val INTERFACE_FIELD: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.INTERFACE_FIELD with String = js.native
    /* "MapperKind.INTERFACE_TYPE" */ val INTERFACE_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.INTERFACE_TYPE with String = js.native
    /* "MapperKind.MUTATION" */ val MUTATION: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.MUTATION with String = js.native
    /* "MapperKind.MUTATION_ROOT_FIELD" */ val MUTATION_ROOT_FIELD: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.MUTATION_ROOT_FIELD with String = js.native
    /* "MapperKind.OBJECT_FIELD" */ val OBJECT_FIELD: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.OBJECT_FIELD with String = js.native
    /* "MapperKind.OBJECT_TYPE" */ val OBJECT_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.OBJECT_TYPE with String = js.native
    /* "MapperKind.QUERY" */ val QUERY: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.QUERY with String = js.native
    /* "MapperKind.QUERY_ROOT_FIELD" */ val QUERY_ROOT_FIELD: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.QUERY_ROOT_FIELD with String = js.native
    /* "MapperKind.ROOT_FIELD" */ val ROOT_FIELD: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.ROOT_FIELD with String = js.native
    /* "MapperKind.ROOT_OBJECT" */ val ROOT_OBJECT: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.ROOT_OBJECT with String = js.native
    /* "MapperKind.SCALAR_TYPE" */ val SCALAR_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.SCALAR_TYPE with String = js.native
    /* "MapperKind.SUBSCRIPTION" */ val SUBSCRIPTION: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.SUBSCRIPTION with String = js.native
    /* "MapperKind.SUBSCRIPTION_ROOT_FIELD" */ val SUBSCRIPTION_ROOT_FIELD: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.SUBSCRIPTION_ROOT_FIELD with String = js.native
    /* "MapperKind.TYPE" */ val TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.TYPE with String = js.native
    /* "MapperKind.UNION_TYPE" */ val UNION_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind.UNION_TYPE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.graphqlToolsUtils.interfacesMod.MapperKind with String] = js.native
  }
  
  /* static members */
  @js.native
  object SchemaDirectiveVisitor extends js.Object {
    /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[String, GraphQLDirective] = js.native
    def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): js.UndefOr[GraphQLDirective | Null] = js.native
    def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: Record[String, SchemaDirectiveVisitorClass]): Record[
        String, 
        js.Array[
          typingsSlinky.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitor[_, _]
        ]
      ] = js.native
    def visitSchemaDirectives(
      schema: GraphQLSchema,
      directiveVisitors: Record[String, SchemaDirectiveVisitorClass],
      context: Record[String, _]
    ): Record[
        String, 
        js.Array[
          typingsSlinky.graphqlToolsUtils.schemaDirectiveVisitorMod.SchemaDirectiveVisitor[_, _]
        ]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object SchemaVisitor extends js.Object {
    def implementsVisitorMethod(methodName: String): Boolean = js.native
  }
  
  @js.native
  object VisitSchemaKind extends js.Object {
    /* "VisitSchemaKind.ABSTRACT_TYPE" */ val ABSTRACT_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.ABSTRACT_TYPE with String = js.native
    /* "VisitSchemaKind.COMPOSITE_TYPE" */ val COMPOSITE_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.COMPOSITE_TYPE with String = js.native
    /* "VisitSchemaKind.ENUM_TYPE" */ val ENUM_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.ENUM_TYPE with String = js.native
    /* "VisitSchemaKind.INPUT_OBJECT_TYPE" */ val INPUT_OBJECT_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.INPUT_OBJECT_TYPE with String = js.native
    /* "VisitSchemaKind.INTERFACE_TYPE" */ val INTERFACE_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.INTERFACE_TYPE with String = js.native
    /* "VisitSchemaKind.MUTATION" */ val MUTATION: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.MUTATION with String = js.native
    /* "VisitSchemaKind.OBJECT_TYPE" */ val OBJECT_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.OBJECT_TYPE with String = js.native
    /* "VisitSchemaKind.QUERY" */ val QUERY: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.QUERY with String = js.native
    /* "VisitSchemaKind.ROOT_OBJECT" */ val ROOT_OBJECT: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.ROOT_OBJECT with String = js.native
    /* "VisitSchemaKind.SCALAR_TYPE" */ val SCALAR_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.SCALAR_TYPE with String = js.native
    /* "VisitSchemaKind.SUBSCRIPTION" */ val SUBSCRIPTION: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.SUBSCRIPTION with String = js.native
    /* "VisitSchemaKind.TYPE" */ val TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.TYPE with String = js.native
    /* "VisitSchemaKind.UNION_TYPE" */ val UNION_TYPE: typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind.UNION_TYPE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.graphqlToolsUtils.interfacesMod.VisitSchemaKind with String] = js.native
  }
  
}

