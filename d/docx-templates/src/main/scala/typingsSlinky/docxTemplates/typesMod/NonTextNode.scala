package typingsSlinky.docxTemplates.typesMod

import typingsSlinky.docxTemplates.AnonDictkey
import typingsSlinky.docxTemplates.docxTemplatesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined docx-templates.docx-templates/lib/types.BaseNode & {  _fTextNode  :false,   _tag  :string,   _attrs  :{[key: string] : sax.sax.QualifiedAttribute | string,   Extension ? :string}} */
@js.native
trait NonTextNode extends Node {
  var _attrs: AnonDictkey = js.native
  var _children: js.Array[Node] = js.native
  var _fTextNode: `false` = js.native
  var _ifName: js.UndefOr[String] = js.native
  var _parent: js.UndefOr[Node] = js.native
  var _tag: String = js.native
}

object NonTextNode {
  @scala.inline
  def apply(_attrs: AnonDictkey, _children: js.Array[Node], _fTextNode: `false`, _tag: String): NonTextNode = {
    val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _tag = _tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonTextNode]
  }
  @scala.inline
  implicit class NonTextNodeOps[Self <: NonTextNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_attrs(value: AnonDictkey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_children(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_fTextNode(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fTextNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_tag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_tag")(value.asInstanceOf[js.Any])
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

