package typingsSlinky.activexMsforms.anon

import typingsSlinky.activexMsforms.MSForms.ReturnBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelIndex extends js.Object {
  val Cancel: ReturnBoolean = js.native
  val Index: Double = js.native
}

object CancelIndex {
  @scala.inline
  def apply(Cancel: ReturnBoolean, Index: Double): CancelIndex = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelIndex]
  }
  @scala.inline
  implicit class CancelIndexOps[Self <: CancelIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: ReturnBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

