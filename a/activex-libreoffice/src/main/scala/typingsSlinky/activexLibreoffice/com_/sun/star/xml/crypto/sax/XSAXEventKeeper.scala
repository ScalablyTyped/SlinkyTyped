package typingsSlinky.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of SAX Event Keeper.
  *
  * This interface is used to manipulate element marks in a SAX event stream.
  *
  * There are two kinds of element mark, one is element collector, which is used to collect a particular element from the SAX event stream; the other is
  * blocker, which is used to block the SAX event stream.
  */
@js.native
trait XSAXEventKeeper extends XInterface {
  /**
    * Gets the element which current blocking happens.
    *
    * This element is the working element of the first blocker in tree order.
    * @returns the current blocking element
    */
  val CurrentBlockingNode: XXMLElementWrapper = js.native
  /**
    * Adds a new blocker on the next element in the SAX event stream.
    *
    * No SAX event starting from the next element will be forwarded until this blocker is removed.
    * @returns the keeper id of the new blocker
    */
  def addBlocker(): Double = js.native
  /**
    * Adds a new element collector on the next element in the SAX event stream.
    * @returns the keeper id of the new element collector
    */
  def addElementCollector(): Double = js.native
  /**
    * Gets the element which current blocking happens.
    *
    * This element is the working element of the first blocker in tree order.
    * @returns the current blocking element
    */
  def getCurrentBlockingNode(): XXMLElementWrapper = js.native
  /**
    * Gets the element of an element mark.
    * @param id the keeper id of the element mark, it can be a element collector or a blocker
    */
  def getElement(id: Double): XXMLElementWrapper = js.native
  /**
    * Checks whether the SAX event stream is blocking.
    * @returns `true` if blocking, `false` otherwise
    */
  def isBlocking(): Boolean = js.native
  /**
    * Prints information about all buffered elements.
    * @returns a tree-style string including all buffer information
    */
  def printBufferNodeTree(): String = js.native
  /**
    * Removes a blocker
    * @param id the keeper id of the blocker to be removed
    */
  def removeBlocker(id: Double): Unit = js.native
  /**
    * Removes an element collector.
    * @param id the keeper id of the element collector to be removed
    */
  def removeElementCollector(id: Double): Unit = js.native
  /**
    * Sets the element of an element mark.
    *
    * When an element is replaced outside of this interface, then uses this method can restore the link between an element mark and its working element.
    * @param id the keeper id of the element mark to be set
    * @param aElement the new element for this element mark.
    */
  def setElement(id: Double, aElement: XXMLElementWrapper): Unit = js.native
  /**
    * Sets the next document handler in the SAX chain.
    *
    * This handler will receive SAX events forwarded by the {@link SAXEventKeeper} .
    * @param nextHandler the next handler in the SAX chain
    * @returns the old next handler
    */
  def setNextHandler(nextHandler: XDocumentHandler): XDocumentHandler = js.native
}

object XSAXEventKeeper {
  @scala.inline
  def apply(
    CurrentBlockingNode: XXMLElementWrapper,
    acquire: () => Unit,
    addBlocker: () => Double,
    addElementCollector: () => Double,
    getCurrentBlockingNode: () => XXMLElementWrapper,
    getElement: Double => XXMLElementWrapper,
    isBlocking: () => Boolean,
    printBufferNodeTree: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeBlocker: Double => Unit,
    removeElementCollector: Double => Unit,
    setElement: (Double, XXMLElementWrapper) => Unit,
    setNextHandler: XDocumentHandler => XDocumentHandler
  ): XSAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addBlocker = js.Any.fromFunction0(addBlocker), addElementCollector = js.Any.fromFunction0(addElementCollector), getCurrentBlockingNode = js.Any.fromFunction0(getCurrentBlockingNode), getElement = js.Any.fromFunction1(getElement), isBlocking = js.Any.fromFunction0(isBlocking), printBufferNodeTree = js.Any.fromFunction0(printBufferNodeTree), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeBlocker = js.Any.fromFunction1(removeBlocker), removeElementCollector = js.Any.fromFunction1(removeElementCollector), setElement = js.Any.fromFunction2(setElement), setNextHandler = js.Any.fromFunction1(setNextHandler))
    __obj.asInstanceOf[XSAXEventKeeper]
  }
  @scala.inline
  implicit class XSAXEventKeeperOps[Self <: XSAXEventKeeper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentBlockingNode(value: XXMLElementWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentBlockingNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddBlocker(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBlocker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddElementCollector(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addElementCollector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentBlockingNode(value: () => XXMLElementWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentBlockingNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetElement(value: Double => XXMLElementWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsBlocking(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlocking")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintBufferNodeTree(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printBufferNodeTree")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveBlocker(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBlocker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveElementCollector(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeElementCollector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetElement(value: (Double, XXMLElementWrapper) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetNextHandler(value: XDocumentHandler => XDocumentHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNextHandler")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

