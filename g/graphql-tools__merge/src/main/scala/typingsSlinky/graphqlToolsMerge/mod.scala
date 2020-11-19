package typingsSlinky.graphqlToolsMerge

import typingsSlinky.graphql.astMod.ASTNode
import typingsSlinky.graphql.astMod.DefinitionNode
import typingsSlinky.graphql.astMod.DirectiveDefinitionNode
import typingsSlinky.graphql.astMod.DirectiveNode
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.astMod.EnumTypeDefinitionNode
import typingsSlinky.graphql.astMod.EnumTypeExtensionNode
import typingsSlinky.graphql.astMod.EnumValueDefinitionNode
import typingsSlinky.graphql.astMod.FieldDefinitionNode
import typingsSlinky.graphql.astMod.InputObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.InputObjectTypeExtensionNode
import typingsSlinky.graphql.astMod.InputValueDefinitionNode
import typingsSlinky.graphql.astMod.InterfaceTypeDefinitionNode
import typingsSlinky.graphql.astMod.InterfaceTypeExtensionNode
import typingsSlinky.graphql.astMod.NamedTypeNode
import typingsSlinky.graphql.astMod.ObjectTypeDefinitionNode
import typingsSlinky.graphql.astMod.ObjectTypeExtensionNode
import typingsSlinky.graphql.astMod.TypeDefinitionNode
import typingsSlinky.graphql.astMod.TypeNode
import typingsSlinky.graphql.astMod.UnionTypeDefinitionNode
import typingsSlinky.graphql.astMod.UnionTypeExtensionNode
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphql.mod.Source
import typingsSlinky.graphqlToolsMerge.anon.Description
import typingsSlinky.graphqlToolsMerge.anon.Name
import typingsSlinky.graphqlToolsMerge.anon.OmitPartialConfigcommentD
import typingsSlinky.graphqlToolsMerge.anon.OnEnum
import typingsSlinky.graphqlToolsMerge.anon.PartialConfigcommentDescr
import typingsSlinky.graphqlToolsMerge.extensionsMod.SchemaExtensions
import typingsSlinky.graphqlToolsMerge.mergeNodesMod.MergedResultMap
import typingsSlinky.graphqlToolsMerge.mergeResolversMod.MergeResolversOptions
import typingsSlinky.graphqlToolsMerge.mergeResolversMod.ResolversDefinition
import typingsSlinky.graphqlToolsMerge.mergeSchemasMod.MergeSchemasConfig
import typingsSlinky.graphqlToolsMerge.mergeTypedefsMod.Config
import typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/merge", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def applyExtensions(schema: GraphQLSchema, extensions: SchemaExtensions): GraphQLSchema = js.native
  
  def collectComment(node: TypeDefinitionNode): Unit = js.native
  
  def extractExtensionsFromSchema(schema: GraphQLSchema): SchemaExtensions = js.native
  
  def extractType(`type`: TypeNode): NamedTypeNode = js.native
  
  def isGraphQLDirective(definition: DefinitionNode): /* is graphql.graphql/language/ast.DirectiveDefinitionNode */ Boolean = js.native
  
  def isGraphQLEnum(definition: DefinitionNode): /* is graphql.graphql/language/ast.EnumTypeDefinitionNode */ Boolean = js.native
  
  def isGraphQLEnumExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.EnumTypeExtensionNode */ Boolean = js.native
  
  def isGraphQLInputType(definition: DefinitionNode): /* is graphql.graphql/language/ast.InputObjectTypeDefinitionNode */ Boolean = js.native
  
  def isGraphQLInputTypeExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.InputObjectTypeExtensionNode */ Boolean = js.native
  
  def isGraphQLInterface(definition: DefinitionNode): /* is graphql.graphql/language/ast.InterfaceTypeDefinitionNode */ Boolean = js.native
  
  def isGraphQLInterfaceExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.InterfaceTypeExtensionNode */ Boolean = js.native
  
  def isGraphQLScalar(definition: DefinitionNode): /* is graphql.graphql/language/ast.ScalarTypeDefinitionNode */ Boolean = js.native
  
  def isGraphQLScalarExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.ScalarTypeExtensionNode */ Boolean = js.native
  
  def isGraphQLType(definition: DefinitionNode): /* is graphql.graphql/language/ast.ObjectTypeDefinitionNode */ Boolean = js.native
  
  def isGraphQLTypeExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.ObjectTypeExtensionNode */ Boolean = js.native
  
  def isGraphQLUnion(definition: DefinitionNode): /* is graphql.graphql/language/ast.UnionTypeDefinitionNode */ Boolean = js.native
  
  def isGraphQLUnionExtension(definition: DefinitionNode): /* is graphql.graphql/language/ast.UnionTypeExtensionNode */ Boolean = js.native
  
  def isListTypeNode(`type`: TypeNode): /* is graphql.graphql/language/ast.ListTypeNode */ Boolean = js.native
  
  def isNonNullTypeNode(`type`: TypeNode): /* is graphql.graphql/language/ast.NonNullTypeNode */ Boolean = js.native
  
  def isSchemaDefinition(node: DefinitionNode): /* is graphql.graphql/language/ast.SchemaDefinitionNode */ Boolean = js.native
  
  def isSourceTypes(types: js.Any): /* is graphql.graphql.Source */ Boolean = js.native
  
  def isStringTypes(types: js.Any): /* is string */ Boolean = js.native
  
  def isWrappingTypeNode(`type`: TypeNode): Boolean = js.native
  
  def mergeArguments(
    args1: js.Array[InputValueDefinitionNode],
    args2: js.Array[InputValueDefinitionNode],
    config: Config
  ): js.Array[InputValueDefinitionNode] = js.native
  
  def mergeDirective(node: DirectiveDefinitionNode): DirectiveDefinitionNode = js.native
  def mergeDirective(node: DirectiveDefinitionNode, existingNode: DirectiveDefinitionNode): DirectiveDefinitionNode = js.native
  
  def mergeDirectives(): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.UndefOr[scala.Nothing], d2: js.UndefOr[scala.Nothing], config: Config): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.UndefOr[scala.Nothing], d2: js.Array[DirectiveNode]): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.UndefOr[scala.Nothing], d2: js.Array[DirectiveNode], config: Config): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.Array[DirectiveNode]): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.Array[DirectiveNode], d2: js.UndefOr[scala.Nothing], config: Config): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.Array[DirectiveNode], d2: js.Array[DirectiveNode]): js.Array[DirectiveNode] = js.native
  def mergeDirectives(d1: js.Array[DirectiveNode], d2: js.Array[DirectiveNode], config: Config): js.Array[DirectiveNode] = js.native
  
  def mergeEnum(e1: EnumTypeDefinitionNode, e2: EnumTypeDefinitionNode): EnumTypeDefinitionNode | EnumTypeExtensionNode = js.native
  def mergeEnum(e1: EnumTypeDefinitionNode, e2: EnumTypeDefinitionNode, config: Config): EnumTypeDefinitionNode | EnumTypeExtensionNode = js.native
  def mergeEnum(e1: EnumTypeDefinitionNode, e2: EnumTypeExtensionNode): EnumTypeDefinitionNode | EnumTypeExtensionNode = js.native
  def mergeEnum(e1: EnumTypeDefinitionNode, e2: EnumTypeExtensionNode, config: Config): EnumTypeDefinitionNode | EnumTypeExtensionNode = js.native
  def mergeEnum(e1: EnumTypeExtensionNode, e2: EnumTypeDefinitionNode): EnumTypeDefinitionNode | EnumTypeExtensionNode = js.native
  def mergeEnum(e1: EnumTypeExtensionNode, e2: EnumTypeDefinitionNode, config: Config): EnumTypeDefinitionNode | EnumTypeExtensionNode = js.native
  def mergeEnum(e1: EnumTypeExtensionNode, e2: EnumTypeExtensionNode): EnumTypeDefinitionNode | EnumTypeExtensionNode = js.native
  def mergeEnum(e1: EnumTypeExtensionNode, e2: EnumTypeExtensionNode, config: Config): EnumTypeDefinitionNode | EnumTypeExtensionNode = js.native
  
  def mergeEnumValues(
    first: js.Array[EnumValueDefinitionNode],
    second: js.Array[EnumValueDefinitionNode],
    config: Config
  ): js.Array[EnumValueDefinitionNode] = js.native
  
  def mergeExtensions(extensions: js.Array[SchemaExtensions]): SchemaExtensions = js.native
  
  def mergeFields[T /* <: FieldDefinitionNode | InputValueDefinitionNode */](`type`: Name, f1: js.Array[T], f2: js.Array[T], config: Config): js.Array[T] = js.native
  
  def mergeGraphQLNodes(nodes: js.Array[DefinitionNode]): MergedResultMap = js.native
  def mergeGraphQLNodes(nodes: js.Array[DefinitionNode], config: Config): MergedResultMap = js.native
  
  def mergeGraphQLTypes(types: js.Array[String | Source | DocumentNode | GraphQLSchema], config: Config): js.Array[DefinitionNode] = js.native
  
  def mergeInputType(node: InputObjectTypeDefinitionNode, existingNode: InputObjectTypeDefinitionNode): InputObjectTypeDefinitionNode | InputObjectTypeExtensionNode = js.native
  def mergeInputType(node: InputObjectTypeDefinitionNode, existingNode: InputObjectTypeDefinitionNode, config: Config): InputObjectTypeDefinitionNode | InputObjectTypeExtensionNode = js.native
  def mergeInputType(node: InputObjectTypeDefinitionNode, existingNode: InputObjectTypeExtensionNode): InputObjectTypeDefinitionNode | InputObjectTypeExtensionNode = js.native
  def mergeInputType(node: InputObjectTypeDefinitionNode, existingNode: InputObjectTypeExtensionNode, config: Config): InputObjectTypeDefinitionNode | InputObjectTypeExtensionNode = js.native
  def mergeInputType(node: InputObjectTypeExtensionNode, existingNode: InputObjectTypeDefinitionNode): InputObjectTypeDefinitionNode | InputObjectTypeExtensionNode = js.native
  def mergeInputType(node: InputObjectTypeExtensionNode, existingNode: InputObjectTypeDefinitionNode, config: Config): InputObjectTypeDefinitionNode | InputObjectTypeExtensionNode = js.native
  def mergeInputType(node: InputObjectTypeExtensionNode, existingNode: InputObjectTypeExtensionNode): InputObjectTypeDefinitionNode | InputObjectTypeExtensionNode = js.native
  def mergeInputType(node: InputObjectTypeExtensionNode, existingNode: InputObjectTypeExtensionNode, config: Config): InputObjectTypeDefinitionNode | InputObjectTypeExtensionNode = js.native
  
  def mergeInterface(node: InterfaceTypeDefinitionNode, existingNode: InterfaceTypeDefinitionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
  def mergeInterface(node: InterfaceTypeDefinitionNode, existingNode: InterfaceTypeExtensionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
  def mergeInterface(node: InterfaceTypeExtensionNode, existingNode: InterfaceTypeDefinitionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
  def mergeInterface(node: InterfaceTypeExtensionNode, existingNode: InterfaceTypeExtensionNode, config: Config): InterfaceTypeDefinitionNode | InterfaceTypeExtensionNode = js.native
  
  def mergeNamedTypeArray(first: js.Array[NamedTypeNode], second: js.Array[NamedTypeNode], config: Config): js.Array[NamedTypeNode] = js.native
  
  def mergeResolvers[TContext, T /* <: ResolversDefinition[TContext] */](resolversDefinitions: js.Array[T]): T = js.native
  def mergeResolvers[TContext, T /* <: ResolversDefinition[TContext] */](resolversDefinitions: js.Array[T], options: MergeResolversOptions): T = js.native
  
  def mergeSchemas(config: MergeSchemasConfig[IResolvers[_, _, Record[String, _], _]]): GraphQLSchema = js.native
  
  def mergeSchemasAsync(config: MergeSchemasConfig[IResolvers[_, _, Record[String, _], _]]): js.Promise[GraphQLSchema] = js.native
  
  def mergeType(node: ObjectTypeDefinitionNode, existingNode: ObjectTypeDefinitionNode): ObjectTypeDefinitionNode | ObjectTypeExtensionNode = js.native
  def mergeType(node: ObjectTypeDefinitionNode, existingNode: ObjectTypeDefinitionNode, config: Config): ObjectTypeDefinitionNode | ObjectTypeExtensionNode = js.native
  def mergeType(node: ObjectTypeDefinitionNode, existingNode: ObjectTypeExtensionNode): ObjectTypeDefinitionNode | ObjectTypeExtensionNode = js.native
  def mergeType(node: ObjectTypeDefinitionNode, existingNode: ObjectTypeExtensionNode, config: Config): ObjectTypeDefinitionNode | ObjectTypeExtensionNode = js.native
  def mergeType(node: ObjectTypeExtensionNode, existingNode: ObjectTypeDefinitionNode): ObjectTypeDefinitionNode | ObjectTypeExtensionNode = js.native
  def mergeType(node: ObjectTypeExtensionNode, existingNode: ObjectTypeDefinitionNode, config: Config): ObjectTypeDefinitionNode | ObjectTypeExtensionNode = js.native
  def mergeType(node: ObjectTypeExtensionNode, existingNode: ObjectTypeExtensionNode): ObjectTypeDefinitionNode | ObjectTypeExtensionNode = js.native
  def mergeType(node: ObjectTypeExtensionNode, existingNode: ObjectTypeExtensionNode, config: Config): ObjectTypeDefinitionNode | ObjectTypeExtensionNode = js.native
  
  def mergeTypeDefs(types: js.Array[DocumentNode | GraphQLSchema | Source | String]): DocumentNode = js.native
  def mergeTypeDefs(types: js.Array[String | Source | DocumentNode | GraphQLSchema], config: OmitPartialConfigcommentD): DocumentNode = js.native
  def mergeTypeDefs(types: js.Array[String | Source | DocumentNode | GraphQLSchema], config: PartialConfigcommentDescr): String = js.native
  @JSName("mergeTypeDefs")
  def mergeTypeDefs_String(types: js.Array[String | Source | DocumentNode | GraphQLSchema]): String = js.native
  
  def mergeUnion(first: UnionTypeDefinitionNode, second: UnionTypeDefinitionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeDefinitionNode, second: UnionTypeDefinitionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeDefinitionNode, second: UnionTypeExtensionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeDefinitionNode, second: UnionTypeExtensionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeExtensionNode, second: UnionTypeDefinitionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeExtensionNode, second: UnionTypeDefinitionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeExtensionNode, second: UnionTypeExtensionNode): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  def mergeUnion(first: UnionTypeExtensionNode, second: UnionTypeExtensionNode, config: Config): UnionTypeDefinitionNode | UnionTypeExtensionNode = js.native
  
  def printComment(comment: String): String = js.native
  
  def printTypeNode(`type`: TypeNode): String = js.native
  
  def printWithComments(ast: ASTNode): js.Any = js.native
  
  def pushComment(node: Description, entity: String): Unit = js.native
  def pushComment(node: Description, entity: String, field: js.UndefOr[scala.Nothing], argument: String): Unit = js.native
  def pushComment(node: Description, entity: String, field: String): Unit = js.native
  def pushComment(node: Description, entity: String, field: String, argument: String): Unit = js.native
  
  def resetComments(): Unit = js.native
  
  def travelSchemaPossibleExtensions(schema: GraphQLSchema, hooks: OnEnum): Unit = js.native
}
