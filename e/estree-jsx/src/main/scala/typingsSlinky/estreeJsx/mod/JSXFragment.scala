package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXFragment
  extends BaseNode
     with Node {
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment] = js.native
  var closingFragment: JSXClosingFragment = js.native
  var openingFragment: JSXOpeningFragment = js.native
  @JSName("type")
  var type_JSXFragment: typingsSlinky.estreeJsx.estreeJsxStrings.JSXFragment = js.native
}

object JSXFragment {
  @scala.inline
  def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXFragment
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXFragment]
  }
  @scala.inline
  implicit class JSXFragmentOps[Self <: JSXFragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosingFragment(value: JSXClosingFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closingFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpeningFragment(value: JSXOpeningFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openingFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

