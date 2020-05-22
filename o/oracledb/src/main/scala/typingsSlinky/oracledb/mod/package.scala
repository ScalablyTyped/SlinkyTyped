package typingsSlinky.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Used with connection.execute() to associate values or JavaScript variables to a statement’s bind variables by name.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#executebindParams
    */
  type BindParameters = (typingsSlinky.std.Record[
    java.lang.String, 
    js.UndefOr[
      typingsSlinky.oracledb.mod.BindParameter | java.lang.String | scala.Double | js.Date | typingsSlinky.oracledb.mod.DBObject | typingsSlinky.node.Buffer | scala.Null
    ]
  ]) | (js.Array[js.Any | typingsSlinky.oracledb.mod.BindParameter])
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.node.Buffer
    - typingsSlinky.oracledb.mod.DBObject
    - typingsSlinky.oracledb.anon.Correlation
  */
  type EnqueueMessage = typingsSlinky.oracledb.mod._EnqueueMessage | java.lang.String | typingsSlinky.node.Buffer
}
