package typingsSlinky.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTabIndex extends js.Object {
  var tabIndex: Double = js.native
}

object AnonTabIndex {
  @scala.inline
  def apply(tabIndex: Double): AnonTabIndex = {
    val __obj = js.Dynamic.literal(tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTabIndex]
  }
  @scala.inline
  implicit class AnonTabIndexOps[Self <: AnonTabIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

