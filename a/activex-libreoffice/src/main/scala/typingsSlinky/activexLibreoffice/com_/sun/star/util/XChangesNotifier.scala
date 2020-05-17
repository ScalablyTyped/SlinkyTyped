package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts events about multiple changes that occur in bulk.
  * @see XChangesListener
  * @see XChangesBatch
  * @see ChangesEvent
  */
@js.native
trait XChangesNotifier extends XInterface {
  /** adds the specified listener to receive events when changes occurred. */
  def addChangesListener(aListener: XChangesListener): Unit = js.native
  /** removes the specified listener. */
  def removeChangesListener(aListener: XChangesListener): Unit = js.native
}

object XChangesNotifier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addChangesListener: XChangesListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChangesListener: XChangesListener => Unit
  ): XChangesNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction1(addChangesListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction1(removeChangesListener))
    __obj.asInstanceOf[XChangesNotifier]
  }
  @scala.inline
  implicit class XChangesNotifierOps[Self <: XChangesNotifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddChangesListener(value: XChangesListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChangesListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveChangesListener(value: XChangesListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChangesListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

