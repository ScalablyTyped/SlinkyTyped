package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows locking the input on components. */
@js.native
trait XBoundControl extends XInterface {
  /**
    * determines whether the input is currently locked or not.
    * @returns `TRUE` when it is currently locked, otherwise `FALSE` .
    */
  var Lock: Boolean = js.native
  /**
    * determines whether the input is currently locked or not.
    * @returns `TRUE` when it is currently locked, otherwise `FALSE` .
    */
  def getLock(): Boolean = js.native
  /**
    * is used for altering the current lock state of the component.
    * @param bLock the new lock state.
    */
  def setLock(bLock: Boolean): Unit = js.native
}

object XBoundControl {
  @scala.inline
  def apply(
    Lock: Boolean,
    acquire: () => Unit,
    getLock: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLock: Boolean => Unit
  ): XBoundControl = {
    val __obj = js.Dynamic.literal(Lock = Lock.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLock = js.Any.fromFunction0(getLock), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLock = js.Any.fromFunction1(setLock))
    __obj.asInstanceOf[XBoundControl]
  }
  @scala.inline
  implicit class XBoundControlOps[Self <: XBoundControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLock(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLock(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLock")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

