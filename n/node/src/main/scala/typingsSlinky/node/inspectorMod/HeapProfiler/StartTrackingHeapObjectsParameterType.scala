package typingsSlinky.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTrackingHeapObjectsParameterType extends js.Object {
  var trackAllocations: js.UndefOr[Boolean] = js.native
}

object StartTrackingHeapObjectsParameterType {
  @scala.inline
  def apply(): StartTrackingHeapObjectsParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTrackingHeapObjectsParameterType]
  }
  @scala.inline
  implicit class StartTrackingHeapObjectsParameterTypeOps[Self <: StartTrackingHeapObjectsParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackAllocations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackAllocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackAllocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackAllocations")(js.undefined)
        ret
    }
  }
  
}

