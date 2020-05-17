package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the possibility of receiving database error events.
  *
  * Please do **not** use anymore, this interface is superseded by {@link com.sun.star.sdb.XSQLErrorBroadcaster} .
  * @deprecated Deprecated
  */
@js.native
trait XErrorBroadcaster extends XInterface {
  /** adds the specified listener to be notified of errors. */
  def addErrorListener(aListener: XErrorListener): Unit = js.native
  /** removes the specified listener. */
  def removeErrorListener(aListener: XErrorListener): Unit = js.native
}

object XErrorBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addErrorListener: XErrorListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeErrorListener: XErrorListener => Unit
  ): XErrorBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addErrorListener = js.Any.fromFunction1(addErrorListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeErrorListener = js.Any.fromFunction1(removeErrorListener))
    __obj.asInstanceOf[XErrorBroadcaster]
  }
  @scala.inline
  implicit class XErrorBroadcasterOps[Self <: XErrorBroadcaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddErrorListener(value: XErrorListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addErrorListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveErrorListener(value: XErrorListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeErrorListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

