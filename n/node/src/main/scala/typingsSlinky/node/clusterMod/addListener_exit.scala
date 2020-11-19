package typingsSlinky.node.clusterMod

import typingsSlinky.node.nodeStrings.exit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cluster", "addListener")
@js.native
object addListener_exit extends js.Object {
  
  def apply(
    event: exit,
    listener: js.Function3[/* worker */ Worker_, /* code */ Double, /* signal */ String, Unit]
  ): Cluster = js.native
}
