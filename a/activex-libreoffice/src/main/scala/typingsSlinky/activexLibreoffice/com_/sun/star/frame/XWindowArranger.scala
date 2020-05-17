package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XWindowArranger extends XInterface {
  /** @deprecated Deprecated */
  def arrange(nCommand: Double): Unit = js.native
  /** @deprecated Deprecated */
  def hasArrangeCommand(nCommand: Double): Boolean = js.native
}

object XWindowArranger {
  @scala.inline
  def apply(
    acquire: () => Unit,
    arrange: Double => Unit,
    hasArrangeCommand: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XWindowArranger = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), arrange = js.Any.fromFunction1(arrange), hasArrangeCommand = js.Any.fromFunction1(hasArrangeCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XWindowArranger]
  }
  @scala.inline
  implicit class XWindowArrangerOps[Self <: XWindowArranger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrange(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasArrangeCommand(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasArrangeCommand")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

