package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingComputationRanges extends js.Object {
  /** The ID of the computation. */
  var computationId: js.UndefOr[String] = js.native
  /** Data disk assignments for ranges from this computation. */
  var rangeAssignments: js.UndefOr[js.Array[KeyRangeDataDiskAssignment]] = js.native
}

object StreamingComputationRanges {
  @scala.inline
  def apply(): StreamingComputationRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingComputationRanges]
  }
  @scala.inline
  implicit class StreamingComputationRangesOps[Self <: StreamingComputationRanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationId")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeAssignments(value: js.Array[KeyRangeDataDiskAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeAssignments")(js.undefined)
        ret
    }
  }
  
}

