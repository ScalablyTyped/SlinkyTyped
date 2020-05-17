package typingsSlinky.carbonType.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontWeightNumber extends js.Object {
  var fontWeight: Double = js.native
}

object FontWeightNumber {
  @scala.inline
  def apply(fontWeight: Double): FontWeightNumber = {
    val __obj = js.Dynamic.literal(fontWeight = fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightNumber]
  }
  @scala.inline
  implicit class FontWeightNumberOps[Self <: FontWeightNumber] (val x: Self) extends AnyVal {
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

