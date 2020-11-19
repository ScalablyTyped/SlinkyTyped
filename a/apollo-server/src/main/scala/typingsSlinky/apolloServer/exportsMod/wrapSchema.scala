package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "wrapSchema")
@js.native
object wrapSchema extends js.Object {
  
  def apply(subschemaOrSubschemaConfig: GraphQLSchema): GraphQLSchema = js.native
  def apply(subschemaOrSubschemaConfig: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
  def apply(subschemaOrSubschemaConfig: SubschemaConfig): GraphQLSchema = js.native
  def apply(subschemaOrSubschemaConfig: SubschemaConfig, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
}
