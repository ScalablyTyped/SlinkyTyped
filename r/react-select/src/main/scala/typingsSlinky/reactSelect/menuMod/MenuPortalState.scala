package typingsSlinky.reactSelect.menuMod

import typingsSlinky.reactSelect.reactSelectStrings.bottom
import typingsSlinky.reactSelect.reactSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuPortalState extends js.Object {
  var placement: bottom | top | Null = js.native
}

object MenuPortalState {
  @scala.inline
  def apply(): MenuPortalState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuPortalState]
  }
  @scala.inline
  implicit class MenuPortalStateOps[Self <: MenuPortalState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

