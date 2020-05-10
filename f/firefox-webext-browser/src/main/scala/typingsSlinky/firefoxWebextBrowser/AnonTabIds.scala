package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTabIds extends js.Object {
  /** All highlighted tabs in the window. */
  var tabIds: js.Array[Double] = js.native
  /** The window whose tabs changed. */
  var windowId: Double = js.native
}

object AnonTabIds {
  @scala.inline
  def apply(tabIds: js.Array[Double], windowId: Double): AnonTabIds = {
    val __obj = js.Dynamic.literal(tabIds = tabIds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTabIds]
  }
  @scala.inline
  implicit class AnonTabIdsOps[Self <: AnonTabIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

