package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** broadcasts message in case embedded object object changes it's state. */
@js.native
trait XStateChangeBroadcaster extends XInterface {
  /** adds the specified listener to receive events about states change */
  def addStateChangeListener(xListener: XStateChangeListener): Unit = js.native
  /** removes the specified listener */
  def removeStateChangeListener(xListener: XStateChangeListener): Unit = js.native
}

object XStateChangeBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addStateChangeListener: XStateChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeStateChangeListener: XStateChangeListener => Unit
  ): XStateChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addStateChangeListener = js.Any.fromFunction1(addStateChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStateChangeListener = js.Any.fromFunction1(removeStateChangeListener))
    __obj.asInstanceOf[XStateChangeBroadcaster]
  }
  @scala.inline
  implicit class XStateChangeBroadcasterOps[Self <: XStateChangeBroadcaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddStateChangeListener(value: XStateChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStateChangeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveStateChangeListener(value: XStateChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStateChangeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

