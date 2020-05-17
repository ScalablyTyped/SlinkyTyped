package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a notifier for changes of XPropertySetInfos.
  * @see PropertySetInfoChangeEvent
  * @see XPropertySetInfoChangeListener
  */
@js.native
trait XPropertySetInfoChangeNotifier extends XInterface {
  /**
    * registers a listener for PropertySetInfoChangeEvents.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addPropertySetInfoChangeListener(Listener: XPropertySetInfoChangeListener): Unit = js.native
  /**
    * removes a listener for PropertySetInfoChangeEvents.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removePropertySetInfoChangeListener(Listener: XPropertySetInfoChangeListener): Unit = js.native
}

object XPropertySetInfoChangeNotifier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addPropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertySetInfoChangeListener: XPropertySetInfoChangeListener => Unit
  ): XPropertySetInfoChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPropertySetInfoChangeListener = js.Any.fromFunction1(addPropertySetInfoChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertySetInfoChangeListener = js.Any.fromFunction1(removePropertySetInfoChangeListener))
    __obj.asInstanceOf[XPropertySetInfoChangeNotifier]
  }
  @scala.inline
  implicit class XPropertySetInfoChangeNotifierOps[Self <: XPropertySetInfoChangeNotifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPropertySetInfoChangeListener(value: XPropertySetInfoChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPropertySetInfoChangeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovePropertySetInfoChangeListener(value: XPropertySetInfoChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePropertySetInfoChangeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

