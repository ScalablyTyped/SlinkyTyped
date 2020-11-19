package typingsSlinky.graphqlToolsDelegate

import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphqlToolsDelegate.typesMod.MergedTypeInfo
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate/results/mergeFields", JSImport.Namespace)
@js.native
object mergeFieldsMod extends js.Object {
  
  def mergeFields(
    mergedTypeInfo: MergedTypeInfo,
    typeName: String,
    `object`: js.Any,
    fieldNodes: js.Array[FieldNode],
    sourceSubschemaOrSourceSubschemas: js.Array[SubschemaConfig],
    targetSubschemas: js.Array[SubschemaConfig],
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  def mergeFields(
    mergedTypeInfo: MergedTypeInfo,
    typeName: String,
    `object`: js.Any,
    fieldNodes: js.Array[FieldNode],
    sourceSubschemaOrSourceSubschemas: SubschemaConfig,
    targetSubschemas: js.Array[SubschemaConfig],
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
}
