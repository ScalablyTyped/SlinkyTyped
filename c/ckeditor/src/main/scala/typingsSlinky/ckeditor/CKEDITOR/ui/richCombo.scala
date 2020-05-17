package typingsSlinky.ckeditor.CKEDITOR.ui

import typingsSlinky.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait richCombo extends js.Object {
  def render(editor: editor, output: js.Array[String]): Unit = js.native
}

object richCombo {
  @scala.inline
  def apply(render: (editor, js.Array[String]) => Unit): richCombo = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[richCombo]
  }
  @scala.inline
  implicit class richComboOps[Self <: richCombo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: (editor, js.Array[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

