package typingsSlinky.fluentReact.mod

import typingsSlinky.fluentReact.fluentReactNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var TEXT_NODE: `3` = js.native
  var localName: js.UndefOr[String] = js.native
  var nodeType: Double = js.native
  var textContext: String = js.native
}

object Node {
  @scala.inline
  def apply(TEXT_NODE: `3`, nodeType: Double, textContext: String): Node = {
    val __obj = js.Dynamic.literal(TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], textContext = textContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTEXT_NODE(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT_NODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(js.undefined)
        ret
    }
  }
  
}

