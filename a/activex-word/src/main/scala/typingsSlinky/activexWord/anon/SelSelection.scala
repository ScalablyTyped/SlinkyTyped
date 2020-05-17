package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelSelection extends js.Object {
  val Sel: Selection = js.native
}

object SelSelection {
  @scala.inline
  def apply(Sel: Selection): SelSelection = {
    val __obj = js.Dynamic.literal(Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelSelection]
  }
  @scala.inline
  implicit class SelSelectionOps[Self <: SelSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSel(value: Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

