package typingsSlinky.reactNativeSortableGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteModeOn extends js.Object {
  var deleteModeOn: Boolean = js.native
}

object DeleteModeOn {
  @scala.inline
  def apply(deleteModeOn: Boolean): DeleteModeOn = {
    val __obj = js.Dynamic.literal(deleteModeOn = deleteModeOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModeOn]
  }
  @scala.inline
  implicit class DeleteModeOnOps[Self <: DeleteModeOn] (val x: Self) extends AnyVal {
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

