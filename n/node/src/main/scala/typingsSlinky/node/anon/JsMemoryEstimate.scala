package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsMemoryEstimate extends js.Object {
  var jsMemoryEstimate: Double = js.native
  var jsMemoryRange: js.Tuple2[Double, Double] = js.native
}

object JsMemoryEstimate {
  @scala.inline
  def apply(jsMemoryEstimate: Double, jsMemoryRange: js.Tuple2[Double, Double]): JsMemoryEstimate = {
    val __obj = js.Dynamic.literal(jsMemoryEstimate = jsMemoryEstimate.asInstanceOf[js.Any], jsMemoryRange = jsMemoryRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsMemoryEstimate]
  }
  @scala.inline
  implicit class JsMemoryEstimateOps[Self <: JsMemoryEstimate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsMemoryEstimate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsMemoryEstimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsMemoryRange(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsMemoryRange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

