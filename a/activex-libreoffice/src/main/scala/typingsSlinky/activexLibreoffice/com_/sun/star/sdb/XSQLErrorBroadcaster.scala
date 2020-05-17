package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** interface for notifying potential listeners of {@link com.sun.star.sdbc.SQLException} s posted by any database object. */
@js.native
trait XSQLErrorBroadcaster extends XInterface {
  /** adds the specified listener to receive the event "errorOccurred" */
  def addSQLErrorListener(Listener: XSQLErrorListener): Unit = js.native
  /** removes the specified listener. */
  def removeSQLErrorListener(Listener: XSQLErrorListener): Unit = js.native
}

object XSQLErrorBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSQLErrorListener: XSQLErrorListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSQLErrorListener: XSQLErrorListener => Unit
  ): XSQLErrorBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSQLErrorListener = js.Any.fromFunction1(addSQLErrorListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSQLErrorListener = js.Any.fromFunction1(removeSQLErrorListener))
    __obj.asInstanceOf[XSQLErrorBroadcaster]
  }
  @scala.inline
  implicit class XSQLErrorBroadcasterOps[Self <: XSQLErrorBroadcaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSQLErrorListener(value: XSQLErrorListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSQLErrorListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveSQLErrorListener(value: XSQLErrorListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSQLErrorListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

