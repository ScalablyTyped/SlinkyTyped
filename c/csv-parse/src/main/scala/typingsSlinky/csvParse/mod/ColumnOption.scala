package typingsSlinky.csvParse.mod

import typingsSlinky.csvParse.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - typingsSlinky.csvParse.csvParseBooleans.`false`
  - typingsSlinky.csvParse.anon.Name
*/
trait ColumnOption extends js.Object

object ColumnOption {
  @scala.inline
  def `false`: typingsSlinky.csvParse.csvParseBooleans.`false` = false.asInstanceOf[typingsSlinky.csvParse.csvParseBooleans.`false`]
  @scala.inline
  implicit def apply(value: Name): ColumnOption = value.asInstanceOf[ColumnOption]
  @scala.inline
  implicit def apply(value: Null): ColumnOption = value.asInstanceOf[ColumnOption]
  @scala.inline
  implicit def apply(value: String): ColumnOption = value.asInstanceOf[ColumnOption]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => ColumnOption): ColumnOption = value.asInstanceOf[ColumnOption]
}

