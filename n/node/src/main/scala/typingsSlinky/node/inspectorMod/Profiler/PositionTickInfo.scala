package typingsSlinky.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a number of samples attributed to a certain source position.
  */
@js.native
trait PositionTickInfo extends js.Object {
  /**
    * Source line number (1-based).
    */
  var line: Double = js.native
  /**
    * Number of samples attributed to the source line.
    */
  var ticks: Double = js.native
}

object PositionTickInfo {
  @scala.inline
  def apply(line: Double, ticks: Double): PositionTickInfo = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionTickInfo]
  }
  @scala.inline
  implicit class PositionTickInfoOps[Self <: PositionTickInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

