package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes the modify state of the object accessible.
  *
  * Additionally, it makes it possible to register listener objects, which get notification whenever the status or content of the object changes.
  */
@js.native
trait XModifiable extends XModifyBroadcaster {
  /** @returns `TRUE` if the object is modified.  The modification is always in relation to a certain state (i.e., the initial, loaded, or last stored version). */
  def isModified(): Boolean = js.native
  /** sets the status of the **modified** -flag from outside of the object. */
  def setModified(bModified: Boolean): Unit = js.native
}

object XModifiable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    isModified: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeModifyListener: XModifyListener => Unit,
    setModified: Boolean => Unit
  ): XModifiable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), isModified = js.Any.fromFunction0(isModified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), setModified = js.Any.fromFunction1(setModified))
    __obj.asInstanceOf[XModifiable]
  }
  @scala.inline
  implicit class XModifiableOps[Self <: XModifiable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsModified(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetModified(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModified")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

