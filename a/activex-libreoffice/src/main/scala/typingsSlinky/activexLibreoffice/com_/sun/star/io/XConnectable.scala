package typingsSlinky.activexLibreoffice.com_.sun.star.io

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to connect data sinks and sources.
  *
  * The predecessor-member is the element in the connection that is nearer to the source of the data. The successor-member is the element that is further
  * away from the source of the data. (Note that this classification does not depend on whether the class implements {@link XInputStream} or {@link
  * XOutputStream} ; it only depends on the direction of data flow.)
  *
  * This interface allows generic services to navigate between arbitrary elements of a connection.
  */
@js.native
trait XConnectable extends XInterface {
  /** @returns the predecessor of this object. */
  var Predecessor: XConnectable = js.native
  /** @returns the successor of this object. */
  var Successor: XConnectable = js.native
  /** @returns the predecessor of this object. */
  def getPredecessor(): XConnectable = js.native
  /** @returns the successor of this object. */
  def getSuccessor(): XConnectable = js.native
  /** sets the source of the data flow for this object. */
  def setPredecessor(aPredecessor: XConnectable): Unit = js.native
  /** sets the sink of the data flow for this object. */
  def setSuccessor(aSuccessor: XConnectable): Unit = js.native
}

object XConnectable {
  @scala.inline
  def apply(
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: () => Unit,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPredecessor: XConnectable => Unit,
    setSuccessor: XConnectable => Unit
  ): XConnectable = {
    val __obj = js.Dynamic.literal(Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor))
    __obj.asInstanceOf[XConnectable]
  }
  @scala.inline
  implicit class XConnectableOps[Self <: XConnectable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredecessor(value: XConnectable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predecessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessor(value: XConnectable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPredecessor(value: () => XConnectable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPredecessor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSuccessor(value: () => XConnectable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuccessor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPredecessor(value: XConnectable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPredecessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSuccessor(value: XConnectable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccessor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

