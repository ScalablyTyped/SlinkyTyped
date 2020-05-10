package typingsSlinky.browserfs.mutexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mutex extends js.Object {
  var _locked: js.Any = js.native
  var _waiters: js.Any = js.native
  def isLocked(): Boolean = js.native
  def lock(cb: js.Function): Unit = js.native
  def tryLock(): Boolean = js.native
  def unlock(): Unit = js.native
}

object Mutex {
  @scala.inline
  def apply(
    _locked: js.Any,
    _waiters: js.Any,
    isLocked: () => Boolean,
    lock: js.Function => Unit,
    tryLock: () => Boolean,
    unlock: () => Unit
  ): Mutex = {
    val __obj = js.Dynamic.literal(_locked = _locked.asInstanceOf[js.Any], _waiters = _waiters.asInstanceOf[js.Any], isLocked = js.Any.fromFunction0(isLocked), lock = js.Any.fromFunction1(lock), tryLock = js.Any.fromFunction0(tryLock), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[Mutex]
  }
  @scala.inline
  implicit class MutexOps[Self <: Mutex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_locked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_waiters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_waiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLocked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLock(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTryLock(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryLock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnlock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

