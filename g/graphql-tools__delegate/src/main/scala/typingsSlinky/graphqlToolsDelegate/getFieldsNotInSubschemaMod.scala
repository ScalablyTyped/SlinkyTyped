package typingsSlinky.graphqlToolsDelegate

import typingsSlinky.graphql.astMod.FieldNode
import typingsSlinky.graphql.definitionMod.GraphQLResolveInfo
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsDelegate.typesMod.MergedTypeInfo
import typingsSlinky.graphqlToolsDelegate.typesMod.SubschemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/delegate/results/getFieldsNotInSubschema", JSImport.Namespace)
@js.native
object getFieldsNotInSubschemaMod extends js.Object {
  
  def getFieldsNotInSubschema(A1: GraphQLResolveInfo, A2: GraphQLSchema, A3: MergedTypeInfo, A4: String): js.Array[FieldNode] = js.native
  def getFieldsNotInSubschema(A1: GraphQLResolveInfo, A2: SubschemaConfig, A3: MergedTypeInfo, A4: String): js.Array[FieldNode] = js.native
}
