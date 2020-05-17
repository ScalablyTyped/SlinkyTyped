package typingsSlinky.activexLibreoffice.com_.sun.star.beans

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a notifier for changed property values
  * @see XPropertiesChangeListener
  */
@js.native
trait XPropertiesChangeNotifier extends XInterface {
  /** adds an {@link XPropertiesChangeListener} to the specified properties with the specified names. */
  def addPropertiesChangeListener(PropertyNames: SeqEquiv[String], Listener: XPropertiesChangeListener): Unit = js.native
  /** removes an {@link XPropertiesChangeListener} from the listener list. */
  def removePropertiesChangeListener(PropertyNames: SeqEquiv[String], Listener: XPropertiesChangeListener): Unit = js.native
}

object XPropertiesChangeNotifier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit
  ): XPropertiesChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction2(removePropertiesChangeListener))
    __obj.asInstanceOf[XPropertiesChangeNotifier]
  }
  @scala.inline
  implicit class XPropertiesChangeNotifierOps[Self <: XPropertiesChangeNotifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPropertiesChangeListener(value: (SeqEquiv[String], XPropertiesChangeListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPropertiesChangeListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemovePropertiesChangeListener(value: (SeqEquiv[String], XPropertiesChangeListener) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePropertiesChangeListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

