package typingsSlinky.graphqlToolsDelegate

import typingsSlinky.graphql.definitionMod.GraphQLCompositeType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate/results/handleObject", JSImport.Namespace)
@js.native
object handleObjectMod extends js.Object {
  
  def handleObject(
    `type`: GraphQLCompositeType,
    `object`: js.Any,
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  def handleObject(
    `type`: GraphQLCompositeType,
    `object`: js.Any,
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    skipTypeMerging: Boolean
  ): js.Any = js.native
  def handleObject(
    `type`: GraphQLCompositeType,
    `object`: js.Any,
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  def handleObject(
    `type`: GraphQLCompositeType,
    `object`: js.Any,
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    skipTypeMerging: Boolean
  ): js.Any = js.native
}
