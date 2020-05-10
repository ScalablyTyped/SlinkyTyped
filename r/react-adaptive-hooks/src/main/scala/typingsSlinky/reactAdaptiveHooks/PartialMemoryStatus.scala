package typingsSlinky.reactAdaptiveHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-adaptive-hooks.react-adaptive-hooks/memory.MemoryStatus> */
@js.native
trait PartialMemoryStatus extends js.Object {
  var deviceMemory: js.UndefOr[Double] = js.native
  var jsHeapSizeLimit: js.UndefOr[Double] = js.native
  var totalJSHeapSize: js.UndefOr[Double] = js.native
  var usedJSHeapSize: js.UndefOr[Double] = js.native
}

object PartialMemoryStatus {
  @scala.inline
  def apply(): PartialMemoryStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMemoryStatus]
  }
  @scala.inline
  implicit class PartialMemoryStatusOps[Self <: PartialMemoryStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withJsHeapSizeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsHeapSizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsHeapSizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsHeapSizeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalJSHeapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalJSHeapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalJSHeapSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalJSHeapSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedJSHeapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedJSHeapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedJSHeapSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedJSHeapSize")(js.undefined)
        ret
    }
  }
  
}

