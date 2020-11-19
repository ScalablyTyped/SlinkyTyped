package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.definitionMod.GraphQLNamedType
import typingsSlinky.graphql.mod.GraphQLDirective
import typingsSlinky.graphqlToolsUtils.anon.SkipPruning
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-tools", "healTypes")
@js.native
object healTypes extends js.Object {
  
  def apply(originalTypeMap: Record[String, GraphQLNamedType | Null], directives: js.Array[GraphQLDirective]): Unit = js.native
  def apply(
    originalTypeMap: Record[String, GraphQLNamedType | Null],
    directives: js.Array[GraphQLDirective],
    config: SkipPruning
  ): Unit = js.native
}
