package typingsSlinky.forkTsCheckerWebpackPlugin.hooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/hooks.ForkTsCheckerHooks, string> */
@js.native
trait ForkTsCheckerLegacyHookMap extends js.Object {
  var cancel: String = js.native
  var done: String = js.native
  var emit: String = js.native
  var receive: String = js.native
  var serviceBeforeStart: String = js.native
  var serviceOutOfMemory: String = js.native
  var serviceStart: String = js.native
  var serviceStartError: String = js.native
  var waiting: String = js.native
}

object ForkTsCheckerLegacyHookMap {
  @scala.inline
  def apply(
    cancel: String,
    done: String,
    emit: String,
    receive: String,
    serviceBeforeStart: String,
    serviceOutOfMemory: String,
    serviceStart: String,
    serviceStartError: String,
    waiting: String
  ): ForkTsCheckerLegacyHookMap = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], serviceBeforeStart = serviceBeforeStart.asInstanceOf[js.Any], serviceOutOfMemory = serviceOutOfMemory.asInstanceOf[js.Any], serviceStart = serviceStart.asInstanceOf[js.Any], serviceStartError = serviceStartError.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForkTsCheckerLegacyHookMap]
  }
  @scala.inline
  implicit class ForkTsCheckerLegacyHookMapOps[Self <: ForkTsCheckerLegacyHookMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceBeforeStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceBeforeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceOutOfMemory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceOutOfMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceStartError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceStartError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaiting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

