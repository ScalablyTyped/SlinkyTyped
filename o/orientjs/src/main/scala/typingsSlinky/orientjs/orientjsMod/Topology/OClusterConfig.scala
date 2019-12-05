package typingsSlinky.orientjs.orientjsMod.Topology

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OClusterConfig extends js.Object {
  def selectionStrategy(cluster: typingsSlinky.orientjs.orientjsMod.Topology.OCluster): OServerNode
}

object OClusterConfig {
  @scala.inline
  def apply(selectionStrategy: typingsSlinky.orientjs.orientjsMod.Topology.OCluster => OServerNode): OClusterConfig = {
    val __obj = js.Dynamic.literal(selectionStrategy = js.Any.fromFunction1(selectionStrategy))
  
    __obj.asInstanceOf[OClusterConfig]
  }
}

