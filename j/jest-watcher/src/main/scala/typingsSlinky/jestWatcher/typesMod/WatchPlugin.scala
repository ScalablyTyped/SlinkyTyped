package typingsSlinky.jestWatcher.typesMod

import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchPlugin extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* hooks */ JestHookSubscriber, Unit]] = js.native
  var getUsageInfo: js.UndefOr[js.Function1[/* globalConfig */ GlobalConfig, UsageData | Null]] = js.native
  var isInternal: js.UndefOr[Boolean] = js.native
  var onKey: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var run: js.UndefOr[
    js.Function2[
      /* globalConfig */ GlobalConfig, 
      /* updateConfigAndRun */ UpdateConfigCallback, 
      js.Promise[Unit | Boolean]
    ]
  ] = js.native
}

object WatchPlugin {
  @scala.inline
  def apply(): WatchPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchPlugin]
  }
  @scala.inline
  implicit class WatchPluginOps[Self <: WatchPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: /* hooks */ JestHookSubscriber => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUsageInfo(value: /* globalConfig */ GlobalConfig => UsageData | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsageInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetUsageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsageInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInternal")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKey(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRun(
      value: (/* globalConfig */ GlobalConfig, /* updateConfigAndRun */ UpdateConfigCallback) => js.Promise[Unit | Boolean]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.undefined)
        ret
    }
  }
  
}

