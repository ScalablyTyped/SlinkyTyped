package typingsSlinky.oracledb.mod

import typingsSlinky.node.Buffer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used with connection.execute() to associate values or JavaScript variables to a statement’s bind variables by name.
  *
  * @see https://oracle.github.io/node-oracledb/doc/api.html#executebindParams
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Record[
java.lang.String, 
js.UndefOr[
  typingsSlinky.oracledb.mod.BindParameter | java.lang.String | scala.Double | typingsSlinky.std.Date | typingsSlinky.oracledb.mod.DBObject | typingsSlinky.node.Buffer | scala.Null
]]
  - js.Array[js.Any | typingsSlinky.oracledb.mod.BindParameter]
*/
trait BindParameters extends js.Object

object BindParameters {
  @scala.inline
  implicit def apply(value: js.Array[js.Any | BindParameter]): BindParameters = value.asInstanceOf[BindParameters]
  @scala.inline
  implicit def apply(
    value: Record[
      String, 
      js.UndefOr[BindParameter | String | Double | js.Date | DBObject | Buffer | Null]
    ]
  ): BindParameters = value.asInstanceOf[BindParameters]
}

