package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a notifier for changes of XCommandInfos.
  * @author Kai Sommerfeld
  * @see CommandInfoChangeEvent
  * @see XCommandInfoChangeListener
  * @version 1.0
  */
@js.native
trait XCommandInfoChangeNotifier extends XInterface {
  /**
    * registers a listener for CommandInfoChangeEvents.
    * @param Listener the listener to add.
    */
  def addCommandInfoChangeListener(Listener: XCommandInfoChangeListener): Unit = js.native
  /**
    * removes a listener for CommandInfoChangeEvents.
    * @param Listener the listener to remove.
    */
  def removeCommandInfoChangeListener(Listener: XCommandInfoChangeListener): Unit = js.native
}

object XCommandInfoChangeNotifier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addCommandInfoChangeListener: XCommandInfoChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCommandInfoChangeListener: XCommandInfoChangeListener => Unit
  ): XCommandInfoChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addCommandInfoChangeListener = js.Any.fromFunction1(addCommandInfoChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCommandInfoChangeListener = js.Any.fromFunction1(removeCommandInfoChangeListener))
    __obj.asInstanceOf[XCommandInfoChangeNotifier]
  }
  @scala.inline
  implicit class XCommandInfoChangeNotifierOps[Self <: XCommandInfoChangeNotifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCommandInfoChangeListener(value: XCommandInfoChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCommandInfoChangeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveCommandInfoChangeListener(value: XCommandInfoChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCommandInfoChangeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

