package typingsSlinky.materialTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActiveTabIndex extends js.Object {
  var activeTabIndex: Double = js.native
}

object AnonActiveTabIndex {
  @scala.inline
  def apply(activeTabIndex: Double): AnonActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveTabIndex]
  }
  @scala.inline
  implicit class AnonActiveTabIndexOps[Self <: AnonActiveTabIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTabIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

