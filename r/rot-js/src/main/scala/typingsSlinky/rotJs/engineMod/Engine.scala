package typingsSlinky.rotJs.engineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Engine extends js.Object {
  var _lock: Double = js.native
  var _scheduler: typingsSlinky.rotJs.schedulerSchedulerMod.default[_] = js.native
  /**
    * Interrupt the engine by an asynchronous action
    */
  def lock(): this.type = js.native
  /**
    * Start the main loop. When this call returns, the loop is locked.
    */
  def start(): this.type = js.native
  /**
    * Resume execution (paused by a previous lock)
    */
  def unlock(): this.type = js.native
}

object Engine {
  @scala.inline
  def apply(
    _lock: Double,
    _scheduler: typingsSlinky.rotJs.schedulerSchedulerMod.default[_],
    lock: () => Engine,
    start: () => Engine,
    unlock: () => Engine
  ): Engine = {
    val __obj = js.Dynamic.literal(_lock = _lock.asInstanceOf[js.Any], _scheduler = _scheduler.asInstanceOf[js.Any], lock = js.Any.fromFunction0(lock), start = js.Any.fromFunction0(start), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_lock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scheduler(value: typingsSlinky.rotJs.schedulerSchedulerMod.default[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scheduler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock(value: () => Engine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Engine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnlock(value: () => Engine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

