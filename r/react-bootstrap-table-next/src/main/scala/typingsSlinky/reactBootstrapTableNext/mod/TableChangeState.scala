package typingsSlinky.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactBootstrapTableNext.anon.Comparator
import typingsSlinky.reactBootstrapTableNext.anon.DataField
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.asc
import typingsSlinky.reactBootstrapTableNext.reactBootstrapTableNextStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableChangeState[T] extends js.Object {
  var cellEdit: DataField
  var data: js.Array[T]
  var filters: StringDictionary[Comparator]
  var page: Double
  var sizePerPage: Double
  var sortField: String
  var sortOrder: asc | desc
}

object TableChangeState {
  @scala.inline
  def apply[T](
    cellEdit: DataField,
    data: js.Array[T],
    filters: StringDictionary[Comparator],
    page: Double,
    sizePerPage: Double,
    sortField: String,
    sortOrder: asc | desc
  ): TableChangeState[T] = {
    val __obj = js.Dynamic.literal(cellEdit = cellEdit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], sizePerPage = sizePerPage.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableChangeState[T]]
  }
}

