package typingsSlinky.prosemirrorModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentDOM extends js.Object {
  var contentDOM: js.UndefOr[org.scalajs.dom.raw.Node | Null] = js.native
  var dom: org.scalajs.dom.raw.Node = js.native
}

object ContentDOM {
  @scala.inline
  def apply(dom: org.scalajs.dom.raw.Node): ContentDOM = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDOM]
  }
  @scala.inline
  implicit class ContentDOMOps[Self <: ContentDOM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDom(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentDOM(value: org.scalajs.dom.raw.Node): Self = {
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

