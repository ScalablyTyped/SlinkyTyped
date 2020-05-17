package typingsSlinky.prosemirrorModel.anon

import typingsSlinky.prosemirrorModel.mod.ContentMatch
import typingsSlinky.prosemirrorModel.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Next extends js.Object {
  var next: ContentMatch[_] = js.native
  var `type`: NodeType[_] = js.native
}

object Next {
  @scala.inline
  def apply(next: ContentMatch[_], `type`: NodeType[_]): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  @scala.inline
  implicit class NextOps[Self <: Next] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: ContentMatch[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: NodeType[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

