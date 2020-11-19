package typingsSlinky.apolloServer.mod

import typingsSlinky.graphql.mod.GraphQLError
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "getErrorsByPathSegment")
@js.native
object getErrorsByPathSegment extends js.Object {
  
  def apply(errors: js.Array[GraphQLError]): Record[String, js.Array[GraphQLError]] = js.native
}
