package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sel extends js.Object {
  var Cancel: Boolean = js.native
  val Sel: Selection = js.native
}

object Sel {
  @scala.inline
  def apply(Cancel: Boolean, Sel: Selection): Sel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sel]
  }
  @scala.inline
  implicit class SelOps[Self <: Sel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSel(value: Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

