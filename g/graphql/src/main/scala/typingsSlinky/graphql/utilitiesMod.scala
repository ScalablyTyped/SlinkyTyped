package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.anon.Description
import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.astMod.ListTypeNode
import typingsSlinky.graphql.astMod.NamedTypeNode
import typingsSlinky.graphql.astMod.NonNullTypeNode
import typingsSlinky.graphql.astMod.OperationDefinitionNode
import typingsSlinky.graphql.astMod.OperationTypeDefinitionNode
import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.buildClientSchemaMod.Options
import typingsSlinky.graphql.coerceInputValueMod.OnErrorCB
import typingsSlinky.graphql.coerceValueMod.CoercedValue
import typingsSlinky.graphql.definitionMod.GraphQLCompositeType
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.definitionMod.GraphQLList
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLNonNull
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.findBreakingChangesMod.BreakingChange
import typingsSlinky.graphql.findBreakingChangesMod.DangerousChange
import typingsSlinky.graphql.findBreakingChangesMod._BreakingChangeType
import typingsSlinky.graphql.findBreakingChangesMod._DangerousChangeType
import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import typingsSlinky.graphql.introspectionQueryMod.IntrospectionOptions
import typingsSlinky.graphql.introspectionQueryMod.IntrospectionQuery_
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.parserMod.ParseOptions
import typingsSlinky.graphql.pathMod.Path
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import typingsSlinky.graphql.sourceMod.Source
import typingsSlinky.graphql.typeInfoMod.getFieldDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities", JSImport.Namespace)
@js.native
object utilitiesMod extends js.Object {
  @js.native
  class TypeInfo protected ()
    extends typingsSlinky.graphql.typeInfoMod.TypeInfo {
    def this(schema: GraphQLSchema) = this()
    def this(
      schema: GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef
    ) = this()
    def this(
      schema: GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef,
      // Initial type may be provided in rare cases to facilitate traversals
    // beginning somewhere other than documents.
    initialType: GraphQLType
    ) = this()
  }
  
  val BreakingChangeType: _BreakingChangeType = js.native
  val DangerousChangeType: _DangerousChangeType = js.native
  val introspectionQuery: String = js.native
  def assertValidName(name: String): String = js.native
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
  def buildASTSchema(documentAST: DocumentNode): GraphQLSchema = js.native
  def buildASTSchema(documentAST: DocumentNode, options: BuildSchemaOptions): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery_): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery_, options: Options): GraphQLSchema = js.native
  def buildSchema(source: String): GraphQLSchema = js.native
  def buildSchema(source: String, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def buildSchema(source: Source): GraphQLSchema = js.native
  def buildSchema(source: Source, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
  def concatAST(asts: js.Array[DocumentNode]): DocumentNode = js.native
  def doTypesOverlap(schema: GraphQLSchema, typeA: GraphQLCompositeType, typeB: GraphQLCompositeType): Boolean = js.native
  def extendSchema(schema: GraphQLSchema, documentAST: DocumentNode): GraphQLSchema = js.native
  def extendSchema(
    schema: GraphQLSchema,
    documentAST: DocumentNode,
    options: typingsSlinky.graphql.extendSchemaMod.Options
  ): GraphQLSchema = js.native
  def findBreakingChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findDangerousChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
  def findDeprecatedUsages(schema: GraphQLSchema, ast: DocumentNode): js.Array[GraphQLError] = js.native
  def getDescription(node: Description, options: Maybe[BuildSchemaOptions]): js.UndefOr[String] = js.native
  def getIntrospectionQuery(): String = js.native
  def getIntrospectionQuery(options: IntrospectionOptions): String = js.native
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
  def getOperationRootType(schema: GraphQLSchema, operation: OperationDefinitionNode): GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getOperationRootType(schema: GraphQLSchema, operation: OperationTypeDefinitionNode): GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def introspectionFromSchema(schema: GraphQLSchema): IntrospectionQuery_ = js.native
  def introspectionFromSchema(schema: GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery_ = js.native
  def isEqualType(typeA: GraphQLType, typeB: GraphQLType): Boolean = js.native
  def isTypeSubTypeOf(schema: GraphQLSchema, maybeSubType: GraphQLType, superType: GraphQLType): Boolean = js.native
  def isValidJSValue(value: js.Any, `type`: GraphQLInputType): js.Array[String] = js.native
  def isValidLiteralValue(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[GraphQLError] = js.native
  def isValidNameError(name: String): js.UndefOr[GraphQLError] = js.native
  def isValidNameError(name: String, node: ASTNode): js.UndefOr[GraphQLError] = js.native
  def lexicographicSortSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def printIntrospectionSchema(schema: GraphQLSchema): String = js.native
  def printIntrospectionSchema(schema: GraphQLSchema, options: typingsSlinky.graphql.schemaPrinterMod.Options): String = js.native
  def printSchema(schema: GraphQLSchema): String = js.native
  def printSchema(schema: GraphQLSchema, options: typingsSlinky.graphql.schemaPrinterMod.Options): String = js.native
  def printType(`type`: GraphQLNamedType): String = js.native
  def printType(`type`: GraphQLNamedType, options: typingsSlinky.graphql.schemaPrinterMod.Options): String = js.native
  def separateOperations(documentAST: DocumentNode): StringDictionary[DocumentNode] = js.native
  def stripIgnoredCharacters(source: String): String = js.native
  def stripIgnoredCharacters(source: Source): String = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[GraphQLList[_]] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[GraphQLNonNull[_]] = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): js.Any = js.native
}

