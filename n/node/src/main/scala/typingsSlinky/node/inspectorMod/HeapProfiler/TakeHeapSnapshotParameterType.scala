package typingsSlinky.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TakeHeapSnapshotParameterType extends js.Object {
  /**
    * If true 'reportHeapSnapshotProgress' events will be generated while snapshot is being taken.
    */
  var reportProgress: js.UndefOr[Boolean] = js.native
}

object TakeHeapSnapshotParameterType {
  @scala.inline
  def apply(): TakeHeapSnapshotParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakeHeapSnapshotParameterType]
  }
  @scala.inline
  implicit class TakeHeapSnapshotParameterTypeOps[Self <: TakeHeapSnapshotParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportProgress")(js.undefined)
        ret
    }
  }
  
}

