package typingsSlinky.baseui.layerMod

import typingsSlinky.baseui.AnonArrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopperDataObject extends js.Object {
  var offsets: AnonArrow = js.native
  var placement: String = js.native
}

object PopperDataObject {
  @scala.inline
  def apply(offsets: AnonArrow, placement: String): PopperDataObject = {
    val __obj = js.Dynamic.literal(offsets = offsets.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperDataObject]
  }
  @scala.inline
  implicit class PopperDataObjectOps[Self <: PopperDataObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffsets(value: AnonArrow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

