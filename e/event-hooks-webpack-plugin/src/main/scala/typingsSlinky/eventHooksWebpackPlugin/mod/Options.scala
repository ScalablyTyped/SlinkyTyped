package typingsSlinky.eventHooksWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var additionalPass: js.UndefOr[js.Function0[Unit]] = js.native
  var afterCompile: js.UndefOr[js.Function0[Unit]] = js.native
  var afterEmit: js.UndefOr[js.Function0[Unit]] = js.native
  var afterEnvironment: js.UndefOr[js.Function0[Unit]] = js.native
  var afterPlugins: js.UndefOr[js.Function0[Unit]] = js.native
  var afterResolvers: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeCompile: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeRun: js.UndefOr[js.Function0[Unit]] = js.native
  var compilation: js.UndefOr[js.Function0[Unit]] = js.native
  var compile: js.UndefOr[js.Function0[Unit]] = js.native
  var contextModuleFactory: js.UndefOr[js.Function0[Unit]] = js.native
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  var emit: js.UndefOr[js.Function0[Unit]] = js.native
  var entryOption: js.UndefOr[js.Function0[Unit]] = js.native
  var environment: js.UndefOr[js.Function0[Unit]] = js.native
  var failed: js.UndefOr[js.Function0[Unit]] = js.native
  var invalid: js.UndefOr[js.Function0[Unit]] = js.native
  var make: js.UndefOr[js.Function0[Unit]] = js.native
  var normalModuleFactory: js.UndefOr[js.Function0[Unit]] = js.native
  var run: js.UndefOr[js.Function0[Unit]] = js.native
  var shouldEmit: js.UndefOr[js.Function0[Unit]] = js.native
  var thisCompilation: js.UndefOr[js.Function0[Unit]] = js.native
  var watchClose: js.UndefOr[js.Function0[Unit]] = js.native
  var watchRun: js.UndefOr[js.Function0[Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalPass(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalPass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAdditionalPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalPass")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCompile(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCompile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCompile")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterEmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEmit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterEmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEmit")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterEnvironment(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEnvironment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEnvironment")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPlugins(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPlugins")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterResolvers(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResolvers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterResolvers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCompile(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCompile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCompile")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRun")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRun")(js.undefined)
        ret
    }
    @scala.inline
    def withCompilation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCompilation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilation")(js.undefined)
        ret
    }
    @scala.inline
    def withCompile(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.undefined)
        ret
    }
    @scala.inline
    def withContextModuleFactory(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextModuleFactory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutContextModuleFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextModuleFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withEmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryOption(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryOption")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEntryOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryOption")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withFailed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalid(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.undefined)
        ret
    }
    @scala.inline
    def withMake(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMake: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalModuleFactory(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalModuleFactory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNormalModuleFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalModuleFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldEmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldEmit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShouldEmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldEmit")(js.undefined)
        ret
    }
    @scala.inline
    def withThisCompilation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisCompilation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutThisCompilation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisCompilation")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWatchClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchClose")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchRun")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutWatchRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchRun")(js.undefined)
        ret
    }
  }
  
}

