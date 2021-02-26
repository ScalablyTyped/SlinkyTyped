package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for establishing connections via a factory which is identified by its name. A DataSource object is typically registered by a naming service
  * provider.
  */
@js.native
trait XDataSource extends XInterface {
  
  /**
    * gets the maximum time in seconds that this data source can wait while attempting to connect to a database.
    *
    * A value of zero means that the timeout is the default system timeout if there is one; otherwise, it means that there is no timeout. When a DataSource
    * object is created the login timeout is initially zero.
    * @returns the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  var LoginTimeout: Double = js.native
  
  /**
    * attempts to establish a database connection.
    * @param user the user name
    * @param password the password
    * @returns the connection object
    * @throws SQLException if a database access error occurs.
    */
  def getConnection(user: String, password: String): XConnection = js.native
  
  /**
    * gets the maximum time in seconds that this data source can wait while attempting to connect to a database.
    *
    * A value of zero means that the timeout is the default system timeout if there is one; otherwise, it means that there is no timeout. When a DataSource
    * object is created the login timeout is initially zero.
    * @returns the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  def getLoginTimeout(): Double = js.native
  
  /**
    * sets the maximum time in seconds that this data source will wait while attempting to connect to a database.
    *
    * A value of zero specifies that the timeout is the default system timeout if there is one; otherwise, it specifies that there is no timeout. When a
    * DataSource object is created the login timeout is initially zero.
    * @param seconds the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  def setLoginTimeout(seconds: Double): Unit = js.native
}
object XDataSource {
  
  @scala.inline
  def apply(
    LoginTimeout: Double,
    acquire: () => Unit,
    getConnection: (String, String) => XConnection,
    getLoginTimeout: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLoginTimeout: Double => Unit
  ): XDataSource = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConnection = js.Any.fromFunction2(getConnection), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout))
    __obj.asInstanceOf[XDataSource]
  }
  
  @scala.inline
  implicit class XDataSourceMutableBuilder[Self <: XDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetConnection(value: (String, String) => XConnection): Self = StObject.set(x, "getConnection", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetLoginTimeout(value: () => Double): Self = StObject.set(x, "getLoginTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoginTimeout(value: Double): Self = StObject.set(x, "LoginTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLoginTimeout(value: Double => Unit): Self = StObject.set(x, "setLoginTimeout", js.Any.fromFunction1(value))
  }
}
