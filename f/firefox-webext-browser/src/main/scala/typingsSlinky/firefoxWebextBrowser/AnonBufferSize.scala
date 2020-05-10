package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.geckoProfiler.ProfilerFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBufferSize extends js.Object {
  /**
    * The maximum size in bytes of the buffer used to store profiling data. A larger value allows capturing a
    * profile that covers a greater amount of time.
    */
  var bufferSize: Double = js.native
  /** A list of active features for the profiler. */
  var features: js.Array[ProfilerFeature] = js.native
  /**
    * Interval in milliseconds between samples of profiling data. A smaller value will increase the detail of the
    * profiles captured.
    */
  var interval: Double = js.native
  /** A list of thread names for which to capture profiles. */
  var threads: js.UndefOr[js.Array[String]] = js.native
  /**
    * The length of the window of time that's kept in the buffer. Any collected samples are discarded as soon as
    * they are older than the number of seconds specified in this setting. Zero means no duration restriction.
    */
  var windowLength: js.UndefOr[Double] = js.native
}

object AnonBufferSize {
  @scala.inline
  def apply(bufferSize: Double, features: js.Array[ProfilerFeature], interval: Double): AnonBufferSize = {
    val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBufferSize]
  }
  @scala.inline
  implicit class AnonBufferSizeOps[Self <: AnonBufferSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[ProfilerFeature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreads(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowLength")(js.undefined)
        ret
    }
  }
  
}

