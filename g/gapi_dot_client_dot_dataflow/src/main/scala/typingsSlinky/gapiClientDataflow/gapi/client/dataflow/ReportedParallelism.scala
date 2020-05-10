package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportedParallelism extends js.Object {
  /**
    * Specifies whether the parallelism is infinite. If true, "value" is
    * ignored.
    * Infinite parallelism means the service will assume that the work item
    * can always be split into more non-empty work items by dynamic splitting.
    * This is a work-around for lack of support for infinity by the current
    * JSON-based Java RPC stack.
    */
  var isInfinite: js.UndefOr[Boolean] = js.native
  /** Specifies the level of parallelism in case it is finite. */
  var value: js.UndefOr[Double] = js.native
}

object ReportedParallelism {
  @scala.inline
  def apply(): ReportedParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportedParallelism]
  }
  @scala.inline
  implicit class ReportedParallelismOps[Self <: ReportedParallelism] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInfinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInfinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInfinite")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

