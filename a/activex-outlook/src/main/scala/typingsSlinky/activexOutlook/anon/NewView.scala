package typingsSlinky.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewView extends js.Object {
  var Cancel: Boolean = js.native
  val NewView: js.Any = js.native
}

object NewView {
  @scala.inline
  def apply(Cancel: Boolean, NewView: js.Any): NewView = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewView = NewView.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewView]
  }
  @scala.inline
  implicit class NewViewOps[Self <: NewView] (val x: Self) extends AnyVal {
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
    def withNewView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewView")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

