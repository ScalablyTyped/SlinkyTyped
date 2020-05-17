package typingsSlinky.jestFakeTimers.anon

import typingsSlinky.jestFakeTimers.jestFakeTimersMod.TimerConfig
import typingsSlinky.jestMessageUtil.mod.StackTraceConfig
import typingsSlinky.jestMock.mod.ModuleMocker
import typingsSlinky.node.NodeJS.Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[TimerRef] extends js.Object {
  var config: StackTraceConfig = js.native
  var global: Global = js.native
  var maxLoops: js.UndefOr[Double] = js.native
  var moduleMocker: ModuleMocker = js.native
  var timerConfig: TimerConfig[TimerRef] = js.native
}

object Config {
  @scala.inline
  def apply[TimerRef](
    config: StackTraceConfig,
    global: Global,
    moduleMocker: ModuleMocker,
    timerConfig: TimerConfig[TimerRef]
  ): Config[TimerRef] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], moduleMocker = moduleMocker.asInstanceOf[js.Any], timerConfig = timerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[TimerRef]]
  }
  @scala.inline
  implicit class ConfigOps[Self[timerref] <: Config[timerref], TimerRef] (val x: Self[TimerRef]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TimerRef] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TimerRef]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TimerRef] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TimerRef] with Other]
    @scala.inline
    def withConfig(value: StackTraceConfig): Self[TimerRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: Global): Self[TimerRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleMocker(value: ModuleMocker): Self[TimerRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleMocker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimerConfig(value: TimerConfig[TimerRef]): Self[TimerRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timerConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLoops(value: Double): Self[TimerRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLoops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLoops: Self[TimerRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLoops")(js.undefined)
        ret
    }
  }
  
}

