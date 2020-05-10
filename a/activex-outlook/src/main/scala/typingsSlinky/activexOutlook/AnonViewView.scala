package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonViewView extends js.Object {
  val View: typingsSlinky.activexOutlook.Outlook.View = js.native
}

object AnonViewView {
  @scala.inline
  def apply(View: View): AnonViewView = {
    val __obj = js.Dynamic.literal(View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonViewView]
  }
  @scala.inline
  implicit class AnonViewViewOps[Self <: AnonViewView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withView(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

