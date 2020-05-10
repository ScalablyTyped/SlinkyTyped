package typingsSlinky.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferStatus extends js.Object {
  var cmds: String = js.native
  var fInsertedText: Boolean = js.native
  var text: String = js.native
}

object BufferStatus {
  @scala.inline
  def apply(cmds: String, fInsertedText: Boolean, text: String): BufferStatus = {
    val __obj = js.Dynamic.literal(cmds = cmds.asInstanceOf[js.Any], fInsertedText = fInsertedText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferStatus]
  }
  @scala.inline
  implicit class BufferStatusOps[Self <: BufferStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFInsertedText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fInsertedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

