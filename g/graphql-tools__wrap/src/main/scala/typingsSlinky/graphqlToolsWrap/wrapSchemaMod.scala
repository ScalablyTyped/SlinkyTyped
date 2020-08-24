package typingsSlinky.graphqlToolsWrap

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/wrapSchema", JSImport.Namespace)
@js.native
object wrapSchemaMod extends js.Object {
  def wrapSchema(subschemaOrSubschemaConfig: GraphQLSchema): GraphQLSchema = js.native
  def wrapSchema(subschemaOrSubschemaConfig: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
  def wrapSchema(subschemaOrSubschemaConfig: SubschemaConfig): GraphQLSchema = js.native
  def wrapSchema(subschemaOrSubschemaConfig: SubschemaConfig, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
}

