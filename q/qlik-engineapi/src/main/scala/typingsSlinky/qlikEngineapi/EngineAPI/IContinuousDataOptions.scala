package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for the dynamic properties of an attribute expression.
  */
@js.native
trait IContinuousDataOptions extends js.Object {
  /**
    * End value.
    */
  var qEnd: Double = js.native
  /**
    * Maximum number of ticks.
    */
  var qMaxNbrTicks: Double = js.native
  /**
    * Number of bins for binning.
    */
  var qNbrPoints: Double = js.native
  /**
    * Start value.
    */
  var qStart: Double = js.native
}

object IContinuousDataOptions {
  @scala.inline
  def apply(qEnd: Double, qMaxNbrTicks: Double, qNbrPoints: Double, qStart: Double): IContinuousDataOptions = {
    val __obj = js.Dynamic.literal(qEnd = qEnd.asInstanceOf[js.Any], qMaxNbrTicks = qMaxNbrTicks.asInstanceOf[js.Any], qNbrPoints = qNbrPoints.asInstanceOf[js.Any], qStart = qStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContinuousDataOptions]
  }
  @scala.inline
  implicit class IContinuousDataOptionsOps[Self <: IContinuousDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMaxNbrTicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMaxNbrTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNbrPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNbrPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

