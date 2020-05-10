package typingsSlinky.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceNodeTiming extends PerformanceEntry {
  /**
    * The high resolution millisecond timestamp at which the Node.js process completed bootstrap.
    */
  val bootstrapComplete: Double = js.native
  /**
    * The high resolution millisecond timestamp at which cluster processing ended.
    */
  val clusterSetupEnd: Double = js.native
  /**
    * The high resolution millisecond timestamp at which cluster processing started.
    */
  val clusterSetupStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which the Node.js event loop exited.
    */
  val loopExit: Double = js.native
  /**
    * The high resolution millisecond timestamp at which the Node.js event loop started.
    */
  val loopStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which main module load ended.
    */
  val moduleLoadEnd: Double = js.native
  /**
    * The high resolution millisecond timestamp at which main module load started.
    */
  val moduleLoadStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which the Node.js process was initialized.
    */
  val nodeStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which preload module load ended.
    */
  val preloadModuleLoadEnd: Double = js.native
  /**
    * The high resolution millisecond timestamp at which preload module load started.
    */
  val preloadModuleLoadStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which third_party_main processing ended.
    */
  val thirdPartyMainEnd: Double = js.native
  /**
    * The high resolution millisecond timestamp at which third_party_main processing started.
    */
  val thirdPartyMainStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which the V8 platform was initialized.
    */
  val v8Start: Double = js.native
}

object PerformanceNodeTiming {
  @scala.inline
  def apply(
    bootstrapComplete: Double,
    clusterSetupEnd: Double,
    clusterSetupStart: Double,
    duration: Double,
    entryType: EntryType,
    loopExit: Double,
    loopStart: Double,
    moduleLoadEnd: Double,
    moduleLoadStart: Double,
    name: String,
    nodeStart: Double,
    preloadModuleLoadEnd: Double,
    preloadModuleLoadStart: Double,
    startTime: Double,
    thirdPartyMainEnd: Double,
    thirdPartyMainStart: Double,
    v8Start: Double
  ): PerformanceNodeTiming = {
    val __obj = js.Dynamic.literal(bootstrapComplete = bootstrapComplete.asInstanceOf[js.Any], clusterSetupEnd = clusterSetupEnd.asInstanceOf[js.Any], clusterSetupStart = clusterSetupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], loopExit = loopExit.asInstanceOf[js.Any], loopStart = loopStart.asInstanceOf[js.Any], moduleLoadEnd = moduleLoadEnd.asInstanceOf[js.Any], moduleLoadStart = moduleLoadStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeStart = nodeStart.asInstanceOf[js.Any], preloadModuleLoadEnd = preloadModuleLoadEnd.asInstanceOf[js.Any], preloadModuleLoadStart = preloadModuleLoadStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], thirdPartyMainEnd = thirdPartyMainEnd.asInstanceOf[js.Any], thirdPartyMainStart = thirdPartyMainStart.asInstanceOf[js.Any], v8Start = v8Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNodeTiming]
  }
  @scala.inline
  implicit class PerformanceNodeTimingOps[Self <: PerformanceNodeTiming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBootstrapComplete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterSetupEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSetupEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterSetupStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSetupStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopExit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleLoadEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleLoadEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleLoadStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleLoadStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreloadModuleLoadEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadModuleLoadEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreloadModuleLoadStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadModuleLoadStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThirdPartyMainEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyMainEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThirdPartyMainStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyMainStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV8Start(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8Start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

