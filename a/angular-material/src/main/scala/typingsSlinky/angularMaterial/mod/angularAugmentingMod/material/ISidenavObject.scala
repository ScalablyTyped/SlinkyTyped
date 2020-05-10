package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISidenavObject extends js.Object {
  def close(): IPromise[Unit] = js.native
  def isLockedOpen(): Boolean = js.native
  def isOpen(): Boolean = js.native
  def onClose(onClose: js.Function0[Unit]): Unit = js.native
  def open(): IPromise[Unit] = js.native
  def toggle(): IPromise[Unit] = js.native
}

object ISidenavObject {
  @scala.inline
  def apply(
    close: () => IPromise[Unit],
    isLockedOpen: () => Boolean,
    isOpen: () => Boolean,
    onClose: js.Function0[Unit] => Unit,
    open: () => IPromise[Unit],
    toggle: () => IPromise[Unit]
  ): ISidenavObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), isLockedOpen = js.Any.fromFunction0(isLockedOpen), isOpen = js.Any.fromFunction0(isOpen), onClose = js.Any.fromFunction1(onClose), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[ISidenavObject]
  }
  @scala.inline
  implicit class ISidenavObjectOps[Self <: ISidenavObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => IPromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLockedOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLockedOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnClose(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => IPromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggle(value: () => IPromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

