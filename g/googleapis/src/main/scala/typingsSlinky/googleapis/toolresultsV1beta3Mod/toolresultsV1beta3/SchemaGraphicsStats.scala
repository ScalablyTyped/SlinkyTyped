package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Graphics statistics for the App. The information is collected from &#39;adb
  * shell dumpsys graphicsstats&#39;. For more info see:
  * https://developer.android.com/training/testing/performance.html Statistics
  * will only be present for API 23+.
  */
@js.native
trait SchemaGraphicsStats extends js.Object {
  /**
    * Histogram of frame render times. There should be 154 buckets ranging from
    * [5ms, 6ms) to [4950ms, infinity)
    */
  var buckets: js.UndefOr[js.Array[SchemaGraphicsStatsBucket]] = js.native
  /**
    * Total &quot;high input latency&quot; events.
    */
  var highInputLatencyCount: js.UndefOr[String] = js.native
  /**
    * Total frames with slow render time. Should be &lt;= total_frames.
    */
  var jankyFrames: js.UndefOr[String] = js.native
  /**
    * Total &quot;missed vsync&quot; events.
    */
  var missedVsyncCount: js.UndefOr[String] = js.native
  /**
    * 50th percentile frame render time in milliseconds.
    */
  var p50Millis: js.UndefOr[String] = js.native
  /**
    * 90th percentile frame render time in milliseconds.
    */
  var p90Millis: js.UndefOr[String] = js.native
  /**
    * 95th percentile frame render time in milliseconds.
    */
  var p95Millis: js.UndefOr[String] = js.native
  /**
    * 99th percentile frame render time in milliseconds.
    */
  var p99Millis: js.UndefOr[String] = js.native
  /**
    * Total &quot;slow bitmap upload&quot; events.
    */
  var slowBitmapUploadCount: js.UndefOr[String] = js.native
  /**
    * Total &quot;slow draw&quot; events.
    */
  var slowDrawCount: js.UndefOr[String] = js.native
  /**
    * Total &quot;slow UI thread&quot; events.
    */
  var slowUiThreadCount: js.UndefOr[String] = js.native
  /**
    * Total frames rendered by package.
    */
  var totalFrames: js.UndefOr[String] = js.native
}

object SchemaGraphicsStats {
  @scala.inline
  def apply(): SchemaGraphicsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGraphicsStats]
  }
  @scala.inline
  implicit class SchemaGraphicsStatsOps[Self <: SchemaGraphicsStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[SchemaGraphicsStatsBucket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(js.undefined)
        ret
    }
    @scala.inline
    def withHighInputLatencyCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highInputLatencyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighInputLatencyCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highInputLatencyCount")(js.undefined)
        ret
    }
    @scala.inline
    def withJankyFrames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jankyFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJankyFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jankyFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withMissedVsyncCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missedVsyncCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissedVsyncCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missedVsyncCount")(js.undefined)
        ret
    }
    @scala.inline
    def withP50Millis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p50Millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP50Millis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p50Millis")(js.undefined)
        ret
    }
    @scala.inline
    def withP90Millis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p90Millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP90Millis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p90Millis")(js.undefined)
        ret
    }
    @scala.inline
    def withP95Millis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p95Millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP95Millis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p95Millis")(js.undefined)
        ret
    }
    @scala.inline
    def withP99Millis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p99Millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP99Millis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p99Millis")(js.undefined)
        ret
    }
    @scala.inline
    def withSlowBitmapUploadCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowBitmapUploadCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlowBitmapUploadCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowBitmapUploadCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSlowDrawCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowDrawCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlowDrawCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowDrawCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSlowUiThreadCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowUiThreadCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlowUiThreadCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slowUiThreadCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalFrames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalFrames")(js.undefined)
        ret
    }
  }
  
}

