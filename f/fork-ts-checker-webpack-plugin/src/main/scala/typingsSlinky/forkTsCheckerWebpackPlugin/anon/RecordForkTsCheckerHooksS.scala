package typingsSlinky.forkTsCheckerWebpackPlugin.anon

import typingsSlinky.tapable.mod.AsyncSeriesHook
import typingsSlinky.tapable.mod.SyncHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/hooks.ForkTsCheckerHooks, tapable.tapable.SyncHook<any, any, any> | tapable.tapable.AsyncSeriesHook<any, any, any>> */
@js.native
trait RecordForkTsCheckerHooksS extends js.Object {
  var cancel: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]) = js.native
  var done: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]) = js.native
  var emit: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]) = js.native
  var receive: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]) = js.native
  var serviceBeforeStart: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]) = js.native
  var serviceOutOfMemory: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]) = js.native
  var serviceStart: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]) = js.native
  var serviceStartError: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]) = js.native
  var waiting: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]) = js.native
}

object RecordForkTsCheckerHooksS {
  @scala.inline
  def apply(
    cancel: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    done: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    emit: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    receive: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    serviceBeforeStart: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    serviceOutOfMemory: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    serviceStart: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    serviceStartError: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    waiting: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
  ): RecordForkTsCheckerHooksS = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], serviceBeforeStart = serviceBeforeStart.asInstanceOf[js.Any], serviceOutOfMemory = serviceOutOfMemory.asInstanceOf[js.Any], serviceStart = serviceStart.asInstanceOf[js.Any], serviceStartError = serviceStartError.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordForkTsCheckerHooksS]
  }
  @scala.inline
  implicit class RecordForkTsCheckerHooksSOps[Self <: RecordForkTsCheckerHooksS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmit(value: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceive(value: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceBeforeStart(value: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceBeforeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceOutOfMemory(value: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceOutOfMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceStart(value: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceStartError(value: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceStartError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

