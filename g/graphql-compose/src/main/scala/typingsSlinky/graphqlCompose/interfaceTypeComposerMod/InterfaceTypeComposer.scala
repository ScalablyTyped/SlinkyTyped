package typingsSlinky.graphqlCompose.interfaceTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLInputType
import typingsSlinky.graphql.definitionMod.GraphQLList
import typingsSlinky.graphql.definitionMod.GraphQLNonNull
import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLTypeResolver
import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphqlCompose.definitionsMod.DirectiveArgs
import typingsSlinky.graphqlCompose.definitionsMod.Extensions
import typingsSlinky.graphqlCompose.definitionsMod.ExtensionsDirective
import typingsSlinky.graphqlCompose.enumTypeComposerMod.EnumTypeComposer
import typingsSlinky.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ArgsMap
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeArgumentConfig
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeArgumentConfigAsObject
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfig
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigArgumentMap
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigAsObject
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigMap
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer
import typingsSlinky.graphqlCompose.objectTypeComposerMod._ComposeOutputType
import typingsSlinky.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer
import typingsSlinky.graphqlCompose.schemaComposerMod.SchemaComposer
import typingsSlinky.graphqlCompose.unionTypeComposerMod.UnionTypeComposer
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/InterfaceTypeComposer", "InterfaceTypeComposer")
@js.native
class InterfaceTypeComposer[TSource, TContext] protected () extends _ComposeOutputType[TSource, TContext] {
  def this(gqType: GraphQLInterfaceType, schemaComposer: SchemaComposer[TContext]) = this()
  
