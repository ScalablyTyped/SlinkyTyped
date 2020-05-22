package typingsSlinky.fundamentalReact.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowData extends js.Object {
  var rowData: js.Array[String | TagMod[Any]]
}

object RowData {
  @scala.inline
  def apply(rowData: js.Array[String | TagMod[Any]]): RowData = {
    val __obj = js.Dynamic.literal(rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowData]
  }
}

