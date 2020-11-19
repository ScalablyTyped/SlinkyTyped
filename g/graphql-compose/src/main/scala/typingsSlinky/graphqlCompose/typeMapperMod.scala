package typingsSlinky.graphqlCompose

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.definitionMod.GraphQLArgumentConfig
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigMap
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfigMap
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfig
import typingsSlinky.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfigMap
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ArgsMap
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeArgumentConfig
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfig
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigArgumentMap
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigMap
import typingsSlinky.graphqlCompose.objectTypeComposerMod.ComposeObjectType
import typingsSlinky.graphqlCompose.schemaComposerMod.AnyComposeType
import typingsSlinky.graphqlCompose.schemaComposerMod.AnyType
import typingsSlinky.graphqlCompose.schemaComposerMod.SchemaComposer
import typingsSlinky.graphqlCompose.typeStorageMod.TypeStorage
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/TypeMapper", JSImport.Namespace)
@js.native
object typeMapperMod extends js.Object {
  
  /**
    * Type storage and type generator from `Schema Definition Language` (`SDL`).
    * This is slightly rewritten [buildASTSchema](https://github.com/graphql/graphql-js/blob/master/src/utilities/buildASTSchema.js)
    * utility from `graphql-js` that allows to create type from a string (SDL).
    */
  @js.native
  class TypeMapper[TContext] protected () extends js.Object {
    def this(schemaComposer: SchemaComposer[TContext]) = this()
    
    var basicScalars: Map[String, GraphQLNamedType] = js.native
    
    def convertArgConfig(composeAC: ComposeArgumentConfig): GraphQLArgumentConfig = js.native
    def convertArgConfig(
      composeAC: ComposeArgumentConfig,
      argName: js.UndefOr[scala.Nothing],
      fieldName: js.UndefOr[scala.Nothing],
      typeName: String
    ): GraphQLArgumentConfig = js.native
    def convertArgConfig(composeAC: ComposeArgumentConfig, argName: js.UndefOr[scala.Nothing], fieldName: String): GraphQLArgumentConfig = js.native
    def convertArgConfig(
      composeAC: ComposeArgumentConfig,
      argName: js.UndefOr[scala.Nothing],
      fieldName: String,
      typeName: String
    ): GraphQLArgumentConfig = js.native
    def convertArgConfig(composeAC: ComposeArgumentConfig, argName: String): GraphQLArgumentConfig = js.native
    def convertArgConfig(
      composeAC: ComposeArgumentConfig,
      argName: String,
      fieldName: js.UndefOr[scala.Nothing],
      typeName: String
    ): GraphQLArgumentConfig = js.native
    def convertArgConfig(composeAC: ComposeArgumentConfig, argName: String, fieldName: String): GraphQLArgumentConfig = js.native
    def convertArgConfig(composeAC: ComposeArgumentConfig, argName: String, fieldName: String, typeName: String): GraphQLArgumentConfig = js.native
    
    def convertArgConfigMap(composeArgsConfigMap: ComposeFieldConfigArgumentMap[_]): GraphQLFieldConfigArgumentMap = js.native
    def convertArgConfigMap(
      composeArgsConfigMap: ComposeFieldConfigArgumentMap[_],
      fieldName: js.UndefOr[scala.Nothing],
      typeName: String
    ): GraphQLFieldConfigArgumentMap = js.native
    def convertArgConfigMap(composeArgsConfigMap: ComposeFieldConfigArgumentMap[_], fieldName: String): GraphQLFieldConfigArgumentMap = js.native
    def convertArgConfigMap(composeArgsConfigMap: ComposeFieldConfigArgumentMap[_], fieldName: String, typeName: String): GraphQLFieldConfigArgumentMap = js.native
    
    def convertInputFieldConfig(composeIFC: ComposeInputFieldConfig): GraphQLInputFieldConfig = js.native
    def convertInputFieldConfig(composeIFC: ComposeInputFieldConfig, fieldName: js.UndefOr[scala.Nothing], typeName: String): GraphQLInputFieldConfig = js.native
    def convertInputFieldConfig(composeIFC: ComposeInputFieldConfig, fieldName: String): GraphQLInputFieldConfig = js.native
    def convertInputFieldConfig(composeIFC: ComposeInputFieldConfig, fieldName: String, typeName: String): GraphQLInputFieldConfig = js.native
    
