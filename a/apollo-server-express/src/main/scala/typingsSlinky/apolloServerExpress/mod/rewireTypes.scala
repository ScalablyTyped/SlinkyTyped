package typingsSlinky.apolloServerExpress.mod

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphqlToolsUtils.anon.Directives
import typingsSlinky.graphqlToolsUtils.anon.SkipPruning
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-express", "rewireTypes")
@js.native
object rewireTypes extends js.Object {
  
  def apply(originalTypeMap: Record[String, GraphQLNamedType | Null], directives: js.Array[GraphQLDirective]): Directives = js.native
  def apply(
    originalTypeMap: Record[String, GraphQLNamedType | Null],
    directives: js.Array[GraphQLDirective],
    options: SkipPruning
  ): Directives = js.native
}
