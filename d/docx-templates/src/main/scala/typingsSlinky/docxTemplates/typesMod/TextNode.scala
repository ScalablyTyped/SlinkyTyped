package typingsSlinky.docxTemplates.typesMod

import typingsSlinky.docxTemplates.docxTemplatesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined docx-templates.docx-templates/lib/types.BaseNode & {  _fTextNode  :true,   _text  :string} */
@js.native
trait TextNode extends Node {
  var _children: js.Array[Node] = js.native
  var _fTextNode: `true` = js.native
  var _ifName: js.UndefOr[String] = js.native
  var _parent: js.UndefOr[Node] = js.native
  var _text: String = js.native
}

object TextNode {
  @scala.inline
  def apply(_children: js.Array[Node], _fTextNode: `true`, _text: String): TextNode = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  @scala.inline
  implicit class TextNodeOps[Self <: TextNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_children(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_fTextNode(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fTextNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ifName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ifName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_ifName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ifName")(js.undefined)
        ret
    }
    @scala.inline
    def with_parent(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_parent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_parent")(js.undefined)
        ret
    }
  }
  
}