    def convertInputFieldConfigMap(composeFields: ComposeInputFieldConfigMap): GraphQLInputFieldConfigMap = js.native
    def convertInputFieldConfigMap(composeFields: ComposeInputFieldConfigMap, typeName: String): GraphQLInputFieldConfigMap = js.native
    
    def convertOutputFieldConfig[TSource, TContext](composeFC: ComposeFieldConfig[TSource, TContext, ArgsMap]): GraphQLFieldConfig[TSource, TContext, StringDictionary[_]] = js.native
    def convertOutputFieldConfig[TSource, TContext](
      composeFC: ComposeFieldConfig[TSource, TContext, ArgsMap],
      fieldName: js.UndefOr[scala.Nothing],
      typeName: String
    ): GraphQLFieldConfig[TSource, TContext, StringDictionary[_]] = js.native
    def convertOutputFieldConfig[TSource, TContext](composeFC: ComposeFieldConfig[TSource, TContext, ArgsMap], fieldName: String): GraphQLFieldConfig[TSource, TContext, StringDictionary[_]] = js.native
    def convertOutputFieldConfig[TSource, TContext](composeFC: ComposeFieldConfig[TSource, TContext, ArgsMap], fieldName: String, typeName: String): GraphQLFieldConfig[TSource, TContext, StringDictionary[_]] = js.native
    
    def convertOutputFieldConfigMap[TSource, TContext](
      composeFields: (ComposeFieldConfigMap[TSource, TContext]) | (GraphQLFieldConfigMap[TSource, TContext])
    ): GraphQLFieldConfigMap[TSource, TContext] = js.native
    def convertOutputFieldConfigMap[TSource, TContext](
      composeFields: (ComposeFieldConfigMap[TSource, TContext]) | (GraphQLFieldConfigMap[TSource, TContext]),
      typeName: String
    ): GraphQLFieldConfigMap[TSource, TContext] = js.native
    
    def convertOutputType(composeType: ComposeObjectType): GraphQLObjectType[_, _] = js.native
    
    def createGraphQLType(str: TypeDefinitionString): GraphQLType | Unit = js.native
    
    def createType(str: TypeDefinitionString): AnyComposeType[TContext] | Unit = js.native
    
    def get(name: String): GraphQLNamedType | Unit = js.native
    
    def getWrapped(str: TypeNameString | TypeWrappedString): GraphQLType | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    def parseTypesFromAst(astDocument: DocumentNode): TypeStorage[String, GraphQLNamedType] = js.native
    
    def parseTypesFromString(str: String): TypeStorage[String, AnyComposeType[TContext]] = js.native
    
    var schemaComposer: SchemaComposer[TContext] = js.native
    
    def set(name: String, `type`: AnyType[_]): Unit = js.native
  }
  /* static members */
  @js.native
  object TypeMapper extends js.Object {
    
    /**
      * Checks that string is EnumType SDL definition
      * eg. `enum Sort { ASC DESC }`
      */
    def isEnumTypeDefinitionString(str: String): Boolean = js.native
    
    /**
      * Checks that string is InputType SDL definition
      * eg. `input Filter { minAge: Int }`
      */
    def isInputTypeDefinitionString(str: String): Boolean = js.native
    
    /**
      * Checks that string is InterfaceType SDL definition
      * eg. `interface User { name: String }`
      */
    def isInterfaceTypeDefinitionString(str: String): Boolean = js.native
    
    /**
      * Checks that string is OutputType SDL definition
      * eg. `type Out { name: String! }`
      */
    def isOutputTypeDefinitionString(str: String): Boolean = js.native
    
    /**
      * Checks that string is ScalarType SDL definition
      * eg. `scalar UInt`
      */
    def isScalarTypeDefinitionString(str: String): Boolean = js.native
    
    /**
      * Checks that string is SDL definition of some type
      * eg. `type Out { name: String! }` or `input Filter { minAge: Int }` etc.
      */
    def isTypeDefinitionString(str: String): Boolean = js.native
    
    /**
      * Check that string is a valid GraphQL Type name.
      * According to spec valid mask is `/^[_A-Za-z][_0-9A-Za-z]*$/`.
      */
    def isTypeNameString(str: String): Boolean = js.native
  }
  
  type TypeAsString = TypeDefinitionString | TypeWrappedString | TypeNameString
  
  type TypeDefinitionString = String
  
  type TypeNameString = String
  
  type TypeWrappedString = String
}
