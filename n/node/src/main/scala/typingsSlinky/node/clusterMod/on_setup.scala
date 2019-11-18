package typingsSlinky.node.clusterMod

import typingsSlinky.node.nodeStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", "on")
@js.native
object on_setup extends js.Object {
  def apply(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
}

