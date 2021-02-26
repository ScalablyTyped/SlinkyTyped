package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines a pooled connection which can share a unused connection.
  *
  * <p>
  *
  * PoolConnections are handled by the connection pool.
  *
  * </p>
  *
  * <p>
  *
  * When the method
  *
  * com::sun::star::sdbc::XPooledConnection::getConnection()
  *
  * is called, the PooledConnection returns the connection which is pooled.
  *
  * </p>
  * @@see com::sun::star::sdbc::XConnection
  */
@js.native
trait XPooledConnection extends XInterface {
  
  /**
    * return the connection which is pooled
    * @returns the pooled {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  val Connection: XConnection = js.native
  
  /**
    * return the connection which is pooled
    * @returns the pooled {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  def getConnection(): XConnection = js.native
}
object XPooledConnection {
  
  @scala.inline
  def apply(
    Connection: XConnection,
    acquire: () => Unit,
    getConnection: () => XConnection,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPooledConnection = {
    val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConnection = js.Any.fromFunction0(getConnection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPooledConnection]
  }
  
  @scala.inline
  implicit class XPooledConnectionMutableBuilder[Self <: XPooledConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: XConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConnection(value: () => XConnection): Self = StObject.set(x, "getConnection", js.Any.fromFunction0(value))
  }
}
