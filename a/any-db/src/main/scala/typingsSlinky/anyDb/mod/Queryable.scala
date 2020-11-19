package typingsSlinky.anyDb.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queryable extends EventEmitter {
  
  /**
    * The Adapter instance that will be used by this Queryable for creating Query instances and/or connections.
    */
  var adapter: Adapter = js.native
  
  /**
    * Execute a SQL statement using bound parameters (if they are provided) and return a Query object
    * that is a Readable stream of the resulting rows. If a Continuation<ResultSet> is provided the rows
    * returned by the database will be aggregated into a [ResultSet][] which will be passed to the
    * continuation after the query has completed.
    * The second form is not needed for normal use, but must be implemented by adapters to work correctly
    * with ConnectionPool and Transaction. See Adapter.createQuery for more details.
    */
  def query(text: String): Query = js.native
  def query(
    text: String,
    params: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* results */ ResultSet, Unit]
  ): Query = js.native
  def query(text: String, params: js.Array[_]): Query = js.native
  def query(
    text: String,
    params: js.Array[_],
    callback: js.Function2[/* error */ js.Error, /* results */ ResultSet, Unit]
  ): Query = js.native
}
