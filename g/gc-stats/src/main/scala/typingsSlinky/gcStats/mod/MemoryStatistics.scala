package typingsSlinky.gcStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryStatistics extends js.Object {
  var heapSizeLimit: Double = js.native
  var mallocedMemory: js.UndefOr[Double] = js.native
   // became available with node 10+
  var numberOfDetachedContexts: js.UndefOr[Double] = js.native
   // became available with node 7+
  var numberOfNativeContexts: js.UndefOr[Double] = js.native
   // became available with node 7+
  var peakMallocedMemory: js.UndefOr[Double] = js.native
  var totalAvailableSize: Double = js.native
  var totalHeapExecutableSize: Double = js.native
  var totalHeapSize: Double = js.native
  var totalPhysicalSize: Double = js.native
  var usedHeapSize: Double = js.native
}

object MemoryStatistics {
  @scala.inline
  def apply(
    heapSizeLimit: Double,
    totalAvailableSize: Double,
    totalHeapExecutableSize: Double,
    totalHeapSize: Double,
    totalPhysicalSize: Double,
    usedHeapSize: Double
  ): MemoryStatistics = {
    val __obj = js.Dynamic.literal(heapSizeLimit = heapSizeLimit.asInstanceOf[js.Any], totalAvailableSize = totalAvailableSize.asInstanceOf[js.Any], totalHeapExecutableSize = totalHeapExecutableSize.asInstanceOf[js.Any], totalHeapSize = totalHeapSize.asInstanceOf[js.Any], totalPhysicalSize = totalPhysicalSize.asInstanceOf[js.Any], usedHeapSize = usedHeapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStatistics]
  }
  @scala.inline
  implicit class MemoryStatisticsOps[Self <: MemoryStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeapSizeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapSizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalAvailableSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalAvailableSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalHeapExecutableSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalHeapExecutableSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalHeapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalHeapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPhysicalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPhysicalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedHeapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedHeapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMallocedMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mallocedMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMallocedMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mallocedMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfDetachedContexts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfDetachedContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfDetachedContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfDetachedContexts")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfNativeContexts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfNativeContexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfNativeContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfNativeContexts")(js.undefined)
        ret
    }
    @scala.inline
    def withPeakMallocedMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakMallocedMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeakMallocedMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peakMallocedMemory")(js.undefined)
        ret
    }
  }
  
}

