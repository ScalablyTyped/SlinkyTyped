package typingsSlinky.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.graphql.definitionMod.GraphQLArgument
import typingsSlinky.graphql.definitionMod.GraphQLArgumentConfig
import typingsSlinky.graphql.definitionMod.GraphQLField
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typingsSlinky.graphql.definitionMod.GraphQLFieldConfigMap
import typingsSlinky.graphql.definitionMod.GraphQLFieldMap
import typingsSlinky.graphql.definitionMod.GraphQLInputField
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfig
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldConfigMap
import typingsSlinky.graphql.definitionMod.GraphQLInputFieldMap
import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.definitionMod.GraphQLType
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphqlTools.interfacesMod.ResolveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/schemaRecreation", JSImport.Namespace)
@js.native
object schemaRecreationMod extends js.Object {
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

