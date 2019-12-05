package typingsSlinky.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLDirective
import typingsSlinky.graphql.typeDefinitionMod.GraphQLArgument
import typingsSlinky.graphql.typeDefinitionMod.GraphQLArgumentConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLField
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldConfigArgumentMap
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldConfigMap
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldMap
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputField
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputFieldConfig
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputFieldConfigMap
import typingsSlinky.graphql.typeDefinitionMod.GraphQLInputFieldMap
import typingsSlinky.graphql.typeDefinitionMod.GraphQLNamedType
import typingsSlinky.graphql.typeDefinitionMod.GraphQLType
import typingsSlinky.graphqlDashTools.distInterfacesMod.ResolveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/schemaRecreation", JSImport.Namespace)
@js.native
object distStitchingSchemaRecreationMod extends js.Object {
  def argsToFieldConfigArgumentMap(args: js.Array[GraphQLArgument], resolveType: ResolveType[_]): GraphQLFieldConfigArgumentMap = js.native
  def argumentToArgumentConfig(argument: GraphQLArgument, resolveType: ResolveType[_]): (js.Tuple2[String, GraphQLArgumentConfig]) | Null = js.native
  def createResolveType(getType: js.Function2[/* name */ String, /* type */ GraphQLType, GraphQLType | Null]): ResolveType[_] = js.native
  def fieldMapToFieldConfigMap(
    fields: GraphQLFieldMap[_, _, StringDictionary[_]],
    resolveType: ResolveType[_],
    keepResolvers: Boolean
  ): GraphQLFieldConfigMap[_, _, StringDictionary[_]] = js.native
  def fieldToFieldConfig(
    field: GraphQLField[_, _, StringDictionary[_]],
    resolveType: ResolveType[_],
    keepResolvers: Boolean
  ): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def inputFieldMapToFieldConfigMap(fields: GraphQLInputFieldMap, resolveType: ResolveType[_]): GraphQLInputFieldConfigMap = js.native
  def inputFieldToFieldConfig(field: GraphQLInputField, resolveType: ResolveType[_]): GraphQLInputFieldConfig = js.native
  def recreateDirective(directive: GraphQLDirective, resolveType: ResolveType[_]): GraphQLDirective = js.native
  def recreateType(`type`: GraphQLNamedType, resolveType: ResolveType[_], keepResolvers: Boolean): GraphQLNamedType = js.native
}

