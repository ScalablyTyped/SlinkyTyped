package typingsSlinky.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPreciseCoverageParameterType extends js.Object {
  /**
    * Collect accurate call counts beyond simple 'covered' or 'not covered'.
    */
  var callCount: js.UndefOr[Boolean] = js.native
  /**
    * Collect block-based coverage.
    */
  var detailed: js.UndefOr[Boolean] = js.native
}

object StartPreciseCoverageParameterType {
  @scala.inline
  def apply(): StartPreciseCoverageParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPreciseCoverageParameterType]
  }
  @scala.inline
  implicit class StartPreciseCoverageParameterTypeOps[Self <: StartPreciseCoverageParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(js.undefined)
        ret
    }
  }
  
}

