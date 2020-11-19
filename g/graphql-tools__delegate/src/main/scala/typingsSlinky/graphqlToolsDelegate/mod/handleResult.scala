package typingsSlinky.graphqlToolsDelegate.mod

import typingsSlinky.graphql.definitionMod.GraphQLOutputType
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate", "handleResult")
@js.native
object handleResult extends js.Object {
  
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    returnType: js.UndefOr[GraphQLOutputType],
    skipTypeMerging: Boolean
  ): js.Any = js.native
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: GraphQLSchema,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    returnType: GraphQLOutputType
  ): js.Any = js.native
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    returnType: js.UndefOr[GraphQLOutputType],
    skipTypeMerging: Boolean
  ): js.Any = js.native
  def apply(
    result: js.Any,
    errors: js.Array[GraphQLError],
    subschema: SubschemaConfig,
    context: Record[String, _],
    info: GraphQLResolveInfo,
    returnType: GraphQLOutputType
  ): js.Any = js.native
}
