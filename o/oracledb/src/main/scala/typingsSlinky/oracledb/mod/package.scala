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
      typingsSlinky.oracledb.mod.BindParameter | java.lang.String | scala.Double | js.Date | typingsSlinky.oracledb.mod.DBObjectIN[js.Any] | typingsSlinky.node.Buffer | scala.Null
    ]
  ]) | (js.Array[js.Any | typingsSlinky.oracledb.mod.BindParameter])
  /**
    * @see https://oracle.github.io/node-oracledb/doc/api.html#objects
    * @since 4.0
    */
  type DBObjectIN[T] = typingsSlinky.oracledb.oracledbStrings.DBObject_IN with org.scalablytyped.runtime.TopLevel[T] with typingsSlinky.oracledb.mod.BaseDBObject[T]
  /**
    * @see https://oracle.github.io/node-oracledb/doc/api.html#objects
    * @since 4.0
    */
  type DBObjectOUT[T] = typingsSlinky.oracledb.oracledbStrings.DBObject_OUT with org.scalablytyped.runtime.TopLevel[js.Any] with typingsSlinky.oracledb.mod.BaseDBObject[T]
  type EnqueueMessage[T] = java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.oracledb.mod.DBObjectIN[T] | typingsSlinky.oracledb.anon.Correlation[T]
}
