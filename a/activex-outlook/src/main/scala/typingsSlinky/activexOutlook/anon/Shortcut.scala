package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.OutlookBarShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shortcut extends js.Object {
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any = js.native
  val Shortcut: OutlookBarShortcut = js.native
}

object Shortcut {
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Shortcut: OutlookBarShortcut
  ): Shortcut = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Shortcut = Shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shortcut]
  }
  @scala.inline
  implicit class ShortcutOps[Self <: Shortcut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcut(value: OutlookBarShortcut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shortcut")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

