package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtrulePrelude
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode] = js.native
  @JSName("type")
  var type_AtrulePrelude: typingsSlinky.cssTree.cssTreeStrings.AtrulePrelude = js.native
}

object AtrulePrelude {
  @scala.inline
  def apply(children: List[CssNode], `type`: typingsSlinky.cssTree.cssTreeStrings.AtrulePrelude): AtrulePrelude = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtrulePrelude]
  }
  @scala.inline
  implicit class AtrulePreludeOps[Self <: AtrulePrelude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: List[CssNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.cssTree.cssTreeStrings.AtrulePrelude): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

