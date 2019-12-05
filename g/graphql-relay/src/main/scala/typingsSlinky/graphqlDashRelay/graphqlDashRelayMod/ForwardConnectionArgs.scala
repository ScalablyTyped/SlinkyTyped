package typingsSlinky.graphqlDashRelay.graphqlDashRelayMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.graphql.typeDefinitionMod.GraphQLFieldConfigArgumentMap
import typingsSlinky.graphqlDashRelay.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardConnectionArgs extends js.Object {
  var after: Anon_Type
  var first: Anon_Type
}

object ForwardConnectionArgs {
  @scala.inline
  def apply(after: Anon_Type, first: Anon_Type): ForwardConnectionArgs = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ForwardConnectionArgs]
  }
}

@JSImport("graphql-relay", "forwardConnectionArgs")
@js.native
object forwardConnectionArgs extends TopLevel[GraphQLFieldConfigArgumentMap with ForwardConnectionArgs]

