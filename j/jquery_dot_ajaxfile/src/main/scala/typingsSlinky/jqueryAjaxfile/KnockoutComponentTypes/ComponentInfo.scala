package typingsSlinky.jqueryAjaxfile.KnockoutComponentTypes

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentInfo extends js.Object {
  var element: Node = js.native
  var templateNodes: js.Array[Node] = js.native
}

object ComponentInfo {
  @scala.inline
  def apply(element: Node, templateNodes: js.Array[Node]): ComponentInfo = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], templateNodes = templateNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInfo]
  }
  @scala.inline
  implicit class ComponentInfoOps[Self <: ComponentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateNodes(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateNodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

