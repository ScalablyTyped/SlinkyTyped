package typingsSlinky.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pgPromise.mod.Column
  - typingsSlinky.pgPromise.mod.ColumnSet
  - js.Array[
java.lang.String | typingsSlinky.pgPromise.mod.IColumnConfig | typingsSlinky.pgPromise.mod.Column]
*/
trait QueryColumns extends js.Object

object QueryColumns {
  @scala.inline
  implicit def apply(value: js.Array[String | IColumnConfig | Column]): QueryColumns = value.asInstanceOf[QueryColumns]
  @scala.inline
  implicit def apply(value: Column): QueryColumns = value.asInstanceOf[QueryColumns]
  @scala.inline
  implicit def apply(value: ColumnSet): QueryColumns = value.asInstanceOf[QueryColumns]
}

