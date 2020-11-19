package typingsSlinky.anyDb.mod

import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends Readable {
  
  /**
    * The callback (if any) that was provided to Queryable.query. Note that
    * Query objects must not use a closed over reference to their callback,
    * as other any-db libraries may rely on modifying the callback property
    * of a Query they did not create.
    */
  def callback(error: js.Error, results: ResultSet): Unit = js.native
  
  /**
    * The SQL query as a string. If you are using MySQL this will contain
    * interpolated values after the query has been enqueued by a connection.
    */
  var text: String = js.native
  
  /**
    * The array of parameter values.
    */
  var values: js.Array[_] = js.native
}
