package typingsSlinky.reactSelect.menuMod

import typingsSlinky.reactSelect.reactSelectStrings.bottom
import typingsSlinky.reactSelect.reactSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuState extends js.Object {
  var maxHeight: Double = js.native
  var placement: bottom | top | Null = js.native
}

object MenuState {
  @scala.inline
  def apply(maxHeight: Double): MenuState = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuState]
  }
  @scala.inline
  implicit class MenuStateOps[Self <: MenuState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(null)
        ret
    }
  }
  
}

