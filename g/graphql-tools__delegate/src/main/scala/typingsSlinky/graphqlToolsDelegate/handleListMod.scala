package typingsSlinky.graphqlToolsDelegate

import typingsSlinky.graphql.definitionMod.GraphQLList
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate/results/handleList", JSImport.Namespace)
@js.native
object handleListMod extends js.Object {
  
  def handleList(
    `type`: GraphQLList[_],
    list: js.Array[_],
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Array[_] = js.native
  def handleList(
    `type`: GraphQLList[_],
    list: js.Array[_],
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    skipTypeMerging: Boolean
  ): js.Array[_] = js.native
  def handleList(
    `type`: GraphQLList[_],
    list: js.Array[_],
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Array[_] = js.native
  def handleList(
    `type`: GraphQLList[_],
    list: js.Array[_],
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    skipTypeMerging: Boolean
  ): js.Array[_] = js.native
}
