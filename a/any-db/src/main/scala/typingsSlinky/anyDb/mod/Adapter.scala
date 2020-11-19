package typingsSlinky.anyDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapter extends js.Object {
  
  /**
    * Create a new connection object. In common usage, config will be created by parse-db-url and passed to the adapter by any-db.
    * If a continuation is given, it must be called, either with an error or the established connection.
    */
  def createConnection(opts: ConnectOpts): Connection = js.native
  def createConnection(opts: ConnectOpts, callback: js.Function2[/* error */ js.Error, /* result */ Connection, Unit]): Connection = js.native
  
  def createQuery(query: Query): Query = js.native
  /**
    * Create a Query that may eventually be executed later on by a Connection. While this function is rarely needed by user code,
    * it makes it possible for ConnectionPool.query and Transaction.query to fulfill the Queryable.query contract
    * by synchronously returning a Query stream
    */
  def createQuery(text: String): Query = js.native
  def createQuery(
    text: String,
    params: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* result */ ResultSet, Unit]
  ): Query = js.native
  def createQuery(text: String, params: js.Array[_]): Query = js.native
  def createQuery(
    text: String,
    params: js.Array[_],
    callback: js.Function2[/* error */ js.Error, /* result */ ResultSet, Unit]
  ): Query = js.native
  
  var name: String = js.native
}
