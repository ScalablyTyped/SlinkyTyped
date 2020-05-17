package typingsSlinky.materialUiCore.anon

import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var node: HTMLInputElement = js.native
  var value: js.UndefOr[(js.Array[String | Double | Boolean]) | String | Double | Boolean] = js.native
}

object Node {
  @scala.inline
  def apply(node: HTMLInputElement): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: HTMLInputElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: (js.Array[String | Double | Boolean]) | String | Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

