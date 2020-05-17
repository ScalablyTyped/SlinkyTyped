package typingsSlinky.handsontable.mod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single row of source data, which can be represented as an array of values, or an object with key/value pairs.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.handsontable.mod.Handsontable.RowObject
  - js.Array[typingsSlinky.handsontable.mod.Handsontable.CellValue]
*/
trait SourceRowData extends js.Object

object SourceRowData {
  @scala.inline
  implicit def apply(value: js.Array[CellValue]): SourceRowData = value.asInstanceOf[SourceRowData]
  @scala.inline
  implicit def apply(value: RowObject): SourceRowData = value.asInstanceOf[SourceRowData]
}

