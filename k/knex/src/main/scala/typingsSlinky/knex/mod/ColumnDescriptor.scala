package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.knex.mod.Raw[js.Any]
  - typingsSlinky.knex.mod.QueryBuilder[TRecord, TResult]
  - typingsSlinky.knex.mod.Dict[java.lang.String]
*/
trait ColumnDescriptor[TRecord, TResult] extends js.Object

object ColumnDescriptor {
  @scala.inline
  implicit def apply[TRecord, TResult](value: Dict[String]): ColumnDescriptor[TRecord, TResult] = value.asInstanceOf[ColumnDescriptor[TRecord, TResult]]
  @scala.inline
  implicit def apply[TRecord, TResult](value: QueryBuilder[TRecord, TResult]): ColumnDescriptor[TRecord, TResult] = value.asInstanceOf[ColumnDescriptor[TRecord, TResult]]
  @scala.inline
  implicit def apply[TRecord, TResult](value: Raw[js.Any]): ColumnDescriptor[TRecord, TResult] = value.asInstanceOf[ColumnDescriptor[TRecord, TResult]]
  @scala.inline
  implicit def apply[TRecord, TResult](value: String): ColumnDescriptor[TRecord, TResult] = value.asInstanceOf[ColumnDescriptor[TRecord, TResult]]
}

