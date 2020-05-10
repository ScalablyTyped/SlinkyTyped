package typingsSlinky.reactAdaptiveHooks.memoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryStatus extends js.Object {
  var deviceMemory: Double = js.native
  var jsHeapSizeLimit: Double | Null = js.native
  var totalJSHeapSize: Double | Null = js.native
  var usedJSHeapSize: Double | Null = js.native
}

object MemoryStatus {
  @scala.inline
  def apply(deviceMemory: Double): MemoryStatus = {
    val __obj = js.Dynamic.literal(deviceMemory = deviceMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStatus]
  }
  @scala.inline
  implicit class MemoryStatusOps[Self <: MemoryStatus] (val x: Self) extends AnyVal {
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
    def withJsHeapSizeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsHeapSizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsHeapSizeLimitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsHeapSizeLimit")(null)
        ret
    }
    @scala.inline
    def withTotalJSHeapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalJSHeapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalJSHeapSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalJSHeapSize")(null)
        ret
    }
    @scala.inline
    def withUsedJSHeapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedJSHeapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedJSHeapSizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedJSHeapSize")(null)
        ret
    }
  }
  
}

