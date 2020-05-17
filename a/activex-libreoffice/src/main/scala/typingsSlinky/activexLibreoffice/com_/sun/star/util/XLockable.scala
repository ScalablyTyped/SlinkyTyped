package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows locking a component
  *
  * `lock` and `unlock` calls can be nested. However, they must be in pairs. As long as there has been one more call to `lock` than to `unlock` , the
  * component is considered locked, which is reflected by {@link isLocked()} returning `TRUE` .
  */
@js.native
trait XLockable extends js.Object {
  /**
    * determines whether the component is currently locked.
    * @see lock
    * @see unlock
    */
  def isLocked(): Boolean = js.native
  /**
    * locks the component
    * @see unlock
    * @see isLocked
    */
  def lock(): Unit = js.native
  /**
    * unlocks the component
    * @see lock
    * @see isLocked
    * @throws NotLockedException if the component is not currently locked.
    */
  def unlock(): Unit = js.native
}

object XLockable {
  @scala.inline
  def apply(isLocked: () => Boolean, lock: () => Unit, unlock: () => Unit): XLockable = {
    val __obj = js.Dynamic.literal(isLocked = js.Any.fromFunction0(isLocked), lock = js.Any.fromFunction0(lock), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[XLockable]
  }
  @scala.inline
  implicit class XLockableOps[Self <: XLockable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsLocked(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction0(value))
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

