package typingsSlinky.activexOutlook

import typingsSlinky.activexOutlook.Outlook.PropertyPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPages extends js.Object {
  val Pages: PropertyPages = js.native
}

object AnonPages {
  @scala.inline
  def apply(Pages: PropertyPages): AnonPages = {
    val __obj = js.Dynamic.literal(Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPages]
  }
  @scala.inline
  implicit class AnonPagesOps[Self <: AnonPages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPages(value: PropertyPages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

