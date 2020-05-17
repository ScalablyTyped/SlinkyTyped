package typingsSlinky.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Removebookmarkshortcut extends js.Object {
  var remove_bookmark_shortcut: js.UndefOr[Boolean] = js.native
  var remove_button: js.UndefOr[Boolean] = js.native
}

object Removebookmarkshortcut {
  @scala.inline
  def apply(): Removebookmarkshortcut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Removebookmarkshortcut]
  }
  @scala.inline
  implicit class RemovebookmarkshortcutOps[Self <: Removebookmarkshortcut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemove_bookmark_shortcut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_bookmark_shortcut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove_bookmark_shortcut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_bookmark_shortcut")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove_button(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove_button: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_button")(js.undefined)
        ret
    }
  }
  
}

