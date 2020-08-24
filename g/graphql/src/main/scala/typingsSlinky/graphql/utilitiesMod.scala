package typingsSlinky.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.anon.CommentDescriptions
import typingsSlinky.graphql.anon.Description
import typingsSlinky.graphql.astMod.ASTKindToNode
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
import typingsSlinky.graphql.astMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.astMod.UnionTypeExtensionNode
import typingsSlinky.graphql.astMod.ValueNode
import typingsSlinky.graphql.astMod.VariableDefinitionNode
import typingsSlinky.graphql.astMod.VariableNode
import typingsSlinky.graphql.buildASTSchemaMod.BuildSchemaOptions
import typingsSlinky.graphql.coerceInputValueMod.OnErrorCB
import typingsSlinky.graphql.definitionMod.GraphQLCompositeType
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.definitionMod.GraphQLList
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLNonNull
import typingsSlinky.graphql.definitionMod.GraphQLObjectType
import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.extendSchemaMod.Options
import typingsSlinky.graphql.findBreakingChangesMod.BreakingChange
import typingsSlinky.graphql.findBreakingChangesMod.DangerousChange
import typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionOptions
import typingsSlinky.graphql.getIntrospectionQueryMod.IntrospectionQuery
import typingsSlinky.graphql.graphQLErrorMod.GraphQLError
import typingsSlinky.graphql.maybeMod.Maybe
import typingsSlinky.graphql.parserMod.ParseOptions
import typingsSlinky.graphql.schemaMod.GraphQLSchema
import typingsSlinky.graphql.schemaMod.GraphQLSchemaValidationOptions
import typingsSlinky.graphql.sourceMod.Source
import typingsSlinky.graphql.typeInfoMod.getFieldDef
import typingsSlinky.graphql.visitorMod.Visitor
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
    // to support non-spec-compliant code bases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef
    ) = this()
    def this(
      schema: GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant code bases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: js.UndefOr[scala.Nothing],
      // Initial type may be provided in rare cases to facilitate traversals
    // beginning somewhere other than documents.
    initialType: GraphQLType
    ) = this()
    def this(
      schema: GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant code bases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef,
      // Initial type may be provided in rare cases to facilitate traversals
    // beginning somewhere other than documents.
    initialType: GraphQLType
    ) = this()
  }
  
  def assertValidName(name: String): String = js.native
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
  def buildASTSchema(documentAST: DocumentNode): GraphQLSchema = js.native
  def buildASTSchema(documentAST: DocumentNode, options: BuildSchemaOptions): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery, options: GraphQLSchemaValidationOptions): GraphQLSchema = js.native
  def buildSchema(source: String): GraphQLSchema = js.native
  def buildSchema(source: String, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def buildSchema(source: Source): GraphQLSchema = js.native
  def buildSchema(source: Source, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  def concatAST(asts: js.Array[DocumentNode]): DocumentNode = js.native
  def doTypesOverlap(schema: GraphQLSchema, typeA: GraphQLCompositeType, typeB: GraphQLCompositeType): Boolean = js.native
  def extendSchema(schema: GraphQLSchema, documentAST: DocumentNode): GraphQLSchema = js.native
  def extendSchema(schema: GraphQLSchema, documentAST: DocumentNode, options: Options): GraphQLSchema = js.native
  def findBreakingChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findDangerousChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
  def findDeprecatedUsages(schema: GraphQLSchema, ast: DocumentNode): js.Array[GraphQLError] = js.native
  def getDescription(node: Description): js.UndefOr[String] = js.native
  def getDescription(node: Description, options: Maybe[CommentDescriptions]): js.UndefOr[String] = js.native
  def getIntrospectionQuery(): String = js.native
  def getIntrospectionQuery(options: IntrospectionOptions): String = js.native
  def getOperationAST(documentAST: DocumentNode): Maybe[OperationDefinitionNode] = js.native
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
  def getOperationRootType(schema: GraphQLSchema, operation: OperationDefinitionNode): GraphQLObjectType[_, _] = js.native
  def getOperationRootType(schema: GraphQLSchema, operation: OperationTypeDefinitionNode): GraphQLObjectType[_, _] = js.native
  def introspectionFromSchema(schema: GraphQLSchema): IntrospectionQuery = js.native
  def introspectionFromSchema(schema: GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
  def isEqualType(typeA: GraphQLType, typeB: GraphQLType): Boolean = js.native
  def isTypeSubTypeOf(schema: GraphQLSchema, maybeSubType: GraphQLType, superType: GraphQLType): Boolean = js.native
  def isValidNameError(name: String): js.UndefOr[GraphQLError] = js.native
  def lexicographicSortSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def printIntrospectionSchema(schema: GraphQLSchema): String = js.native
  def printIntrospectionSchema(schema: GraphQLSchema, options: typingsSlinky.graphql.printSchemaMod.Options): String = js.native
  def printSchema(schema: GraphQLSchema): String = js.native
  def printSchema(schema: GraphQLSchema, options: typingsSlinky.graphql.printSchemaMod.Options): String = js.native
  def printType(`type`: GraphQLNamedType): String = js.native
  def printType(`type`: GraphQLNamedType, options: typingsSlinky.graphql.printSchemaMod.Options): String = js.native
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
  object BreakingChangeType extends js.Object {
    var ARG_CHANGED_KIND: typingsSlinky.graphql.graphqlStrings.ARG_CHANGED_KIND = js.native
    var ARG_REMOVED: typingsSlinky.graphql.graphqlStrings.ARG_REMOVED = js.native
    var DIRECTIVE_ARG_REMOVED: typingsSlinky.graphql.graphqlStrings.DIRECTIVE_ARG_REMOVED = js.native
    var DIRECTIVE_LOCATION_REMOVED: typingsSlinky.graphql.graphqlStrings.DIRECTIVE_LOCATION_REMOVED = js.native
    var DIRECTIVE_REMOVED: typingsSlinky.graphql.graphqlStrings.DIRECTIVE_REMOVED = js.native
    var DIRECTIVE_REPEATABLE_REMOVED: typingsSlinky.graphql.graphqlStrings.DIRECTIVE_REPEATABLE_REMOVED = js.native
    var FIELD_CHANGED_KIND: typingsSlinky.graphql.graphqlStrings.FIELD_CHANGED_KIND = js.native
    var FIELD_REMOVED: typingsSlinky.graphql.graphqlStrings.FIELD_REMOVED = js.native
    var IMPLEMENTED_INTERFACE_REMOVED: typingsSlinky.graphql.graphqlStrings.IMPLEMENTED_INTERFACE_REMOVED = js.native
    var REQUIRED_ARG_ADDED: typingsSlinky.graphql.graphqlStrings.REQUIRED_ARG_ADDED = js.native
    var REQUIRED_DIRECTIVE_ARG_ADDED: typingsSlinky.graphql.graphqlStrings.REQUIRED_DIRECTIVE_ARG_ADDED = js.native
    var REQUIRED_INPUT_FIELD_ADDED: typingsSlinky.graphql.graphqlStrings.REQUIRED_INPUT_FIELD_ADDED = js.native
    var TYPE_CHANGED_KIND: typingsSlinky.graphql.graphqlStrings.TYPE_CHANGED_KIND = js.native
    var TYPE_REMOVED: typingsSlinky.graphql.graphqlStrings.TYPE_REMOVED = js.native
    var TYPE_REMOVED_FROM_UNION: typingsSlinky.graphql.graphqlStrings.TYPE_REMOVED_FROM_UNION = js.native
    var VALUE_REMOVED_FROM_ENUM: typingsSlinky.graphql.graphqlStrings.VALUE_REMOVED_FROM_ENUM = js.native
  }
  
  @js.native
  object DangerousChangeType extends js.Object {
    var ARG_DEFAULT_VALUE_CHANGE: typingsSlinky.graphql.graphqlStrings.ARG_DEFAULT_VALUE_CHANGE = js.native
    var IMPLEMENTED_INTERFACE_ADDED: typingsSlinky.graphql.graphqlStrings.IMPLEMENTED_INTERFACE_ADDED = js.native
    var OPTIONAL_ARG_ADDED: typingsSlinky.graphql.graphqlStrings.OPTIONAL_ARG_ADDED = js.native
    var OPTIONAL_INPUT_FIELD_ADDED: typingsSlinky.graphql.graphqlStrings.OPTIONAL_INPUT_FIELD_ADDED = js.native
    var TYPE_ADDED_TO_UNION: typingsSlinky.graphql.graphqlStrings.TYPE_ADDED_TO_UNION = js.native
    var VALUE_ADDED_TO_ENUM: typingsSlinky.graphql.graphqlStrings.VALUE_ADDED_TO_ENUM = js.native
  }
  
}

