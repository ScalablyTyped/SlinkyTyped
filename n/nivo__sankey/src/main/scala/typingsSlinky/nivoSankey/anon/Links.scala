package typingsSlinky.nivoSankey.anon

import typingsSlinky.nivoSankey.mod.SankeyDataLink
import typingsSlinky.nivoSankey.mod.SankeyDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Links extends js.Object {
  var links: js.Array[SankeyDataLink] = js.native
  var nodes: js.Array[SankeyDataNode] = js.native
}

object Links {
  @scala.inline
  def apply(links: js.Array[SankeyDataLink], nodes: js.Array[SankeyDataNode]): Links = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  @scala.inline
  implicit class LinksOps[Self <: Links] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: js.Array[SankeyDataLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[SankeyDataNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

