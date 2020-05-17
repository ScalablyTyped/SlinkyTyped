package typingsSlinky.activexLibreoffice.com_.sun.star.connection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XStreamListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to add listeners to a connection.
  *
  * Maybe supported by connections returned from {@link XAcceptor.accept()} or {@link XConnector.connect()} .
  */
@js.native
trait XConnectionBroadcaster extends XInterface {
  /**
    * registers an object to receive events from this connection.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addStreamListener(aListener: XStreamListener): Unit = js.native
  /**
    * unregisters an object to receive events from this connection.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeStreamListener(aListener: XStreamListener): Unit = js.native
}

object XConnectionBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addStreamListener: XStreamListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeStreamListener: XStreamListener => Unit
  ): XConnectionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addStreamListener = js.Any.fromFunction1(addStreamListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStreamListener = js.Any.fromFunction1(removeStreamListener))
    __obj.asInstanceOf[XConnectionBroadcaster]
  }
  @scala.inline
  implicit class XConnectionBroadcasterOps[Self <: XConnectionBroadcaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddStreamListener(value: XStreamListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStreamListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveStreamListener(value: XStreamListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStreamListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

