package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.mod.GraphQLEnumType
import typingsSlinky.graphql.mod.GraphQLInputObjectType
import typingsSlinky.graphql.mod.GraphQLInterfaceType
import typingsSlinky.graphql.mod.GraphQLObjectType
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.interfacesMod.SchemaMapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/mapSchema", JSImport.Namespace)
@js.native
object mapSchemaMod extends js.Object {
  def correctASTNodes(`type`: GraphQLEnumType): GraphQLEnumType = js.native
  def correctASTNodes(`type`: GraphQLInputObjectType): GraphQLInputObjectType = js.native
  def correctASTNodes(`type`: GraphQLInterfaceType): GraphQLInterfaceType = js.native
  def correctASTNodes(`type`: GraphQLObjectType[_, _]): GraphQLObjectType[_, _] = js.native
  def mapSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def mapSchema(schema: GraphQLSchema, schemaMapper: SchemaMapper): GraphQLSchema = js.native
}

