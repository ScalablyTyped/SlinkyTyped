package typingsSlinky.doubleclickGpt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRestrictDataProcessing extends js.Object {
  var restrictDataProcessing: Boolean = js.native
}

object AnonRestrictDataProcessing {
  @scala.inline
  def apply(restrictDataProcessing: Boolean): AnonRestrictDataProcessing = {
    val __obj = js.Dynamic.literal(restrictDataProcessing = restrictDataProcessing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRestrictDataProcessing]
  }
  @scala.inline
  implicit class AnonRestrictDataProcessingOps[Self <: AnonRestrictDataProcessing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestrictDataProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictDataProcessing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

