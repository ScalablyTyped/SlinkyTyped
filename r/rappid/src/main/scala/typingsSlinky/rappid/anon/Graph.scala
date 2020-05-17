package typingsSlinky.rappid.anon

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.jointjs.mod.dia.Cell
import typingsSlinky.jointjs.mod.dia.Paper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends js.Object {
  var graph: typingsSlinky.jointjs.mod.dia.Graph = js.native
  var model: Collection[Cell] = js.native
  var paper: Paper = js.native
}

object Graph {
  @scala.inline
  def apply(graph: typingsSlinky.jointjs.mod.dia.Graph, model: Collection[Cell], paper: Paper): Graph = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  @scala.inline
  implicit class GraphOps[Self <: Graph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGraph(value: typingsSlinky.jointjs.mod.dia.Graph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: Collection[Cell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaper(value: Paper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

