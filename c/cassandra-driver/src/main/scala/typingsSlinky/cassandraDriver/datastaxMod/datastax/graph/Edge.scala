package typingsSlinky.cassandraDriver.datastaxMod.datastax.graph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge
  extends typingsSlinky.cassandraDriver.graphMod.graph.Element {
  var inV: js.UndefOr[typingsSlinky.cassandraDriver.graphMod.graph.Vertex] = js.native
  var inVLabel: js.UndefOr[String] = js.native
  var outV: js.UndefOr[typingsSlinky.cassandraDriver.graphMod.graph.Vertex] = js.native
  var outVLabel: js.UndefOr[String] = js.native
  var properties: js.UndefOr[js.Object] = js.native
}

object Edge {
  @scala.inline
  def apply(id: js.Any, label: String): Edge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInV(value: typingsSlinky.cassandraDriver.graphMod.graph.Vertex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inV")(js.undefined)
        ret
    }
    @scala.inline
    def withInVLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inVLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInVLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inVLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOutV(value: typingsSlinky.cassandraDriver.graphMod.graph.Vertex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outV")(js.undefined)
        ret
    }
    @scala.inline
    def withOutVLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outVLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutVLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outVLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

