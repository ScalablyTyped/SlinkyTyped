package typingsSlinky.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxEventLoopDelay extends js.Object {
  /**
    * maximum event loop delay duration in milliseconds over which incoming requests are rejected with an HTTP Server Timeout (503) response.
    * Defaults to 0 (no limit).
    */
  var maxEventLoopDelay: js.UndefOr[Double] = js.native
  /** maximum V8 heap size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit). */
  var maxHeapUsedBytes: js.UndefOr[Double] = js.native
  /**
    * maximum process RSS size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit).
    */
  var maxRssBytes: js.UndefOr[Double] = js.native
  /** the frequency of sampling in milliseconds. When set to 0, the other load options are ignored. Defaults to 0 (no sampling). */
  var sampleInterval: js.UndefOr[Double] = js.native
}

object AnonMaxEventLoopDelay {
  @scala.inline
  def apply(): AnonMaxEventLoopDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxEventLoopDelay]
  }
  @scala.inline
  implicit class AnonMaxEventLoopDelayOps[Self <: AnonMaxEventLoopDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxEventLoopDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEventLoopDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEventLoopDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEventLoopDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeapUsedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeapUsedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeapUsedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeapUsedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRssBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRssBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRssBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRssBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleInterval")(js.undefined)
        ret
    }
  }
  
}

