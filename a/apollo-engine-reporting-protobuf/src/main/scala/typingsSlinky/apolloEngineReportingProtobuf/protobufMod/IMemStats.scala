package typingsSlinky.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMemStats extends js.Object {
  /** MemStats gcCountDelta */
  var gcCountDelta: js.UndefOr[Double | Null] = js.native
  /** MemStats gcOverheadBytes */
  var gcOverheadBytes: js.UndefOr[Double | Null] = js.native
  /** MemStats gcStwNsDelta */
  var gcStwNsDelta: js.UndefOr[Double | Null] = js.native
  /** MemStats heapAllocatedBytes */
  var heapAllocatedBytes: js.UndefOr[Double | Null] = js.native
  /** MemStats heapAllocatedBytesDelta */
  var heapAllocatedBytesDelta: js.UndefOr[Double | Null] = js.native
  /** MemStats heapAllocatedObjects */
  var heapAllocatedObjects: js.UndefOr[Double | Null] = js.native
  /** MemStats heapAllocatedObjectsDelta */
  var heapAllocatedObjectsDelta: js.UndefOr[Double | Null] = js.native
  /** MemStats heapBytes */
  var heapBytes: js.UndefOr[Double | Null] = js.native
  /** MemStats heapFreedObjectsDelta */
  var heapFreedObjectsDelta: js.UndefOr[Double | Null] = js.native
  /** MemStats heapReleasedBytes */
  var heapReleasedBytes: js.UndefOr[Double | Null] = js.native
  /** MemStats stackBytes */
  var stackBytes: js.UndefOr[Double | Null] = js.native
  /** MemStats stackUsedBytes */
  var stackUsedBytes: js.UndefOr[Double | Null] = js.native
  /** MemStats totalBytes */
  var totalBytes: js.UndefOr[Double | Null] = js.native
}

object IMemStats {
  @scala.inline
  def apply(): IMemStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMemStats]
  }
  @scala.inline
  implicit class IMemStatsOps[Self <: IMemStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGcCountDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcCountDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcCountDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcCountDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withGcCountDeltaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcCountDelta")(null)
        ret
    }
    @scala.inline
    def withGcOverheadBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcOverheadBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcOverheadBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcOverheadBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withGcOverheadBytesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcOverheadBytes")(null)
        ret
    }
    @scala.inline
    def withGcStwNsDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcStwNsDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcStwNsDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcStwNsDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withGcStwNsDeltaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcStwNsDelta")(null)
        ret
    }
    @scala.inline
    def withHeapAllocatedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeapAllocatedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withHeapAllocatedBytesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedBytes")(null)
        ret
    }
    @scala.inline
    def withHeapAllocatedBytesDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedBytesDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeapAllocatedBytesDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedBytesDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withHeapAllocatedBytesDeltaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedBytesDelta")(null)
        ret
    }
    @scala.inline
    def withHeapAllocatedObjects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeapAllocatedObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withHeapAllocatedObjectsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedObjects")(null)
        ret
    }
    @scala.inline
    def withHeapAllocatedObjectsDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedObjectsDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeapAllocatedObjectsDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedObjectsDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withHeapAllocatedObjectsDeltaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapAllocatedObjectsDelta")(null)
        ret
    }
    @scala.inline
    def withHeapBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeapBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withHeapBytesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapBytes")(null)
        ret
    }
    @scala.inline
    def withHeapFreedObjectsDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapFreedObjectsDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeapFreedObjectsDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapFreedObjectsDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withHeapFreedObjectsDeltaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapFreedObjectsDelta")(null)
        ret
    }
    @scala.inline
    def withHeapReleasedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapReleasedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeapReleasedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapReleasedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withHeapReleasedBytesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapReleasedBytes")(null)
        ret
    }
    @scala.inline
    def withStackBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withStackBytesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackBytes")(null)
        ret
    }
    @scala.inline
    def withStackUsedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackUsedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackUsedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackUsedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withStackUsedBytesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackUsedBytes")(null)
        ret
    }
    @scala.inline
    def withTotalBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalBytesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBytes")(null)
        ret
    }
  }
  
}

