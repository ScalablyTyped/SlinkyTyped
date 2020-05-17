package typingsSlinky.jestWatcher.baseWatchPluginMod

import typingsSlinky.jestTypes.configMod.GlobalConfig
import typingsSlinky.jestWatcher.typesMod.JestHookSubscriber
import typingsSlinky.jestWatcher.typesMod.UpdateConfigCallback
import typingsSlinky.jestWatcher.typesMod.UsageData
import typingsSlinky.jestWatcher.typesMod.WatchPlugin
import typingsSlinky.node.processMod.global.NodeJS.ReadStream
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseWatchPlugin extends WatchPlugin {
  var _stdin: ReadStream = js.native
  var _stdout: WriteStream = js.native
  @JSName("apply")
  def apply_MBaseWatchPlugin(_hooks: JestHookSubscriber): Unit = js.native
  @JSName("getUsageInfo")
  def getUsageInfo_MBaseWatchPlugin(_globalConfig: GlobalConfig): UsageData | Null = js.native
  @JSName("onKey")
  def onKey_MBaseWatchPlugin(_key: String): Unit = js.native
  @JSName("run")
  def run_MBaseWatchPlugin(_globalConfig: GlobalConfig, _updateConfigAndRun: UpdateConfigCallback): js.Promise[Unit | Boolean] = js.native
}

object BaseWatchPlugin {
  @scala.inline
  def apply(
    _stdin: ReadStream,
    _stdout: WriteStream,
    apply: JestHookSubscriber => Unit,
    getUsageInfo: GlobalConfig => UsageData | Null,
    onKey: String => Unit,
    run: (GlobalConfig, UpdateConfigCallback) => js.Promise[Unit | Boolean]
  ): BaseWatchPlugin = {
    val __obj = js.Dynamic.literal(_stdin = _stdin.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), getUsageInfo = js.Any.fromFunction1(getUsageInfo), onKey = js.Any.fromFunction1(onKey), run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[BaseWatchPlugin]
  }
  @scala.inline
  implicit class BaseWatchPluginOps[Self <: BaseWatchPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_stdin(value: ReadStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stdin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_stdout(value: WriteStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApply(value: JestHookSubscriber => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUsageInfo(value: GlobalConfig => UsageData | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsageInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnKey(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(value: (GlobalConfig, UpdateConfigCallback) => js.Promise[Unit | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

