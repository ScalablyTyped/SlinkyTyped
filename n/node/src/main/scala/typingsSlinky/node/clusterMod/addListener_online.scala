package typingsSlinky.node.clusterMod

import typingsSlinky.node.nodeStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "addListener")
@js.native
object addListener_online extends js.Object {
  def apply(event: online, listener: js.Function1[/* worker */ Worker, Unit]): Cluster = js.native
}

