package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCopied extends js.Object {
  var copied: String = js.native
  var copy: String = js.native
  var edit: String = js.native
  var expand: String = js.native
}

object AnonCopied {
  @scala.inline
  def apply(copied: String, copy: String, edit: String, expand: String): AnonCopied = {
    val __obj = js.Dynamic.literal(copied = copied.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCopied]
  }
  @scala.inline
  implicit class AnonCopiedOps[Self <: AnonCopied] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopied(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

