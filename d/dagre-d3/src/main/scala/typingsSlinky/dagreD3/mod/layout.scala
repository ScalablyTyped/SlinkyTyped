package typingsSlinky.dagreD3.mod

import typingsSlinky.dagre.mod.EdgeConfig
import typingsSlinky.dagre.mod.GraphLabel
import typingsSlinky.dagre.mod.NodeConfig
import typingsSlinky.dagre.mod.graphlib.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dagre-d3", "layout")
@js.native
object layout extends js.Object {
  def apply(graph: Graph[js.Object]): Unit = js.native
  def apply(graph: Graph[js.Object], layout: GraphLabel with NodeConfig with EdgeConfig): Unit = js.native
}

