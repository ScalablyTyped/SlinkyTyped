package typingsSlinky.prosemirrorModel

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentDOM extends js.Object {
  var contentDOM: js.UndefOr[Node | Null] = js.native
  var dom: Node = js.native
}

object AnonContentDOM {
  @scala.inline
  def apply(dom: Node): AnonContentDOM = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentDOM]
  }
  @scala.inline
  implicit class AnonContentDOMOps[Self <: AnonContentDOM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDom(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentDOM(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDOM")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDOMNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDOM")(null)
        ret
    }
  }
  
}

