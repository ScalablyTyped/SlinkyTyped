package typingsSlinky.dagreDashD3.dagreDashD3Mod

import typingsSlinky.dagre.dagreMod.EdgeConfig
import typingsSlinky.dagre.dagreMod.GraphLabel
import typingsSlinky.dagre.dagreMod.NodeConfig
import typingsSlinky.dagre.dagreMod.graphlib.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "layout")
@js.native
object layout extends js.Object {
  def apply(graph: Graph): Unit = js.native
  def apply(graph: Graph, layout: GraphLabel with NodeConfig with EdgeConfig): Unit = js.native
}

