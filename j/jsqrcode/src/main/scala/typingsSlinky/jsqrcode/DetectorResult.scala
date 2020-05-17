package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorResult extends js.Object {
  var bits: BitMatrix = js.native
  var points: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult]) = js.native
}

object DetectorResult {
  @scala.inline
  def apply(
    bits: BitMatrix,
    points: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult])
  ): DetectorResult = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorResult]
  }
  @scala.inline
  implicit class DetectorResultOps[Self <: DetectorResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBits(value: BitMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(
      value: (js.Tuple3[DetectorResult, DetectorResult, DetectorResult]) | (js.Tuple4[DetectorResult, DetectorResult, DetectorResult, DetectorResult])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

