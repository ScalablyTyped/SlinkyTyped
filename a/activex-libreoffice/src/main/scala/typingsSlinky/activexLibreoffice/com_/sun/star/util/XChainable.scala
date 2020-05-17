package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables the object to be a member of a chain. */
@js.native
trait XChainable extends XInterface {
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  val Predecessor: XChainable = js.native
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  var Successor: XChainable = js.native
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  def getPredecessor(): XChainable = js.native
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  def getSuccessor(): XChainable = js.native
  /** checks if the specified object can be linked to this. */
  def isChainable(xChainable: XChainable): Boolean = js.native
  /**
    * connects the specified object to this object as the successor in a chain.
    *
    * This implies that this object will become the predecessor of **xChainable** .
    */
  def setSuccessor(xChainable: XChainable): Unit = js.native
}

object XChainable {
  @scala.inline
  def apply(
    Predecessor: XChainable,
    Successor: XChainable,
    acquire: () => Unit,
    getPredecessor: () => XChainable,
    getSuccessor: () => XChainable,
    isChainable: XChainable => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSuccessor: XChainable => Unit
  ): XChainable = {
    val __obj = js.Dynamic.literal(Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), isChainable = js.Any.fromFunction1(isChainable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSuccessor = js.Any.fromFunction1(setSuccessor))
    __obj.asInstanceOf[XChainable]
  }
  @scala.inline
  implicit class XChainableOps[Self <: XChainable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPredecessor(value: XChainable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predecessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessor(value: XChainable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPredecessor(value: () => XChainable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPredecessor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSuccessor(value: () => XChainable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSuccessor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsChainable(value: XChainable => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChainable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSuccessor(value: XChainable => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSuccessor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

