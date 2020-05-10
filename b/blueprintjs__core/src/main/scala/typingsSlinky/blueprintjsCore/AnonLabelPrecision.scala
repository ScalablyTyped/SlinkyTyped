package typingsSlinky.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabelPrecision extends js.Object {
  var labelPrecision: Double = js.native
}

object AnonLabelPrecision {
  @scala.inline
  def apply(labelPrecision: Double): AnonLabelPrecision = {
    val __obj = js.Dynamic.literal(labelPrecision = labelPrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelPrecision]
  }
  @scala.inline
  implicit class AnonLabelPrecisionOps[Self <: AnonLabelPrecision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPrecision")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

