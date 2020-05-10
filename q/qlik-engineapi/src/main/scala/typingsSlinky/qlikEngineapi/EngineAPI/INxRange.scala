package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxRange...
  */
@js.native
trait INxRange extends js.Object {
  /**
    * Position in the expression of the first character of the field name.
    */
  var qCount: Double = js.native
  /**
    * Number of characters in the field name.
    */
  var qFrom: Double = js.native
}

object INxRange {
  @scala.inline
  def apply(qCount: Double, qFrom: Double): INxRange = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qFrom = qFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxRange]
  }
  @scala.inline
  implicit class INxRangeOps[Self <: INxRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFrom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

