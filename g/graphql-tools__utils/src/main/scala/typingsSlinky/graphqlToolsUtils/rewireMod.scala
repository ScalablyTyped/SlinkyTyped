package typingsSlinky.graphqlToolsUtils

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphqlToolsUtils.anon.Directives
import typingsSlinky.graphqlToolsUtils.anon.SkipPruning
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/utils/rewire", JSImport.Namespace)
@js.native
object rewireMod extends js.Object {
  
  def rewireTypes(originalTypeMap: Record[String, GraphQLNamedType | Null], directives: js.Array[GraphQLDirective]): Directives = js.native
  def rewireTypes(
    originalTypeMap: Record[String, GraphQLNamedType | Null],
    directives: js.Array[GraphQLDirective],
    options: SkipPruning
  ): Directives = js.native
}