  def addFieldArgs(fieldName: String, newArgs: ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  
  /**
    * Add new fields or replace existed in a GraphQL type
    */
  def addFields(newValues: ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  
  def addTypeResolver[TSrc](`type`: GraphQLObjectType[_, _], checkFn: InterfaceTypeResolverCheckFn[TSrc, TContext]): this.type = js.native
  def addTypeResolver[TSrc](`type`: ObjectTypeComposer[TSrc, TContext], checkFn: InterfaceTypeResolverCheckFn[TSrc, TContext]): this.type = js.native
  
  def clearExtensions(): this.type = js.native
  
  def clearFieldArgExtensions(fieldName: String, argName: String): this.type = js.native
  
  def clearFieldExtensions(fieldName: String): this.type = js.native
  
  def clone(newTypeName: String): this.type = js.native
  
  def deprecateFields(fields: String): this.type = js.native
  def deprecateFields(fields: js.Array[String]): this.type = js.native
  def deprecateFields(fields: StringDictionary[String]): this.type = js.native
  
  def extendExtensions(extensions: Extensions): this.type = js.native
  
  def extendField(
    fieldName: String,
    partialFieldConfig: Partial[ComposeFieldConfigAsObject[TSource, TContext, ArgsMap]]
  ): this.type = js.native
  
  def extendFieldArgExtensions(fieldName: String, argName: String, extensions: Extensions): this.type = js.native
  
  def extendFieldExtensions(fieldName: String, extensions: Extensions): this.type = js.native
  
  /**
    * -----------------------------------------------
    * Misc methods
    * -----------------------------------------------
    */
  def get(path: String): js.Any = js.native
  def get(path: js.Array[String]): js.Any = js.native
  
  def getDescription(): String = js.native
  
  def getDirectiveById(idx: Double): DirectiveArgs | Unit = js.native
  
  def getDirectiveByName(directiveName: String): DirectiveArgs | Unit = js.native
  
  def getDirectiveNames(): js.Array[String] = js.native
  
  /**
    * -----------------------------------------------
    * Directive methods
    * -----------------------------------------------
    */
  def getDirectives(): js.Array[ExtensionsDirective] = js.native
  
  def getExtension(extensionName: String): js.Any = js.native
  
  /**
    *  -----------------------------------------------
    * Extensions methods
    * -----------------------------------------------
    */
  def getExtensions(): Extensions = js.native
  
  def getField(name: String): ComposeFieldConfigAsObject[TSource, TContext, ArgsMap] = js.native
  
  def getFieldArg(fieldName: String, argName: String): ComposeArgumentConfigAsObject = js.native
  
  def getFieldArgDirectiveById(fieldName: String, argName: String, idx: Double): DirectiveArgs | Unit = js.native
  
  def getFieldArgDirectiveByName(fieldName: String, argName: String, directiveName: String): DirectiveArgs | Unit = js.native
  
  def getFieldArgDirectiveNames(fieldName: String, argName: String): js.Array[String] = js.native
  
  def getFieldArgDirectives(fieldName: String, argName: String): js.Array[ExtensionsDirective] = js.native
  
  def getFieldArgExtension(fieldName: String, argName: String, extensionName: String): js.Any = js.native
  
  def getFieldArgExtensions(fieldName: String, argName: String): Extensions = js.native
  
  /**
    * Alias for `getFieldArgTC()` but returns statically checked InputTypeComposer.
    * If field have other type then error will be thrown.
    */
  def getFieldArgITC(fieldName: String, argName: String): InputTypeComposer[TContext] = js.native
  
  def getFieldArgTC(fieldName: String, argName: String): InputTypeComposer[TContext] | EnumTypeComposer[TContext] | ScalarTypeComposer[TContext] = js.native
  
  def getFieldArgType(fieldName: String, argName: String): GraphQLInputType = js.native
  
  def getFieldArgs[TArgs](fieldName: String): ComposeFieldConfigArgumentMap[TArgs] = js.native
  
  def getFieldConfig(fieldName: String): GraphQLFieldConfig[TSource, TContext, StringDictionary[_]] = js.native
  
  def getFieldDirectiveById(fieldName: String, idx: Double): DirectiveArgs | Unit = js.native
  
  def getFieldDirectiveByName(fieldName: String, directiveName: String): DirectiveArgs | Unit = js.native
  
  def getFieldDirectiveNames(fieldName: String): js.Array[String] = js.native
  
  def getFieldDirectives(fieldName: String): js.Array[ExtensionsDirective] = js.native
  
  def getFieldExtension(fieldName: String, extensionName: String): js.Any = js.native
  
  def getFieldExtensions(fieldName: String): Extensions = js.native
  
  def getFieldNames(): js.Array[String] = js.native
  
  /**
    * Alias for `getFieldTC()` but returns statically checked ObjectTypeComposer.
    * If field have other type then error will be thrown.
    */
  def getFieldOTC(fieldName: String): ObjectTypeComposer[TSource, TContext] = js.native
  
  def getFieldTC(fieldName: String): (ObjectTypeComposer[TSource, TContext]) | EnumTypeComposer[TContext] | (InterfaceTypeComposer[TSource, TContext]) | (UnionTypeComposer[TSource, TContext]) | ScalarTypeComposer[TContext] = js.native
  
  def getFieldType(fieldName: String): GraphQLOutputType = js.native
  
  def getFields(): ComposeFieldConfigMap[TSource, TContext] = js.native
  
  /**
    * An alias for `getInputTypeComposer`
    */
  def getITC(): InputTypeComposer[TContext] = js.native
  
  /**
    * -----------------------------------------------
    * InputType methods
    * -----------------------------------------------
    */
  def getInputType(): GraphQLInputObjectType = js.native
  
  def getInputTypeComposer(): InputTypeComposer[TContext] = js.native
  
  /**
    * -----------------------------------------------
    * ResolveType methods
    * -----------------------------------------------
    */
  def getResolveType(): (GraphQLTypeResolver[TSource, TContext]) | Null | Unit = js.native
  
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def getType(): GraphQLInterfaceType = js.native
  
  def getTypeName(): String = js.native
  
  def getTypeNonNull(): GraphQLNonNull[GraphQLInterfaceType] = js.native
  
  def getTypePlural(): GraphQLList[GraphQLInterfaceType] = js.native
  
  def getTypeResolverCheckFn(`type`: GraphQLObjectType[_, _]): InterfaceTypeResolverCheckFn[TSource, TContext] = js.native
  def getTypeResolverCheckFn(`type`: ObjectTypeComposer[_, TContext]): InterfaceTypeResolverCheckFn[TSource, TContext] = js.native
  
  def getTypeResolverNames(): js.Array[String] = js.native
  
  def getTypeResolverTypes(): js.Array[GraphQLObjectType[_, _]] = js.native
  
  def getTypeResolvers(): InterfaceTypeResolversMap[TContext] = js.native
  
  var gqType: GraphQLInterfaceTypeExtended[TSource, TContext] = js.native
  
  def hasExtension(extensionName: String): Boolean = js.native
  
  /**
    * -----------------------------------------------
    * Field methods
    * -----------------------------------------------
    */
  def hasField(name: String): Boolean = js.native
  
  def hasFieldArg(fieldName: String, argName: String): Boolean = js.native
  
  def hasFieldArgExtension(fieldName: String, argName: String, extensionName: String): Boolean = js.native
  
  def hasFieldExtension(fieldName: String, extensionName: String): Boolean = js.native
  
  def hasInputTypeComposer(): Boolean = js.native
  
  def hasTypeResolver(`type`: GraphQLObjectType[_, _]): Boolean = js.native
  def hasTypeResolver(`type`: ObjectTypeComposer[_, TContext]): Boolean = js.native
  
  def isFieldNonNull(fieldName: String): Boolean = js.native
  
  def makeFieldNonNull(fieldNameOrArray: String): this.type = js.native
  def makeFieldNonNull(fieldNameOrArray: js.Array[String]): this.type = js.native
  
  def makeFieldNullable(fieldNameOrArray: String): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: js.Array[String]): this.type = js.native
  
  def removeExtension(extensionName: String): this.type = js.native
  
  def removeField(nameOrArray: String): this.type = js.native
  def removeField(nameOrArray: js.Array[String]): this.type = js.native
  
  def removeFieldArgExtension(fieldName: String, argName: String, extensionName: String): this.type = js.native
  
  def removeFieldExtension(fieldName: String, extensionName: String): this.type = js.native
  
  def removeInputTypeComposer(): this.type = js.native
  
  def removeOtherFields(fieldNameOrArray: String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[String]): this.type = js.native
  
  def removeTypeResolver(`type`: GraphQLObjectType[_, _]): this.type = js.native
  def removeTypeResolver(`type`: ObjectTypeComposer[_, TContext]): this.type = js.native
  
  def reorderFields(names: js.Array[String]): this.type = js.native
  
  var sc: SchemaComposer[TContext] = js.native
  
  def setDescription(description: String): this.type = js.native
  
  def setExtension(extensionName: String, value: js.Any): this.type = js.native
  
  def setExtensions(extensions: Extensions): this.type = js.native
  
  def setField(name: String, fieldConfig: ComposeFieldConfig[TSource, TContext, ArgsMap]): this.type = js.native
  
  def setFieldArg(fieldName: String, argName: String, argConfig: ComposeArgumentConfig): this.type = js.native
  
  def setFieldArgExtension(fieldName: String, argName: String, extensionName: String, value: js.Any): this.type = js.native
  
  def setFieldArgExtensions(fieldName: String, argName: String, extensions: Extensions): this.type = js.native
  
  def setFieldArgs(fieldName: String, args: ComposeFieldConfigArgumentMap[_]): this.type = js.native
  
  def setFieldExtension(fieldName: String, extensionName: String, value: js.Any): this.type = js.native
  
  def setFieldExtensions(fieldName: String, extensions: Extensions): this.type = js.native
  
  def setFields(fields: ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  
  def setInputTypeComposer(itc: InputTypeComposer[TContext]): this.type = js.native
  
  def setResolveType(): this.type = js.native
  def setResolveType(fn: Unit): this.type = js.native
  def setResolveType(fn: GraphQLTypeResolver[TSource, TContext]): this.type = js.native
  
  def setTypeName(name: String): this.type = js.native
  
  def setTypeResolvers(typeResolversMap: InterfaceTypeResolversMap[TContext]): this.type = js.native
}
/* static members */
@JSImport("graphql-compose/lib/InterfaceTypeComposer", "InterfaceTypeComposer")
@js.native
object InterfaceTypeComposer extends js.Object {
  
  /**
    * Create `InterfaceTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): InterfaceTypeComposer[TSrc, TCtx] = js.native
  
  /**
    * Create `InterfaceTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx]): InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx], schemaComposer: SchemaComposer[TCtx]): InterfaceTypeComposer[TSrc, TCtx] = js.native
}
