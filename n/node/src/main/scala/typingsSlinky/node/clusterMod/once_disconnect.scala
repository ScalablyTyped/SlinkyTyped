package typingsSlinky.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cluster", "once")
@js.native
object once_disconnect extends js.Object {
  
  def apply(
    event: typingsSlinky.node.nodeStrings.disconnect,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): Cluster = js.native
}
