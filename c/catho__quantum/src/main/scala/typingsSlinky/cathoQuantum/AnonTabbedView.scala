package typingsSlinky.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTabbedView extends js.Object {
  var tabbedView: js.UndefOr[js.Object] = js.native
}

object AnonTabbedView {
  @scala.inline
  def apply(): AnonTabbedView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTabbedView]
  }
  @scala.inline
  implicit class AnonTabbedViewOps[Self <: AnonTabbedView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabbedView(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabbedView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabbedView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabbedView")(js.undefined)
        ret
    }
  }
  
}

