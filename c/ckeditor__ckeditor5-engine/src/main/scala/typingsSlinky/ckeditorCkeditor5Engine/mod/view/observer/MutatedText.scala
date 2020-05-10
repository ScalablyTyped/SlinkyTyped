package typingsSlinky.ckeditorCkeditor5Engine.mod.view.observer

import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutatedText extends js.Object {
  var newText: String = js.native
  var node: Text = js.native
  var oldText: String = js.native
  var `type`: String = js.native
}

object MutatedText {
  @scala.inline
  def apply(newText: String, node: Text, oldText: String, `type`: String): MutatedText = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutatedText]
  }
  @scala.inline
  implicit class MutatedTextOps[Self <: MutatedText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

