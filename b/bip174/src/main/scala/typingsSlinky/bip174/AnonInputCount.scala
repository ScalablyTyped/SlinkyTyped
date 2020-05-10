package typingsSlinky.bip174

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInputCount extends js.Object {
  var inputCount: Double = js.native
  var outputCount: Double = js.native
}

object AnonInputCount {
  @scala.inline
  def apply(inputCount: Double, outputCount: Double): AnonInputCount = {
    val __obj = js.Dynamic.literal(inputCount = inputCount.asInstanceOf[js.Any], outputCount = outputCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInputCount]
  }
  @scala.inline
  implicit class AnonInputCountOps[Self <: AnonInputCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

