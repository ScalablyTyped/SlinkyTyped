package typingsSlinky.carbonType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFontWeightNumber extends js.Object {
  var fontWeight: Double = js.native
}

object AnonFontWeightNumber {
  @scala.inline
  def apply(fontWeight: Double): AnonFontWeightNumber = {
    val __obj = js.Dynamic.literal(fontWeight = fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFontWeightNumber]
  }
  @scala.inline
  implicit class AnonFontWeightNumberOps[Self <: AnonFontWeightNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

