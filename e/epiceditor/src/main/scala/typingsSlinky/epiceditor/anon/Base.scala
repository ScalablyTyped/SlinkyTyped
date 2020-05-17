package typingsSlinky.epiceditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var base: String = js.native
  var editor: String = js.native
  var preview: String = js.native
}

object Base {
  @scala.inline
  def apply(base: String, editor: String, preview: String): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

