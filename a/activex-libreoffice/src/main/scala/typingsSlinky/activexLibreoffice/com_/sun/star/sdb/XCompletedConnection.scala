package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for establishing connections via a factory which is identified by its name. To complete the information needed for establishing a connection
  * an interaction handler is used.
  */
@js.native
trait XCompletedConnection extends XInterface {
  /**
    * attempts to establish a database connection. If information is missing, such as a user's password, they are completed by user interaction.
    * @param handler will be asked when more information is needed
    * @returns the {@link Connection} object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def connectWithCompletion(handler: XInteractionHandler): XConnection = js.native
}

object XCompletedConnection {
  @scala.inline
  def apply(
    acquire: () => Unit,
    connectWithCompletion: XInteractionHandler => XConnection,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCompletedConnection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCompletedConnection]
  }
  @scala.inline
  implicit class XCompletedConnectionOps[Self <: XCompletedConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectWithCompletion(value: XInteractionHandler => XConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectWithCompletion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

