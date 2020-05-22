package typingsSlinky.prosemirrorModel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentDOM extends js.Object {
  var contentDOM: js.UndefOr[org.scalajs.dom.raw.Node | Null] = js.undefined
  var dom: org.scalajs.dom.raw.Node
}

object ContentDOM {
  @scala.inline
  def apply(
    dom: org.scalajs.dom.raw.Node,
    contentDOM: js.UndefOr[Null | org.scalajs.dom.raw.Node] = js.undefined
  ): ContentDOM = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
    if (!js.isUndefined(contentDOM)) __obj.updateDynamic("contentDOM")(contentDOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDOM]
  }
}

