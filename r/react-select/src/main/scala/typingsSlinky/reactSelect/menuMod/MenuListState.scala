package typingsSlinky.reactSelect.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==============================
// Menu List
// ==============================
@js.native
trait MenuListState extends js.Object {
  /** Set classname for isMulti */
  var isMulti: Boolean = js.native
  /* Set the max height of the Menu component  */
  var maxHeight: Double = js.native
}

object MenuListState {
  @scala.inline
  def apply(isMulti: Boolean, maxHeight: Double): MenuListState = {
    val __obj = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListState]
  }
  @scala.inline
  implicit class MenuListStateOps[Self <: MenuListState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMulti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

