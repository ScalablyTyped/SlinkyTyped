package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of {@link SAXEventKeeper} Status Change Listener.
  *
  * This interface is used to receive the {@link SAXEventKeeper} status change notification.
  */
@js.native
trait XSAXEventKeeperStatusChangeListener extends XInterface {
  /**
    * Notifies the {@link SAXEventKeeper} is entering/leaving blocking state.
    * @param isBlocking `true` if the {@link SAXEventKeeper} is entering blocking state, `false` otherwise
    */
  def blockingStatusChanged(isBlocking: Boolean): Unit = js.native
  /**
    * Notifies the {@link SAXEventKeeper} 's buffer is empty/not empty
    * @param isBufferEmpty `true` if the {@link SAXEventKeeper} has no buffer at all; `false` otherwise.
    */
  def bufferStatusChanged(isBufferEmpty: Boolean): Unit = js.native
  /**
    * Notifies the {@link SAXEventKeeper} is entering/leaving collecting state.
    * @param isInsideCollectedElement `true` if the {@link SAXEventKeeper} is collecting some element, `false` otherwise
    */
  def collectionStatusChanged(isInsideCollectedElement: Boolean): Unit = js.native
}

object XSAXEventKeeperStatusChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    blockingStatusChanged: Boolean => Unit,
    bufferStatusChanged: Boolean => Unit,
    collectionStatusChanged: Boolean => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSAXEventKeeperStatusChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), blockingStatusChanged = js.Any.fromFunction1(blockingStatusChanged), bufferStatusChanged = js.Any.fromFunction1(bufferStatusChanged), collectionStatusChanged = js.Any.fromFunction1(collectionStatusChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSAXEventKeeperStatusChangeListener]
  }
  @scala.inline
  implicit class XSAXEventKeeperStatusChangeListenerOps[Self <: XSAXEventKeeperStatusChangeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockingStatusChanged(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockingStatusChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBufferStatusChanged(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferStatusChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCollectionStatusChanged(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionStatusChanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

