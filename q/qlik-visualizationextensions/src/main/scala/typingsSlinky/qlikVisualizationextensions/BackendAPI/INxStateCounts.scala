package typingsSlinky.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INxStateCounts extends js.Object {
  /**
    * Number of values in alternative state.
    * Integer
    */
  var qAlternative: Double = js.native
  /**
    * Number of values in deselected state.
    * Integer
    */
  var qDeselected: Double = js.native
  /**
    * Number of values in excluded state
    * Integer
    */
  var qExcluded: Double = js.native
  /**
    * Number of values in locked state.
    * Integer
    */
  var qLocked: Double = js.native
  /**
    * Number of values in locked excluded state.
    * Integer
    */
  var qLockedExcluded: Double = js.native
  /**
    * Number of values in optional state.
    * Integer
    */
  var qOption: Double = js.native
  /**
    * Number of values in selected state.
    * Integer
    */
  var qSelected: Double = js.native
  /**
    * Number of values in selected excluded state.
    * Integer
    */
  var qSelectedExcluded: Double = js.native
}

object INxStateCounts {
  @scala.inline
  def apply(
    qAlternative: Double,
    qDeselected: Double,
    qExcluded: Double,
    qLocked: Double,
    qLockedExcluded: Double,
    qOption: Double,
    qSelected: Double,
    qSelectedExcluded: Double
  ): INxStateCounts = {
    val __obj = js.Dynamic.literal(qAlternative = qAlternative.asInstanceOf[js.Any], qDeselected = qDeselected.asInstanceOf[js.Any], qExcluded = qExcluded.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qLockedExcluded = qLockedExcluded.asInstanceOf[js.Any], qOption = qOption.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedExcluded = qSelectedExcluded.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStateCounts]
  }
  @scala.inline
  implicit class INxStateCountsOps[Self <: INxStateCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAlternative(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAlternative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQDeselected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDeselected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQExcluded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExcluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLocked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLockedExcluded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLockedExcluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOption(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelectedExcluded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelectedExcluded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

