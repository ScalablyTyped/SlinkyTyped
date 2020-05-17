package typingsSlinky.json2csv.json2csvbaseMod.json2csv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.json2csv.json2csvbaseMod.json2csv.FieldValueCallbackWithoutField[T]
  - typingsSlinky.json2csv.json2csvbaseMod.json2csv.FieldValueCallbackWithField[T]
*/
trait FieldValueCallback[T] extends js.Object

object FieldValueCallback {
  @scala.inline
  implicit def apply[T](value: FieldValueCallbackWithField[T]): FieldValueCallback[T] = value.asInstanceOf[FieldValueCallback[T]]
  @scala.inline
  implicit def apply[T](value: FieldValueCallbackWithoutField[T]): FieldValueCallback[T] = value.asInstanceOf[FieldValueCallback[T]]
}

