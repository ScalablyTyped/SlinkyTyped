package typingsSlinky.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "once")
@js.native
object once_disconnect extends js.Object {
  def apply(
    event: typingsSlinky.node.nodeStrings.disconnect,
    listener: js.Function1[/* worker */ Worker, Unit]
  ): Cluster = js.native
}

