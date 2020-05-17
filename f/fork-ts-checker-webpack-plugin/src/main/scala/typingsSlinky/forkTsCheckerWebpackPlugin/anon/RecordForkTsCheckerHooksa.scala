package typingsSlinky.forkTsCheckerWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/hooks.ForkTsCheckerHooks, any> */
@js.native
trait RecordForkTsCheckerHooksa extends js.Object {
  var cancel: js.Any = js.native
  var done: js.Any = js.native
  var emit: js.Any = js.native
  var receive: js.Any = js.native
  var serviceBeforeStart: js.Any = js.native
  var serviceOutOfMemory: js.Any = js.native
  var serviceStart: js.Any = js.native
  var serviceStartError: js.Any = js.native
  var waiting: js.Any = js.native
}

object RecordForkTsCheckerHooksa {
  @scala.inline
  def apply(
    cancel: js.Any,
    done: js.Any,
    emit: js.Any,
    receive: js.Any,
    serviceBeforeStart: js.Any,
    serviceOutOfMemory: js.Any,
    serviceStart: js.Any,
    serviceStartError: js.Any,
    waiting: js.Any
  ): RecordForkTsCheckerHooksa = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], serviceBeforeStart = serviceBeforeStart.asInstanceOf[js.Any], serviceOutOfMemory = serviceOutOfMemory.asInstanceOf[js.Any], serviceStart = serviceStart.asInstanceOf[js.Any], serviceStartError = serviceStartError.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordForkTsCheckerHooksa]
  }
  @scala.inline
  implicit class RecordForkTsCheckerHooksaOps[Self <: RecordForkTsCheckerHooksa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmit(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceive(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceBeforeStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceBeforeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceOutOfMemory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceOutOfMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceStartError(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceStartError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

