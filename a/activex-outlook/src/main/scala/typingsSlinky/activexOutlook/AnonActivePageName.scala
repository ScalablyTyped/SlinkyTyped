package typingsSlinky.activexOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActivePageName extends js.Object {
  val ActivePageName: String = js.native
}

object AnonActivePageName {
  @scala.inline
  def apply(ActivePageName: String): AnonActivePageName = {
    val __obj = js.Dynamic.literal(ActivePageName = ActivePageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActivePageName]
  }
  @scala.inline
  implicit class AnonActivePageNameOps[Self <: AnonActivePageName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivePageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivePageName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

