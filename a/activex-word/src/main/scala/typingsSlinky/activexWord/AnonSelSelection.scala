package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelSelection extends js.Object {
  val Sel: Selection = js.native
}

object AnonSelSelection {
  @scala.inline
  def apply(Sel: Selection): AnonSelSelection = {
    val __obj = js.Dynamic.literal(Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelSelection]
  }
  @scala.inline
  implicit class AnonSelSelectionOps[Self <: AnonSelSelection] (val x: Self) extends AnyVal {
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

