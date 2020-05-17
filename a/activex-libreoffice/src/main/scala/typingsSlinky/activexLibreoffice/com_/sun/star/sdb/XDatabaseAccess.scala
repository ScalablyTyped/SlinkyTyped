package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
@js.native
trait XDatabaseAccess extends XDataSource {
  def addDatabaseAccessListener(listener: XDatabaseAccessListener): Unit = js.native
  def getIsolatedConnection(user: String, password: String): XConnection = js.native
  def hasConnections(): Boolean = js.native
  def removeDatabaseAccessListener(listener: XDatabaseAccessListener): Unit = js.native
  def suspendConnections(): Boolean = js.native
}

object XDatabaseAccess {
  @scala.inline
  def apply(
    LoginTimeout: Double,
    acquire: () => Unit,
    addDatabaseAccessListener: XDatabaseAccessListener => Unit,
    getConnection: (String, String) => XConnection,
    getIsolatedConnection: (String, String) => XConnection,
    getLoginTimeout: () => Double,
    hasConnections: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDatabaseAccessListener: XDatabaseAccessListener => Unit,
    setLoginTimeout: Double => Unit,
    suspendConnections: () => Boolean
  ): XDatabaseAccess = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDatabaseAccessListener = js.Any.fromFunction1(addDatabaseAccessListener), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), hasConnections = js.Any.fromFunction0(hasConnections), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDatabaseAccessListener = js.Any.fromFunction1(removeDatabaseAccessListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), suspendConnections = js.Any.fromFunction0(suspendConnections))
    __obj.asInstanceOf[XDatabaseAccess]
  }
  @scala.inline
  implicit class XDatabaseAccessOps[Self <: XDatabaseAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddDatabaseAccessListener(value: XDatabaseAccessListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDatabaseAccessListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIsolatedConnection(value: (String, String) => XConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsolatedConnection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasConnections(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasConnections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveDatabaseAccessListener(value: XDatabaseAccessListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDatabaseAccessListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuspendConnections(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendConnections")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

