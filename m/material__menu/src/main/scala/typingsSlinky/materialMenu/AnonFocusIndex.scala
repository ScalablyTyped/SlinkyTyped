package typingsSlinky.materialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocusIndex extends js.Object {
  var focusIndex: js.UndefOr[Null] = js.native
}

object AnonFocusIndex {
  @scala.inline
  def apply(): AnonFocusIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFocusIndex]
  }
  @scala.inline
  implicit class AnonFocusIndexOps[Self <: AnonFocusIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusIndex(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusIndexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIndex")(null)
        ret
    }
  }
  
}

