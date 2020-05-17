package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nodes extends js.Object {
  var nodes: DataTypes = js.native
  var ports: DragEnd = js.native
}

object Nodes {
  @scala.inline
  def apply(nodes: DataTypes, ports: DragEnd): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  @scala.inline
  implicit class NodesOps[Self <: Nodes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodes(value: DataTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPorts(value: DragEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

