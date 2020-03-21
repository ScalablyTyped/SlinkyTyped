package typingsSlinky.node.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "addListener")
@js.native
object addListener_disconnect extends js.Object {
  def apply(
    event: typingsSlinky.node.nodeStrings.disconnect,
    listener: js.Function1[/* worker */ Worker_, Unit]
  ): Cluster = js.native
}

