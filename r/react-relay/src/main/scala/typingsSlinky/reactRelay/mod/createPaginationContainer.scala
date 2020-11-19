package typingsSlinky.reactRelay.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactRelay.anon.RelayRelayPaginationProp
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay", "createPaginationContainer")
@js.native
object createPaginationContainer extends js.Object {
  
  def apply[Props](
    Component: ReactComponentClass[Props with RelayRelayPaginationProp],
    fragmentSpec: Record[String, GraphQLTaggedNode],
    connectionConfig: ConnectionConfig[Props]
  ): Container[Props] = js.native
}
