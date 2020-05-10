package typingsSlinky.reactNativeSortableGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeleteModeOn extends js.Object {
  var deleteModeOn: Boolean = js.native
}

object AnonDeleteModeOn {
  @scala.inline
  def apply(deleteModeOn: Boolean): AnonDeleteModeOn = {
    val __obj = js.Dynamic.literal(deleteModeOn = deleteModeOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeleteModeOn]
  }
  @scala.inline
  implicit class AnonDeleteModeOnOps[Self <: AnonDeleteModeOn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteModeOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteModeOn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

