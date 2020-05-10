package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxContinuousRangeSelectInfo with extends of RangeSelectInfo
  */
@js.native
trait INxContinuousRangeSelectInfo extends IRangeSelectInfo {
  /**
    * Dimension index.
    */
  var qDimIx: Double = js.native
}

object INxContinuousRangeSelectInfo {
  @scala.inline
  def apply(qDimIx: Double, qRange: IRange): INxContinuousRangeSelectInfo = {
    val __obj = js.Dynamic.literal(qDimIx = qDimIx.asInstanceOf[js.Any], qRange = qRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxContinuousRangeSelectInfo]
  }
  @scala.inline
  implicit class INxContinuousRangeSelectInfoOps[Self <: INxContinuousRangeSelectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDimIx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDimIx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

