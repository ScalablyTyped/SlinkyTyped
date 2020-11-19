package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.graphqlToolsUtils.anon.SkipPruning
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/utils/heal", JSImport.Namespace)
@js.native
object healMod extends js.Object {
  
  def healSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  
  def healTypes(originalTypeMap: Record[String, GraphQLNamedType | Null], directives: js.Array[GraphQLDirective]): Unit = js.native
  def healTypes(
    originalTypeMap: Record[String, GraphQLNamedType | Null],
    directives: js.Array[GraphQLDirective],
    config: SkipPruning
  ): Unit = js.native
}
