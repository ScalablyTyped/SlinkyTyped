package typingsSlinky.forkTsCheckerWebpackPlugin.hooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/hooks.ForkTsCheckerHooks, string> */
trait ForkTsCheckerLegacyHookMap extends js.Object {
  var cancel: String
  var done: String
  var emit: String
  var receive: String
  var serviceBeforeStart: String
  var serviceOutOfMemory: String
  var serviceStart: String
  var serviceStartError: String
  var waiting: String
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
}

