package typingsSlinky.graphqlToolsDelegate

import typingsSlinky.graphqlToolsDelegate.typesMod.DelegationContext
import typingsSlinky.graphqlToolsUtils.interfacesMod.Transform
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/delegate/delegationBindings", JSImport.Namespace)
@js.native
object delegationBindingsMod extends js.Object {
  def defaultDelegationBinding(delegationContext: DelegationContext): js.Array[Transform[Record[String, _]]] = js.native
}

